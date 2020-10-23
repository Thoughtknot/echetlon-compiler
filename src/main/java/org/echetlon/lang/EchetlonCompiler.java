package org.echetlon.lang;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.echetlon.lang.EchetlonParser.*;

import java.nio.ByteBuffer;
import java.util.*;
import java.util.stream.Collectors;

public class EchetlonCompiler {

    public static byte[] compile(String code) {
        List<Statement> statements = parse(code);
        CompilerContext ctxt = new CompilerContext();
        ByteBuffer bb = ByteBuffer.allocate(2048);
        for (Statement statement : statements) {
            statement.push(bb, ctxt);
        }
        return bb.array();
    }

    private static Expression parse(EchetlonParser.ExpressionContext ctxt) {
        if (ctxt instanceof ParenExpContext) {
            ParenExpContext parenExpContext = (ParenExpContext) ctxt;
            return parse(parenExpContext.expression());
        }
        if (ctxt instanceof StrLiteralContext) {
            StrLiteralContext strLit = (StrLiteralContext) ctxt;
            return new StringLiteral(strLit.STRING().getText());
        }
        if (ctxt instanceof ObjValContext) {
            ObjValContext objVal = (ObjValContext) ctxt;
            return new ObjectAllocation(objVal.objAlloc().alloc.getText(), objVal.objAlloc().fieldAlloc());
        }
        if (ctxt instanceof ArrayRefContext) {
            ArrayRefContext context = (ArrayRefContext) ctxt;
            return new ArrayReference(parse(context.arr), parse(context.index));
        }
        if (ctxt instanceof IntLiteralContext) {
            IntLiteralContext intLiteral = (IntLiteralContext) ctxt;
            return new IntLiteral(intLiteral.getText());
        }
        if (ctxt instanceof AddContext) {
            AddContext addContext = (AddContext) ctxt;
            return new Addition(parse(addContext.l), parse(addContext.r));
        }
        if (ctxt instanceof SubContext) {
            SubContext subContext = (SubContext) ctxt;
            return new Subtraction(parse(subContext.l), parse(subContext.r));
        }
        if (ctxt instanceof ArrayLiteralContext) {
            ArrayLiteralContext arrayContext = (ArrayLiteralContext) ctxt;
            List<Expression> expressions = arrayContext.expression()
                .stream()
                .map(EchetlonCompiler::parse)
                .collect(Collectors.toList());
            return new ArrayLiteral(expressions);
        }
        if (ctxt instanceof VarRefContext) {
            VarRefContext varRefContext = (VarRefContext) ctxt;
            return new VariableReference(varRefContext.name.getText());
        }
        if (ctxt instanceof VarFieldRefContext) {
            VarFieldRefContext varRefContext = (VarFieldRefContext) ctxt;
            return new VariableFieldReference(varRefContext.name.getText(), varRefContext.field.getText());
        }
        if (ctxt instanceof MethodCallContext) {
            MethodCallContext methodCall = (MethodCallContext) ctxt;
            String objName = methodCall.objName != null ? methodCall.objName.getText() : null;
            return new MethodCall(objName, methodCall.name.getText(),
                    methodCall.expression().stream().map(EchetlonCompiler::parse).collect(Collectors.toList()));
        }
        return null;
    }

    private static Type parse(SingleTypeContext ctxt) {
        if (ctxt.INT() != null) {
            return new IntType();
        }
        else if (ctxt.IDENTIFIER() != null) {
            return new ObjectType(ctxt.IDENTIFIER().getText());
        }
        else if (ctxt.STR() != null) {
            return new StringType();
        }
        else {
            return null;
        }
    }

    private static Type parse(TypeContext ctxt) {
        if (ctxt.singleType() != null) {
            return parse(ctxt.singleType());
        }
        else if (ctxt.array() != null) {
            return new ArrayType(parse(ctxt.array().singleType()));
        }
        return null;
    }

    private static Statement parse(EchetlonParser.StatementContext ctxt) {
        if (ctxt.returnStmt() != null) {
            ReturnStmtContext ret = ctxt.returnStmt();
            return new Return(parse(ret.expression()));
        }
        if (ctxt.objDecl() != null) {
            ObjDeclContext obj = ctxt.objDecl();
            return new ObjectDeclaration(obj.name.getText(), obj.methodDecl(), obj.fieldDecl());
        }
        if (ctxt.varObjDec() != null) {
            VarObjDecContext obj = ctxt.varObjDec();
            return new VariableDeclaration(parse(obj.type()), obj.var.getText(), parse(obj.expression()));
        }
        if (ctxt.varAss() != null) {
            VarAssContext obj = ctxt.varAss();
            return new VariableAssignment(obj.var.getText(), obj.fieldDeref(), parse(obj.expression()));
        }
        if (ctxt.loop() != null) {
            LoopContext loop = ctxt.loop();
            return new Loop(parse(loop.expression()), loop.statement().stream().map(EchetlonCompiler::parse).collect(Collectors.toList()));
        }
        if (ctxt.methodCallStmt() != null) {
            MethodCallStmtContext methodCall = ctxt.methodCallStmt();
            String objName = methodCall.objName != null ? methodCall.objName.getText() : null;
            return new MethodCallStatement(objName, methodCall.name.getText(),
                methodCall.expression().stream().map(EchetlonCompiler::parse).collect(Collectors.toList()));
        }
        return null;
    }

    private static List<Statement> parse(String code) {
        CharStream input = new ANTLRInputStream(code);
        EchetlonLexer lexer = new EchetlonLexer(input);
        EchetlonParser parser = new EchetlonParser(new CommonTokenStream(lexer));
        if (parser.getNumberOfSyntaxErrors() > 0) {
            return Collections.emptyList();
        }
        List<Statement> statements = parser.file().statement().stream()
            .map(EchetlonCompiler::parse)
            .collect(Collectors.toList());
        return statements;
    }

    public interface Type {
        byte getSize(CompilerContext ctxt);
    }

    public interface Expression {
        void push(ByteBuffer bb, CompilerContext ctxt);
        Type getType(CompilerContext ctxt);
    }

    public interface Statement {
        void push(ByteBuffer bb, CompilerContext ctxt);
    }

    public static class IntType implements Type {
        @Override
        public byte getSize(CompilerContext ctxt) {
            return 8;
        }
    }
    public static class VoidType implements Type {
        @Override
        public byte getSize(CompilerContext ctxt) {
            return 0;
        }
    }

    public static class ByteType implements Type {
        @Override
        public byte getSize(CompilerContext ctxt) {
            return 1;
        }
    }

    public static class StringType extends ArrayType {
        public StringType() {
            super(new ByteType());
        }
    }

    public static class ArrayType implements Type {
        private final Type innerType;

        public ArrayType(Type innerType) {
            this.innerType = innerType;
        }

        @Override
        public byte getSize(CompilerContext ctxt) {
            return 8;
        }
    }

    public static class ObjectType implements Type {
        public String objName;

        public ObjectType(String objName) {
            this.objName = objName;
        }

        @Override
        public byte getSize(CompilerContext ctxt) {
            /*ObjectDeclaration size = ctxt.getObject(objName);
            return (byte) size.fields.stream().mapToInt(f -> f.type.getSize(ctxt))
                .sum();
            */
            return 8; // reference
        }
    }

    public static class ObjectField {
        private String name;
        private int id;
        private Type type;

        public ObjectField(String name, int id, Type type) {
            this.name = name;
            this.id = id;
            this.type = type;
        }
    }

    public static class Subtraction implements Expression {
        private final Expression l;
        private final Expression r;

        public Subtraction(Expression l, Expression r) {
            this.l = l;
            this.r = r;
        }

        @Override
        public void push(ByteBuffer bb, CompilerContext ctxt) {
            if (l.getType(ctxt).getClass() != r.getType(ctxt).getClass()) {
                throw new UnsupportedOperationException("Unsupported addition between " + l.getType(ctxt).getClass().getSimpleName()
                        + " and " + r.getType(ctxt).getClass().getSimpleName());
            }
            l.push(bb, ctxt);
            r.push(bb, ctxt);
            bb.put((byte) 0x79); // POP_1
            bb.put((byte) 0x78); // POP_0
            bb.put((byte) 0x10); // SUB_1
            bb.put((byte) 0x70); // PUSH_0
        }

        @Override
        public Type getType(CompilerContext ctxt) {
            return l.getType(ctxt);
        }
    }

    public static class Addition implements Expression {
        private final Expression l;
        private final Expression r;

        public Addition(Expression l, Expression r) {
            this.l = l;
            this.r = r;
        }

        @Override
        public void push(ByteBuffer bb, CompilerContext ctxt) {
            if (l.getType(ctxt).getClass() != r.getType(ctxt).getClass()) {
                throw new UnsupportedOperationException("Unsupported addition between " + l.getType(ctxt).getClass().getSimpleName()
                    + " and " + r.getType(ctxt).getClass().getSimpleName());
            }
            l.push(bb, ctxt);
            r.push(bb, ctxt);
            bb.put((byte) 0x79); // POP_1
            bb.put((byte) 0x78); // POP_0
            bb.put((byte) 0x01); // ADD_1
            bb.put((byte) 0x70); // PUSH_0
        }

        @Override
        public Type getType(CompilerContext ctxt) {
            return l.getType(ctxt);
        }
    }

    public static class ArrayReference implements Expression {
        private final Expression array;
        private final Expression index;

        public ArrayReference(Expression array, Expression index) {
            this.array = array;
            this.index = index;
        }

        @Override
        public void push(ByteBuffer bb, CompilerContext ctxt) {
            array.push(bb, ctxt);
            index.push(bb, ctxt);
            bb.put((byte) 0x79); // POP_1 - index
            bb.put((byte) 0x78); // POP_0 - address
            bb.put(getSizeArrayOp(getType(ctxt).getSize(ctxt)));
            bb.put((byte) 0x70); // PUSH_0
        }

        @Override
        public Type getType(CompilerContext ctxt) {
            return ((ArrayType) array.getType(ctxt)).innerType;
        }

        private byte getSizeArrayOp(byte size) {
            if (size == 1) {
                return 0x6D; // LOAD_0_ARRAY_ITEM_1_8
            }
            else if (size == 2) {
                return 0x6C; // LOAD_0_ARRAY_ITEM_1_16
            }
            else if (size == 4) {
                return 0x6B; // LOAD_0_ARRAY_ITEM_1_32
            }
            else {
                return 0x6A; // LOAD_0_ARRAY_ITEM_1_64
            }
        }
    }

    public static class StringLiteral implements Expression {
        private String value;

        public StringLiteral(String value) {
            this.value = value.substring(1, value.length() - 1);
        }

        @Override
        public void push(ByteBuffer bb, CompilerContext ctxt) {
            bb.put((byte) 0x64); //NEW_ARRAY_0
            ArrayType type = (ArrayType) getType(ctxt);
            bb.put((byte) (value.length() + 1));
            bb.put((byte) 0x70); // PUSH_0
            bb.put((byte) 0x65); //STORE_0_ARRAY_ITEMS_IMM_8
            bb.put((byte) (value.length() + 1));
            for (char c : value.toCharArray()) {
                bb.put((byte) c);
            }
            bb.put((byte) '\0');
        }

        @Override
        public Type getType(CompilerContext ctxt) {
            return new StringType();
        }
    }

    public static class MethodCall implements Expression {
        private final String objName;
        private final String methodName;
        private final List<Expression> args;

        public MethodCall(String objName, String varName, List<Expression> args) {
            this.objName = objName;
            this.methodName = varName;
            this.args = args;
        }

        @Override
        public void push(ByteBuffer bb, CompilerContext ctxt) {
            if ("system".equals(objName)) {
                if ("print".equals(methodName)) {
                    assert args.size() == 1;
                    Expression arg = args.get(0);
                    arg.push(bb, ctxt);
                    bb.put((byte) 0x78); // POP_0
                    if (arg.getType(ctxt) instanceof ArrayType) {
                        bb.put((byte) 0xF0); // PRINT_0
                    }
                    else {
                        bb.put((byte) 0xF1); // PRINT_CHAR_0
                    }
                }
            }
            else if (objName != null) {
                VariableDeclaration var = ctxt.getVariable(objName);
                ObjectType type = (ObjectType) var.type;
                ObjectDeclaration obj = ctxt.getObject(type.objName);
                int methodId = obj.getMethodIndex(methodName);
                bb.put((byte) 0x88); // CALL_0
                bb.put((byte) obj.id);
                bb.put((byte) methodId);
            }
        }

        @Override
        public Type getType(CompilerContext ctxt) {
            if (objName.equals("system")) {
                return new VoidType();
            }
            VariableDeclaration var = ctxt.getVariable(objName);
            ObjectType type = (ObjectType) var.type;
            ObjectDeclaration obj = ctxt.getObject(type.objName);
            ObjectMethod meth = obj.getMethod(methodName);
            return meth.type;
        }
    }

    public static class ArrayLiteral implements Expression {
        private List<Expression> expressions;

        public ArrayLiteral(List<Expression> expressions) {
            this.expressions = expressions;
        }

        @Override
        public void push(ByteBuffer bb, CompilerContext ctxt) {
            bb.put((byte) 0x64); //NEW_ARRAY_0
            ArrayType type = (ArrayType) getType(ctxt);
            bb.put((byte) (type.innerType.getSize(ctxt) * expressions.size()));
            bb.put((byte) 0x70); // PUSH_0
            int i = 0;
            for (Expression expression : expressions) {
                byte size = expression.getType(ctxt).getSize(ctxt);
                expression.push(bb, ctxt);
                bb.put((byte) 0x79); // POP_1 - value
                bb.put((byte) 0x78); // POP_0 - address
                bb.put(getSizeArrayOp(size));
                bb.put((byte) i); // offset
                bb.put((byte) 0x70); // PUSH_0
                i += size;
            }
        }

        private byte getSizeArrayOp(byte size) {
            if (size == 1) {
                return 0x66; // STORE_0_ARRAY_ITEM_1_8
            }
            else if (size == 2) {
                return 0x67; // STORE_0_ARRAY_ITEM_1_16
            }
            else if (size == 4) {
                return 0x68; // STORE_0_ARRAY_ITEM_1_32
            }
            else {
                return 0x69; // STORE_0_ARRAY_ITEM_1_64
            }
        }

        @Override
        public Type getType(CompilerContext ctxt) {
            if (expressions.size() > 0) {
                return new ArrayType(expressions.get(0).getType(ctxt));
            }
            else {
                return new ArrayType(new VoidType());
            }
        }
    }

    public static class IntLiteral implements Expression {
        public long value;

        public IntLiteral(String value) {
            this.value = Long.parseLong(value);
        }

        @Override
        public void push(ByteBuffer bb, CompilerContext ctxt) {
            bb.put((byte) 0x43); // LD_0_I_64
            bb.putLong(value);
            bb.put((byte) 0x70); // PUSH_0
        }

        @Override
        public Type getType(CompilerContext ctxt) {
            return new IntType();
        }
    }

    public static class VariableFieldReference implements Expression {
        private final String varName;
        private final String fieldName;

        public VariableFieldReference(String varName, String fieldName) {
            this.varName = varName;
            this.fieldName = fieldName;
        }

        @Override
        public void push(ByteBuffer bb, CompilerContext ctxt) {
            VariableDeclaration var = ctxt.getVariable(varName);
            bb.put((byte) 0x30); // LD_0_N
            bb.put((byte) var.id);

            if (var.type instanceof ObjectType) {
                ObjectType type = (ObjectType) var.type;
                ObjectDeclaration obj = ctxt.getObject(type.objName);
                int argIndex = obj.getFieldIndex(fieldName);
                bb.put((byte) 0x62); // LOAD_OBJ_ARG_0
                bb.put((byte) obj.id);
                bb.put((byte) argIndex);
            }
            else {
                // TODO
            }

            bb.put((byte) 0x70); // PUSH_0
        }

        @Override
        public Type getType(CompilerContext ctxt) {
            VariableDeclaration var = ctxt.getVariable(varName);
            ObjectType type = (ObjectType) var.type;
            ObjectDeclaration obj = ctxt.getObject(type.objName);
            ObjectField field = obj.getField(fieldName);
            return field.type;
        }
    }

    public static class VariableReference implements Expression {
        private String varName;

        public VariableReference(String varName) {
            this.varName = varName;
        }

        @Override
        public void push(ByteBuffer bb, CompilerContext ctxt) {
            VariableDeclaration var = ctxt.getVariable(varName);
            bb.put((byte) 0x30); // LD_0_N
            bb.put((byte) var.id);
            bb.put((byte) 0x70); // PUSH_0

        }

        @Override
        public Type getType(CompilerContext ctxt) {
            return ctxt.getVariable(varName).type;
        }
    }

    public static class ObjectAllocation implements Expression {
        private String name;
        private Map<String, Expression> fields = new HashMap<>();

        public ObjectAllocation(String name, List<FieldAllocContext> fieldAlloc) {
            this.name = name;
            for (FieldAllocContext ctxt : fieldAlloc) {
                fields.put(ctxt.name.getText(), parse(ctxt.expression()));
            }
        }

        @Override
        public void push(ByteBuffer bb, CompilerContext ctxt) {
            ObjectDeclaration obj = ctxt.getObject(name);
            bb.put((byte) 0x61); // NEW_OBJ_0
            bb.put((byte) obj.id);
            bb.put((byte) 0x70); // PUSH_0
            for (Map.Entry<String, Expression> entry : fields.entrySet()) {
                entry.getValue().push(bb, ctxt);
                bb.put((byte) 0x79); // POP_1
                bb.put((byte) 0x78); // POP_0
                bb.put((byte) 0x70); // PUSH_0

                int argIndex = obj.getFieldIndex(entry.getKey());

                bb.put((byte) 0x63); // STORE_OBJ_0_ARG_1
                bb.put((byte) obj.id);
                bb.put((byte) argIndex);
            }
        }

        @Override
        public Type getType(CompilerContext ctxt) {
            return new ObjectType(name);
        }
    }

    public static class Return implements Statement {
        private Expression exp;

        public Return(Expression exp) {
            this.exp = exp;
        }

        @Override
        public void push(ByteBuffer bb, CompilerContext ctxt) {
            exp.push(bb, ctxt);
            bb.put((byte) 0x89); // RET;
        }
    }

    public static class VariableDeclaration implements Statement {
        private static int variableId = 10;
        private int id;
        private Type type;
        private String varName;
        private Expression exp;

        public VariableDeclaration(Type type, String varName, Expression exp) {
            id = variableId++;
            this.type = type;
            this.varName = varName;
            this.exp = exp;
        }

        @Override
        public void push(ByteBuffer bb, CompilerContext ctxt) {
            ctxt.putVariable(varName, this);

            exp.push(bb, ctxt);
            bb.put((byte) 0x78); // POP_0
            bb.put((byte) 0x2F); // LD_N_0
            bb.put((byte) id);
        }
    }

    public static class MethodCallStatement implements Statement {
        private final MethodCall exp;

        public MethodCallStatement(String objName, String text, List<Expression> collect) {
            exp = new MethodCall(objName, text, collect);
        }

        @Override
        public void push(ByteBuffer bb, CompilerContext ctxt) {
            exp.push(bb, ctxt);
            if (exp.getType(ctxt).getSize(ctxt) > 0) {
                bb.put((byte) 0x78); //POP_0 <- pop method return
            }
        }
    }

    public static class Loop implements Statement {
        private Expression conditional;
        private List<Statement> statements;

        public Loop(Expression conditional, List<Statement> statements) {
            this.conditional = conditional;
            this.statements = statements;
        }

        @Override
        public void push(ByteBuffer bb, CompilerContext ctxt) {
            CompilerContext scopeCtxt = new CompilerContext(ctxt);
            bb.put((byte) 0x83); //LABEL_0
            bb.put((byte) 0x70); //PUSH_0
            statements.forEach(s -> s.push(bb, scopeCtxt));
            conditional.push(bb, ctxt);
            bb.put((byte) 0x78); //POP_0 <- the conditional
            bb.put((byte) 0x78); //POP_0 <- the label
            bb.put((byte) 0x81); //JMP_NZ <- continue loop if conditional is zero
        }
    }

    public static class VariableAssignment implements Statement {
        private FieldDerefContext fieldDeref;
        private String varName;
        private Expression exp;

        public VariableAssignment(String varName, FieldDerefContext fieldDeref, Expression exp) {
            this.varName = varName;
            this.fieldDeref = fieldDeref;
            this.exp = exp;
        }

        @Override
        public void push(ByteBuffer bb, CompilerContext ctxt) {
            VariableDeclaration variable = ctxt.getVariable(varName);
            exp.push(bb, ctxt);

            if (fieldDeref == null || fieldDeref.isEmpty()) {
                bb.put((byte) 0x78); // POP_0
                bb.put((byte) 0x2F); // LD_N_0
                bb.put((byte) variable.id);
            }
            else if (variable.type instanceof ObjectType) {
                ObjectType type = (ObjectType) variable.type;
                ObjectDeclaration obj = ctxt.getObject(type.objName);
                int attrIndex = obj.getFieldIndex(fieldDeref.name.getText());

                bb.put((byte) 0x30); // LD_0_N
                bb.put((byte) variable.id);
                bb.put((byte) 0x79); // POP_1
                bb.put((byte) 0x63); // STORE_OBJ_0_ARG_1
                bb.put((byte) obj.id);
                bb.put((byte) attrIndex);
            }
            else {
                // unhandled
            }
        }
    }

    public static class MethodParameter {
        private String name;
        private int id;
        private Type type;

        public MethodParameter(String name, int id, Type type) {
            this.name = name;
            this.id = id;
            this.type = type;
        }
    }

    public static class ObjectMethod implements Expression {
        public static final int size = 8;
        int index;
        Type type;
        List<MethodParameter> parameters;
        List<Statement> statements;
        String name;

        @Override
        public void push(ByteBuffer bb, CompilerContext ctxt) {
            statements.forEach(s -> s.push(bb, ctxt));
        }

        @Override
        public Type getType(CompilerContext ctxt) {
            return type;
        }
    }

    public static class ObjectDeclaration implements Statement {
        private static int counter = 1;
        private int id;
        private String name;
        List<ObjectField> fields = new ArrayList<>();
        List<ObjectMethod> methods = new ArrayList<>();

        public ObjectDeclaration(String name, List<MethodDeclContext> methodDeclContexts, List<FieldDeclContext> fieldDecl) {
            this.id = counter++;
            this.name = name;
            int i = 0;
            for (EchetlonParser.FieldDeclContext field : fieldDecl) {
                ObjectField f = new ObjectField(field.IDENTIFIER().getText(), i++, parse(field.type()));
                fields.add(f);
            }
            i = 0;
            for (MethodDeclContext ctxt : methodDeclContexts) {
                ObjectMethod method = new ObjectMethod();
                method.type = parse(ctxt.type());
                method.index = i++;
                method.statements = ctxt.statement().stream().map(EchetlonCompiler::parse).collect(Collectors.toList());
                method.name = ctxt.name.getText();
                int j = 0;
                method.parameters = new ArrayList<>();
                for (ArgumentContext arg : ctxt.argument()) {
                    method.parameters.add(new MethodParameter(arg.getText(), j++, parse(arg.type())));
                }
                methods.add(method);
            }
        }

        @Override
        public void push(ByteBuffer bb, CompilerContext ctxt) {
            ctxt.putObject(name, this);
            bb.put((byte) 0x60);
            bb.put((byte) id);
            bb.put((byte) (fields.size()));
            for (ObjectField f : fields) {
                bb.put(f.type.getSize(ctxt));
            }
            // define methods
            for (ObjectMethod method : methods) {
                bb.put((byte) 0x90); // DEFINE_METHOD
                bb.put((byte) id);
                bb.put((byte) method.index);
                CompilerContext context = new CompilerContext(ctxt);
                ByteBuffer allocate = ByteBuffer.allocate(2000);
                method.push(allocate, context);
                bb.putShort((short) allocate.position());
                int position = allocate.position();
                allocate.flip();
                for (int i = 0; i < position; i++) {
                    bb.put(allocate.get());
                }
            }
        }

        public int getFieldIndex(String key) {
            int i = 0;
            for (ObjectField f : fields) {
                if (f.name.equals(key)) {
                    break;
                }
                i++;
            }
            return i;
        }

        public ObjectField getField(String key) {
            for (ObjectField f : fields) {
                if (f.name.equals(key)) {
                    return f;
                }
            }
            return null;
        }

        public int getMethodIndex(String key) {
            int i = 0;
            for (ObjectMethod m : methods) {
                if (m.name.equals(key)) {
                    break;
                }
                i++;
            }
            return i;
        }

        public ObjectMethod getMethod(String key) {
            for (ObjectMethod m : methods) {
                if (m.name.equals(key)) {
                    return m;
                }
            }
            return null;
        }
    }
}

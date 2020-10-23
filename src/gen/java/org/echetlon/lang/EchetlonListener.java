// Generated from C:/projects/java/echetlon-lang\Echetlon.g4 by ANTLR 4.8
package org.echetlon.lang;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EchetlonParser}.
 */
public interface EchetlonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EchetlonParser#singleType}.
	 * @param ctx the parse tree
	 */
	void enterSingleType(EchetlonParser.SingleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EchetlonParser#singleType}.
	 * @param ctx the parse tree
	 */
	void exitSingleType(EchetlonParser.SingleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EchetlonParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(EchetlonParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link EchetlonParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(EchetlonParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link EchetlonParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(EchetlonParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EchetlonParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(EchetlonParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EchetlonParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void enterFieldDecl(EchetlonParser.FieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link EchetlonParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void exitFieldDecl(EchetlonParser.FieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link EchetlonParser#fieldAlloc}.
	 * @param ctx the parse tree
	 */
	void enterFieldAlloc(EchetlonParser.FieldAllocContext ctx);
	/**
	 * Exit a parse tree produced by {@link EchetlonParser#fieldAlloc}.
	 * @param ctx the parse tree
	 */
	void exitFieldAlloc(EchetlonParser.FieldAllocContext ctx);
	/**
	 * Enter a parse tree produced by {@link EchetlonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(EchetlonParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EchetlonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(EchetlonParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link EchetlonParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(EchetlonParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link EchetlonParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(EchetlonParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link EchetlonParser#objDecl}.
	 * @param ctx the parse tree
	 */
	void enterObjDecl(EchetlonParser.ObjDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link EchetlonParser#objDecl}.
	 * @param ctx the parse tree
	 */
	void exitObjDecl(EchetlonParser.ObjDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link EchetlonParser#objAlloc}.
	 * @param ctx the parse tree
	 */
	void enterObjAlloc(EchetlonParser.ObjAllocContext ctx);
	/**
	 * Exit a parse tree produced by {@link EchetlonParser#objAlloc}.
	 * @param ctx the parse tree
	 */
	void exitObjAlloc(EchetlonParser.ObjAllocContext ctx);
	/**
	 * Enter a parse tree produced by {@link EchetlonParser#varObjDec}.
	 * @param ctx the parse tree
	 */
	void enterVarObjDec(EchetlonParser.VarObjDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link EchetlonParser#varObjDec}.
	 * @param ctx the parse tree
	 */
	void exitVarObjDec(EchetlonParser.VarObjDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link EchetlonParser#fieldDeref}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeref(EchetlonParser.FieldDerefContext ctx);
	/**
	 * Exit a parse tree produced by {@link EchetlonParser#fieldDeref}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeref(EchetlonParser.FieldDerefContext ctx);
	/**
	 * Enter a parse tree produced by {@link EchetlonParser#varAss}.
	 * @param ctx the parse tree
	 */
	void enterVarAss(EchetlonParser.VarAssContext ctx);
	/**
	 * Exit a parse tree produced by {@link EchetlonParser#varAss}.
	 * @param ctx the parse tree
	 */
	void exitVarAss(EchetlonParser.VarAssContext ctx);
	/**
	 * Enter a parse tree produced by {@link EchetlonParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(EchetlonParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link EchetlonParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(EchetlonParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link EchetlonParser#methodCallStmt}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallStmt(EchetlonParser.MethodCallStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EchetlonParser#methodCallStmt}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallStmt(EchetlonParser.MethodCallStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EchetlonParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(EchetlonParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EchetlonParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(EchetlonParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EchetlonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(EchetlonParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EchetlonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(EchetlonParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strLiteral}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStrLiteral(EchetlonParser.StrLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strLiteral}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStrLiteral(EchetlonParser.StrLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd(EchetlonParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd(EchetlonParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSub(EchetlonParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSub(EchetlonParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varFieldRef}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVarFieldRef(EchetlonParser.VarFieldRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varFieldRef}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVarFieldRef(EchetlonParser.VarFieldRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayLiteral}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(EchetlonParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayLiteral}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(EchetlonParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(EchetlonParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(EchetlonParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExp}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExp(EchetlonParser.ParenExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExp}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExp(EchetlonParser.ParenExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objVal}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjVal(EchetlonParser.ObjValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objVal}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjVal(EchetlonParser.ObjValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayRef}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayRef(EchetlonParser.ArrayRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayRef}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayRef(EchetlonParser.ArrayRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varRef}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVarRef(EchetlonParser.VarRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varRef}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVarRef(EchetlonParser.VarRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(EchetlonParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(EchetlonParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link EchetlonParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(EchetlonParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link EchetlonParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(EchetlonParser.FileContext ctx);
}
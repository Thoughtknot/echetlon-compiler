// Generated from C:/projects/java/echetlon-lang\Echetlon.g4 by ANTLR 4.8
package org.echetlon.lang;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EchetlonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EchetlonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EchetlonParser#singleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleType(EchetlonParser.SingleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EchetlonParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(EchetlonParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link EchetlonParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(EchetlonParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EchetlonParser#fieldDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDecl(EchetlonParser.FieldDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link EchetlonParser#fieldAlloc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAlloc(EchetlonParser.FieldAllocContext ctx);
	/**
	 * Visit a parse tree produced by {@link EchetlonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(EchetlonParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link EchetlonParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(EchetlonParser.MethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link EchetlonParser#objDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjDecl(EchetlonParser.ObjDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link EchetlonParser#objAlloc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjAlloc(EchetlonParser.ObjAllocContext ctx);
	/**
	 * Visit a parse tree produced by {@link EchetlonParser#varObjDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarObjDec(EchetlonParser.VarObjDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link EchetlonParser#fieldDeref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeref(EchetlonParser.FieldDerefContext ctx);
	/**
	 * Visit a parse tree produced by {@link EchetlonParser#varAss}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAss(EchetlonParser.VarAssContext ctx);
	/**
	 * Visit a parse tree produced by {@link EchetlonParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(EchetlonParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link EchetlonParser#methodCallStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallStmt(EchetlonParser.MethodCallStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EchetlonParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(EchetlonParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EchetlonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(EchetlonParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strLiteral}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrLiteral(EchetlonParser.StrLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(EchetlonParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(EchetlonParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varFieldRef}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarFieldRef(EchetlonParser.VarFieldRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLiteral}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(EchetlonParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(EchetlonParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExp}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExp(EchetlonParser.ParenExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objVal}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjVal(EchetlonParser.ObjValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayRef}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayRef(EchetlonParser.ArrayRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varRef}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarRef(EchetlonParser.VarRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link EchetlonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(EchetlonParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link EchetlonParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(EchetlonParser.FileContext ctx);
}
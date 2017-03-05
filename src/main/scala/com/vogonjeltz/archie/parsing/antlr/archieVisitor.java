// Generated from C:/Users/Freddie/Google Drive/Programming/IdeaProjects/Archie/src/main/scala/com/vogonjeltz/archie/parsing/antlr\archie.g4 by ANTLR 4.6
package com.vogonjeltz.archie.parsing.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link archieParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface archieVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link archieParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(archieParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link archieParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(archieParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link archieParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(archieParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link archieParser#classHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassHeader(archieParser.ClassHeaderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code combinedID}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinedID(archieParser.CombinedIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketedElement}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketedElement(archieParser.BracketedElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseElement}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseElement(archieParser.ElseElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(archieParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileElement}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileElement(archieParser.WhileElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newObj}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewObj(archieParser.NewObjContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literal}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(archieParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code textID}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextID(archieParser.TextIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code codeBlock}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlock(archieParser.CodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(archieParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionLiteral}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionLiteral(archieParser.FunctionLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(archieParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opFunctionCall}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpFunctionCall(archieParser.OpFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link archieParser#instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstantiation(archieParser.InstantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link archieParser#elementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementList(archieParser.ElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link archieParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(archieParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link archieParser#nameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameList(archieParser.NameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link archieParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(archieParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link archieParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(archieParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link archieParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(archieParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link archieParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(archieParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link archieParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(archieParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link archieParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(archieParser.NameContext ctx);
}
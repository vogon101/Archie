// Generated from archie.g4 by ANTLR 4.6
package com.vogonjeltz.archie.parsing.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link archieParser}.
 */
public interface archieListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link archieParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(archieParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link archieParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(archieParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link archieParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(archieParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link archieParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(archieParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link archieParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(archieParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link archieParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(archieParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link archieParser#classHeader}.
	 * @param ctx the parse tree
	 */
	void enterClassHeader(archieParser.ClassHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link archieParser#classHeader}.
	 * @param ctx the parse tree
	 */
	void exitClassHeader(archieParser.ClassHeaderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code combinedID}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 */
	void enterCombinedID(archieParser.CombinedIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code combinedID}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 */
	void exitCombinedID(archieParser.CombinedIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketedElement}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 */
	void enterBracketedElement(archieParser.BracketedElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketedElement}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 */
	void exitBracketedElement(archieParser.BracketedElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elseElement}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElseElement(archieParser.ElseElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elseElement}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElseElement(archieParser.ElseElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(archieParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(archieParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileElement}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 */
	void enterWhileElement(archieParser.WhileElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileElement}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 */
	void exitWhileElement(archieParser.WhileElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newObj}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 */
	void enterNewObj(archieParser.NewObjContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newObj}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 */
	void exitNewObj(archieParser.NewObjContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literal}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(archieParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literal}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(archieParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textID}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 */
	void enterTextID(archieParser.TextIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textID}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 */
	void exitTextID(archieParser.TextIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code codeBlock}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(archieParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code codeBlock}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(archieParser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(archieParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(archieParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionLiteral}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 */
	void enterFunctionLiteral(archieParser.FunctionLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionLiteral}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 */
	void exitFunctionLiteral(archieParser.FunctionLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 */
	void enterIf(archieParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 */
	void exitIf(archieParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opFunctionCall}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 */
	void enterOpFunctionCall(archieParser.OpFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opFunctionCall}
	 * labeled alternative in {@link archieParser#element}.
	 * @param ctx the parse tree
	 */
	void exitOpFunctionCall(archieParser.OpFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link archieParser#instantiation}.
	 * @param ctx the parse tree
	 */
	void enterInstantiation(archieParser.InstantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link archieParser#instantiation}.
	 * @param ctx the parse tree
	 */
	void exitInstantiation(archieParser.InstantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link archieParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(archieParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link archieParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(archieParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link archieParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(archieParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link archieParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(archieParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link archieParser#nameList}.
	 * @param ctx the parse tree
	 */
	void enterNameList(archieParser.NameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link archieParser#nameList}.
	 * @param ctx the parse tree
	 */
	void exitNameList(archieParser.NameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link archieParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(archieParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link archieParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(archieParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link archieParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(archieParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link archieParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(archieParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link archieParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(archieParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link archieParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(archieParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link archieParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(archieParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link archieParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(archieParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link archieParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(archieParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link archieParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(archieParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link archieParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(archieParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link archieParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(archieParser.NameContext ctx);
}
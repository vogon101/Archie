// Generated from C:/Users/Freddie/Google Drive/Programming/IdeaProjects/Archie/src/main/scala/com/vogonjeltz/archie/parsing/antlr\archie.g4 by ANTLR 4.6
package com.vogonjeltz.archie.parsing.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class archieParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, IF=4, ELSE=5, CLASS=6, WHILE=7, RETURN=8, BOOLEAN_LITERAL_TOKEN=9, 
		STRING_LITERAL_TOKEN=10, ALPHA_NUMERIC_NAME=11, SYMBOL=12, INTEGER_LITERAL=13, 
		FLOAT_LITERAL=14, FARROW=15, WS=16, SKP=17, COMMENT=18, DOT=19, COMMA=20, 
		EQ=21, O_R_BRACK=22, C_R_BRACK=23, O_C_BRACK=24, C_C_BRACK=25;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_classDef = 2, RULE_classHeader = 3, 
		RULE_element = 4, RULE_instantiation = 5, RULE_elementList = 6, RULE_identifier = 7, 
		RULE_nameList = 8, RULE_value = 9, RULE_booleanLiteral = 10, RULE_stringLiteral = 11, 
		RULE_floatLiteral = 12, RULE_integerLiteral = 13, RULE_name = 14;
	public static final String[] ruleNames = {
		"program", "line", "classDef", "classHeader", "element", "instantiation", 
		"elementList", "identifier", "nameList", "value", "booleanLiteral", "stringLiteral", 
		"floatLiteral", "integerLiteral", "name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\n'", "';'", "'new'", "'if'", "'else'", "'class'", "'while'", 
		"'return'", null, null, null, null, null, null, "'=>'", null, null, null, 
		"'.'", "','", "'='", "'('", "')'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "IF", "ELSE", "CLASS", "WHILE", "RETURN", "BOOLEAN_LITERAL_TOKEN", 
		"STRING_LITERAL_TOKEN", "ALPHA_NUMERIC_NAME", "SYMBOL", "INTEGER_LITERAL", 
		"FLOAT_LITERAL", "FARROW", "WS", "SKP", "COMMENT", "DOT", "COMMA", "EQ", 
		"O_R_BRACK", "C_R_BRACK", "O_C_BRACK", "C_C_BRACK"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "archie.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public archieParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(archieParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof archieVisitor ) return ((archieVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(30);
				match(T__0);
				}
			}

			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << IF) | (1L << CLASS) | (1L << WHILE) | (1L << RETURN) | (1L << BOOLEAN_LITERAL_TOKEN) | (1L << STRING_LITERAL_TOKEN) | (1L << ALPHA_NUMERIC_NAME) | (1L << SYMBOL) | (1L << INTEGER_LITERAL) | (1L << FLOAT_LITERAL) | (1L << COMMENT) | (1L << EQ) | (1L << O_R_BRACK) | (1L << O_C_BRACK))) != 0)) {
				{
				{
				setState(33);
				line();
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public ClassDefContext classDef() {
			return getRuleContext(ClassDefContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(archieParser.COMMENT, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof archieVisitor ) return ((archieVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				classDef();
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(42);
					match(T__0);
					}
					}
					setState(45); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				break;
			case T__2:
			case IF:
			case WHILE:
			case RETURN:
			case BOOLEAN_LITERAL_TOKEN:
			case STRING_LITERAL_TOKEN:
			case ALPHA_NUMERIC_NAME:
			case SYMBOL:
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case EQ:
			case O_R_BRACK:
			case O_C_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				element(0);
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(48);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==T__1) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(51); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 || _la==T__1 );
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				match(COMMENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDefContext extends ParserRuleContext {
		public ClassHeaderContext classHeader() {
			return getRuleContext(ClassHeaderContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).exitClassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof archieVisitor ) return ((archieVisitor<? extends T>)visitor).visitClassDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			classHeader();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << BOOLEAN_LITERAL_TOKEN) | (1L << STRING_LITERAL_TOKEN) | (1L << ALPHA_NUMERIC_NAME) | (1L << SYMBOL) | (1L << INTEGER_LITERAL) | (1L << FLOAT_LITERAL) | (1L << EQ) | (1L << O_R_BRACK) | (1L << O_C_BRACK))) != 0)) {
				{
				setState(57);
				element(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassHeaderContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(archieParser.CLASS, 0); }
		public TerminalNode ALPHA_NUMERIC_NAME() { return getToken(archieParser.ALPHA_NUMERIC_NAME, 0); }
		public NameListContext nameList() {
			return getRuleContext(NameListContext.class,0);
		}
		public ClassHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).enterClassHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).exitClassHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof archieVisitor ) return ((archieVisitor<? extends T>)visitor).visitClassHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassHeaderContext classHeader() throws RecognitionException {
		ClassHeaderContext _localctx = new ClassHeaderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(CLASS);
			setState(61);
			match(ALPHA_NUMERIC_NAME);
			setState(62);
			nameList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	 
		public ElementContext() { }
		public void copyFrom(ElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CombinedIDContext extends ElementContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(archieParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(archieParser.DOT, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public CombinedIDContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).enterCombinedID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).exitCombinedID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof archieVisitor ) return ((archieVisitor<? extends T>)visitor).visitCombinedID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketedElementContext extends ElementContext {
		public TerminalNode O_R_BRACK() { return getToken(archieParser.O_R_BRACK, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode C_R_BRACK() { return getToken(archieParser.C_R_BRACK, 0); }
		public BracketedElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).enterBracketedElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).exitBracketedElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof archieVisitor ) return ((archieVisitor<? extends T>)visitor).visitBracketedElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElseElementContext extends ElementContext {
		public TerminalNode IF() { return getToken(archieParser.IF, 0); }
		public TerminalNode O_R_BRACK() { return getToken(archieParser.O_R_BRACK, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode C_R_BRACK() { return getToken(archieParser.C_R_BRACK, 0); }
		public TerminalNode ELSE() { return getToken(archieParser.ELSE, 0); }
		public ElseElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).enterElseElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).exitElseElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof archieVisitor ) return ((archieVisitor<? extends T>)visitor).visitElseElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentContext extends ElementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(archieParser.EQ, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public AssignmentContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof archieVisitor ) return ((archieVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileElementContext extends ElementContext {
		public TerminalNode WHILE() { return getToken(archieParser.WHILE, 0); }
		public TerminalNode O_R_BRACK() { return getToken(archieParser.O_R_BRACK, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode C_R_BRACK() { return getToken(archieParser.C_R_BRACK, 0); }
		public WhileElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).enterWhileElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).exitWhileElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof archieVisitor ) return ((archieVisitor<? extends T>)visitor).visitWhileElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewObjContext extends ElementContext {
		public InstantiationContext instantiation() {
			return getRuleContext(InstantiationContext.class,0);
		}
		public NewObjContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).enterNewObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).exitNewObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof archieVisitor ) return ((archieVisitor<? extends T>)visitor).visitNewObj(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralContext extends ElementContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public LiteralContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof archieVisitor ) return ((archieVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TextIDContext extends ElementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TextIDContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).enterTextID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).exitTextID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof archieVisitor ) return ((archieVisitor<? extends T>)visitor).visitTextID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CodeBlockContext extends ElementContext {
		public TerminalNode O_C_BRACK() { return getToken(archieParser.O_C_BRACK, 0); }
		public TerminalNode C_C_BRACK() { return getToken(archieParser.C_C_BRACK, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public CodeBlockContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).exitCodeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof archieVisitor ) return ((archieVisitor<? extends T>)visitor).visitCodeBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends ElementContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public FunctionCallContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof archieVisitor ) return ((archieVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionLiteralContext extends ElementContext {
		public NameListContext nameList() {
			return getRuleContext(NameListContext.class,0);
		}
		public TerminalNode FARROW() { return getToken(archieParser.FARROW, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public FunctionLiteralContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).enterFunctionLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).exitFunctionLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof archieVisitor ) return ((archieVisitor<? extends T>)visitor).visitFunctionLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnElementContext extends ElementContext {
		public TerminalNode RETURN() { return getToken(archieParser.RETURN, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ReturnElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).enterReturnElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).exitReturnElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof archieVisitor ) return ((archieVisitor<? extends T>)visitor).visitReturnElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends ElementContext {
		public TerminalNode IF() { return getToken(archieParser.IF, 0); }
		public TerminalNode O_R_BRACK() { return getToken(archieParser.O_R_BRACK, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode C_R_BRACK() { return getToken(archieParser.C_R_BRACK, 0); }
		public IfContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof archieVisitor ) return ((archieVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpFunctionCallContext extends ElementContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OpFunctionCallContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).enterOpFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).exitOpFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof archieVisitor ) return ((archieVisitor<? extends T>)visitor).visitOpFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		return element(0);
	}

	private ElementContext element(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ElementContext _localctx = new ElementContext(_ctx, _parentState);
		ElementContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_element, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new BracketedElementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(65);
				match(O_R_BRACK);
				setState(66);
				element(0);
				setState(67);
				match(C_R_BRACK);
				}
				break;
			case 2:
				{
				_localctx = new FunctionLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				nameList();
				setState(70);
				match(FARROW);
				setState(71);
				element(11);
				}
				break;
			case 3:
				{
				_localctx = new CodeBlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				match(O_C_BRACK);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(74);
					match(T__0);
					}
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(80);
						element(0);
						setState(82); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(81);
							_la = _input.LA(1);
							if ( !(_la==T__0 || _la==T__1) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							}
							setState(84); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==T__0 || _la==T__1 );
						}
						} 
					}
					setState(90);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << BOOLEAN_LITERAL_TOKEN) | (1L << STRING_LITERAL_TOKEN) | (1L << ALPHA_NUMERIC_NAME) | (1L << SYMBOL) | (1L << INTEGER_LITERAL) | (1L << FLOAT_LITERAL) | (1L << EQ) | (1L << O_R_BRACK) | (1L << O_C_BRACK))) != 0)) {
					{
					setState(91);
					element(0);
					}
				}

				setState(94);
				match(C_C_BRACK);
				}
				break;
			case 4:
				{
				_localctx = new AssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				identifier();
				setState(96);
				match(EQ);
				setState(97);
				element(9);
				}
				break;
			case 5:
				{
				_localctx = new ElseElementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				match(IF);
				setState(100);
				match(O_R_BRACK);
				setState(101);
				element(0);
				setState(102);
				match(C_R_BRACK);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(103);
					match(T__0);
					}
				}

				setState(106);
				element(0);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0 || _la==T__1) {
					{
					setState(107);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==T__1) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(110);
				match(ELSE);
				setState(111);
				element(8);
				}
				break;
			case 6:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(IF);
				setState(114);
				match(O_R_BRACK);
				setState(115);
				element(0);
				setState(116);
				match(C_R_BRACK);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(117);
					match(T__0);
					}
				}

				setState(120);
				element(7);
				}
				break;
			case 7:
				{
				_localctx = new WhileElementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(WHILE);
				setState(123);
				match(O_R_BRACK);
				setState(124);
				element(0);
				setState(125);
				match(C_R_BRACK);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(126);
					match(T__0);
					}
				}

				setState(129);
				element(6);
				}
				break;
			case 8:
				{
				_localctx = new ReturnElementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				match(RETURN);
				setState(132);
				element(5);
				}
				break;
			case 9:
				{
				_localctx = new TextIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				identifier();
				}
				break;
			case 10:
				{
				_localctx = new NewObjContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				instantiation();
				}
				break;
			case 11:
				{
				_localctx = new LiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				value();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(151);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new OpFunctionCallContext(new ElementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_element);
						setState(138);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(139);
						name();
						setState(140);
						element(13);
						}
						break;
					case 2:
						{
						_localctx = new FunctionCallContext(new ElementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_element);
						setState(142);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(143);
						elementList();
						}
						break;
					case 3:
						{
						_localctx = new CombinedIDContext(new ElementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_element);
						setState(144);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(147); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(145);
								match(DOT);
								setState(146);
								name();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(149); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InstantiationContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public InstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instantiation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).enterInstantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).exitInstantiation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof archieVisitor ) return ((archieVisitor<? extends T>)visitor).visitInstantiation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstantiationContext instantiation() throws RecognitionException {
		InstantiationContext _localctx = new InstantiationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instantiation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__2);
			setState(157);
			name();
			setState(158);
			elementList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementListContext extends ParserRuleContext {
		public TerminalNode O_R_BRACK() { return getToken(archieParser.O_R_BRACK, 0); }
		public TerminalNode C_R_BRACK() { return getToken(archieParser.C_R_BRACK, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(archieParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(archieParser.COMMA, i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).exitElementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof archieVisitor ) return ((archieVisitor<? extends T>)visitor).visitElementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(O_R_BRACK);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << BOOLEAN_LITERAL_TOKEN) | (1L << STRING_LITERAL_TOKEN) | (1L << ALPHA_NUMERIC_NAME) | (1L << SYMBOL) | (1L << INTEGER_LITERAL) | (1L << FLOAT_LITERAL) | (1L << EQ) | (1L << O_R_BRACK) | (1L << O_C_BRACK))) != 0)) {
				{
				setState(161);
				element(0);
				}
			}

			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(164);
				match(COMMA);
				setState(165);
				element(0);
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(C_R_BRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(archieParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(archieParser.DOT, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof archieVisitor ) return ((archieVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_identifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			name();
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(174);
					match(DOT);
					setState(175);
					name();
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameListContext extends ParserRuleContext {
		public TerminalNode O_R_BRACK() { return getToken(archieParser.O_R_BRACK, 0); }
		public TerminalNode C_R_BRACK() { return getToken(archieParser.C_R_BRACK, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(archieParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(archieParser.COMMA, i);
		}
		public NameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).enterNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).exitNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof archieVisitor ) return ((archieVisitor<? extends T>)visitor).visitNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameListContext nameList() throws RecognitionException {
		NameListContext _localctx = new NameListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nameList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(O_R_BRACK);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(182);
					name();
					setState(183);
					match(COMMA);
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALPHA_NUMERIC_NAME) | (1L << SYMBOL) | (1L << EQ))) != 0)) {
				{
				setState(190);
				name();
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(191);
					match(COMMA);
					}
				}

				}
			}

			setState(196);
			match(C_R_BRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof archieVisitor ) return ((archieVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_value);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				floatLiteral();
				}
				break;
			case STRING_LITERAL_TOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				stringLiteral();
				}
				break;
			case BOOLEAN_LITERAL_TOKEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				booleanLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode BOOLEAN_LITERAL_TOKEN() { return getToken(archieParser.BOOLEAN_LITERAL_TOKEN, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof archieVisitor ) return ((archieVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_booleanLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(BOOLEAN_LITERAL_TOKEN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL_TOKEN() { return getToken(archieParser.STRING_LITERAL_TOKEN, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof archieVisitor ) return ((archieVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(STRING_LITERAL_TOKEN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(archieParser.FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof archieVisitor ) return ((archieVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(FLOAT_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(archieParser.INTEGER_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof archieVisitor ) return ((archieVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(INTEGER_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode ALPHA_NUMERIC_NAME() { return getToken(archieParser.ALPHA_NUMERIC_NAME, 0); }
		public TerminalNode SYMBOL() { return getToken(archieParser.SYMBOL, 0); }
		public List<TerminalNode> EQ() { return getTokens(archieParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(archieParser.EQ, i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof archieListener ) ((archieListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof archieVisitor ) return ((archieVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_name);
		try {
			int _alt;
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALPHA_NUMERIC_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(ALPHA_NUMERIC_NAME);
				}
				break;
			case SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(SYMBOL);
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				match(EQ);
				setState(216); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(215);
						match(EQ);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(218); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return element_sempred((ElementContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean element_sempred(ElementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\33\u00e1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\5\2\"\n\2\3\2"+
		"\7\2%\n\2\f\2\16\2(\13\2\3\2\3\2\3\3\3\3\6\3.\n\3\r\3\16\3/\3\3\3\3\6"+
		"\3\64\n\3\r\3\16\3\65\3\3\5\39\n\3\3\4\3\4\5\4=\n\4\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6N\n\6\f\6\16\6Q\13\6\3\6"+
		"\3\6\6\6U\n\6\r\6\16\6V\7\6Y\n\6\f\6\16\6\\\13\6\3\6\5\6_\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6k\n\6\3\6\3\6\5\6o\n\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6y\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0082\n"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u008b\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\6\6\u0096\n\6\r\6\16\6\u0097\7\6\u009a\n\6\f\6\16\6\u009d\13"+
		"\6\3\7\3\7\3\7\3\7\3\b\3\b\5\b\u00a5\n\b\3\b\3\b\7\b\u00a9\n\b\f\b\16"+
		"\b\u00ac\13\b\3\b\3\b\3\t\3\t\3\t\7\t\u00b3\n\t\f\t\16\t\u00b6\13\t\3"+
		"\n\3\n\3\n\3\n\7\n\u00bc\n\n\f\n\16\n\u00bf\13\n\3\n\3\n\5\n\u00c3\n\n"+
		"\5\n\u00c5\n\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u00cd\n\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\6\20\u00db\n\20\r\20\16\20"+
		"\u00dc\5\20\u00df\n\20\3\20\2\3\n\21\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36\2\3\3\2\3\4\u00fa\2!\3\2\2\2\48\3\2\2\2\6:\3\2\2\2\b>\3\2\2\2\n"+
		"\u008a\3\2\2\2\f\u009e\3\2\2\2\16\u00a2\3\2\2\2\20\u00af\3\2\2\2\22\u00b7"+
		"\3\2\2\2\24\u00cc\3\2\2\2\26\u00ce\3\2\2\2\30\u00d0\3\2\2\2\32\u00d2\3"+
		"\2\2\2\34\u00d4\3\2\2\2\36\u00de\3\2\2\2 \"\7\3\2\2! \3\2\2\2!\"\3\2\2"+
		"\2\"&\3\2\2\2#%\5\4\3\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3"+
		"\2\2\2(&\3\2\2\2)*\7\2\2\3*\3\3\2\2\2+-\5\6\4\2,.\7\3\2\2-,\3\2\2\2./"+
		"\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\609\3\2\2\2\61\63\5\n\6\2\62\64\t\2\2\2"+
		"\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\669\3\2\2\2\67"+
		"9\7\24\2\28+\3\2\2\28\61\3\2\2\28\67\3\2\2\29\5\3\2\2\2:<\5\b\5\2;=\5"+
		"\n\6\2<;\3\2\2\2<=\3\2\2\2=\7\3\2\2\2>?\7\b\2\2?@\7\r\2\2@A\5\22\n\2A"+
		"\t\3\2\2\2BC\b\6\1\2CD\7\30\2\2DE\5\n\6\2EF\7\31\2\2F\u008b\3\2\2\2GH"+
		"\5\22\n\2HI\7\21\2\2IJ\5\n\6\rJ\u008b\3\2\2\2KO\7\32\2\2LN\7\3\2\2ML\3"+
		"\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PZ\3\2\2\2QO\3\2\2\2RT\5\n\6\2SU\t"+
		"\2\2\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XR\3\2\2\2Y\\"+
		"\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2]_\5\n\6\2^]\3\2\2\2"+
		"^_\3\2\2\2_`\3\2\2\2`\u008b\7\33\2\2ab\5\20\t\2bc\7\27\2\2cd\5\n\6\13"+
		"d\u008b\3\2\2\2ef\7\6\2\2fg\7\30\2\2gh\5\n\6\2hj\7\31\2\2ik\7\3\2\2ji"+
		"\3\2\2\2jk\3\2\2\2kl\3\2\2\2ln\5\n\6\2mo\t\2\2\2nm\3\2\2\2no\3\2\2\2o"+
		"p\3\2\2\2pq\7\7\2\2qr\5\n\6\nr\u008b\3\2\2\2st\7\6\2\2tu\7\30\2\2uv\5"+
		"\n\6\2vx\7\31\2\2wy\7\3\2\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\5\n\6\t{\u008b"+
		"\3\2\2\2|}\7\t\2\2}~\7\30\2\2~\177\5\n\6\2\177\u0081\7\31\2\2\u0080\u0082"+
		"\7\3\2\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0084\5\n\6\b\u0084\u008b\3\2\2\2\u0085\u0086\7\n\2\2\u0086\u008b\5\n"+
		"\6\7\u0087\u008b\5\20\t\2\u0088\u008b\5\f\7\2\u0089\u008b\5\24\13\2\u008a"+
		"B\3\2\2\2\u008aG\3\2\2\2\u008aK\3\2\2\2\u008aa\3\2\2\2\u008ae\3\2\2\2"+
		"\u008as\3\2\2\2\u008a|\3\2\2\2\u008a\u0085\3\2\2\2\u008a\u0087\3\2\2\2"+
		"\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\u009b\3\2\2\2\u008c\u008d"+
		"\f\16\2\2\u008d\u008e\5\36\20\2\u008e\u008f\5\n\6\17\u008f\u009a\3\2\2"+
		"\2\u0090\u0091\f\17\2\2\u0091\u009a\5\16\b\2\u0092\u0095\f\5\2\2\u0093"+
		"\u0094\7\25\2\2\u0094\u0096\5\36\20\2\u0095\u0093\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099"+
		"\u008c\3\2\2\2\u0099\u0090\3\2\2\2\u0099\u0092\3\2\2\2\u009a\u009d\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\13\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009e\u009f\7\5\2\2\u009f\u00a0\5\36\20\2\u00a0\u00a1\5\16\b"+
		"\2\u00a1\r\3\2\2\2\u00a2\u00a4\7\30\2\2\u00a3\u00a5\5\n\6\2\u00a4\u00a3"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00aa\3\2\2\2\u00a6\u00a7\7\26\2\2"+
		"\u00a7\u00a9\5\n\6\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00ae\7\31\2\2\u00ae\17\3\2\2\2\u00af\u00b4\5\36\20\2\u00b0\u00b1\7\25"+
		"\2\2\u00b1\u00b3\5\36\20\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\21\3\2\2\2\u00b6\u00b4\3\2\2"+
		"\2\u00b7\u00bd\7\30\2\2\u00b8\u00b9\5\36\20\2\u00b9\u00ba\7\26\2\2\u00ba"+
		"\u00bc\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00c4\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\u00c2\5\36\20\2\u00c1\u00c3\7\26\2\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c7\7\31\2\2\u00c7\23\3\2\2\2\u00c8\u00cd\5\34"+
		"\17\2\u00c9\u00cd\5\32\16\2\u00ca\u00cd\5\30\r\2\u00cb\u00cd\5\26\f\2"+
		"\u00cc\u00c8\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb"+
		"\3\2\2\2\u00cd\25\3\2\2\2\u00ce\u00cf\7\13\2\2\u00cf\27\3\2\2\2\u00d0"+
		"\u00d1\7\f\2\2\u00d1\31\3\2\2\2\u00d2\u00d3\7\20\2\2\u00d3\33\3\2\2\2"+
		"\u00d4\u00d5\7\17\2\2\u00d5\35\3\2\2\2\u00d6\u00df\7\r\2\2\u00d7\u00df"+
		"\7\16\2\2\u00d8\u00da\7\27\2\2\u00d9\u00db\7\27\2\2\u00da\u00d9\3\2\2"+
		"\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df"+
		"\3\2\2\2\u00de\u00d6\3\2\2\2\u00de\u00d7\3\2\2\2\u00de\u00d8\3\2\2\2\u00df"+
		"\37\3\2\2\2\35!&/\658<OVZ^jnx\u0081\u008a\u0097\u0099\u009b\u00a4\u00aa"+
		"\u00b4\u00bd\u00c2\u00c4\u00cc\u00dc\u00de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
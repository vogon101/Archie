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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, CLASS=8, STRING_LITERAL_TOKEN=9, 
		ALPHA_NUMERIC_NAME=10, SYMBOL=11, CLASS_NAME=12, NUMERIC=13, FARROW=14, 
		WS=15, SKP=16, COMMENT=17, DOT=18, COMMA=19, EQ=20, O_R_BRACK=21, C_R_BRACK=22, 
		O_C_BRACK=23, C_C_BRACK=24;
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
		null, "'\n'", "';'", "'new'", "'true'", "'false'", "'f'", "'F'", "'class'", 
		null, null, null, null, null, "'=>'", null, null, null, "'.'", "','", 
		"'='", "'('", "')'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "CLASS", "STRING_LITERAL_TOKEN", 
		"ALPHA_NUMERIC_NAME", "SYMBOL", "CLASS_NAME", "NUMERIC", "FARROW", "WS", 
		"SKP", "COMMENT", "DOT", "COMMA", "EQ", "O_R_BRACK", "C_R_BRACK", "O_C_BRACK", 
		"C_C_BRACK"
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
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(30);
				match(T__0);
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << CLASS) | (1L << STRING_LITERAL_TOKEN) | (1L << ALPHA_NUMERIC_NAME) | (1L << SYMBOL) | (1L << NUMERIC) | (1L << COMMENT) | (1L << EQ) | (1L << O_R_BRACK) | (1L << O_C_BRACK))) != 0)) {
				{
				{
				setState(36);
				line();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
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
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				classDef();
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(45);
					match(T__0);
					}
					}
					setState(48); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				break;
			case T__2:
			case T__3:
			case T__4:
			case STRING_LITERAL_TOKEN:
			case ALPHA_NUMERIC_NAME:
			case SYMBOL:
			case NUMERIC:
			case EQ:
			case O_R_BRACK:
			case O_C_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				element(0);
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(51);
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
					setState(54); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 || _la==T__1 );
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
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
			setState(59);
			classHeader();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << STRING_LITERAL_TOKEN) | (1L << ALPHA_NUMERIC_NAME) | (1L << SYMBOL) | (1L << NUMERIC) | (1L << EQ) | (1L << O_R_BRACK) | (1L << O_C_BRACK))) != 0)) {
				{
				setState(60);
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
			setState(63);
			match(CLASS);
			setState(64);
			match(ALPHA_NUMERIC_NAME);
			setState(65);
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
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new BracketedElementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(68);
				match(O_R_BRACK);
				setState(69);
				element(0);
				setState(70);
				match(C_R_BRACK);
				}
				break;
			case 2:
				{
				_localctx = new FunctionLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				nameList();
				setState(73);
				match(FARROW);
				setState(74);
				element(7);
				}
				break;
			case 3:
				{
				_localctx = new TextIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				identifier();
				}
				break;
			case 4:
				{
				_localctx = new CodeBlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				match(O_C_BRACK);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(78);
					match(T__0);
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(84);
						element(0);
						setState(86); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(85);
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
							setState(88); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==T__0 || _la==T__1 );
						}
						} 
					}
					setState(94);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << STRING_LITERAL_TOKEN) | (1L << ALPHA_NUMERIC_NAME) | (1L << SYMBOL) | (1L << NUMERIC) | (1L << EQ) | (1L << O_R_BRACK) | (1L << O_C_BRACK))) != 0)) {
					{
					setState(95);
					element(0);
					}
				}

				setState(98);
				match(C_C_BRACK);
				}
				break;
			case 5:
				{
				_localctx = new NewObjContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				instantiation();
				}
				break;
			case 6:
				{
				_localctx = new AssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				identifier();
				setState(101);
				match(EQ);
				setState(102);
				element(2);
				}
				break;
			case 7:
				{
				_localctx = new LiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				value();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(120);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new OpFunctionCallContext(new ElementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_element);
						setState(107);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(108);
						name();
						setState(109);
						element(10);
						}
						break;
					case 2:
						{
						_localctx = new FunctionCallContext(new ElementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_element);
						setState(111);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(112);
						elementList();
						}
						break;
					case 3:
						{
						_localctx = new CombinedIDContext(new ElementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_element);
						setState(113);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(116); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(114);
								match(DOT);
								setState(115);
								name();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(118); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
			setState(125);
			match(T__2);
			setState(126);
			name();
			setState(127);
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
			setState(129);
			match(O_R_BRACK);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << STRING_LITERAL_TOKEN) | (1L << ALPHA_NUMERIC_NAME) | (1L << SYMBOL) | (1L << NUMERIC) | (1L << EQ) | (1L << O_R_BRACK) | (1L << O_C_BRACK))) != 0)) {
				{
				setState(130);
				element(0);
				}
			}

			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(133);
				match(COMMA);
				setState(134);
				element(0);
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
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
			setState(142);
			name();
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(143);
					match(DOT);
					setState(144);
					name();
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
			setState(150);
			match(O_R_BRACK);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(151);
					name();
					setState(152);
					match(COMMA);
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALPHA_NUMERIC_NAME) | (1L << SYMBOL) | (1L << EQ))) != 0)) {
				{
				setState(159);
				name();
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(160);
					match(COMMA);
					}
				}

				}
			}

			setState(165);
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
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				integerLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				floatLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				stringLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				booleanLiteral();
				}
				break;
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
			setState(175);
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
		public List<TerminalNode> NUMERIC() { return getTokens(archieParser.NUMERIC); }
		public TerminalNode NUMERIC(int i) {
			return getToken(archieParser.NUMERIC, i);
		}
		public TerminalNode DOT() { return getToken(archieParser.DOT, 0); }
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(177);
				match(NUMERIC);
				}
				}
				setState(180); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMERIC );
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				{
				{
				{
				setState(182);
				match(DOT);
				setState(184); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(183);
						match(NUMERIC);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(186); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				setState(189);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(188);
					_la = _input.LA(1);
					if ( !(_la==T__5 || _la==T__6) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				}
				break;
			case T__5:
			case T__6:
				{
				setState(191);
				_la = _input.LA(1);
				if ( !(_la==T__5 || _la==T__6) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class IntegerLiteralContext extends ParserRuleContext {
		public List<TerminalNode> NUMERIC() { return getTokens(archieParser.NUMERIC); }
		public TerminalNode NUMERIC(int i) {
			return getToken(archieParser.NUMERIC, i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(194);
					match(NUMERIC);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(197); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALPHA_NUMERIC_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(ALPHA_NUMERIC_NAME);
				}
				break;
			case SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(SYMBOL);
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				match(EQ);
				setState(203); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(202);
						match(EQ);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(205); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32\u00d4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\7\2\"\n\2\f\2"+
		"\16\2%\13\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\3\3\3\6\3\61\n\3\r\3"+
		"\16\3\62\3\3\3\3\6\3\67\n\3\r\3\16\38\3\3\5\3<\n\3\3\4\3\4\5\4@\n\4\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6R\n"+
		"\6\f\6\16\6U\13\6\3\6\3\6\6\6Y\n\6\r\6\16\6Z\7\6]\n\6\f\6\16\6`\13\6\3"+
		"\6\5\6c\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6l\n\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\6\6w\n\6\r\6\16\6x\7\6{\n\6\f\6\16\6~\13\6\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\5\b\u0086\n\b\3\b\3\b\7\b\u008a\n\b\f\b\16\b\u008d\13\b\3"+
		"\b\3\b\3\t\3\t\3\t\7\t\u0094\n\t\f\t\16\t\u0097\13\t\3\n\3\n\3\n\3\n\7"+
		"\n\u009d\n\n\f\n\16\n\u00a0\13\n\3\n\3\n\5\n\u00a4\n\n\5\n\u00a6\n\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\5\13\u00ae\n\13\3\f\3\f\3\r\3\r\3\16\6\16\u00b5"+
		"\n\16\r\16\16\16\u00b6\3\16\3\16\6\16\u00bb\n\16\r\16\16\16\u00bc\3\16"+
		"\5\16\u00c0\n\16\3\16\5\16\u00c3\n\16\3\17\6\17\u00c6\n\17\r\17\16\17"+
		"\u00c7\3\20\3\20\3\20\3\20\6\20\u00ce\n\20\r\20\16\20\u00cf\5\20\u00d2"+
		"\n\20\3\20\2\3\n\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\5\3\2\3\4"+
		"\3\2\6\7\3\2\b\t\u00ea\2#\3\2\2\2\4;\3\2\2\2\6=\3\2\2\2\bA\3\2\2\2\nk"+
		"\3\2\2\2\f\177\3\2\2\2\16\u0083\3\2\2\2\20\u0090\3\2\2\2\22\u0098\3\2"+
		"\2\2\24\u00ad\3\2\2\2\26\u00af\3\2\2\2\30\u00b1\3\2\2\2\32\u00b4\3\2\2"+
		"\2\34\u00c5\3\2\2\2\36\u00d1\3\2\2\2 \"\7\3\2\2! \3\2\2\2\"%\3\2\2\2#"+
		"!\3\2\2\2#$\3\2\2\2$)\3\2\2\2%#\3\2\2\2&(\5\4\3\2\'&\3\2\2\2(+\3\2\2\2"+
		")\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\7\2\2\3-\3\3\2\2\2.\60\5\6"+
		"\4\2/\61\7\3\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2"+
		"\63<\3\2\2\2\64\66\5\n\6\2\65\67\t\2\2\2\66\65\3\2\2\2\678\3\2\2\28\66"+
		"\3\2\2\289\3\2\2\29<\3\2\2\2:<\7\23\2\2;.\3\2\2\2;\64\3\2\2\2;:\3\2\2"+
		"\2<\5\3\2\2\2=?\5\b\5\2>@\5\n\6\2?>\3\2\2\2?@\3\2\2\2@\7\3\2\2\2AB\7\n"+
		"\2\2BC\7\f\2\2CD\5\22\n\2D\t\3\2\2\2EF\b\6\1\2FG\7\27\2\2GH\5\n\6\2HI"+
		"\7\30\2\2Il\3\2\2\2JK\5\22\n\2KL\7\20\2\2LM\5\n\6\tMl\3\2\2\2Nl\5\20\t"+
		"\2OS\7\31\2\2PR\7\3\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T^\3\2"+
		"\2\2US\3\2\2\2VX\5\n\6\2WY\t\2\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2"+
		"\2\2[]\3\2\2\2\\V\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_b\3\2\2\2`^\3"+
		"\2\2\2ac\5\n\6\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2dl\7\32\2\2el\5\f\7\2fg"+
		"\5\20\t\2gh\7\26\2\2hi\5\n\6\4il\3\2\2\2jl\5\24\13\2kE\3\2\2\2kJ\3\2\2"+
		"\2kN\3\2\2\2kO\3\2\2\2ke\3\2\2\2kf\3\2\2\2kj\3\2\2\2l|\3\2\2\2mn\f\13"+
		"\2\2no\5\36\20\2op\5\n\6\fp{\3\2\2\2qr\f\n\2\2r{\5\16\b\2sv\f\7\2\2tu"+
		"\7\24\2\2uw\5\36\20\2vt\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2"+
		"\2zm\3\2\2\2zq\3\2\2\2zs\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\13\3\2"+
		"\2\2~|\3\2\2\2\177\u0080\7\5\2\2\u0080\u0081\5\36\20\2\u0081\u0082\5\16"+
		"\b\2\u0082\r\3\2\2\2\u0083\u0085\7\27\2\2\u0084\u0086\5\n\6\2\u0085\u0084"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008b\3\2\2\2\u0087\u0088\7\25\2\2"+
		"\u0088\u008a\5\n\6\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u008f\7\30\2\2\u008f\17\3\2\2\2\u0090\u0095\5\36\20\2\u0091\u0092\7\24"+
		"\2\2\u0092\u0094\5\36\20\2\u0093\u0091\3\2\2\2\u0094\u0097\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\21\3\2\2\2\u0097\u0095\3\2\2"+
		"\2\u0098\u009e\7\27\2\2\u0099\u009a\5\36\20\2\u009a\u009b\7\25\2\2\u009b"+
		"\u009d\3\2\2\2\u009c\u0099\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\u00a5\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u00a3\5\36\20\2\u00a2\u00a4\7\25\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a8\7\30\2\2\u00a8\23\3\2\2\2\u00a9\u00ae\5\34"+
		"\17\2\u00aa\u00ae\5\32\16\2\u00ab\u00ae\5\30\r\2\u00ac\u00ae\5\26\f\2"+
		"\u00ad\u00a9\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac"+
		"\3\2\2\2\u00ae\25\3\2\2\2\u00af\u00b0\t\3\2\2\u00b0\27\3\2\2\2\u00b1\u00b2"+
		"\7\13\2\2\u00b2\31\3\2\2\2\u00b3\u00b5\7\17\2\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00c2\3\2"+
		"\2\2\u00b8\u00ba\7\24\2\2\u00b9\u00bb\7\17\2\2\u00ba\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2"+
		"\2\2\u00be\u00c0\t\4\2\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c3\3\2\2\2\u00c1\u00c3\t\4\2\2\u00c2\u00b8\3\2\2\2\u00c2\u00c1\3\2"+
		"\2\2\u00c3\33\3\2\2\2\u00c4\u00c6\7\17\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\35\3\2\2\2\u00c9"+
		"\u00d2\7\f\2\2\u00ca\u00d2\7\r\2\2\u00cb\u00cd\7\26\2\2\u00cc\u00ce\7"+
		"\26\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00c9\3\2\2\2\u00d1\u00ca\3\2"+
		"\2\2\u00d1\u00cb\3\2\2\2\u00d2\37\3\2\2\2\36#)\628;?SZ^bkxz|\u0085\u008b"+
		"\u0095\u009e\u00a3\u00a5\u00ad\u00b6\u00bc\u00bf\u00c2\u00c7\u00cf\u00d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
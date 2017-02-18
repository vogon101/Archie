// Generated from archie.g4 by ANTLR 4.6
package com.vogonjeltz.archie.parsing.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class archieLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, IF=8, ELSE=9, 
		CLASS=10, STRING_LITERAL_TOKEN=11, ALPHA_NUMERIC_NAME=12, SYMBOL=13, CLASS_NAME=14, 
		NUMERIC=15, FARROW=16, WS=17, SKP=18, COMMENT=19, DOT=20, COMMA=21, EQ=22, 
		O_R_BRACK=23, C_R_BRACK=24, O_C_BRACK=25, C_C_BRACK=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "IF", "ELSE", 
		"CLASS", "ESCAPED_QUOTE", "STRING_LITERAL_TOKEN", "ALPHA_NUMERIC_NAME", 
		"SYMBOL", "CLASS_NAME", "NUMERIC", "FARROW", "WS", "SKP", "COMMENT", "DOT", 
		"COMMA", "EQ", "O_R_BRACK", "C_R_BRACK", "O_C_BRACK", "C_C_BRACK"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\n'", "';'", "'new'", "'true'", "'false'", "'f'", "'F'", "'if'", 
		"'else'", "'class'", null, null, null, null, null, "'=>'", null, null, 
		null, "'.'", "','", "'='", "'('", "')'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "IF", "ELSE", "CLASS", 
		"STRING_LITERAL_TOKEN", "ALPHA_NUMERIC_NAME", "SYMBOL", "CLASS_NAME", 
		"NUMERIC", "FARROW", "WS", "SKP", "COMMENT", "DOT", "COMMA", "EQ", "O_R_BRACK", 
		"C_R_BRACK", "O_C_BRACK", "C_C_BRACK"
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


	public archieLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "archie.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\34\u00a8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\7\re\n\r\f\r\16\rh\13\r\3\r\3\r\3\16\3\16\7\16n\n\16\f\16\16\16q"+
		"\13\16\3\17\6\17t\n\17\r\17\16\17u\3\20\3\20\7\20z\n\20\f\20\16\20}\13"+
		"\20\3\21\3\21\3\22\3\22\3\22\3\23\6\23\u0085\n\23\r\23\16\23\u0086\3\23"+
		"\3\23\3\24\6\24\u008c\n\24\r\24\16\24\u008d\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\6\25\u0097\n\25\r\25\16\25\u0098\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3f\2\35\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\2\31\r\33\16\35\17\37\20!\21#\22%\23\'\24"+
		")\25+\26-\27/\30\61\31\63\32\65\33\67\34\3\2\n\4\2\f\f\17\17\5\2C\\aa"+
		"c|\6\2\62;C\\aac|\f\2##%&((,-//>>@A``~~\u0080\u0080\3\2\62;\4\2\13\13"+
		"\"\"\3\2\17\17\3\2\f\f\u00ae\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\3"+
		"9\3\2\2\2\5;\3\2\2\2\7=\3\2\2\2\tA\3\2\2\2\13F\3\2\2\2\rL\3\2\2\2\17N"+
		"\3\2\2\2\21P\3\2\2\2\23S\3\2\2\2\25X\3\2\2\2\27^\3\2\2\2\31a\3\2\2\2\33"+
		"k\3\2\2\2\35s\3\2\2\2\37w\3\2\2\2!~\3\2\2\2#\u0080\3\2\2\2%\u0084\3\2"+
		"\2\2\'\u008b\3\2\2\2)\u0091\3\2\2\2+\u009a\3\2\2\2-\u009c\3\2\2\2/\u009e"+
		"\3\2\2\2\61\u00a0\3\2\2\2\63\u00a2\3\2\2\2\65\u00a4\3\2\2\2\67\u00a6\3"+
		"\2\2\29:\7\f\2\2:\4\3\2\2\2;<\7=\2\2<\6\3\2\2\2=>\7p\2\2>?\7g\2\2?@\7"+
		"y\2\2@\b\3\2\2\2AB\7v\2\2BC\7t\2\2CD\7w\2\2DE\7g\2\2E\n\3\2\2\2FG\7h\2"+
		"\2GH\7c\2\2HI\7n\2\2IJ\7u\2\2JK\7g\2\2K\f\3\2\2\2LM\7h\2\2M\16\3\2\2\2"+
		"NO\7H\2\2O\20\3\2\2\2PQ\7k\2\2QR\7h\2\2R\22\3\2\2\2ST\7g\2\2TU\7n\2\2"+
		"UV\7u\2\2VW\7g\2\2W\24\3\2\2\2XY\7e\2\2YZ\7n\2\2Z[\7c\2\2[\\\7u\2\2\\"+
		"]\7u\2\2]\26\3\2\2\2^_\7^\2\2_`\7$\2\2`\30\3\2\2\2af\7$\2\2be\5\27\f\2"+
		"ce\n\2\2\2db\3\2\2\2dc\3\2\2\2eh\3\2\2\2fg\3\2\2\2fd\3\2\2\2gi\3\2\2\2"+
		"hf\3\2\2\2ij\7$\2\2j\32\3\2\2\2ko\t\3\2\2ln\t\4\2\2ml\3\2\2\2nq\3\2\2"+
		"\2om\3\2\2\2op\3\2\2\2p\34\3\2\2\2qo\3\2\2\2rt\t\5\2\2sr\3\2\2\2tu\3\2"+
		"\2\2us\3\2\2\2uv\3\2\2\2v\36\3\2\2\2w{\t\3\2\2xz\t\4\2\2yx\3\2\2\2z}\3"+
		"\2\2\2{y\3\2\2\2{|\3\2\2\2| \3\2\2\2}{\3\2\2\2~\177\t\6\2\2\177\"\3\2"+
		"\2\2\u0080\u0081\7?\2\2\u0081\u0082\7@\2\2\u0082$\3\2\2\2\u0083\u0085"+
		"\t\7\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\b\23\2\2\u0089&\3\2\2\2"+
		"\u008a\u008c\t\b\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\b\24\2\2"+
		"\u0090(\3\2\2\2\u0091\u0092\7\61\2\2\u0092\u0093\7\61\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\u0096\n\t\2\2\u0095\u0097\7\f\2\2\u0096\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099*\3\2\2\2"+
		"\u009a\u009b\7\60\2\2\u009b,\3\2\2\2\u009c\u009d\7.\2\2\u009d.\3\2\2\2"+
		"\u009e\u009f\7?\2\2\u009f\60\3\2\2\2\u00a0\u00a1\7*\2\2\u00a1\62\3\2\2"+
		"\2\u00a2\u00a3\7+\2\2\u00a3\64\3\2\2\2\u00a4\u00a5\7}\2\2\u00a5\66\3\2"+
		"\2\2\u00a6\u00a7\7\177\2\2\u00a78\3\2\2\2\13\2dfou{\u0086\u008d\u0098"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
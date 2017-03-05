// Generated from C:/Users/Freddie/Google Drive/Programming/IdeaProjects/Archie/src/main/scala/com/vogonjeltz/archie/parsing/antlr\archie.g4 by ANTLR 4.6
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
		CLASS=10, WHILE=11, STRING_LITERAL_TOKEN=12, ALPHA_NUMERIC_NAME=13, SYMBOL=14, 
		CLASS_NAME=15, NUMERIC=16, FARROW=17, WS=18, SKP=19, COMMENT=20, DOT=21, 
		COMMA=22, EQ=23, O_R_BRACK=24, C_R_BRACK=25, O_C_BRACK=26, C_C_BRACK=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "IF", "ELSE", 
		"CLASS", "WHILE", "ESCAPED_QUOTE", "STRING_LITERAL_TOKEN", "ALPHA_NUMERIC_NAME", 
		"SYMBOL", "CLASS_NAME", "NUMERIC", "FARROW", "WS", "SKP", "COMMENT", "DOT", 
		"COMMA", "EQ", "O_R_BRACK", "C_R_BRACK", "O_C_BRACK", "C_C_BRACK"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\n'", "';'", "'new'", "'true'", "'false'", "'f'", "'F'", "'if'", 
		"'else'", "'class'", "'while'", null, null, null, null, null, "'=>'", 
		null, null, null, "'.'", "','", "'='", "'('", "')'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "IF", "ELSE", "CLASS", 
		"WHILE", "STRING_LITERAL_TOKEN", "ALPHA_NUMERIC_NAME", "SYMBOL", "CLASS_NAME", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u00b0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\7\16m\n\16\f\16\16\16p\13\16"+
		"\3\16\3\16\3\17\3\17\7\17v\n\17\f\17\16\17y\13\17\3\20\6\20|\n\20\r\20"+
		"\16\20}\3\21\3\21\7\21\u0082\n\21\f\21\16\21\u0085\13\21\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\6\24\u008d\n\24\r\24\16\24\u008e\3\24\3\24\3\25\6\25\u0094"+
		"\n\25\r\25\16\25\u0095\3\25\3\25\3\26\3\26\3\26\3\26\3\26\6\26\u009f\n"+
		"\26\r\26\16\26\u00a0\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3n\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\2\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61"+
		"\31\63\32\65\33\67\349\35\3\2\n\4\2\f\f\17\17\5\2C\\aac|\6\2\62;C\\aa"+
		"c|\f\2##%&((,-//>>@A``~~\u0080\u0080\3\2\62;\4\2\13\13\"\"\3\2\17\17\3"+
		"\2\f\f\u00b6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2"+
		"\2\2\5=\3\2\2\2\7?\3\2\2\2\tC\3\2\2\2\13H\3\2\2\2\rN\3\2\2\2\17P\3\2\2"+
		"\2\21R\3\2\2\2\23U\3\2\2\2\25Z\3\2\2\2\27`\3\2\2\2\31f\3\2\2\2\33i\3\2"+
		"\2\2\35s\3\2\2\2\37{\3\2\2\2!\177\3\2\2\2#\u0086\3\2\2\2%\u0088\3\2\2"+
		"\2\'\u008c\3\2\2\2)\u0093\3\2\2\2+\u0099\3\2\2\2-\u00a2\3\2\2\2/\u00a4"+
		"\3\2\2\2\61\u00a6\3\2\2\2\63\u00a8\3\2\2\2\65\u00aa\3\2\2\2\67\u00ac\3"+
		"\2\2\29\u00ae\3\2\2\2;<\7\f\2\2<\4\3\2\2\2=>\7=\2\2>\6\3\2\2\2?@\7p\2"+
		"\2@A\7g\2\2AB\7y\2\2B\b\3\2\2\2CD\7v\2\2DE\7t\2\2EF\7w\2\2FG\7g\2\2G\n"+
		"\3\2\2\2HI\7h\2\2IJ\7c\2\2JK\7n\2\2KL\7u\2\2LM\7g\2\2M\f\3\2\2\2NO\7h"+
		"\2\2O\16\3\2\2\2PQ\7H\2\2Q\20\3\2\2\2RS\7k\2\2ST\7h\2\2T\22\3\2\2\2UV"+
		"\7g\2\2VW\7n\2\2WX\7u\2\2XY\7g\2\2Y\24\3\2\2\2Z[\7e\2\2[\\\7n\2\2\\]\7"+
		"c\2\2]^\7u\2\2^_\7u\2\2_\26\3\2\2\2`a\7y\2\2ab\7j\2\2bc\7k\2\2cd\7n\2"+
		"\2de\7g\2\2e\30\3\2\2\2fg\7^\2\2gh\7$\2\2h\32\3\2\2\2in\7$\2\2jm\5\31"+
		"\r\2km\n\2\2\2lj\3\2\2\2lk\3\2\2\2mp\3\2\2\2no\3\2\2\2nl\3\2\2\2oq\3\2"+
		"\2\2pn\3\2\2\2qr\7$\2\2r\34\3\2\2\2sw\t\3\2\2tv\t\4\2\2ut\3\2\2\2vy\3"+
		"\2\2\2wu\3\2\2\2wx\3\2\2\2x\36\3\2\2\2yw\3\2\2\2z|\t\5\2\2{z\3\2\2\2|"+
		"}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~ \3\2\2\2\177\u0083\t\3\2\2\u0080\u0082"+
		"\t\4\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\"\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\t\6\2\2"+
		"\u0087$\3\2\2\2\u0088\u0089\7?\2\2\u0089\u008a\7@\2\2\u008a&\3\2\2\2\u008b"+
		"\u008d\t\7\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\b\24\2\2\u0091"+
		"(\3\2\2\2\u0092\u0094\t\b\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2"+
		"\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098"+
		"\b\25\2\2\u0098*\3\2\2\2\u0099\u009a\7\61\2\2\u009a\u009b\7\61\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009e\n\t\2\2\u009d\u009f\7\f\2\2\u009e\u009d\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		",\3\2\2\2\u00a2\u00a3\7\60\2\2\u00a3.\3\2\2\2\u00a4\u00a5\7.\2\2\u00a5"+
		"\60\3\2\2\2\u00a6\u00a7\7?\2\2\u00a7\62\3\2\2\2\u00a8\u00a9\7*\2\2\u00a9"+
		"\64\3\2\2\2\u00aa\u00ab\7+\2\2\u00ab\66\3\2\2\2\u00ac\u00ad\7}\2\2\u00ad"+
		"8\3\2\2\2\u00ae\u00af\7\177\2\2\u00af:\3\2\2\2\13\2lnw}\u0083\u008e\u0095"+
		"\u00a0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
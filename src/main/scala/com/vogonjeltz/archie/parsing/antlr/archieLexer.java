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
		T__0=1, T__1=2, T__2=3, IF=4, ELSE=5, CLASS=6, WHILE=7, RETURN=8, BOOLEAN_LITERAL_TOKEN=9, 
		STRING_LITERAL_TOKEN=10, ALPHA_NUMERIC_NAME=11, SYMBOL=12, INTEGER_LITERAL=13, 
		FLOAT_LITERAL=14, FARROW=15, WS=16, SKP=17, COMMENT=18, DOT=19, COMMA=20, 
		EQ=21, O_R_BRACK=22, C_R_BRACK=23, O_C_BRACK=24, C_C_BRACK=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "IF", "ELSE", "CLASS", "WHILE", "RETURN", "BOOLEAN_LITERAL_TOKEN", 
		"ESCAPED_QUOTE", "STRING_LITERAL_TOKEN", "ALPHA_NUMERIC_NAME", "SYMBOL", 
		"NUMERIC", "INTEGER_LITERAL", "FLOAT_LITERAL", "FARROW", "WS", "SKP", 
		"COMMENT", "DOT", "COMMA", "EQ", "O_R_BRACK", "C_R_BRACK", "O_C_BRACK", 
		"C_C_BRACK"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u00c7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\nf\n\n\3\13\3\13\3\13\3\f\3\f\3\f\7\fn\n\f\f\f\16\fq\13\f\3\f\3\f"+
		"\3\r\3\r\7\rw\n\r\f\r\16\rz\13\r\3\r\5\r}\n\r\3\16\6\16\u0080\n\16\r\16"+
		"\16\16\u0081\3\17\3\17\3\20\6\20\u0087\n\20\r\20\16\20\u0088\3\21\6\21"+
		"\u008c\n\21\r\21\16\21\u008d\3\21\3\21\6\21\u0092\n\21\r\21\16\21\u0093"+
		"\3\21\5\21\u0097\n\21\3\21\5\21\u009a\n\21\3\22\3\22\3\22\3\23\6\23\u00a0"+
		"\n\23\r\23\16\23\u00a1\3\23\3\23\3\24\6\24\u00a7\n\24\r\24\16\24\u00a8"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\6\25\u00b1\n\25\r\25\16\25\u00b2\3\25\6"+
		"\25\u00b6\n\25\r\25\16\25\u00b7\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3o\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\2\27\f\31\r\33\16\35\2\37\17!\20#\21%\22\'\23)\24+\25-\26"+
		"/\27\61\30\63\31\65\32\67\33\3\2\13\4\2\f\f\17\17\5\2C\\aac|\6\2\62;C"+
		"\\aac|\f\2##%&((,-//>>@A``~~\u0080\u0080\3\2\62;\4\2HHhh\4\2\13\13\"\""+
		"\3\2\17\17\3\2\f\f\u00d3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3\2\2"+
		"\2\7=\3\2\2\2\tA\3\2\2\2\13D\3\2\2\2\rI\3\2\2\2\17O\3\2\2\2\21U\3\2\2"+
		"\2\23e\3\2\2\2\25g\3\2\2\2\27j\3\2\2\2\31t\3\2\2\2\33\177\3\2\2\2\35\u0083"+
		"\3\2\2\2\37\u0086\3\2\2\2!\u008b\3\2\2\2#\u009b\3\2\2\2%\u009f\3\2\2\2"+
		"\'\u00a6\3\2\2\2)\u00ac\3\2\2\2+\u00b9\3\2\2\2-\u00bb\3\2\2\2/\u00bd\3"+
		"\2\2\2\61\u00bf\3\2\2\2\63\u00c1\3\2\2\2\65\u00c3\3\2\2\2\67\u00c5\3\2"+
		"\2\29:\7\f\2\2:\4\3\2\2\2;<\7=\2\2<\6\3\2\2\2=>\7p\2\2>?\7g\2\2?@\7y\2"+
		"\2@\b\3\2\2\2AB\7k\2\2BC\7h\2\2C\n\3\2\2\2DE\7g\2\2EF\7n\2\2FG\7u\2\2"+
		"GH\7g\2\2H\f\3\2\2\2IJ\7e\2\2JK\7n\2\2KL\7c\2\2LM\7u\2\2MN\7u\2\2N\16"+
		"\3\2\2\2OP\7y\2\2PQ\7j\2\2QR\7k\2\2RS\7n\2\2ST\7g\2\2T\20\3\2\2\2UV\7"+
		"t\2\2VW\7g\2\2WX\7v\2\2XY\7w\2\2YZ\7t\2\2Z[\7p\2\2[\22\3\2\2\2\\]\7v\2"+
		"\2]^\7t\2\2^_\7w\2\2_f\7g\2\2`a\7h\2\2ab\7c\2\2bc\7n\2\2cd\7u\2\2df\7"+
		"g\2\2e\\\3\2\2\2e`\3\2\2\2f\24\3\2\2\2gh\7^\2\2hi\7$\2\2i\26\3\2\2\2j"+
		"o\7$\2\2kn\5\25\13\2ln\n\2\2\2mk\3\2\2\2ml\3\2\2\2nq\3\2\2\2op\3\2\2\2"+
		"om\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7$\2\2s\30\3\2\2\2tx\t\3\2\2uw\t\4\2"+
		"\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y|\3\2\2\2zx\3\2\2\2{}\7#\2"+
		"\2|{\3\2\2\2|}\3\2\2\2}\32\3\2\2\2~\u0080\t\5\2\2\177~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\34\3\2\2\2\u0083"+
		"\u0084\t\6\2\2\u0084\36\3\2\2\2\u0085\u0087\5\35\17\2\u0086\u0085\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		" \3\2\2\2\u008a\u008c\5\35\17\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2"+
		"\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0099\3\2\2\2\u008f\u0091"+
		"\5+\26\2\u0090\u0092\5\35\17\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2"+
		"\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0097"+
		"\t\7\2\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u009a\t\7\2\2\u0099\u008f\3\2\2\2\u0099\u0098\3\2\2\2\u009a\"\3\2\2\2"+
		"\u009b\u009c\7?\2\2\u009c\u009d\7@\2\2\u009d$\3\2\2\2\u009e\u00a0\t\b"+
		"\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\b\23\2\2\u00a4&\3\2\2\2"+
		"\u00a5\u00a7\t\t\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\b\24\2\2"+
		"\u00ab(\3\2\2\2\u00ac\u00ad\7\61\2\2\u00ad\u00ae\7\61\2\2\u00ae\u00b0"+
		"\3\2\2\2\u00af\u00b1\n\n\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b6\7\f"+
		"\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8*\3\2\2\2\u00b9\u00ba\7\60\2\2\u00ba,\3\2\2\2\u00bb"+
		"\u00bc\7.\2\2\u00bc.\3\2\2\2\u00bd\u00be\7?\2\2\u00be\60\3\2\2\2\u00bf"+
		"\u00c0\7*\2\2\u00c0\62\3\2\2\2\u00c1\u00c2\7+\2\2\u00c2\64\3\2\2\2\u00c3"+
		"\u00c4\7}\2\2\u00c4\66\3\2\2\2\u00c5\u00c6\7\177\2\2\u00c68\3\2\2\2\22"+
		"\2emox|\u0081\u0088\u008d\u0093\u0096\u0099\u00a1\u00a8\u00b2\u00b7\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
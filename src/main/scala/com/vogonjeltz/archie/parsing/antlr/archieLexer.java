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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, CLASS=8, STRING_LITERAL_TOKEN=9, 
		ALPHA_NUMERIC_NAME=10, SYMBOL=11, CLASS_NAME=12, NUMERIC=13, FARROW=14, 
		WS=15, SKP=16, COMMENT=17, DOT=18, COMMA=19, EQ=20, O_R_BRACK=21, C_R_BRACK=22, 
		O_C_BRACK=23, C_C_BRACK=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "CLASS", "ESCAPED_QUOTE", 
		"STRING_LITERAL_TOKEN", "ALPHA_NUMERIC_NAME", "SYMBOL", "CLASS_NAME", 
		"NUMERIC", "FARROW", "WS", "SKP", "COMMENT", "DOT", "COMMA", "EQ", "O_R_BRACK", 
		"C_R_BRACK", "O_C_BRACK", "C_C_BRACK"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u00a2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\7\13Y\n\13\f\13\16\13\\\13\13\3\13\3\13\3\f\3\f\7"+
		"\fb\n\f\f\f\16\fe\13\f\3\r\6\rh\n\r\r\r\16\ri\3\r\7\rm\n\r\f\r\16\rp\13"+
		"\r\3\16\3\16\7\16t\n\16\f\16\16\16w\13\16\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\6\21\177\n\21\r\21\16\21\u0080\3\21\3\21\3\22\6\22\u0086\n\22\r\22\16"+
		"\22\u0087\3\22\3\22\3\23\3\23\3\23\3\23\3\23\6\23\u0091\n\23\r\23\16\23"+
		"\u0092\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3Z\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\2\25\13\27\f\31\r"+
		"\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\3\2\13"+
		"\4\2\f\f\17\17\5\2C\\aac|\6\2\62;C\\aac|\r\2##%&((,-//\61\61>>@A``~~\u0080"+
		"\u0080\3\2??\3\2\62;\4\2\13\13\"\"\3\2\17\17\3\2\f\f\u00a9\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\3\65\3\2\2\2\5\67\3\2\2\2\79\3\2\2\2\t=\3\2\2\2\13B\3\2\2\2\rH\3\2"+
		"\2\2\17J\3\2\2\2\21L\3\2\2\2\23R\3\2\2\2\25U\3\2\2\2\27_\3\2\2\2\31g\3"+
		"\2\2\2\33q\3\2\2\2\35x\3\2\2\2\37z\3\2\2\2!~\3\2\2\2#\u0085\3\2\2\2%\u008b"+
		"\3\2\2\2\'\u0094\3\2\2\2)\u0096\3\2\2\2+\u0098\3\2\2\2-\u009a\3\2\2\2"+
		"/\u009c\3\2\2\2\61\u009e\3\2\2\2\63\u00a0\3\2\2\2\65\66\7\f\2\2\66\4\3"+
		"\2\2\2\678\7=\2\28\6\3\2\2\29:\7p\2\2:;\7g\2\2;<\7y\2\2<\b\3\2\2\2=>\7"+
		"v\2\2>?\7t\2\2?@\7w\2\2@A\7g\2\2A\n\3\2\2\2BC\7h\2\2CD\7c\2\2DE\7n\2\2"+
		"EF\7u\2\2FG\7g\2\2G\f\3\2\2\2HI\7h\2\2I\16\3\2\2\2JK\7H\2\2K\20\3\2\2"+
		"\2LM\7e\2\2MN\7n\2\2NO\7c\2\2OP\7u\2\2PQ\7u\2\2Q\22\3\2\2\2RS\7^\2\2S"+
		"T\7$\2\2T\24\3\2\2\2UZ\7$\2\2VY\5\23\n\2WY\n\2\2\2XV\3\2\2\2XW\3\2\2\2"+
		"Y\\\3\2\2\2Z[\3\2\2\2ZX\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7$\2\2^\26\3\2"+
		"\2\2_c\t\3\2\2`b\t\4\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\30\3"+
		"\2\2\2ec\3\2\2\2fh\t\5\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jn\3"+
		"\2\2\2km\t\6\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\32\3\2\2\2p"+
		"n\3\2\2\2qu\t\3\2\2rt\t\4\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2"+
		"v\34\3\2\2\2wu\3\2\2\2xy\t\7\2\2y\36\3\2\2\2z{\7?\2\2{|\7@\2\2| \3\2\2"+
		"\2}\177\t\b\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\b\21\2\2\u0083\"\3\2\2\2\u0084"+
		"\u0086\t\t\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\b\22\2\2\u008a"+
		"$\3\2\2\2\u008b\u008c\7\61\2\2\u008c\u008d\7\61\2\2\u008d\u008e\3\2\2"+
		"\2\u008e\u0090\n\n\2\2\u008f\u0091\7\f\2\2\u0090\u008f\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093&\3\2\2\2\u0094"+
		"\u0095\7\60\2\2\u0095(\3\2\2\2\u0096\u0097\7.\2\2\u0097*\3\2\2\2\u0098"+
		"\u0099\7?\2\2\u0099,\3\2\2\2\u009a\u009b\7*\2\2\u009b.\3\2\2\2\u009c\u009d"+
		"\7+\2\2\u009d\60\3\2\2\2\u009e\u009f\7}\2\2\u009f\62\3\2\2\2\u00a0\u00a1"+
		"\7\177\2\2\u00a1\64\3\2\2\2\f\2XZcinu\u0080\u0087\u0092\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
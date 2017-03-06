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
		CLASS=10, WHILE=11, RETURN=12, STRING_LITERAL_TOKEN=13, ALPHA_NUMERIC_NAME=14, 
		SYMBOL=15, CLASS_NAME=16, NUMERIC=17, FARROW=18, WS=19, SKP=20, COMMENT=21, 
		DOT=22, COMMA=23, EQ=24, O_R_BRACK=25, C_R_BRACK=26, O_C_BRACK=27, C_C_BRACK=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "IF", "ELSE", 
		"CLASS", "WHILE", "RETURN", "ESCAPED_QUOTE", "STRING_LITERAL_TOKEN", "ALPHA_NUMERIC_NAME", 
		"SYMBOL", "CLASS_NAME", "NUMERIC", "FARROW", "WS", "SKP", "COMMENT", "DOT", 
		"COMMA", "EQ", "O_R_BRACK", "C_R_BRACK", "O_C_BRACK", "C_C_BRACK"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\n'", "';'", "'new'", "'true'", "'false'", "'f'", "'F'", "'if'", 
		"'else'", "'class'", "'while'", "'return'", null, null, null, null, null, 
		"'=>'", null, null, null, "'.'", "','", "'='", "'('", "')'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "IF", "ELSE", "CLASS", 
		"WHILE", "RETURN", "STRING_LITERAL_TOKEN", "ALPHA_NUMERIC_NAME", "SYMBOL", 
		"CLASS_NAME", "NUMERIC", "FARROW", "WS", "SKP", "COMMENT", "DOT", "COMMA", 
		"EQ", "O_R_BRACK", "C_R_BRACK", "O_C_BRACK", "C_C_BRACK"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\36\u00bd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\7\17v\n\17\f\17\16\17y\13\17\3\17\3\17\3\20\3\20\7\20\177"+
		"\n\20\f\20\16\20\u0082\13\20\3\21\6\21\u0085\n\21\r\21\16\21\u0086\3\22"+
		"\3\22\7\22\u008b\n\22\f\22\16\22\u008e\13\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\6\25\u0096\n\25\r\25\16\25\u0097\3\25\3\25\3\26\6\26\u009d\n\26"+
		"\r\26\16\26\u009e\3\26\3\26\3\27\3\27\3\27\3\27\6\27\u00a7\n\27\r\27\16"+
		"\27\u00a8\3\27\6\27\u00ac\n\27\r\27\16\27\u00ad\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3w\2\37\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\2\35\17\37\20!\21#\22%"+
		"\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36\3\2\n\4\2\f\f"+
		"\17\17\5\2C\\aac|\6\2\62;C\\aac|\f\2##%&((,-//>>@A``~~\u0080\u0080\3\2"+
		"\62;\4\2\13\13\"\"\3\2\17\17\3\2\f\f\u00c4\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7A\3\2\2\2\t"+
		"E\3\2\2\2\13J\3\2\2\2\rP\3\2\2\2\17R\3\2\2\2\21T\3\2\2\2\23W\3\2\2\2\25"+
		"\\\3\2\2\2\27b\3\2\2\2\31h\3\2\2\2\33o\3\2\2\2\35r\3\2\2\2\37|\3\2\2\2"+
		"!\u0084\3\2\2\2#\u0088\3\2\2\2%\u008f\3\2\2\2\'\u0091\3\2\2\2)\u0095\3"+
		"\2\2\2+\u009c\3\2\2\2-\u00a2\3\2\2\2/\u00af\3\2\2\2\61\u00b1\3\2\2\2\63"+
		"\u00b3\3\2\2\2\65\u00b5\3\2\2\2\67\u00b7\3\2\2\29\u00b9\3\2\2\2;\u00bb"+
		"\3\2\2\2=>\7\f\2\2>\4\3\2\2\2?@\7=\2\2@\6\3\2\2\2AB\7p\2\2BC\7g\2\2CD"+
		"\7y\2\2D\b\3\2\2\2EF\7v\2\2FG\7t\2\2GH\7w\2\2HI\7g\2\2I\n\3\2\2\2JK\7"+
		"h\2\2KL\7c\2\2LM\7n\2\2MN\7u\2\2NO\7g\2\2O\f\3\2\2\2PQ\7h\2\2Q\16\3\2"+
		"\2\2RS\7H\2\2S\20\3\2\2\2TU\7k\2\2UV\7h\2\2V\22\3\2\2\2WX\7g\2\2XY\7n"+
		"\2\2YZ\7u\2\2Z[\7g\2\2[\24\3\2\2\2\\]\7e\2\2]^\7n\2\2^_\7c\2\2_`\7u\2"+
		"\2`a\7u\2\2a\26\3\2\2\2bc\7y\2\2cd\7j\2\2de\7k\2\2ef\7n\2\2fg\7g\2\2g"+
		"\30\3\2\2\2hi\7t\2\2ij\7g\2\2jk\7v\2\2kl\7w\2\2lm\7t\2\2mn\7p\2\2n\32"+
		"\3\2\2\2op\7^\2\2pq\7$\2\2q\34\3\2\2\2rw\7$\2\2sv\5\33\16\2tv\n\2\2\2"+
		"us\3\2\2\2ut\3\2\2\2vy\3\2\2\2wx\3\2\2\2wu\3\2\2\2xz\3\2\2\2yw\3\2\2\2"+
		"z{\7$\2\2{\36\3\2\2\2|\u0080\t\3\2\2}\177\t\4\2\2~}\3\2\2\2\177\u0082"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081 \3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0083\u0085\t\5\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\"\3\2\2\2\u0088\u008c\t\3\2\2"+
		"\u0089\u008b\t\4\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d$\3\2\2\2\u008e\u008c\3\2\2\2\u008f"+
		"\u0090\t\6\2\2\u0090&\3\2\2\2\u0091\u0092\7?\2\2\u0092\u0093\7@\2\2\u0093"+
		"(\3\2\2\2\u0094\u0096\t\7\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2"+
		"\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a"+
		"\b\25\2\2\u009a*\3\2\2\2\u009b\u009d\t\b\2\2\u009c\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a1\b\26\2\2\u00a1,\3\2\2\2\u00a2\u00a3\7\61\2\2\u00a3\u00a4"+
		"\7\61\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a7\n\t\2\2\u00a6\u00a5\3\2\2\2"+
		"\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab"+
		"\3\2\2\2\u00aa\u00ac\7\f\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae.\3\2\2\2\u00af\u00b0\7\60\2\2"+
		"\u00b0\60\3\2\2\2\u00b1\u00b2\7.\2\2\u00b2\62\3\2\2\2\u00b3\u00b4\7?\2"+
		"\2\u00b4\64\3\2\2\2\u00b5\u00b6\7*\2\2\u00b6\66\3\2\2\2\u00b7\u00b8\7"+
		"+\2\2\u00b88\3\2\2\2\u00b9\u00ba\7}\2\2\u00ba:\3\2\2\2\u00bb\u00bc\7\177"+
		"\2\2\u00bc<\3\2\2\2\f\2uw\u0080\u0086\u008c\u0097\u009e\u00a8\u00ad\3"+
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
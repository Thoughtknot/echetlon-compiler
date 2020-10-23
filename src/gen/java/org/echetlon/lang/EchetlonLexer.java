// Generated from C:/projects/java/echetlon-lang\Echetlon.g4 by ANTLR 4.8
package org.echetlon.lang;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EchetlonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, OBJ=2, INT=3, STR=4, NEW=5, LOOP=6, RETURN=7, EQ=8, STRING=9, IDENTIFIER=10, 
		SEMIC=11, COLON=12, LCPAREN=13, RCPAREN=14, LPAREN=15, RPAREN=16, LSPAREN=17, 
		RSPAREN=18, COMMA=19, DOT=20, MINUS=21, PLUS=22, INT_LIT=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "OBJ", "INT", "STR", "NEW", "LOOP", "RETURN", "EQ", "STRING", "IDENTIFIER", 
			"SEMIC", "COLON", "LCPAREN", "RCPAREN", "LPAREN", "RPAREN", "LSPAREN", 
			"RSPAREN", "COMMA", "DOT", "MINUS", "PLUS", "INT_LIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'obj'", "'int'", "'string'", "'new'", "'loop'", "'return'", 
			"'='", null, null, "';'", "':'", "'{'", "'}'", "'('", "')'", "'['", "']'", 
			"','", "'.'", "'-'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "OBJ", "INT", "STR", "NEW", "LOOP", "RETURN", "EQ", "STRING", 
			"IDENTIFIER", "SEMIC", "COLON", "LCPAREN", "RCPAREN", "LPAREN", "RPAREN", 
			"LSPAREN", "RSPAREN", "COMMA", "DOT", "MINUS", "PLUS", "INT_LIT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public EchetlonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Echetlon.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u0083\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\6\2\63\n\2\r\2\16\2\64\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\6\n\\\n\n\r\n\16\n]\3\n\3\n\3\13\6\13"+
		"c\n\13\r\13\16\13d\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\6\30\u0080\n\30\r\30\16\30\u0081\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\3\2\6\5\2\13\f\17\17\"\"\4\2\f\f\17\17\5\2C\\aac|\3\2\62;\2\u0086"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\3\62\3\2\2\2\58\3\2\2\2\7<\3\2\2\2\t@\3\2\2\2\13G\3\2\2\2\rK\3\2\2"+
		"\2\17P\3\2\2\2\21W\3\2\2\2\23Y\3\2\2\2\25b\3\2\2\2\27f\3\2\2\2\31h\3\2"+
		"\2\2\33j\3\2\2\2\35l\3\2\2\2\37n\3\2\2\2!p\3\2\2\2#r\3\2\2\2%t\3\2\2\2"+
		"\'v\3\2\2\2)x\3\2\2\2+z\3\2\2\2-|\3\2\2\2/\177\3\2\2\2\61\63\t\2\2\2\62"+
		"\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66"+
		"\67\b\2\2\2\67\4\3\2\2\289\7q\2\29:\7d\2\2:;\7l\2\2;\6\3\2\2\2<=\7k\2"+
		"\2=>\7p\2\2>?\7v\2\2?\b\3\2\2\2@A\7u\2\2AB\7v\2\2BC\7t\2\2CD\7k\2\2DE"+
		"\7p\2\2EF\7i\2\2F\n\3\2\2\2GH\7p\2\2HI\7g\2\2IJ\7y\2\2J\f\3\2\2\2KL\7"+
		"n\2\2LM\7q\2\2MN\7q\2\2NO\7r\2\2O\16\3\2\2\2PQ\7t\2\2QR\7g\2\2RS\7v\2"+
		"\2ST\7w\2\2TU\7t\2\2UV\7p\2\2V\20\3\2\2\2WX\7?\2\2X\22\3\2\2\2Y[\7$\2"+
		"\2Z\\\n\3\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7$"+
		"\2\2`\24\3\2\2\2ac\t\4\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2e\26"+
		"\3\2\2\2fg\7=\2\2g\30\3\2\2\2hi\7<\2\2i\32\3\2\2\2jk\7}\2\2k\34\3\2\2"+
		"\2lm\7\177\2\2m\36\3\2\2\2no\7*\2\2o \3\2\2\2pq\7+\2\2q\"\3\2\2\2rs\7"+
		"]\2\2s$\3\2\2\2tu\7_\2\2u&\3\2\2\2vw\7.\2\2w(\3\2\2\2xy\7\60\2\2y*\3\2"+
		"\2\2z{\7/\2\2{,\3\2\2\2|}\7-\2\2}.\3\2\2\2~\u0080\t\5\2\2\177~\3\2\2\2"+
		"\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\60\3"+
		"\2\2\2\7\2\64]d\u0081\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
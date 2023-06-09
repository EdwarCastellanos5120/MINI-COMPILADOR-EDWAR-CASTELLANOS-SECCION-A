// Generated from com/MiniCompilador/Eclang.g4 by ANTLR 4.5.1
package com.MiniCompilador;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EclangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PL_INICIO=1, PL_VAR=2, PL_CON_S=3, PL_CON_E=4, PL_IF=5, PL_ELSE_IF=6, 
		PL_ELSE=7, PL_SELECCIONADOR=8, PL_ALTER=9, PL_END=10, PL_PRE=11, PL_WHILE=12, 
		PL_FOR=13, PL_CARGO=14, PL_AND=15, PL_OR=16, SIM_OPERACION=17, SIM_NEGACION=18, 
		SIM_DE_COMPA=19, SIMBOLO_ASIGN=20, SIMBOLO_DO=21, PA_A=22, PA_C=23, COR_A=24, 
		CORC_C=25, LL_A=26, LL_C=27, PUN_COMA=28, COMA=29, RETORNO=30, COMILLAS=31, 
		IDENTIFICADOR=32, TEXTO=33, NUMERO=34, WS=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PL_INICIO", "PL_VAR", "PL_CON_S", "PL_CON_E", "PL_IF", "PL_ELSE_IF", 
		"PL_ELSE", "PL_SELECCIONADOR", "PL_ALTER", "PL_END", "PL_PRE", "PL_WHILE", 
		"PL_FOR", "PL_CARGO", "PL_AND", "PL_OR", "SIM_OPERACION", "SIM_NEGACION", 
		"SIM_DE_COMPA", "SIMBOLO_ASIGN", "SIMBOLO_DO", "PA_A", "PA_C", "COR_A", 
		"CORC_C", "LL_A", "LL_C", "PUN_COMA", "COMA", "RETORNO", "COMILLAS", "IDENTIFICADOR", 
		"TEXTO", "NUMERO", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Class'", "'Var'", "'Console.s'", "'Console.e'", "'if'", "'else if'", 
		"'else'", "'Seleccionador'", "'Alter'", "'end'", "'Pre'", "'While'", "'For'", 
		"'Cargo'", "'AND'", "'OR'", null, "'!'", null, "'='", "'$'", "'('", "')'", 
		"'['", "']'", "'{'", "'}'", "';'", "','", "'->'", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PL_INICIO", "PL_VAR", "PL_CON_S", "PL_CON_E", "PL_IF", "PL_ELSE_IF", 
		"PL_ELSE", "PL_SELECCIONADOR", "PL_ALTER", "PL_END", "PL_PRE", "PL_WHILE", 
		"PL_FOR", "PL_CARGO", "PL_AND", "PL_OR", "SIM_OPERACION", "SIM_NEGACION", 
		"SIM_DE_COMPA", "SIMBOLO_ASIGN", "SIMBOLO_DO", "PA_A", "PA_C", "COR_A", 
		"CORC_C", "LL_A", "LL_C", "PUN_COMA", "COMA", "RETORNO", "COMILLAS", "IDENTIFICADOR", 
		"TEXTO", "NUMERO", "WS"
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


	public EclangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Eclang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u00f5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\5\24\u00b8\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37"+
		"\3 \3 \3!\3!\7!\u00d5\n!\f!\16!\u00d8\13!\3\"\6\"\u00db\n\"\r\"\16\"\u00dc"+
		"\3#\5#\u00e0\n#\3#\6#\u00e3\n#\r#\16#\u00e4\3#\3#\6#\u00e9\n#\r#\16#\u00ea"+
		"\5#\u00ed\n#\3$\6$\u00f0\n$\r$\16$\u00f1\3$\3$\2\2%\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\t"+
		"\6\2\'\',-//\61\61\4\2>>@@\4\2C\\c|\5\2\62;C\\c|\3\2//\3\2\62;\5\2\13"+
		"\f\17\17\"\"\u00ff\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5O\3\2\2\2\7S\3\2\2\2\t]\3\2\2\2\13g\3"+
		"\2\2\2\rj\3\2\2\2\17r\3\2\2\2\21w\3\2\2\2\23\u0085\3\2\2\2\25\u008b\3"+
		"\2\2\2\27\u008f\3\2\2\2\31\u0093\3\2\2\2\33\u0099\3\2\2\2\35\u009d\3\2"+
		"\2\2\37\u00a3\3\2\2\2!\u00a7\3\2\2\2#\u00aa\3\2\2\2%\u00ac\3\2\2\2\'\u00b7"+
		"\3\2\2\2)\u00b9\3\2\2\2+\u00bb\3\2\2\2-\u00bd\3\2\2\2/\u00bf\3\2\2\2\61"+
		"\u00c1\3\2\2\2\63\u00c3\3\2\2\2\65\u00c5\3\2\2\2\67\u00c7\3\2\2\29\u00c9"+
		"\3\2\2\2;\u00cb\3\2\2\2=\u00cd\3\2\2\2?\u00d0\3\2\2\2A\u00d2\3\2\2\2C"+
		"\u00da\3\2\2\2E\u00df\3\2\2\2G\u00ef\3\2\2\2IJ\7E\2\2JK\7n\2\2KL\7c\2"+
		"\2LM\7u\2\2MN\7u\2\2N\4\3\2\2\2OP\7X\2\2PQ\7c\2\2QR\7t\2\2R\6\3\2\2\2"+
		"ST\7E\2\2TU\7q\2\2UV\7p\2\2VW\7u\2\2WX\7q\2\2XY\7n\2\2YZ\7g\2\2Z[\7\60"+
		"\2\2[\\\7u\2\2\\\b\3\2\2\2]^\7E\2\2^_\7q\2\2_`\7p\2\2`a\7u\2\2ab\7q\2"+
		"\2bc\7n\2\2cd\7g\2\2de\7\60\2\2ef\7g\2\2f\n\3\2\2\2gh\7k\2\2hi\7h\2\2"+
		"i\f\3\2\2\2jk\7g\2\2kl\7n\2\2lm\7u\2\2mn\7g\2\2no\7\"\2\2op\7k\2\2pq\7"+
		"h\2\2q\16\3\2\2\2rs\7g\2\2st\7n\2\2tu\7u\2\2uv\7g\2\2v\20\3\2\2\2wx\7"+
		"U\2\2xy\7g\2\2yz\7n\2\2z{\7g\2\2{|\7e\2\2|}\7e\2\2}~\7k\2\2~\177\7q\2"+
		"\2\177\u0080\7p\2\2\u0080\u0081\7c\2\2\u0081\u0082\7f\2\2\u0082\u0083"+
		"\7q\2\2\u0083\u0084\7t\2\2\u0084\22\3\2\2\2\u0085\u0086\7C\2\2\u0086\u0087"+
		"\7n\2\2\u0087\u0088\7v\2\2\u0088\u0089\7g\2\2\u0089\u008a\7t\2\2\u008a"+
		"\24\3\2\2\2\u008b\u008c\7g\2\2\u008c\u008d\7p\2\2\u008d\u008e\7f\2\2\u008e"+
		"\26\3\2\2\2\u008f\u0090\7R\2\2\u0090\u0091\7t\2\2\u0091\u0092\7g\2\2\u0092"+
		"\30\3\2\2\2\u0093\u0094\7Y\2\2\u0094\u0095\7j\2\2\u0095\u0096\7k\2\2\u0096"+
		"\u0097\7n\2\2\u0097\u0098\7g\2\2\u0098\32\3\2\2\2\u0099\u009a\7H\2\2\u009a"+
		"\u009b\7q\2\2\u009b\u009c\7t\2\2\u009c\34\3\2\2\2\u009d\u009e\7E\2\2\u009e"+
		"\u009f\7c\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7i\2\2\u00a1\u00a2\7q\2\2"+
		"\u00a2\36\3\2\2\2\u00a3\u00a4\7C\2\2\u00a4\u00a5\7P\2\2\u00a5\u00a6\7"+
		"F\2\2\u00a6 \3\2\2\2\u00a7\u00a8\7Q\2\2\u00a8\u00a9\7T\2\2\u00a9\"\3\2"+
		"\2\2\u00aa\u00ab\t\2\2\2\u00ab$\3\2\2\2\u00ac\u00ad\7#\2\2\u00ad&\3\2"+
		"\2\2\u00ae\u00af\7>\2\2\u00af\u00b8\7?\2\2\u00b0\u00b1\7@\2\2\u00b1\u00b8"+
		"\7?\2\2\u00b2\u00b8\t\3\2\2\u00b3\u00b4\7?\2\2\u00b4\u00b8\7?\2\2\u00b5"+
		"\u00b6\7#\2\2\u00b6\u00b8\7?\2\2\u00b7\u00ae\3\2\2\2\u00b7\u00b0\3\2\2"+
		"\2\u00b7\u00b2\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8("+
		"\3\2\2\2\u00b9\u00ba\7?\2\2\u00ba*\3\2\2\2\u00bb\u00bc\7&\2\2\u00bc,\3"+
		"\2\2\2\u00bd\u00be\7*\2\2\u00be.\3\2\2\2\u00bf\u00c0\7+\2\2\u00c0\60\3"+
		"\2\2\2\u00c1\u00c2\7]\2\2\u00c2\62\3\2\2\2\u00c3\u00c4\7_\2\2\u00c4\64"+
		"\3\2\2\2\u00c5\u00c6\7}\2\2\u00c6\66\3\2\2\2\u00c7\u00c8\7\177\2\2\u00c8"+
		"8\3\2\2\2\u00c9\u00ca\7=\2\2\u00ca:\3\2\2\2\u00cb\u00cc\7.\2\2\u00cc<"+
		"\3\2\2\2\u00cd\u00ce\7/\2\2\u00ce\u00cf\7@\2\2\u00cf>\3\2\2\2\u00d0\u00d1"+
		"\7$\2\2\u00d1@\3\2\2\2\u00d2\u00d6\t\4\2\2\u00d3\u00d5\t\5\2\2\u00d4\u00d3"+
		"\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"B\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db\t\4\2\2\u00da\u00d9\3\2\2\2"+
		"\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00ddD\3"+
		"\2\2\2\u00de\u00e0\t\6\2\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e2\3\2\2\2\u00e1\u00e3\t\7\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00ec\3\2\2\2\u00e6"+
		"\u00e8\7\60\2\2\u00e7\u00e9\t\7\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3"+
		"\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec"+
		"\u00e6\3\2\2\2\u00ec\u00ed\3\2\2\2\u00edF\3\2\2\2\u00ee\u00f0\t\b\2\2"+
		"\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\b$\2\2\u00f4H\3\2\2\2\13\2\u00b7"+
		"\u00d6\u00dc\u00df\u00e4\u00ea\u00ec\u00f1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
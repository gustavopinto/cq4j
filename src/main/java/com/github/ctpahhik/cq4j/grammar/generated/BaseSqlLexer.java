// Generated from BaseSql.g4 by ANTLR 4.1
package com.github.ctpahhik.cq4j.grammar.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BaseSqlLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, MULT=3, DIV=4, AND=5, OR=6, AS=7, BETWEEN=8, NOT=9, NULL=10, 
		IN=11, IS=12, L_PAREN=13, R_PAREN=14, COMA=15, LT_EQ=16, LT=17, GT_EQ=18, 
		GT=19, EQ=20, NOT_EQ=21, SELECT=22, FROM=23, JOIN=24, WHERE=25, ORDER_BY=26, 
		GROUP_BY=27, CASE=28, WHEN=29, THEN=30, ELSE=31, END=32, BOOLEAN=33, ID=34, 
		INT=35, FLOAT=36, STRING=37, WS=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'+'", "'-'", "'*'", "'/'", "'and'", "'or'", "'as'", "'between'", "'not'", 
		"'null'", "'in'", "'is'", "'('", "')'", "','", "LT_EQ", "'<'", "GT_EQ", 
		"'>'", "'='", "NOT_EQ", "'select'", "'from'", "'join'", "'where'", "ORDER_BY", 
		"GROUP_BY", "'case'", "'when'", "'then'", "'else'", "'end'", "BOOLEAN", 
		"ID", "INT", "FLOAT", "STRING", "WS"
	};
	public static final String[] ruleNames = {
		"PLUS", "MINUS", "MULT", "DIV", "AND", "OR", "AS", "BETWEEN", "NOT", "NULL", 
		"IN", "IS", "L_PAREN", "R_PAREN", "COMA", "LT_EQ", "LT", "GT_EQ", "GT", 
		"EQ", "NOT_EQ", "SELECT", "FROM", "JOIN", "WHERE", "ORDER_BY", "GROUP_BY", 
		"CASE", "WHEN", "THEN", "ELSE", "END", "BOOLEAN", "ID", "INT", "FLOAT", 
		"STRING", "WS", "EXPONENT", "HEX_DIGIT", "ESC_SEQ", "OCTAL_ESC", "UNICODE_ESC"
	};


	public BaseSqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BaseSql.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 37: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2(\u0156\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\5\21\u008d\n\21\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u0095"+
		"\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u009f\n\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u00eb\n\"\3"+
		"#\3#\7#\u00ef\n#\f#\16#\u00f2\13#\3$\6$\u00f5\n$\r$\16$\u00f6\3%\6%\u00fa"+
		"\n%\r%\16%\u00fb\3%\3%\7%\u0100\n%\f%\16%\u0103\13%\3%\5%\u0106\n%\3%"+
		"\3%\6%\u010a\n%\r%\16%\u010b\3%\5%\u010f\n%\3%\6%\u0112\n%\r%\16%\u0113"+
		"\3%\5%\u0117\n%\3&\3&\3&\7&\u011c\n&\f&\16&\u011f\13&\3&\3&\3&\3&\7&\u0125"+
		"\n&\f&\16&\u0128\13&\3&\5&\u012b\n&\3\'\6\'\u012e\n\'\r\'\16\'\u012f\3"+
		"\'\3\'\3(\3(\5(\u0136\n(\3(\6(\u0139\n(\r(\16(\u013a\3)\3)\3*\3*\3*\3"+
		"*\5*\u0143\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u014e\n+\3,\3,\3,\3,\3,\3"+
		",\3,\2-\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25"+
		"\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)"+
		"\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= "+
		"\1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\2O\2\1Q\2\1S\2\1U\2\1W\2\1\3\2\13\5"+
		"\2C\\aac|\6\2\62;C\\aac|\4\2$$^^\4\2))^^\5\2\13\f\17\17\"\"\4\2GGgg\4"+
		"\2--//\5\2\62;CHch\n\2$$))^^ddhhppttvv\u016a\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\3Y\3\2\2\2\5[\3\2\2\2\7]\3\2\2\2\t_\3\2\2\2\13a\3\2\2\2\re\3"+
		"\2\2\2\17h\3\2\2\2\21k\3\2\2\2\23s\3\2\2\2\25w\3\2\2\2\27|\3\2\2\2\31"+
		"\177\3\2\2\2\33\u0082\3\2\2\2\35\u0084\3\2\2\2\37\u0086\3\2\2\2!\u008c"+
		"\3\2\2\2#\u008e\3\2\2\2%\u0094\3\2\2\2\'\u0096\3\2\2\2)\u0098\3\2\2\2"+
		"+\u009e\3\2\2\2-\u00a0\3\2\2\2/\u00a7\3\2\2\2\61\u00ac\3\2\2\2\63\u00b1"+
		"\3\2\2\2\65\u00b7\3\2\2\2\67\u00c0\3\2\2\29\u00c9\3\2\2\2;\u00ce\3\2\2"+
		"\2=\u00d3\3\2\2\2?\u00d8\3\2\2\2A\u00dd\3\2\2\2C\u00ea\3\2\2\2E\u00ec"+
		"\3\2\2\2G\u00f4\3\2\2\2I\u0116\3\2\2\2K\u012a\3\2\2\2M\u012d\3\2\2\2O"+
		"\u0133\3\2\2\2Q\u013c\3\2\2\2S\u0142\3\2\2\2U\u014d\3\2\2\2W\u014f\3\2"+
		"\2\2YZ\7-\2\2Z\4\3\2\2\2[\\\7/\2\2\\\6\3\2\2\2]^\7,\2\2^\b\3\2\2\2_`\7"+
		"\61\2\2`\n\3\2\2\2ab\7c\2\2bc\7p\2\2cd\7f\2\2d\f\3\2\2\2ef\7q\2\2fg\7"+
		"t\2\2g\16\3\2\2\2hi\7c\2\2ij\7u\2\2j\20\3\2\2\2kl\7d\2\2lm\7g\2\2mn\7"+
		"v\2\2no\7y\2\2op\7g\2\2pq\7g\2\2qr\7p\2\2r\22\3\2\2\2st\7p\2\2tu\7q\2"+
		"\2uv\7v\2\2v\24\3\2\2\2wx\7p\2\2xy\7w\2\2yz\7n\2\2z{\7n\2\2{\26\3\2\2"+
		"\2|}\7k\2\2}~\7p\2\2~\30\3\2\2\2\177\u0080\7k\2\2\u0080\u0081\7u\2\2\u0081"+
		"\32\3\2\2\2\u0082\u0083\7*\2\2\u0083\34\3\2\2\2\u0084\u0085\7+\2\2\u0085"+
		"\36\3\2\2\2\u0086\u0087\7.\2\2\u0087 \3\2\2\2\u0088\u0089\7>\2\2\u0089"+
		"\u008d\7?\2\2\u008a\u008b\7#\2\2\u008b\u008d\7@\2\2\u008c\u0088\3\2\2"+
		"\2\u008c\u008a\3\2\2\2\u008d\"\3\2\2\2\u008e\u008f\7>\2\2\u008f$\3\2\2"+
		"\2\u0090\u0091\7@\2\2\u0091\u0095\7?\2\2\u0092\u0093\7#\2\2\u0093\u0095"+
		"\7>\2\2\u0094\u0090\3\2\2\2\u0094\u0092\3\2\2\2\u0095&\3\2\2\2\u0096\u0097"+
		"\7@\2\2\u0097(\3\2\2\2\u0098\u0099\7?\2\2\u0099*\3\2\2\2\u009a\u009b\7"+
		"#\2\2\u009b\u009f\7?\2\2\u009c\u009d\7>\2\2\u009d\u009f\7@\2\2\u009e\u009a"+
		"\3\2\2\2\u009e\u009c\3\2\2\2\u009f,\3\2\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2"+
		"\7g\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7e\2\2\u00a5"+
		"\u00a6\7v\2\2\u00a6.\3\2\2\2\u00a7\u00a8\7h\2\2\u00a8\u00a9\7t\2\2\u00a9"+
		"\u00aa\7q\2\2\u00aa\u00ab\7o\2\2\u00ab\60\3\2\2\2\u00ac\u00ad\7l\2\2\u00ad"+
		"\u00ae\7q\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7p\2\2\u00b0\62\3\2\2\2\u00b1"+
		"\u00b2\7y\2\2\u00b2\u00b3\7j\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7t\2\2"+
		"\u00b5\u00b6\7g\2\2\u00b6\64\3\2\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7"+
		"t\2\2\u00b9\u00ba\7f\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00be\7d\2\2\u00be\u00bf\7{\2\2\u00bf\66\3\2\2\2\u00c0"+
		"\u00c1\7i\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4\7w\2\2"+
		"\u00c4\u00c5\7r\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7d\2\2\u00c7\u00c8"+
		"\7{\2\2\u00c88\3\2\2\2\u00c9\u00ca\7e\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc"+
		"\7u\2\2\u00cc\u00cd\7g\2\2\u00cd:\3\2\2\2\u00ce\u00cf\7y\2\2\u00cf\u00d0"+
		"\7j\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7p\2\2\u00d2<\3\2\2\2\u00d3\u00d4"+
		"\7v\2\2\u00d4\u00d5\7j\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7p\2\2\u00d7"+
		">\3\2\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7u\2\2\u00db"+
		"\u00dc\7g\2\2\u00dc@\3\2\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7p\2\2\u00df"+
		"\u00e0\7f\2\2\u00e0B\3\2\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7t\2\2\u00e3"+
		"\u00e4\7w\2\2\u00e4\u00eb\7g\2\2\u00e5\u00e6\7h\2\2\u00e6\u00e7\7c\2\2"+
		"\u00e7\u00e8\7n\2\2\u00e8\u00e9\7u\2\2\u00e9\u00eb\7g\2\2\u00ea\u00e1"+
		"\3\2\2\2\u00ea\u00e5\3\2\2\2\u00ebD\3\2\2\2\u00ec\u00f0\t\2\2\2\u00ed"+
		"\u00ef\t\3\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1F\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f5"+
		"\4\62;\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7H\3\2\2\2\u00f8\u00fa\4\62;\2\u00f9\u00f8\3\2\2\2"+
		"\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd"+
		"\3\2\2\2\u00fd\u0101\7\60\2\2\u00fe\u0100\4\62;\2\u00ff\u00fe\3\2\2\2"+
		"\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0105"+
		"\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0106\5O(\2\u0105\u0104\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0117\3\2\2\2\u0107\u0109\7\60\2\2\u0108\u010a\4"+
		"\62;\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010f\5O(\2\u010e\u010d\3\2\2"+
		"\2\u010e\u010f\3\2\2\2\u010f\u0117\3\2\2\2\u0110\u0112\4\62;\2\u0111\u0110"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0117\5O(\2\u0116\u00f9\3\2\2\2\u0116\u0107\3\2\2"+
		"\2\u0116\u0111\3\2\2\2\u0117J\3\2\2\2\u0118\u011d\7$\2\2\u0119\u011c\5"+
		"S*\2\u011a\u011c\n\4\2\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c"+
		"\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2"+
		"\2\2\u011f\u011d\3\2\2\2\u0120\u012b\7$\2\2\u0121\u0126\7)\2\2\u0122\u0125"+
		"\5S*\2\u0123\u0125\n\5\2\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125"+
		"\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2"+
		"\2\2\u0128\u0126\3\2\2\2\u0129\u012b\7)\2\2\u012a\u0118\3\2\2\2\u012a"+
		"\u0121\3\2\2\2\u012bL\3\2\2\2\u012c\u012e\t\6\2\2\u012d\u012c\3\2\2\2"+
		"\u012e\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u0132\b\'\2\2\u0132N\3\2\2\2\u0133\u0135\t\7\2\2\u0134"+
		"\u0136\t\b\2\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2"+
		"\2\2\u0137\u0139\4\62;\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013bP\3\2\2\2\u013c\u013d\t\t\2\2"+
		"\u013dR\3\2\2\2\u013e\u013f\7^\2\2\u013f\u0143\t\n\2\2\u0140\u0143\5W"+
		",\2\u0141\u0143\5U+\2\u0142\u013e\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0141"+
		"\3\2\2\2\u0143T\3\2\2\2\u0144\u0145\7^\2\2\u0145\u0146\4\62\65\2\u0146"+
		"\u0147\4\629\2\u0147\u014e\4\629\2\u0148\u0149\7^\2\2\u0149\u014a\4\62"+
		"9\2\u014a\u014e\4\629\2\u014b\u014c\7^\2\2\u014c\u014e\4\629\2\u014d\u0144"+
		"\3\2\2\2\u014d\u0148\3\2\2\2\u014d\u014b\3\2\2\2\u014eV\3\2\2\2\u014f"+
		"\u0150\7^\2\2\u0150\u0151\7w\2\2\u0151\u0152\5Q)\2\u0152\u0153\5Q)\2\u0153"+
		"\u0154\5Q)\2\u0154\u0155\5Q)\2\u0155X\3\2\2\2\32\2\u008c\u0094\u009e\u00ea"+
		"\u00f0\u00f6\u00fb\u0101\u0105\u010b\u010e\u0113\u0116\u011b\u011d\u0124"+
		"\u0126\u012a\u012f\u0135\u013a\u0142\u014d";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
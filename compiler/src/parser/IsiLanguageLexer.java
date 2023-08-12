// Generated from IsiLanguage.g4 by ANTLR 4.13.0
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class IsiLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, TEXTO=9, 
		NUM=10, ATTR=11, OP=12, OPREL=13, ID=14, COMMA=15, AP=16, FP=17, AC=18, 
		FC=19, EOL=20, DITTO=21, BLANK=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "TEXTO", 
			"NUM", "ATTR", "OP", "OPREL", "ID", "COMMA", "AP", "FP", "AC", "FC", 
			"EOL", "DITTO", "BLANK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog'", "'declare'", "'leia'", "'escreva'", 
			"'se'", "'entao'", "'senao'", null, null, "':='", null, null, null, "','", 
			"'('", "')'", "'{'", "'}'", "'.'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "TEXTO", "NUM", 
			"ATTR", "OP", "OPREL", "ID", "COMMA", "AP", "FP", "AC", "FC", "EOL", 
			"DITTO", "BLANK"
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


	public IsiLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IsiLanguage.g4"; }

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
		"\u0004\u0000\u0016\u009c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\bf\b\b\n\b\f\bi\t\b\u0001\b"+
		"\u0001\b\u0001\t\u0004\tn\b\t\u000b\t\f\to\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u0080\b\f\u0001\r\u0003\r\u0083\b\r\u0001\r"+
		"\u0005\r\u0086\b\r\n\r\f\r\u0089\t\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0000\u0000\u0016\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016\u0001\u0000\u0007\u0004\u0000"+
		"\t\t09AZaz\u0001\u000009\u0003\u0000*+--//\u0002\u0000<<>>\u0002\u0000"+
		"AZaz\u0003\u000009AZaz\u0003\u0000\t\n\r\r  \u00a3\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0001-\u0001\u0000\u0000\u0000\u00036\u0001\u0000\u0000\u0000\u0005"+
		">\u0001\u0000\u0000\u0000\u0007F\u0001\u0000\u0000\u0000\tK\u0001\u0000"+
		"\u0000\u0000\u000bS\u0001\u0000\u0000\u0000\rV\u0001\u0000\u0000\u0000"+
		"\u000f\\\u0001\u0000\u0000\u0000\u0011b\u0001\u0000\u0000\u0000\u0013"+
		"m\u0001\u0000\u0000\u0000\u0015q\u0001\u0000\u0000\u0000\u0017t\u0001"+
		"\u0000\u0000\u0000\u0019\u007f\u0001\u0000\u0000\u0000\u001b\u0082\u0001"+
		"\u0000\u0000\u0000\u001d\u008a\u0001\u0000\u0000\u0000\u001f\u008c\u0001"+
		"\u0000\u0000\u0000!\u008e\u0001\u0000\u0000\u0000#\u0090\u0001\u0000\u0000"+
		"\u0000%\u0092\u0001\u0000\u0000\u0000\'\u0094\u0001\u0000\u0000\u0000"+
		")\u0096\u0001\u0000\u0000\u0000+\u0098\u0001\u0000\u0000\u0000-.\u0005"+
		"p\u0000\u0000./\u0005r\u0000\u0000/0\u0005o\u0000\u000001\u0005g\u0000"+
		"\u000012\u0005r\u0000\u000023\u0005a\u0000\u000034\u0005m\u0000\u0000"+
		"45\u0005a\u0000\u00005\u0002\u0001\u0000\u0000\u000067\u0005f\u0000\u0000"+
		"78\u0005i\u0000\u000089\u0005m\u0000\u00009:\u0005p\u0000\u0000:;\u0005"+
		"r\u0000\u0000;<\u0005o\u0000\u0000<=\u0005g\u0000\u0000=\u0004\u0001\u0000"+
		"\u0000\u0000>?\u0005d\u0000\u0000?@\u0005e\u0000\u0000@A\u0005c\u0000"+
		"\u0000AB\u0005l\u0000\u0000BC\u0005a\u0000\u0000CD\u0005r\u0000\u0000"+
		"DE\u0005e\u0000\u0000E\u0006\u0001\u0000\u0000\u0000FG\u0005l\u0000\u0000"+
		"GH\u0005e\u0000\u0000HI\u0005i\u0000\u0000IJ\u0005a\u0000\u0000J\b\u0001"+
		"\u0000\u0000\u0000KL\u0005e\u0000\u0000LM\u0005s\u0000\u0000MN\u0005c"+
		"\u0000\u0000NO\u0005r\u0000\u0000OP\u0005e\u0000\u0000PQ\u0005v\u0000"+
		"\u0000QR\u0005a\u0000\u0000R\n\u0001\u0000\u0000\u0000ST\u0005s\u0000"+
		"\u0000TU\u0005e\u0000\u0000U\f\u0001\u0000\u0000\u0000VW\u0005e\u0000"+
		"\u0000WX\u0005n\u0000\u0000XY\u0005t\u0000\u0000YZ\u0005a\u0000\u0000"+
		"Z[\u0005o\u0000\u0000[\u000e\u0001\u0000\u0000\u0000\\]\u0005s\u0000\u0000"+
		"]^\u0005e\u0000\u0000^_\u0005n\u0000\u0000_`\u0005a\u0000\u0000`a\u0005"+
		"o\u0000\u0000a\u0010\u0001\u0000\u0000\u0000bg\u0003)\u0014\u0000cf\u0007"+
		"\u0000\u0000\u0000df\u0003+\u0015\u0000ec\u0001\u0000\u0000\u0000ed\u0001"+
		"\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000"+
		"gh\u0001\u0000\u0000\u0000hj\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000"+
		"\u0000jk\u0003)\u0014\u0000k\u0012\u0001\u0000\u0000\u0000ln\u0007\u0001"+
		"\u0000\u0000ml\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000p\u0014\u0001\u0000\u0000"+
		"\u0000qr\u0005:\u0000\u0000rs\u0005=\u0000\u0000s\u0016\u0001\u0000\u0000"+
		"\u0000tu\u0007\u0002\u0000\u0000u\u0018\u0001\u0000\u0000\u0000v\u0080"+
		"\u0007\u0003\u0000\u0000wx\u0005<\u0000\u0000x\u0080\u0005=\u0000\u0000"+
		"yz\u0005>\u0000\u0000z\u0080\u0005=\u0000\u0000{|\u0005!\u0000\u0000|"+
		"\u0080\u0005=\u0000\u0000}~\u0005=\u0000\u0000~\u0080\u0005=\u0000\u0000"+
		"\u007fv\u0001\u0000\u0000\u0000\u007fw\u0001\u0000\u0000\u0000\u007fy"+
		"\u0001\u0000\u0000\u0000\u007f{\u0001\u0000\u0000\u0000\u007f}\u0001\u0000"+
		"\u0000\u0000\u0080\u001a\u0001\u0000\u0000\u0000\u0081\u0083\u0007\u0004"+
		"\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0087\u0001\u0000"+
		"\u0000\u0000\u0084\u0086\u0007\u0005\u0000\u0000\u0085\u0084\u0001\u0000"+
		"\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u001c\u0001\u0000"+
		"\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008b\u0005,\u0000"+
		"\u0000\u008b\u001e\u0001\u0000\u0000\u0000\u008c\u008d\u0005(\u0000\u0000"+
		"\u008d \u0001\u0000\u0000\u0000\u008e\u008f\u0005)\u0000\u0000\u008f\""+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0005{\u0000\u0000\u0091$\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0005}\u0000\u0000\u0093&\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0005.\u0000\u0000\u0095(\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0005\"\u0000\u0000\u0097*\u0001\u0000\u0000\u0000\u0098\u0099\u0007"+
		"\u0006\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0006"+
		"\u0015\u0000\u0000\u009b,\u0001\u0000\u0000\u0000\b\u0000ego\u007f\u0082"+
		"\u0085\u0087\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
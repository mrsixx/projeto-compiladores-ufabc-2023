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
		T__0=1, T__1=2, T__2=3, NUMBER=4, TEXT=5, ATTR=6, SUM=7, SUB=8, OPREL=9, 
		ID=10, VIRG=11, PF=12, AP=13, FP=14, BLANK=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "NUMBER", "TEXT", "ATTR", "SUM", "SUB", "OPREL", 
			"ID", "VIRG", "PF", "AP", "FP", "BLANK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog.'", "'ola mundo'", null, null, "':='", 
			"'+'", "'-'", null, null, "','", "'.'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "NUMBER", "TEXT", "ATTR", "SUM", "SUB", "OPREL", 
			"ID", "VIRG", "PF", "AP", "FP", "BLANK"
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
		"\u0004\u0000\u000fo\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0004\u0003=\b"+
		"\u0003\u000b\u0003\f\u0003>\u0001\u0004\u0001\u0004\u0005\u0004C\b\u0004"+
		"\n\u0004\f\u0004F\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b[\b\b\u0001\t\u0001\t\u0005\t_\b\t\n\t\f\tb\t\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0000\u0000\u000f\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u0001\u0000\u0005"+
		"\u0001\u000009\u0006\u0000\t\t !--09AZaz\u0001\u0000az\u0003\u000009A"+
		"Zaz\u0003\u0000\t\n\r\r  v\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000"+
		"\u0000\u0000\u0003(\u0001\u0000\u0000\u0000\u00051\u0001\u0000\u0000\u0000"+
		"\u0007<\u0001\u0000\u0000\u0000\t@\u0001\u0000\u0000\u0000\u000bI\u0001"+
		"\u0000\u0000\u0000\rL\u0001\u0000\u0000\u0000\u000fN\u0001\u0000\u0000"+
		"\u0000\u0011Z\u0001\u0000\u0000\u0000\u0013\\\u0001\u0000\u0000\u0000"+
		"\u0015c\u0001\u0000\u0000\u0000\u0017e\u0001\u0000\u0000\u0000\u0019g"+
		"\u0001\u0000\u0000\u0000\u001bi\u0001\u0000\u0000\u0000\u001dk\u0001\u0000"+
		"\u0000\u0000\u001f \u0005p\u0000\u0000 !\u0005r\u0000\u0000!\"\u0005o"+
		"\u0000\u0000\"#\u0005g\u0000\u0000#$\u0005r\u0000\u0000$%\u0005a\u0000"+
		"\u0000%&\u0005m\u0000\u0000&\'\u0005a\u0000\u0000\'\u0002\u0001\u0000"+
		"\u0000\u0000()\u0005f\u0000\u0000)*\u0005i\u0000\u0000*+\u0005m\u0000"+
		"\u0000+,\u0005p\u0000\u0000,-\u0005r\u0000\u0000-.\u0005o\u0000\u0000"+
		"./\u0005g\u0000\u0000/0\u0005.\u0000\u00000\u0004\u0001\u0000\u0000\u0000"+
		"12\u0005o\u0000\u000023\u0005l\u0000\u000034\u0005a\u0000\u000045\u0005"+
		" \u0000\u000056\u0005m\u0000\u000067\u0005u\u0000\u000078\u0005n\u0000"+
		"\u000089\u0005d\u0000\u00009:\u0005o\u0000\u0000:\u0006\u0001\u0000\u0000"+
		"\u0000;=\u0007\u0000\u0000\u0000<;\u0001\u0000\u0000\u0000=>\u0001\u0000"+
		"\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?\b\u0001"+
		"\u0000\u0000\u0000@D\u0005\"\u0000\u0000AC\u0007\u0001\u0000\u0000BA\u0001"+
		"\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000"+
		"DE\u0001\u0000\u0000\u0000EG\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000"+
		"\u0000GH\u0005\"\u0000\u0000H\n\u0001\u0000\u0000\u0000IJ\u0005:\u0000"+
		"\u0000JK\u0005=\u0000\u0000K\f\u0001\u0000\u0000\u0000LM\u0005+\u0000"+
		"\u0000M\u000e\u0001\u0000\u0000\u0000NO\u0005-\u0000\u0000O\u0010\u0001"+
		"\u0000\u0000\u0000P[\u0005>\u0000\u0000QR\u0005>\u0000\u0000R[\u0005="+
		"\u0000\u0000S[\u0005<\u0000\u0000TU\u0005<\u0000\u0000U[\u0005=\u0000"+
		"\u0000VW\u0005=\u0000\u0000W[\u0005=\u0000\u0000XY\u0005<\u0000\u0000"+
		"Y[\u0005>\u0000\u0000ZP\u0001\u0000\u0000\u0000ZQ\u0001\u0000\u0000\u0000"+
		"ZS\u0001\u0000\u0000\u0000ZT\u0001\u0000\u0000\u0000ZV\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000[\u0012\u0001\u0000\u0000\u0000\\`\u0007"+
		"\u0002\u0000\u0000]_\u0007\u0003\u0000\u0000^]\u0001\u0000\u0000\u0000"+
		"_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000a\u0014\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000cd\u0005"+
		",\u0000\u0000d\u0016\u0001\u0000\u0000\u0000ef\u0005.\u0000\u0000f\u0018"+
		"\u0001\u0000\u0000\u0000gh\u0005(\u0000\u0000h\u001a\u0001\u0000\u0000"+
		"\u0000ij\u0005)\u0000\u0000j\u001c\u0001\u0000\u0000\u0000kl\u0007\u0004"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0006\u000e\u0000\u0000n\u001e"+
		"\u0001\u0000\u0000\u0000\u0007\u0000>BDZ^`\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
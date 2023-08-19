// Generated from d:\UFABC\COMPILADORES\projeto-compiladores-ufabc-2023\compiler\IsiLanguage.g4 by ANTLR 4.9.2

	import ast.*;
	import symbols.*;
	import exceptions.*;
	import java.util.Arrays;
	import java.util.ArrayList;
	import java.util.List;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IsiLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, TEXTO=19, INT=20, DECIMAL=21, ATTR=22, OP=23, OPREL=24, ID=25, 
		COMMA=26, AP=27, FP=28, AC=29, FC=30, ACO=31, FCO=32, EOL=33, DITTO=34, 
		ARROW=35, BLANK=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "TEXTO", "INT", "DECIMAL", "ATTR", "OP", "OPREL", "ID", "COMMA", 
			"AP", "FP", "AC", "FC", "ACO", "FCO", "EOL", "DITTO", "ARROW", "BLANK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog'", "'declare'", "'como'", "'INTEIRO'", 
			"'DECIMAL'", "'TEXTO'", "'leia'", "'escreva'", "'se'", "'entao'", "'senao'", 
			"'paratodo'", "'em'", "'..'", "';'", "'enquanto'", "'faca'", null, null, 
			null, "':='", null, null, null, "','", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "'.'", "'\"'", "'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "TEXTO", "INT", "DECIMAL", 
			"ATTR", "OP", "OPREL", "ID", "COMMA", "AP", "FP", "AC", "FC", "ACO", 
			"FCO", "EOL", "DITTO", "ARROW", "BLANK"
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


		private List<String> ids;
		private Program  program = new Program();
		private Expression expression;
		private BinaryExpression binaryExpression;
		private SymbolTable symbolTable = new SymbolTable();
		private List<Command> curThread;
		private List<Command> listaTrue;
		private List<Command> listaFalse;
		private List<Command> listaEnquanto;
		private List<Integer> _tipoVar = new ArrayList<Integer>();
		private RelationalExpression _relationalExpression;
		private DeclarationCommand _declCmd;

		public void setup() {
			program.setSymbols(symbolTable);
		}

		public Program getAST() { 
			return this.program;
		} 

		public void showIdentifiers() {
			symbolTable.getSymbols().values().stream().forEach((id)->System.out.println(id));
		}
		
		public void showCommands() {
			 program.getCommands().forEach((cmd)->System.out.println(cmd));
		}

		private String lastToken() {
			return ((TokenStream)_input).LT(-1).getText();
		}

		private Identifier getIdIfDeclared() { 
				String id = lastToken();
				if (!symbolTable.exists(id)){
					throw new IsiSemanticException("Semantic ERROR - Undeclared Identifier: " + id);
				}
				return symbolTable.get(id);
	  }

	  public void verificaID(String id){
			if (!symbolTable.exists(id))
				throw new IsiSemanticException("Symbol "+id+" not declared");
		}
		
		public void mapIdentifier(String name, DataType type) {
			Identifier id = new Identifier(name, type);
			symbolTable.add(id);
			_declCmd.getIds().add(id);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0105\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\7\24\u00be\n\24\f\24\16\24\u00c1\13"+
		"\24\3\24\3\24\3\25\5\25\u00c6\n\25\3\25\6\25\u00c9\n\25\r\25\16\25\u00ca"+
		"\3\26\3\26\3\26\6\26\u00d0\n\26\r\26\16\26\u00d1\3\27\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00e2\n\31\3\32"+
		"\5\32\u00e5\n\32\3\32\7\32\u00e8\n\32\f\32\16\32\u00eb\13\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$"+
		"\3$\3$\3%\3%\3%\3%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&\3\2\t\6\2\13\13\62;C\\c|\3\2\62"+
		";\5\2,-//\61\61\4\2>>@@\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\2\u010e"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\3K\3\2\2\2\5T\3\2\2\2\7\\\3\2\2\2\td\3\2\2\2\13i\3\2\2\2"+
		"\rq\3\2\2\2\17y\3\2\2\2\21\177\3\2\2\2\23\u0084\3\2\2\2\25\u008c\3\2\2"+
		"\2\27\u008f\3\2\2\2\31\u0095\3\2\2\2\33\u009b\3\2\2\2\35\u00a4\3\2\2\2"+
		"\37\u00a7\3\2\2\2!\u00aa\3\2\2\2#\u00ac\3\2\2\2%\u00b5\3\2\2\2\'\u00ba"+
		"\3\2\2\2)\u00c5\3\2\2\2+\u00cc\3\2\2\2-\u00d3\3\2\2\2/\u00d6\3\2\2\2\61"+
		"\u00e1\3\2\2\2\63\u00e4\3\2\2\2\65\u00ec\3\2\2\2\67\u00ee\3\2\2\29\u00f0"+
		"\3\2\2\2;\u00f2\3\2\2\2=\u00f4\3\2\2\2?\u00f6\3\2\2\2A\u00f8\3\2\2\2C"+
		"\u00fa\3\2\2\2E\u00fc\3\2\2\2G\u00fe\3\2\2\2I\u0101\3\2\2\2KL\7r\2\2L"+
		"M\7t\2\2MN\7q\2\2NO\7i\2\2OP\7t\2\2PQ\7c\2\2QR\7o\2\2RS\7c\2\2S\4\3\2"+
		"\2\2TU\7h\2\2UV\7k\2\2VW\7o\2\2WX\7r\2\2XY\7t\2\2YZ\7q\2\2Z[\7i\2\2[\6"+
		"\3\2\2\2\\]\7f\2\2]^\7g\2\2^_\7e\2\2_`\7n\2\2`a\7c\2\2ab\7t\2\2bc\7g\2"+
		"\2c\b\3\2\2\2de\7e\2\2ef\7q\2\2fg\7o\2\2gh\7q\2\2h\n\3\2\2\2ij\7K\2\2"+
		"jk\7P\2\2kl\7V\2\2lm\7G\2\2mn\7K\2\2no\7T\2\2op\7Q\2\2p\f\3\2\2\2qr\7"+
		"F\2\2rs\7G\2\2st\7E\2\2tu\7K\2\2uv\7O\2\2vw\7C\2\2wx\7N\2\2x\16\3\2\2"+
		"\2yz\7V\2\2z{\7G\2\2{|\7Z\2\2|}\7V\2\2}~\7Q\2\2~\20\3\2\2\2\177\u0080"+
		"\7n\2\2\u0080\u0081\7g\2\2\u0081\u0082\7k\2\2\u0082\u0083\7c\2\2\u0083"+
		"\22\3\2\2\2\u0084\u0085\7g\2\2\u0085\u0086\7u\2\2\u0086\u0087\7e\2\2\u0087"+
		"\u0088\7t\2\2\u0088\u0089\7g\2\2\u0089\u008a\7x\2\2\u008a\u008b\7c\2\2"+
		"\u008b\24\3\2\2\2\u008c\u008d\7u\2\2\u008d\u008e\7g\2\2\u008e\26\3\2\2"+
		"\2\u008f\u0090\7g\2\2\u0090\u0091\7p\2\2\u0091\u0092\7v\2\2\u0092\u0093"+
		"\7c\2\2\u0093\u0094\7q\2\2\u0094\30\3\2\2\2\u0095\u0096\7u\2\2\u0096\u0097"+
		"\7g\2\2\u0097\u0098\7p\2\2\u0098\u0099\7c\2\2\u0099\u009a\7q\2\2\u009a"+
		"\32\3\2\2\2\u009b\u009c\7r\2\2\u009c\u009d\7c\2\2\u009d\u009e\7t\2\2\u009e"+
		"\u009f\7c\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7f\2\2"+
		"\u00a2\u00a3\7q\2\2\u00a3\34\3\2\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7"+
		"o\2\2\u00a6\36\3\2\2\2\u00a7\u00a8\7\60\2\2\u00a8\u00a9\7\60\2\2\u00a9"+
		" \3\2\2\2\u00aa\u00ab\7=\2\2\u00ab\"\3\2\2\2\u00ac\u00ad\7g\2\2\u00ad"+
		"\u00ae\7p\2\2\u00ae\u00af\7s\2\2\u00af\u00b0\7w\2\2\u00b0\u00b1\7c\2\2"+
		"\u00b1\u00b2\7p\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7q\2\2\u00b4$\3\2\2"+
		"\2\u00b5\u00b6\7h\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7e\2\2\u00b8\u00b9"+
		"\7c\2\2\u00b9&\3\2\2\2\u00ba\u00bf\5E#\2\u00bb\u00be\t\2\2\2\u00bc\u00be"+
		"\5I%\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c2\u00c3\5E#\2\u00c3(\3\2\2\2\u00c4\u00c6\7/\2\2\u00c5\u00c4\3"+
		"\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c9\t\3\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb*\3\2\2\2\u00cc\u00cd\5)\25\2\u00cd\u00cf\7\60\2\2\u00ce\u00d0"+
		"\t\3\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2,\3\2\2\2\u00d3\u00d4\7<\2\2\u00d4\u00d5\7?\2\2\u00d5"+
		".\3\2\2\2\u00d6\u00d7\t\4\2\2\u00d7\60\3\2\2\2\u00d8\u00e2\t\5\2\2\u00d9"+
		"\u00da\7>\2\2\u00da\u00e2\7?\2\2\u00db\u00dc\7@\2\2\u00dc\u00e2\7?\2\2"+
		"\u00dd\u00de\7#\2\2\u00de\u00e2\7?\2\2\u00df\u00e0\7?\2\2\u00e0\u00e2"+
		"\7?\2\2\u00e1\u00d8\3\2\2\2\u00e1\u00d9\3\2\2\2\u00e1\u00db\3\2\2\2\u00e1"+
		"\u00dd\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\62\3\2\2\2\u00e3\u00e5\t\6\2"+
		"\2\u00e4\u00e3\3\2\2\2\u00e5\u00e9\3\2\2\2\u00e6\u00e8\t\7\2\2\u00e7\u00e6"+
		"\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\64\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\7.\2\2\u00ed\66\3\2\2\2\u00ee"+
		"\u00ef\7*\2\2\u00ef8\3\2\2\2\u00f0\u00f1\7+\2\2\u00f1:\3\2\2\2\u00f2\u00f3"+
		"\7}\2\2\u00f3<\3\2\2\2\u00f4\u00f5\7\177\2\2\u00f5>\3\2\2\2\u00f6\u00f7"+
		"\7]\2\2\u00f7@\3\2\2\2\u00f8\u00f9\7_\2\2\u00f9B\3\2\2\2\u00fa\u00fb\7"+
		"\60\2\2\u00fbD\3\2\2\2\u00fc\u00fd\7$\2\2\u00fdF\3\2\2\2\u00fe\u00ff\7"+
		"?\2\2\u00ff\u0100\7@\2\2\u0100H\3\2\2\2\u0101\u0102\t\b\2\2\u0102\u0103"+
		"\3\2\2\2\u0103\u0104\b%\2\2\u0104J\3\2\2\2\f\2\u00bd\u00bf\u00c5\u00ca"+
		"\u00d1\u00e1\u00e4\u00e7\u00e9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
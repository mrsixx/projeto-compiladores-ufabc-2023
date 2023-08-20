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
		T__17=18, TEXTO=19, INT=20, DECIMAL=21, ATTR=22, OP=23, OPREL=24, OPLOG=25, 
		ID=26, COMMA=27, AP=28, FP=29, AC=30, FC=31, ACO=32, FCO=33, EOL=34, DITTO=35, 
		ARROW=36, BLANK=37;
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
			"T__17", "TEXTO", "INT", "DECIMAL", "ATTR", "OP", "OPREL", "OPLOG", "ID", 
			"COMMA", "AP", "FP", "AC", "FC", "ACO", "FCO", "EOL", "DITTO", "ARROW", 
			"BLANK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog'", "'declare'", "'como'", "'INTEIRO'", 
			"'DECIMAL'", "'TEXTO'", "'leia'", "'escreva'", "'se'", "'entao'", "'senao'", 
			"'paratodo'", "'em'", "'..'", "';'", "'enquanto'", "'faca'", null, null, 
			null, "':='", null, null, null, null, "','", "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "'.'", "'\"'", "'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "TEXTO", "INT", "DECIMAL", 
			"ATTR", "OP", "OPREL", "OPLOG", "ID", "COMMA", "AP", "FP", "AC", "FC", 
			"ACO", "FCO", "EOL", "DITTO", "ARROW", "BLANK"
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
		private BinaryRelationalExpression binaryRelExpression;
		private List<Command> curThread;
		private List<Command> listaTrue;
		private List<Command> listaFalse;
		private List<Command> listaEnquanto;
		private List<Integer> _tipoVar = new ArrayList<Integer>();
		private RelationalExpression _relationalExpression;
		private DeclarationCommand _declCmd;
		public Program getAST() { 
			return this.program;
		} 

		public void showIdentifiers() {
			program.getSymbolTable().getSymbols().values().stream().forEach((id)->System.out.println(id));
		}
		
		public void showCommands() {
			 program.getCommands().forEach((cmd)->System.out.println(cmd));
		}

		private String lastToken() {
			return ((TokenStream)_input).LT(-1).getText();
		}

		private Identifier getIdIfDeclared() { 
				String id = lastToken();
				if (!program.getSymbolTable().exists(id)){
					throw new IsiSemanticException("Semantic ERROR - Undeclared Identifier: " + id);
				}
				return program.getSymbolTable().get(id);
	  }

	  public void verificaID(String id){
			if (!program.getSymbolTable().exists(id))
				throw new IsiSemanticException("Symbol "+id+" not declared");
		}
		
		public void mapIdentifier(String name, DataType type) {
			Identifier id = new Identifier(name, type);
			program.getSymbolTable().add(id);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u010c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\7\24\u00c0\n\24\f\24\16\24\u00c3"+
		"\13\24\3\24\3\24\3\25\5\25\u00c8\n\25\3\25\6\25\u00cb\n\25\r\25\16\25"+
		"\u00cc\3\26\3\26\3\26\6\26\u00d2\n\26\r\26\16\26\u00d3\3\27\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00e4\n\31"+
		"\3\32\3\32\3\32\5\32\u00e9\n\32\3\33\5\33\u00ec\n\33\3\33\7\33\u00ef\n"+
		"\33\f\33\16\33\u00f2\13\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 "+
		"\3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3&\2\2\'\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'\3\2\t\6\2\13\13\62;C\\c|\3\2\62;\5\2,-//\61\61\4\2>>@@\4\2C\\c"+
		"|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\2\u0116\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M"+
		"\3\2\2\2\5V\3\2\2\2\7^\3\2\2\2\tf\3\2\2\2\13k\3\2\2\2\rs\3\2\2\2\17{\3"+
		"\2\2\2\21\u0081\3\2\2\2\23\u0086\3\2\2\2\25\u008e\3\2\2\2\27\u0091\3\2"+
		"\2\2\31\u0097\3\2\2\2\33\u009d\3\2\2\2\35\u00a6\3\2\2\2\37\u00a9\3\2\2"+
		"\2!\u00ac\3\2\2\2#\u00ae\3\2\2\2%\u00b7\3\2\2\2\'\u00bc\3\2\2\2)\u00c7"+
		"\3\2\2\2+\u00ce\3\2\2\2-\u00d5\3\2\2\2/\u00d8\3\2\2\2\61\u00e3\3\2\2\2"+
		"\63\u00e8\3\2\2\2\65\u00eb\3\2\2\2\67\u00f3\3\2\2\29\u00f5\3\2\2\2;\u00f7"+
		"\3\2\2\2=\u00f9\3\2\2\2?\u00fb\3\2\2\2A\u00fd\3\2\2\2C\u00ff\3\2\2\2E"+
		"\u0101\3\2\2\2G\u0103\3\2\2\2I\u0105\3\2\2\2K\u0108\3\2\2\2MN\7r\2\2N"+
		"O\7t\2\2OP\7q\2\2PQ\7i\2\2QR\7t\2\2RS\7c\2\2ST\7o\2\2TU\7c\2\2U\4\3\2"+
		"\2\2VW\7h\2\2WX\7k\2\2XY\7o\2\2YZ\7r\2\2Z[\7t\2\2[\\\7q\2\2\\]\7i\2\2"+
		"]\6\3\2\2\2^_\7f\2\2_`\7g\2\2`a\7e\2\2ab\7n\2\2bc\7c\2\2cd\7t\2\2de\7"+
		"g\2\2e\b\3\2\2\2fg\7e\2\2gh\7q\2\2hi\7o\2\2ij\7q\2\2j\n\3\2\2\2kl\7K\2"+
		"\2lm\7P\2\2mn\7V\2\2no\7G\2\2op\7K\2\2pq\7T\2\2qr\7Q\2\2r\f\3\2\2\2st"+
		"\7F\2\2tu\7G\2\2uv\7E\2\2vw\7K\2\2wx\7O\2\2xy\7C\2\2yz\7N\2\2z\16\3\2"+
		"\2\2{|\7V\2\2|}\7G\2\2}~\7Z\2\2~\177\7V\2\2\177\u0080\7Q\2\2\u0080\20"+
		"\3\2\2\2\u0081\u0082\7n\2\2\u0082\u0083\7g\2\2\u0083\u0084\7k\2\2\u0084"+
		"\u0085\7c\2\2\u0085\22\3\2\2\2\u0086\u0087\7g\2\2\u0087\u0088\7u\2\2\u0088"+
		"\u0089\7e\2\2\u0089\u008a\7t\2\2\u008a\u008b\7g\2\2\u008b\u008c\7x\2\2"+
		"\u008c\u008d\7c\2\2\u008d\24\3\2\2\2\u008e\u008f\7u\2\2\u008f\u0090\7"+
		"g\2\2\u0090\26\3\2\2\2\u0091\u0092\7g\2\2\u0092\u0093\7p\2\2\u0093\u0094"+
		"\7v\2\2\u0094\u0095\7c\2\2\u0095\u0096\7q\2\2\u0096\30\3\2\2\2\u0097\u0098"+
		"\7u\2\2\u0098\u0099\7g\2\2\u0099\u009a\7p\2\2\u009a\u009b\7c\2\2\u009b"+
		"\u009c\7q\2\2\u009c\32\3\2\2\2\u009d\u009e\7r\2\2\u009e\u009f\7c\2\2\u009f"+
		"\u00a0\7t\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7q\2\2"+
		"\u00a3\u00a4\7f\2\2\u00a4\u00a5\7q\2\2\u00a5\34\3\2\2\2\u00a6\u00a7\7"+
		"g\2\2\u00a7\u00a8\7o\2\2\u00a8\36\3\2\2\2\u00a9\u00aa\7\60\2\2\u00aa\u00ab"+
		"\7\60\2\2\u00ab \3\2\2\2\u00ac\u00ad\7=\2\2\u00ad\"\3\2\2\2\u00ae\u00af"+
		"\7g\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7s\2\2\u00b1\u00b2\7w\2\2\u00b2"+
		"\u00b3\7c\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7q\2\2"+
		"\u00b6$\3\2\2\2\u00b7\u00b8\7h\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7e\2"+
		"\2\u00ba\u00bb\7c\2\2\u00bb&\3\2\2\2\u00bc\u00c1\5G$\2\u00bd\u00c0\t\2"+
		"\2\2\u00be\u00c0\5K&\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c3"+
		"\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c4\u00c5\5G$\2\u00c5(\3\2\2\2\u00c6\u00c8\7/\2\2\u00c7"+
		"\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00cb\t\3"+
		"\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd*\3\2\2\2\u00ce\u00cf\5)\25\2\u00cf\u00d1\7\60\2\2"+
		"\u00d0\u00d2\t\3\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4,\3\2\2\2\u00d5\u00d6\7<\2\2\u00d6\u00d7"+
		"\7?\2\2\u00d7.\3\2\2\2\u00d8\u00d9\t\4\2\2\u00d9\60\3\2\2\2\u00da\u00e4"+
		"\t\5\2\2\u00db\u00dc\7>\2\2\u00dc\u00e4\7?\2\2\u00dd\u00de\7@\2\2\u00de"+
		"\u00e4\7?\2\2\u00df\u00e0\7#\2\2\u00e0\u00e4\7?\2\2\u00e1\u00e2\7?\2\2"+
		"\u00e2\u00e4\7?\2\2\u00e3\u00da\3\2\2\2\u00e3\u00db\3\2\2\2\u00e3\u00dd"+
		"\3\2\2\2\u00e3\u00df\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\62\3\2\2\2\u00e5"+
		"\u00e9\7g\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e9\7w\2\2\u00e8\u00e5\3\2\2"+
		"\2\u00e8\u00e6\3\2\2\2\u00e9\64\3\2\2\2\u00ea\u00ec\t\6\2\2\u00eb\u00ea"+
		"\3\2\2\2\u00ec\u00f0\3\2\2\2\u00ed\u00ef\t\7\2\2\u00ee\u00ed\3\2\2\2\u00ef"+
		"\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\66\3\2\2"+
		"\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\7.\2\2\u00f48\3\2\2\2\u00f5\u00f6\7"+
		"*\2\2\u00f6:\3\2\2\2\u00f7\u00f8\7+\2\2\u00f8<\3\2\2\2\u00f9\u00fa\7}"+
		"\2\2\u00fa>\3\2\2\2\u00fb\u00fc\7\177\2\2\u00fc@\3\2\2\2\u00fd\u00fe\7"+
		"]\2\2\u00feB\3\2\2\2\u00ff\u0100\7_\2\2\u0100D\3\2\2\2\u0101\u0102\7\60"+
		"\2\2\u0102F\3\2\2\2\u0103\u0104\7$\2\2\u0104H\3\2\2\2\u0105\u0106\7?\2"+
		"\2\u0106\u0107\7@\2\2\u0107J\3\2\2\2\u0108\u0109\t\b\2\2\u0109\u010a\3"+
		"\2\2\2\u010a\u010b\b&\2\2\u010bL\3\2\2\2\r\2\u00bf\u00c1\u00c7\u00cc\u00d3"+
		"\u00e3\u00e8\u00eb\u00ee\u00f0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
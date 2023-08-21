// Generated from IsiLanguage.g4 by ANTLR 4.13.0
package parser;

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

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class IsiLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

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
		"\u0004\u0000%\u0108\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0004\u0012"+
		"\u00bd\b\u0012\u000b\u0012\f\u0012\u00be\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0003\u0013\u00c4\b\u0013\u0001\u0013\u0004\u0013\u00c7\b\u0013"+
		"\u000b\u0013\f\u0013\u00c8\u0001\u0014\u0001\u0014\u0001\u0014\u0004\u0014"+
		"\u00ce\b\u0014\u000b\u0014\f\u0014\u00cf\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u00e0\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00e5"+
		"\b\u0018\u0001\u0019\u0003\u0019\u00e8\b\u0019\u0001\u0019\u0005\u0019"+
		"\u00eb\b\u0019\n\u0019\f\u0019\u00ee\t\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0000"+
		"\u0000%\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\""+
		"E#G$I%\u0001\u0000\u0007\u0001\u0000\"\"\u0001\u000009\u0003\u0000*+-"+
		"-//\u0002\u0000<<>>\u0002\u0000AZaz\u0003\u000009AZaz\u0003\u0000\t\n"+
		"\r\r  \u0111\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000"+
		"A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001"+
		"\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000"+
		"\u0000\u0001K\u0001\u0000\u0000\u0000\u0003T\u0001\u0000\u0000\u0000\u0005"+
		"\\\u0001\u0000\u0000\u0000\u0007d\u0001\u0000\u0000\u0000\ti\u0001\u0000"+
		"\u0000\u0000\u000bq\u0001\u0000\u0000\u0000\ry\u0001\u0000\u0000\u0000"+
		"\u000f\u007f\u0001\u0000\u0000\u0000\u0011\u0084\u0001\u0000\u0000\u0000"+
		"\u0013\u008c\u0001\u0000\u0000\u0000\u0015\u008f\u0001\u0000\u0000\u0000"+
		"\u0017\u0095\u0001\u0000\u0000\u0000\u0019\u009b\u0001\u0000\u0000\u0000"+
		"\u001b\u00a4\u0001\u0000\u0000\u0000\u001d\u00a7\u0001\u0000\u0000\u0000"+
		"\u001f\u00aa\u0001\u0000\u0000\u0000!\u00ac\u0001\u0000\u0000\u0000#\u00b5"+
		"\u0001\u0000\u0000\u0000%\u00ba\u0001\u0000\u0000\u0000\'\u00c3\u0001"+
		"\u0000\u0000\u0000)\u00ca\u0001\u0000\u0000\u0000+\u00d1\u0001\u0000\u0000"+
		"\u0000-\u00d4\u0001\u0000\u0000\u0000/\u00df\u0001\u0000\u0000\u00001"+
		"\u00e4\u0001\u0000\u0000\u00003\u00e7\u0001\u0000\u0000\u00005\u00ef\u0001"+
		"\u0000\u0000\u00007\u00f1\u0001\u0000\u0000\u00009\u00f3\u0001\u0000\u0000"+
		"\u0000;\u00f5\u0001\u0000\u0000\u0000=\u00f7\u0001\u0000\u0000\u0000?"+
		"\u00f9\u0001\u0000\u0000\u0000A\u00fb\u0001\u0000\u0000\u0000C\u00fd\u0001"+
		"\u0000\u0000\u0000E\u00ff\u0001\u0000\u0000\u0000G\u0101\u0001\u0000\u0000"+
		"\u0000I\u0104\u0001\u0000\u0000\u0000KL\u0005p\u0000\u0000LM\u0005r\u0000"+
		"\u0000MN\u0005o\u0000\u0000NO\u0005g\u0000\u0000OP\u0005r\u0000\u0000"+
		"PQ\u0005a\u0000\u0000QR\u0005m\u0000\u0000RS\u0005a\u0000\u0000S\u0002"+
		"\u0001\u0000\u0000\u0000TU\u0005f\u0000\u0000UV\u0005i\u0000\u0000VW\u0005"+
		"m\u0000\u0000WX\u0005p\u0000\u0000XY\u0005r\u0000\u0000YZ\u0005o\u0000"+
		"\u0000Z[\u0005g\u0000\u0000[\u0004\u0001\u0000\u0000\u0000\\]\u0005d\u0000"+
		"\u0000]^\u0005e\u0000\u0000^_\u0005c\u0000\u0000_`\u0005l\u0000\u0000"+
		"`a\u0005a\u0000\u0000ab\u0005r\u0000\u0000bc\u0005e\u0000\u0000c\u0006"+
		"\u0001\u0000\u0000\u0000de\u0005c\u0000\u0000ef\u0005o\u0000\u0000fg\u0005"+
		"m\u0000\u0000gh\u0005o\u0000\u0000h\b\u0001\u0000\u0000\u0000ij\u0005"+
		"I\u0000\u0000jk\u0005N\u0000\u0000kl\u0005T\u0000\u0000lm\u0005E\u0000"+
		"\u0000mn\u0005I\u0000\u0000no\u0005R\u0000\u0000op\u0005O\u0000\u0000"+
		"p\n\u0001\u0000\u0000\u0000qr\u0005D\u0000\u0000rs\u0005E\u0000\u0000"+
		"st\u0005C\u0000\u0000tu\u0005I\u0000\u0000uv\u0005M\u0000\u0000vw\u0005"+
		"A\u0000\u0000wx\u0005L\u0000\u0000x\f\u0001\u0000\u0000\u0000yz\u0005"+
		"T\u0000\u0000z{\u0005E\u0000\u0000{|\u0005X\u0000\u0000|}\u0005T\u0000"+
		"\u0000}~\u0005O\u0000\u0000~\u000e\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0005l\u0000\u0000\u0080\u0081\u0005e\u0000\u0000\u0081\u0082\u0005i"+
		"\u0000\u0000\u0082\u0083\u0005a\u0000\u0000\u0083\u0010\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0005e\u0000\u0000\u0085\u0086\u0005s\u0000\u0000\u0086"+
		"\u0087\u0005c\u0000\u0000\u0087\u0088\u0005r\u0000\u0000\u0088\u0089\u0005"+
		"e\u0000\u0000\u0089\u008a\u0005v\u0000\u0000\u008a\u008b\u0005a\u0000"+
		"\u0000\u008b\u0012\u0001\u0000\u0000\u0000\u008c\u008d\u0005s\u0000\u0000"+
		"\u008d\u008e\u0005e\u0000\u0000\u008e\u0014\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0005e\u0000\u0000\u0090\u0091\u0005n\u0000\u0000\u0091\u0092\u0005"+
		"t\u0000\u0000\u0092\u0093\u0005a\u0000\u0000\u0093\u0094\u0005o\u0000"+
		"\u0000\u0094\u0016\u0001\u0000\u0000\u0000\u0095\u0096\u0005s\u0000\u0000"+
		"\u0096\u0097\u0005e\u0000\u0000\u0097\u0098\u0005n\u0000\u0000\u0098\u0099"+
		"\u0005a\u0000\u0000\u0099\u009a\u0005o\u0000\u0000\u009a\u0018\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0005p\u0000\u0000\u009c\u009d\u0005a\u0000\u0000"+
		"\u009d\u009e\u0005r\u0000\u0000\u009e\u009f\u0005a\u0000\u0000\u009f\u00a0"+
		"\u0005t\u0000\u0000\u00a0\u00a1\u0005o\u0000\u0000\u00a1\u00a2\u0005d"+
		"\u0000\u0000\u00a2\u00a3\u0005o\u0000\u0000\u00a3\u001a\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0005e\u0000\u0000\u00a5\u00a6\u0005m\u0000\u0000\u00a6"+
		"\u001c\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005.\u0000\u0000\u00a8\u00a9"+
		"\u0005.\u0000\u0000\u00a9\u001e\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005"+
		";\u0000\u0000\u00ab \u0001\u0000\u0000\u0000\u00ac\u00ad\u0005e\u0000"+
		"\u0000\u00ad\u00ae\u0005n\u0000\u0000\u00ae\u00af\u0005q\u0000\u0000\u00af"+
		"\u00b0\u0005u\u0000\u0000\u00b0\u00b1\u0005a\u0000\u0000\u00b1\u00b2\u0005"+
		"n\u0000\u0000\u00b2\u00b3\u0005t\u0000\u0000\u00b3\u00b4\u0005o\u0000"+
		"\u0000\u00b4\"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005f\u0000\u0000"+
		"\u00b6\u00b7\u0005a\u0000\u0000\u00b7\u00b8\u0005c\u0000\u0000\u00b8\u00b9"+
		"\u0005a\u0000\u0000\u00b9$\u0001\u0000\u0000\u0000\u00ba\u00bc\u0005\""+
		"\u0000\u0000\u00bb\u00bd\b\u0000\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0005\"\u0000\u0000\u00c1&\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c4\u0005-\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c7\u0007\u0001\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c9(\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0003\'\u0013\u0000\u00cb\u00cd\u0005.\u0000\u0000\u00cc\u00ce\u0007"+
		"\u0001\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001"+
		"\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d0*\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005:\u0000"+
		"\u0000\u00d2\u00d3\u0005=\u0000\u0000\u00d3,\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0007\u0002\u0000\u0000\u00d5.\u0001\u0000\u0000\u0000\u00d6\u00e0"+
		"\u0007\u0003\u0000\u0000\u00d7\u00d8\u0005<\u0000\u0000\u00d8\u00e0\u0005"+
		"=\u0000\u0000\u00d9\u00da\u0005>\u0000\u0000\u00da\u00e0\u0005=\u0000"+
		"\u0000\u00db\u00dc\u0005!\u0000\u0000\u00dc\u00e0\u0005=\u0000\u0000\u00dd"+
		"\u00de\u0005=\u0000\u0000\u00de\u00e0\u0005=\u0000\u0000\u00df\u00d6\u0001"+
		"\u0000\u0000\u0000\u00df\u00d7\u0001\u0000\u0000\u0000\u00df\u00d9\u0001"+
		"\u0000\u0000\u0000\u00df\u00db\u0001\u0000\u0000\u0000\u00df\u00dd\u0001"+
		"\u0000\u0000\u0000\u00e00\u0001\u0000\u0000\u0000\u00e1\u00e5\u0005e\u0000"+
		"\u0000\u00e2\u00e3\u0005o\u0000\u0000\u00e3\u00e5\u0005u\u0000\u0000\u00e4"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5"+
		"2\u0001\u0000\u0000\u0000\u00e6\u00e8\u0007\u0004\u0000\u0000\u00e7\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e8\u00ec\u0001\u0000\u0000\u0000\u00e9\u00eb"+
		"\u0007\u0005\u0000\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ee"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ed4\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f0\u0005,\u0000\u0000\u00f06\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f2\u0005(\u0000\u0000\u00f28\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f4\u0005)\u0000\u0000\u00f4:\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005"+
		"{\u0000\u0000\u00f6<\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005}\u0000"+
		"\u0000\u00f8>\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005[\u0000\u0000\u00fa"+
		"@\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005]\u0000\u0000\u00fcB\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fe\u0005.\u0000\u0000\u00feD\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0005\"\u0000\u0000\u0100F\u0001\u0000\u0000\u0000"+
		"\u0101\u0102\u0005=\u0000\u0000\u0102\u0103\u0005>\u0000\u0000\u0103H"+
		"\u0001\u0000\u0000\u0000\u0104\u0105\u0007\u0006\u0000\u0000\u0105\u0106"+
		"\u0001\u0000\u0000\u0000\u0106\u0107\u0006$\u0000\u0000\u0107J\u0001\u0000"+
		"\u0000\u0000\n\u0000\u00be\u00c3\u00c8\u00cf\u00df\u00e4\u00e7\u00ea\u00ec"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
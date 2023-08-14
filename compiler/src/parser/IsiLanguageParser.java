// Generated from IsiLanguage.g4 by ANTLR 4.13.0
package parser;

	import ast.*;
	import symbols.*;
	import java.util.Arrays;
	import java.util.List;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class IsiLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		TEXTO=18, INT=19, DECIMAL=20, ATTR=21, OP=22, OPREL=23, ID=24, COMMA=25, 
		AP=26, FP=27, AC=28, FC=29, ACO=30, FCO=31, EOL=32, DITTO=33, ARROW=34, 
		BLANK=35;
	public static final int
		RULE_prog = 0, RULE_declaracoes = 1, RULE_declara = 2, RULE_type = 3, 
		RULE_bloco = 4, RULE_escopo = 5, RULE_cmd = 6, RULE_cmdLine = 7, RULE_cmdLeitura = 8, 
		RULE_cmdEscrita = 9, RULE_cmdExpr = 10, RULE_cmdIf = 11, RULE_cmdLoop = 12, 
		RULE_paratodo = 13, RULE_enquanto = 14, RULE_limInf = 15, RULE_limSup = 16, 
		RULE_passo = 17, RULE_exprRel = 18, RULE_expr = 19, RULE_exprl = 20, RULE_termo = 21, 
		RULE_num = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declaracoes", "declara", "type", "bloco", "escopo", "cmd", "cmdLine", 
			"cmdLeitura", "cmdEscrita", "cmdExpr", "cmdIf", "cmdLoop", "paratodo", 
			"enquanto", "limInf", "limSup", "passo", "exprRel", "expr", "exprl", 
			"termo", "num"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog'", "'declare'", "'como'", "'INTEIRO'", 
			"'DECIMAL'", "'TEXTO'", "'leia'", "'escreva'", "'se'", "'entao'", "'senao'", 
			"'paratodo'", "'em'", "'..'", "';'", "'enquanto'", null, null, null, 
			"':='", null, null, null, "','", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"'.'", "'\"'", "'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "TEXTO", "INT", "DECIMAL", "ATTR", 
			"OP", "OPREL", "ID", "COMMA", "AP", "FP", "AC", "FC", "ACO", "FCO", "EOL", 
			"DITTO", "ARROW", "BLANK"
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

	@Override
	public String getGrammarFileName() { return "IsiLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		private List<String> ids;
		private Program  program = new Program();
		private Expression expression;
		private BinaryExpression binaryExpression;
		private SymbolTable symbolTable = new SymbolTable();

		public void setup() {
			program.setSymbols(symbolTable);
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

	public IsiLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode EOL() { return getToken(IsiLanguageParser.EOL, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__0);
			setState(47);
			declaracoes();
			setState(48);
			bloco();
			setState(49);
			match(T__1);
			setState(50);
			match(EOL);

				program.cleanStack();

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracoesContext extends ParserRuleContext {
		public List<DeclaraContext> declara() {
			return getRuleContexts(DeclaraContext.class);
		}
		public DeclaraContext declara(int i) {
			return getRuleContext(DeclaraContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitDeclaracoes(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(53);
				declara();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaraContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(IsiLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IsiLanguageParser.ID, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EOL() { return getToken(IsiLanguageParser.EOL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IsiLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IsiLanguageParser.COMMA, i);
		}
		public DeclaraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterDeclara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitDeclara(this);
		}
	}

	public final DeclaraContext declara() throws RecognitionException {
		DeclaraContext _localctx = new DeclaraContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__2);
			setState(60);
			match(ID);
			 ids = new ArrayList<String>(); ids.add(lastToken());
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(62);
				match(COMMA);
				setState(63);
				match(ID);
				 ids.add(lastToken());
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(T__3);
			setState(71);
			type();
			setState(72);
			match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(T__4);
				ids.forEach((id)-> symbolTable.add(new Identifier(id, DataType.INTEIRO)));
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(T__5);
				ids.forEach((id)-> symbolTable.add(new Identifier(id, DataType.DECIMAL)));
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				match(T__6);
				ids.forEach((id)-> symbolTable.add(new Identifier(id, DataType.TEXTO)));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(82);
				cmd();
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16918272L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EscopoContext extends ParserRuleContext {
		public TerminalNode AC() { return getToken(IsiLanguageParser.AC, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FC() { return getToken(IsiLanguageParser.FC, 0); }
		public EscopoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escopo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterEscopo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitEscopo(this);
		}
	}

	public final EscopoContext escopo() throws RecognitionException {
		EscopoContext _localctx = new EscopoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_escopo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(AC);
			setState(88);
			bloco();
			setState(89);
			match(FC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdContext extends ParserRuleContext {
		public CmdLineContext cmdLine() {
			return getRuleContext(CmdLineContext.class,0);
		}
		public CmdIfContext cmdIf() {
			return getRuleContext(CmdIfContext.class,0);
		}
		public CmdLoopContext cmdLoop() {
			return getRuleContext(CmdLoopContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmd);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				cmdLine();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				cmdIf();
				}
				break;
			case T__12:
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				cmdLoop();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdLineContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(IsiLanguageParser.EOL, 0); }
		public CmdLeituraContext cmdLeitura() {
			return getRuleContext(CmdLeituraContext.class,0);
		}
		public CmdEscritaContext cmdEscrita() {
			return getRuleContext(CmdEscritaContext.class,0);
		}
		public CmdExprContext cmdExpr() {
			return getRuleContext(CmdExprContext.class,0);
		}
		public CmdLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterCmdLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitCmdLine(this);
		}
	}

	public final CmdLineContext cmdLine() throws RecognitionException {
		CmdLineContext _localctx = new CmdLineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(96);
				cmdLeitura();
				}
				break;
			case T__8:
				{
				setState(97);
				cmdEscrita();
				}
				break;
			case ID:
				{
				setState(98);
				cmdExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(101);
			match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdLeituraContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLanguageParser.AP, 0); }
		public TerminalNode ID() { return getToken(IsiLanguageParser.ID, 0); }
		public TerminalNode FP() { return getToken(IsiLanguageParser.FP, 0); }
		public CmdLeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLeitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterCmdLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitCmdLeitura(this);
		}
	}

	public final CmdLeituraContext cmdLeitura() throws RecognitionException {
		CmdLeituraContext _localctx = new CmdLeituraContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdLeitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__7);
			setState(104);
			match(AP);
			setState(105);
			match(ID);
			setState(106);
			match(FP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdEscritaContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLanguageParser.AP, 0); }
		public TerminalNode FP() { return getToken(IsiLanguageParser.FP, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TerminalNode TEXTO() { return getToken(IsiLanguageParser.TEXTO, 0); }
		public TerminalNode ID() { return getToken(IsiLanguageParser.ID, 0); }
		public CmdEscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEscrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterCmdEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitCmdEscrita(this);
		}
	}

	public final CmdEscritaContext cmdEscrita() throws RecognitionException {
		CmdEscritaContext _localctx = new CmdEscritaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdEscrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__8);
			setState(109);
			match(AP);
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DECIMAL:
				{
				setState(110);
				num();
				}
				break;
			case TEXTO:
				{
				setState(111);
				match(TEXTO);
				}
				break;
			case ID:
				{
				setState(112);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(115);
			match(FP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiLanguageParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(IsiLanguageParser.ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CmdExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterCmdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitCmdExpr(this);
		}
	}

	public final CmdExprContext cmdExpr() throws RecognitionException {
		CmdExprContext _localctx = new CmdExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(ID);
			String idAtribuido = lastToken();
			setState(119);
			match(ATTR);
			setState(120);
			expr();

											Identifier id = symbolTable.get(idAtribuido);
											program.putCommandOnStack(new AttributionCommand(id, expression));
											expression = null;		
										
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdIfContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLanguageParser.AP, 0); }
		public ExprRelContext exprRel() {
			return getRuleContext(ExprRelContext.class,0);
		}
		public TerminalNode FP() { return getToken(IsiLanguageParser.FP, 0); }
		public List<EscopoContext> escopo() {
			return getRuleContexts(EscopoContext.class);
		}
		public EscopoContext escopo(int i) {
			return getRuleContext(EscopoContext.class,i);
		}
		public CmdIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterCmdIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitCmdIf(this);
		}
	}

	public final CmdIfContext cmdIf() throws RecognitionException {
		CmdIfContext _localctx = new CmdIfContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmdIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__9);
			setState(124);
			match(AP);
			setState(125);
			exprRel();
			setState(126);
			match(FP);
			setState(127);
			match(T__10);
			setState(128);
			escopo();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(129);
				match(T__11);
				setState(130);
				escopo();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdLoopContext extends ParserRuleContext {
		public EscopoContext escopo() {
			return getRuleContext(EscopoContext.class,0);
		}
		public ParatodoContext paratodo() {
			return getRuleContext(ParatodoContext.class,0);
		}
		public EnquantoContext enquanto() {
			return getRuleContext(EnquantoContext.class,0);
		}
		public CmdLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterCmdLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitCmdLoop(this);
		}
	}

	public final CmdLoopContext cmdLoop() throws RecognitionException {
		CmdLoopContext _localctx = new CmdLoopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cmdLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				{
				setState(133);
				paratodo();
				}
				break;
			case T__16:
				{
				setState(134);
				enquanto();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(137);
			escopo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParatodoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiLanguageParser.ID, 0); }
		public TerminalNode ACO() { return getToken(IsiLanguageParser.ACO, 0); }
		public LimInfContext limInf() {
			return getRuleContext(LimInfContext.class,0);
		}
		public LimSupContext limSup() {
			return getRuleContext(LimSupContext.class,0);
		}
		public PassoContext passo() {
			return getRuleContext(PassoContext.class,0);
		}
		public TerminalNode FP() { return getToken(IsiLanguageParser.FP, 0); }
		public TerminalNode FCO() { return getToken(IsiLanguageParser.FCO, 0); }
		public ParatodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paratodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterParatodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitParatodo(this);
		}
	}

	public final ParatodoContext paratodo() throws RecognitionException {
		ParatodoContext _localctx = new ParatodoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_paratodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__12);
			setState(140);
			match(ID);
			setState(141);
			match(T__13);
			setState(142);
			match(ACO);
			setState(143);
			limInf();
			setState(144);
			match(T__14);
			setState(145);
			limSup();
			setState(146);
			match(T__15);
			setState(147);
			passo();
			setState(148);
			_la = _input.LA(1);
			if ( !(_la==FP || _la==FCO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnquantoContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLanguageParser.AP, 0); }
		public ExprRelContext exprRel() {
			return getRuleContext(ExprRelContext.class,0);
		}
		public TerminalNode FP() { return getToken(IsiLanguageParser.FP, 0); }
		public EnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitEnquanto(this);
		}
	}

	public final EnquantoContext enquanto() throws RecognitionException {
		EnquantoContext _localctx = new EnquantoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__16);
			setState(151);
			match(AP);
			setState(152);
			exprRel();
			setState(153);
			match(FP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LimInfContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiLanguageParser.ID, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public LimInfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limInf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterLimInf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitLimInf(this);
		}
	}

	public final LimInfContext limInf() throws RecognitionException {
		LimInfContext _localctx = new LimInfContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_limInf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(155);
				match(ID);
				}
				break;
			case INT:
			case DECIMAL:
				{
				setState(156);
				num();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LimSupContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiLanguageParser.ID, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public LimSupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limSup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterLimSup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitLimSup(this);
		}
	}

	public final LimSupContext limSup() throws RecognitionException {
		LimSupContext _localctx = new LimSupContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_limSup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(159);
				match(ID);
				}
				break;
			case INT:
			case DECIMAL:
				{
				setState(160);
				num();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PassoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiLanguageParser.ID, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public PassoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterPasso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitPasso(this);
		}
	}

	public final PassoContext passo() throws RecognitionException {
		PassoContext _localctx = new PassoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_passo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(163);
				match(ID);
				}
				break;
			case INT:
			case DECIMAL:
				{
				setState(164);
				num();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprRelContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(IsiLanguageParser.OPREL, 0); }
		public ExprRelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprRel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterExprRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitExprRel(this);
		}
	}

	public final ExprRelContext exprRel() throws RecognitionException {
		ExprRelContext _localctx = new ExprRelContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exprRel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			expr();
			setState(168);
			match(OPREL);
			setState(169);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public List<ExprlContext> exprl() {
			return getRuleContexts(ExprlContext.class);
		}
		public ExprlContext exprl(int i) {
			return getRuleContext(ExprlContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			termo();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(172);
				exprl();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprlContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(IsiLanguageParser.OP, 0); }
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public ExprlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterExprl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitExprl(this);
		}
	}

	public final ExprlContext exprl() throws RecognitionException {
		ExprlContext _localctx = new ExprlContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exprl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(OP);
			 
											binaryExpression = new BinaryExpression(lastToken().charAt(0));
											binaryExpression.setLeftOperand(expression);
											
			setState(180);
			termo();

											binaryExpression.setRightOperand(expression);
											expression = binaryExpression;
										
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiLanguageParser.ID, 0); }
		public TerminalNode INT() { return getToken(IsiLanguageParser.INT, 0); }
		public TerminalNode DECIMAL() { return getToken(IsiLanguageParser.DECIMAL, 0); }
		public TerminalNode TEXTO() { return getToken(IsiLanguageParser.TEXTO, 0); }
		public TerminalNode AP() { return getToken(IsiLanguageParser.AP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FP() { return getToken(IsiLanguageParser.FP, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_termo);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(ID);

												String id = lastToken();
												if (!symbolTable.exists(id)){
													throw new RuntimeException("Semantic ERROR - Undeclared Identifier: " + id);
												}
												expression = new IdentifierExpression(symbolTable.get(id));
											
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(INT);
				 expression = new LiteralExpression<Integer>(Integer.valueOf(lastToken())); 
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				match(DECIMAL);
				 expression = new LiteralExpression<Float>(Float.valueOf(lastToken())); 
				}
				break;
			case TEXTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(189);
				match(TEXTO);
				 expression = new LiteralExpression<String>(lastToken()); 
				}
				break;
			case AP:
				enterOuterAlt(_localctx, 5);
				{
				setState(191);
				match(AP);
				setState(192);
				expr();
				setState(193);
				match(FP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(IsiLanguageParser.INT, 0); }
		public TerminalNode DECIMAL() { return getToken(IsiLanguageParser.DECIMAL, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001#\u00c8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u00017\b\u0001"+
		"\n\u0001\f\u0001:\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002B\b\u0002\n\u0002\f\u0002E\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003Q\b\u0003"+
		"\u0001\u0004\u0004\u0004T\b\u0004\u000b\u0004\f\u0004U\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006_\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007d\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tr\b\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0084\b\u000b\u0001\f\u0001\f\u0003\f\u0088\b\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u009e\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00a2\b\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u00a6"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u00ae\b\u0013\n\u0013\f\u0013\u00b1\t\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00c4\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0000\u0000\u0017\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,\u0000\u0002\u0002\u0000\u001b\u001b\u001f\u001f\u0001\u0000\u0013"+
		"\u0014\u00c5\u0000.\u0001\u0000\u0000\u0000\u00028\u0001\u0000\u0000\u0000"+
		"\u0004;\u0001\u0000\u0000\u0000\u0006P\u0001\u0000\u0000\u0000\bS\u0001"+
		"\u0000\u0000\u0000\nW\u0001\u0000\u0000\u0000\f^\u0001\u0000\u0000\u0000"+
		"\u000ec\u0001\u0000\u0000\u0000\u0010g\u0001\u0000\u0000\u0000\u0012l"+
		"\u0001\u0000\u0000\u0000\u0014u\u0001\u0000\u0000\u0000\u0016{\u0001\u0000"+
		"\u0000\u0000\u0018\u0087\u0001\u0000\u0000\u0000\u001a\u008b\u0001\u0000"+
		"\u0000\u0000\u001c\u0096\u0001\u0000\u0000\u0000\u001e\u009d\u0001\u0000"+
		"\u0000\u0000 \u00a1\u0001\u0000\u0000\u0000\"\u00a5\u0001\u0000\u0000"+
		"\u0000$\u00a7\u0001\u0000\u0000\u0000&\u00ab\u0001\u0000\u0000\u0000("+
		"\u00b2\u0001\u0000\u0000\u0000*\u00c3\u0001\u0000\u0000\u0000,\u00c5\u0001"+
		"\u0000\u0000\u0000./\u0005\u0001\u0000\u0000/0\u0003\u0002\u0001\u0000"+
		"01\u0003\b\u0004\u000012\u0005\u0002\u0000\u000023\u0005 \u0000\u0000"+
		"34\u0006\u0000\uffff\uffff\u00004\u0001\u0001\u0000\u0000\u000057\u0003"+
		"\u0004\u0002\u000065\u0001\u0000\u0000\u00007:\u0001\u0000\u0000\u0000"+
		"86\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009\u0003\u0001\u0000"+
		"\u0000\u0000:8\u0001\u0000\u0000\u0000;<\u0005\u0003\u0000\u0000<=\u0005"+
		"\u0018\u0000\u0000=C\u0006\u0002\uffff\uffff\u0000>?\u0005\u0019\u0000"+
		"\u0000?@\u0005\u0018\u0000\u0000@B\u0006\u0002\uffff\uffff\u0000A>\u0001"+
		"\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000DF\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000"+
		"\u0000FG\u0005\u0004\u0000\u0000GH\u0003\u0006\u0003\u0000HI\u0005 \u0000"+
		"\u0000I\u0005\u0001\u0000\u0000\u0000JK\u0005\u0005\u0000\u0000KQ\u0006"+
		"\u0003\uffff\uffff\u0000LM\u0005\u0006\u0000\u0000MQ\u0006\u0003\uffff"+
		"\uffff\u0000NO\u0005\u0007\u0000\u0000OQ\u0006\u0003\uffff\uffff\u0000"+
		"PJ\u0001\u0000\u0000\u0000PL\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000"+
		"\u0000Q\u0007\u0001\u0000\u0000\u0000RT\u0003\f\u0006\u0000SR\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001"+
		"\u0000\u0000\u0000V\t\u0001\u0000\u0000\u0000WX\u0005\u001c\u0000\u0000"+
		"XY\u0003\b\u0004\u0000YZ\u0005\u001d\u0000\u0000Z\u000b\u0001\u0000\u0000"+
		"\u0000[_\u0003\u000e\u0007\u0000\\_\u0003\u0016\u000b\u0000]_\u0003\u0018"+
		"\f\u0000^[\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^]\u0001"+
		"\u0000\u0000\u0000_\r\u0001\u0000\u0000\u0000`d\u0003\u0010\b\u0000ad"+
		"\u0003\u0012\t\u0000bd\u0003\u0014\n\u0000c`\u0001\u0000\u0000\u0000c"+
		"a\u0001\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000ef\u0005 \u0000\u0000f\u000f\u0001\u0000\u0000\u0000gh\u0005\b\u0000"+
		"\u0000hi\u0005\u001a\u0000\u0000ij\u0005\u0018\u0000\u0000jk\u0005\u001b"+
		"\u0000\u0000k\u0011\u0001\u0000\u0000\u0000lm\u0005\t\u0000\u0000mq\u0005"+
		"\u001a\u0000\u0000nr\u0003,\u0016\u0000or\u0005\u0012\u0000\u0000pr\u0005"+
		"\u0018\u0000\u0000qn\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000"+
		"qp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0005\u001b\u0000"+
		"\u0000t\u0013\u0001\u0000\u0000\u0000uv\u0005\u0018\u0000\u0000vw\u0006"+
		"\n\uffff\uffff\u0000wx\u0005\u0015\u0000\u0000xy\u0003&\u0013\u0000yz"+
		"\u0006\n\uffff\uffff\u0000z\u0015\u0001\u0000\u0000\u0000{|\u0005\n\u0000"+
		"\u0000|}\u0005\u001a\u0000\u0000}~\u0003$\u0012\u0000~\u007f\u0005\u001b"+
		"\u0000\u0000\u007f\u0080\u0005\u000b\u0000\u0000\u0080\u0083\u0003\n\u0005"+
		"\u0000\u0081\u0082\u0005\f\u0000\u0000\u0082\u0084\u0003\n\u0005\u0000"+
		"\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000"+
		"\u0084\u0017\u0001\u0000\u0000\u0000\u0085\u0088\u0003\u001a\r\u0000\u0086"+
		"\u0088\u0003\u001c\u000e\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087"+
		"\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0003\n\u0005\u0000\u008a\u0019\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0005\r\u0000\u0000\u008c\u008d\u0005\u0018\u0000\u0000\u008d\u008e\u0005"+
		"\u000e\u0000\u0000\u008e\u008f\u0005\u001e\u0000\u0000\u008f\u0090\u0003"+
		"\u001e\u000f\u0000\u0090\u0091\u0005\u000f\u0000\u0000\u0091\u0092\u0003"+
		" \u0010\u0000\u0092\u0093\u0005\u0010\u0000\u0000\u0093\u0094\u0003\""+
		"\u0011\u0000\u0094\u0095\u0007\u0000\u0000\u0000\u0095\u001b\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0005\u0011\u0000\u0000\u0097\u0098\u0005\u001a"+
		"\u0000\u0000\u0098\u0099\u0003$\u0012\u0000\u0099\u009a\u0005\u001b\u0000"+
		"\u0000\u009a\u001d\u0001\u0000\u0000\u0000\u009b\u009e\u0005\u0018\u0000"+
		"\u0000\u009c\u009e\u0003,\u0016\u0000\u009d\u009b\u0001\u0000\u0000\u0000"+
		"\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u001f\u0001\u0000\u0000\u0000"+
		"\u009f\u00a2\u0005\u0018\u0000\u0000\u00a0\u00a2\u0003,\u0016\u0000\u00a1"+
		"\u009f\u0001\u0000\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2"+
		"!\u0001\u0000\u0000\u0000\u00a3\u00a6\u0005\u0018\u0000\u0000\u00a4\u00a6"+
		"\u0003,\u0016\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a6#\u0001\u0000\u0000\u0000\u00a7\u00a8\u0003&\u0013"+
		"\u0000\u00a8\u00a9\u0005\u0017\u0000\u0000\u00a9\u00aa\u0003&\u0013\u0000"+
		"\u00aa%\u0001\u0000\u0000\u0000\u00ab\u00af\u0003*\u0015\u0000\u00ac\u00ae"+
		"\u0003(\u0014\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001"+
		"\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b0\'\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0005\u0016\u0000\u0000\u00b3\u00b4\u0006\u0014"+
		"\uffff\uffff\u0000\u00b4\u00b5\u0003*\u0015\u0000\u00b5\u00b6\u0006\u0014"+
		"\uffff\uffff\u0000\u00b6)\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u0018"+
		"\u0000\u0000\u00b8\u00c4\u0006\u0015\uffff\uffff\u0000\u00b9\u00ba\u0005"+
		"\u0013\u0000\u0000\u00ba\u00c4\u0006\u0015\uffff\uffff\u0000\u00bb\u00bc"+
		"\u0005\u0014\u0000\u0000\u00bc\u00c4\u0006\u0015\uffff\uffff\u0000\u00bd"+
		"\u00be\u0005\u0012\u0000\u0000\u00be\u00c4\u0006\u0015\uffff\uffff\u0000"+
		"\u00bf\u00c0\u0005\u001a\u0000\u0000\u00c0\u00c1\u0003&\u0013\u0000\u00c1"+
		"\u00c2\u0005\u001b\u0000\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3"+
		"\u00b7\u0001\u0000\u0000\u0000\u00c3\u00b9\u0001\u0000\u0000\u0000\u00c3"+
		"\u00bb\u0001\u0000\u0000\u0000\u00c3\u00bd\u0001\u0000\u0000\u0000\u00c3"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c4+\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0007\u0001\u0000\u0000\u00c6-\u0001\u0000\u0000\u0000\u000e8CPU^cq\u0083"+
		"\u0087\u009d\u00a1\u00a5\u00af\u00c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
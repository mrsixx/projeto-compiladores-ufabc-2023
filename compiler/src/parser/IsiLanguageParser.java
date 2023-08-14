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
		RULE_passo = 17, RULE_exprRel = 18, RULE_expr = 19, RULE_termo = 20, RULE_num = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declaracoes", "declara", "type", "bloco", "escopo", "cmd", "cmdLine", 
			"cmdLeitura", "cmdEscrita", "cmdExpr", "cmdIf", "cmdLoop", "paratodo", 
			"enquanto", "limInf", "limSup", "passo", "exprRel", "expr", "termo", 
			"num"
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
			setState(44);
			match(T__0);
			setState(45);
			declaracoes();
			setState(46);
			bloco();
			setState(47);
			match(T__1);
			setState(48);
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
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(51);
				declara();
				}
				}
				setState(56);
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
			setState(57);
			match(T__2);
			setState(58);
			match(ID);
			 ids = new ArrayList<String>(); ids.add(lastToken());
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(60);
				match(COMMA);
				setState(61);
				match(ID);
				 ids.add(lastToken());
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(T__3);
			setState(69);
			type();
			setState(70);
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
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(T__4);
				ids.forEach((id)-> symbolTable.add(new Identifier(id, DataType.INTEIRO)));
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(T__5);
				ids.forEach((id)-> symbolTable.add(new Identifier(id, DataType.DECIMAL)));
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
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
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				cmd();
				}
				}
				setState(83); 
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
			setState(85);
			match(AC);
			setState(86);
			bloco();
			setState(87);
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
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				cmdLine();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				cmdIf();
				}
				break;
			case T__12:
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
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
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(94);
				cmdLeitura();
				}
				break;
			case T__8:
				{
				setState(95);
				cmdEscrita();
				}
				break;
			case ID:
				{
				setState(96);
				cmdExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(99);
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
			setState(101);
			match(T__7);
			setState(102);
			match(AP);
			setState(103);
			match(ID);
			setState(104);
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
			setState(106);
			match(T__8);
			setState(107);
			match(AP);
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DECIMAL:
				{
				setState(108);
				num();
				}
				break;
			case TEXTO:
				{
				setState(109);
				match(TEXTO);
				}
				break;
			case ID:
				{
				setState(110);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(113);
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
			setState(115);
			match(ID);
			String idAtribuido = lastToken();
			setState(117);
			match(ATTR);
			setState(118);
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
			setState(121);
			match(T__9);
			setState(122);
			match(AP);
			setState(123);
			exprRel();
			setState(124);
			match(FP);
			setState(125);
			match(T__10);
			setState(126);
			escopo();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(127);
				match(T__11);
				setState(128);
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
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				{
				setState(131);
				paratodo();
				}
				break;
			case T__16:
				{
				setState(132);
				enquanto();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(135);
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
			setState(137);
			match(T__12);
			setState(138);
			match(ID);
			setState(139);
			match(T__13);
			setState(140);
			match(ACO);
			setState(141);
			limInf();
			setState(142);
			match(T__14);
			setState(143);
			limSup();
			setState(144);
			match(T__15);
			setState(145);
			passo();
			setState(146);
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
			setState(148);
			match(T__16);
			setState(149);
			match(AP);
			setState(150);
			exprRel();
			setState(151);
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
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(153);
				match(ID);
				}
				break;
			case INT:
			case DECIMAL:
				{
				setState(154);
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
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(157);
				match(ID);
				}
				break;
			case INT:
			case DECIMAL:
				{
				setState(158);
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
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(161);
				match(ID);
				}
				break;
			case INT:
			case DECIMAL:
				{
				setState(162);
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
			setState(165);
			expr();
			setState(166);
			match(OPREL);
			setState(167);
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
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> OP() { return getTokens(IsiLanguageParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(IsiLanguageParser.OP, i);
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
			setState(169);
			termo();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(170);
				match(OP);
				setState(171);
				termo();
				}
				}
				setState(176);
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
		enterRule(_localctx, 40, RULE_termo);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(ID);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(INT);
				 expression = new LiteralExpression<Integer>(Integer.getInteger(lastToken())); 
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				match(DECIMAL);
				 expression = new LiteralExpression<Float>(Float.valueOf(lastToken())); 
				}
				break;
			case TEXTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				match(TEXTO);
				 expression = new LiteralExpression<String>(lastToken()); 
				}
				break;
			case AP:
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				match(AP);
				setState(185);
				expr();
				setState(186);
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
		enterRule(_localctx, 42, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
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
		"\u0004\u0001#\u00c1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0005\u00015\b\u0001\n\u0001\f\u00018\t\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002@\b\u0002\n\u0002\f\u0002C\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003O\b\u0003\u0001\u0004\u0004\u0004"+
		"R\b\u0004\u000b\u0004\f\u0004S\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006]\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007b\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0003\tp\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0082\b\u000b"+
		"\u0001\f\u0001\f\u0003\f\u0086\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u009c\b\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u00a0"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u00a4\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u00ad\b\u0013\n\u0013\f\u0013\u00b0\t\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00bd\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0000\u0000\u0016\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*\u0000"+
		"\u0002\u0002\u0000\u001b\u001b\u001f\u001f\u0001\u0000\u0013\u0014\u00bf"+
		"\u0000,\u0001\u0000\u0000\u0000\u00026\u0001\u0000\u0000\u0000\u00049"+
		"\u0001\u0000\u0000\u0000\u0006N\u0001\u0000\u0000\u0000\bQ\u0001\u0000"+
		"\u0000\u0000\nU\u0001\u0000\u0000\u0000\f\\\u0001\u0000\u0000\u0000\u000e"+
		"a\u0001\u0000\u0000\u0000\u0010e\u0001\u0000\u0000\u0000\u0012j\u0001"+
		"\u0000\u0000\u0000\u0014s\u0001\u0000\u0000\u0000\u0016y\u0001\u0000\u0000"+
		"\u0000\u0018\u0085\u0001\u0000\u0000\u0000\u001a\u0089\u0001\u0000\u0000"+
		"\u0000\u001c\u0094\u0001\u0000\u0000\u0000\u001e\u009b\u0001\u0000\u0000"+
		"\u0000 \u009f\u0001\u0000\u0000\u0000\"\u00a3\u0001\u0000\u0000\u0000"+
		"$\u00a5\u0001\u0000\u0000\u0000&\u00a9\u0001\u0000\u0000\u0000(\u00bc"+
		"\u0001\u0000\u0000\u0000*\u00be\u0001\u0000\u0000\u0000,-\u0005\u0001"+
		"\u0000\u0000-.\u0003\u0002\u0001\u0000./\u0003\b\u0004\u0000/0\u0005\u0002"+
		"\u0000\u000001\u0005 \u0000\u000012\u0006\u0000\uffff\uffff\u00002\u0001"+
		"\u0001\u0000\u0000\u000035\u0003\u0004\u0002\u000043\u0001\u0000\u0000"+
		"\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000"+
		"\u0000\u00007\u0003\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u0000"+
		"9:\u0005\u0003\u0000\u0000:;\u0005\u0018\u0000\u0000;A\u0006\u0002\uffff"+
		"\uffff\u0000<=\u0005\u0019\u0000\u0000=>\u0005\u0018\u0000\u0000>@\u0006"+
		"\u0002\uffff\uffff\u0000?<\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000"+
		"\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BD\u0001\u0000"+
		"\u0000\u0000CA\u0001\u0000\u0000\u0000DE\u0005\u0004\u0000\u0000EF\u0003"+
		"\u0006\u0003\u0000FG\u0005 \u0000\u0000G\u0005\u0001\u0000\u0000\u0000"+
		"HI\u0005\u0005\u0000\u0000IO\u0006\u0003\uffff\uffff\u0000JK\u0005\u0006"+
		"\u0000\u0000KO\u0006\u0003\uffff\uffff\u0000LM\u0005\u0007\u0000\u0000"+
		"MO\u0006\u0003\uffff\uffff\u0000NH\u0001\u0000\u0000\u0000NJ\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000O\u0007\u0001\u0000\u0000\u0000"+
		"PR\u0003\f\u0006\u0000QP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000T\t\u0001\u0000\u0000"+
		"\u0000UV\u0005\u001c\u0000\u0000VW\u0003\b\u0004\u0000WX\u0005\u001d\u0000"+
		"\u0000X\u000b\u0001\u0000\u0000\u0000Y]\u0003\u000e\u0007\u0000Z]\u0003"+
		"\u0016\u000b\u0000[]\u0003\u0018\f\u0000\\Y\u0001\u0000\u0000\u0000\\"+
		"Z\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000]\r\u0001\u0000\u0000"+
		"\u0000^b\u0003\u0010\b\u0000_b\u0003\u0012\t\u0000`b\u0003\u0014\n\u0000"+
		"a^\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000a`\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000cd\u0005 \u0000\u0000d\u000f\u0001\u0000"+
		"\u0000\u0000ef\u0005\b\u0000\u0000fg\u0005\u001a\u0000\u0000gh\u0005\u0018"+
		"\u0000\u0000hi\u0005\u001b\u0000\u0000i\u0011\u0001\u0000\u0000\u0000"+
		"jk\u0005\t\u0000\u0000ko\u0005\u001a\u0000\u0000lp\u0003*\u0015\u0000"+
		"mp\u0005\u0012\u0000\u0000np\u0005\u0018\u0000\u0000ol\u0001\u0000\u0000"+
		"\u0000om\u0001\u0000\u0000\u0000on\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000qr\u0005\u001b\u0000\u0000r\u0013\u0001\u0000\u0000\u0000"+
		"st\u0005\u0018\u0000\u0000tu\u0006\n\uffff\uffff\u0000uv\u0005\u0015\u0000"+
		"\u0000vw\u0003&\u0013\u0000wx\u0006\n\uffff\uffff\u0000x\u0015\u0001\u0000"+
		"\u0000\u0000yz\u0005\n\u0000\u0000z{\u0005\u001a\u0000\u0000{|\u0003$"+
		"\u0012\u0000|}\u0005\u001b\u0000\u0000}~\u0005\u000b\u0000\u0000~\u0081"+
		"\u0003\n\u0005\u0000\u007f\u0080\u0005\f\u0000\u0000\u0080\u0082\u0003"+
		"\n\u0005\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000"+
		"\u0000\u0000\u0082\u0017\u0001\u0000\u0000\u0000\u0083\u0086\u0003\u001a"+
		"\r\u0000\u0084\u0086\u0003\u001c\u000e\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0003\n\u0005\u0000\u0088\u0019\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0005\r\u0000\u0000\u008a\u008b\u0005\u0018\u0000\u0000\u008b"+
		"\u008c\u0005\u000e\u0000\u0000\u008c\u008d\u0005\u001e\u0000\u0000\u008d"+
		"\u008e\u0003\u001e\u000f\u0000\u008e\u008f\u0005\u000f\u0000\u0000\u008f"+
		"\u0090\u0003 \u0010\u0000\u0090\u0091\u0005\u0010\u0000\u0000\u0091\u0092"+
		"\u0003\"\u0011\u0000\u0092\u0093\u0007\u0000\u0000\u0000\u0093\u001b\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0005\u0011\u0000\u0000\u0095\u0096\u0005"+
		"\u001a\u0000\u0000\u0096\u0097\u0003$\u0012\u0000\u0097\u0098\u0005\u001b"+
		"\u0000\u0000\u0098\u001d\u0001\u0000\u0000\u0000\u0099\u009c\u0005\u0018"+
		"\u0000\u0000\u009a\u009c\u0003*\u0015\u0000\u009b\u0099\u0001\u0000\u0000"+
		"\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u001f\u0001\u0000\u0000"+
		"\u0000\u009d\u00a0\u0005\u0018\u0000\u0000\u009e\u00a0\u0003*\u0015\u0000"+
		"\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000"+
		"\u00a0!\u0001\u0000\u0000\u0000\u00a1\u00a4\u0005\u0018\u0000\u0000\u00a2"+
		"\u00a4\u0003*\u0015\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a4#\u0001\u0000\u0000\u0000\u00a5\u00a6\u0003"+
		"&\u0013\u0000\u00a6\u00a7\u0005\u0017\u0000\u0000\u00a7\u00a8\u0003&\u0013"+
		"\u0000\u00a8%\u0001\u0000\u0000\u0000\u00a9\u00ae\u0003(\u0014\u0000\u00aa"+
		"\u00ab\u0005\u0016\u0000\u0000\u00ab\u00ad\u0003(\u0014\u0000\u00ac\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\'\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00bd\u0005"+
		"\u0018\u0000\u0000\u00b2\u00b3\u0005\u0013\u0000\u0000\u00b3\u00bd\u0006"+
		"\u0014\uffff\uffff\u0000\u00b4\u00b5\u0005\u0014\u0000\u0000\u00b5\u00bd"+
		"\u0006\u0014\uffff\uffff\u0000\u00b6\u00b7\u0005\u0012\u0000\u0000\u00b7"+
		"\u00bd\u0006\u0014\uffff\uffff\u0000\u00b8\u00b9\u0005\u001a\u0000\u0000"+
		"\u00b9\u00ba\u0003&\u0013\u0000\u00ba\u00bb\u0005\u001b\u0000\u0000\u00bb"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bc\u00b1\u0001\u0000\u0000\u0000\u00bc"+
		"\u00b2\u0001\u0000\u0000\u0000\u00bc\u00b4\u0001\u0000\u0000\u0000\u00bc"+
		"\u00b6\u0001\u0000\u0000\u0000\u00bc\u00b8\u0001\u0000\u0000\u0000\u00bd"+
		")\u0001\u0000\u0000\u0000\u00be\u00bf\u0007\u0001\u0000\u0000\u00bf+\u0001"+
		"\u0000\u0000\u0000\u000e6ANS\\ao\u0081\u0085\u009b\u009f\u00a3\u00ae\u00bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
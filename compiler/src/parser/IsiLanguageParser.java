// Generated from IsiLanguage.g4 by ANTLR 4.13.0
package parser;

	import ast.*;
	import symbols.*;
	import exceptions.*;
	import java.util.Arrays;
	import java.util.ArrayList;
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
		T__17=18, TEXTO=19, INT=20, DECIMAL=21, ATTR=22, OP=23, OPREL=24, OPLOG=25, 
		ID=26, COMMA=27, AP=28, FP=29, AC=30, FC=31, ACO=32, FCO=33, EOL=34, DITTO=35, 
		ARROW=36, BLANK=37;
	public static final int
		RULE_prog = 0, RULE_declaracoes = 1, RULE_declara = 2, RULE_type = 3, 
		RULE_bloco = 4, RULE_escopo = 5, RULE_cmd = 6, RULE_cmdLine = 7, RULE_cmdLeitura = 8, 
		RULE_cmdEscrita = 9, RULE_cmdExpr = 10, RULE_cmdIf = 11, RULE_cmdLoop = 12, 
		RULE_paratodo = 13, RULE_enquanto = 14, RULE_exprRel = 15, RULE_exprRell = 16, 
		RULE_termoRel = 17, RULE_expr = 18, RULE_exprl = 19, RULE_termo = 20, 
		RULE_num = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declaracoes", "declara", "type", "bloco", "escopo", "cmd", "cmdLine", 
			"cmdLeitura", "cmdEscrita", "cmdExpr", "cmdIf", "cmdLoop", "paratodo", 
			"enquanto", "exprRel", "exprRell", "termoRel", "expr", "exprl", "termo", 
			"num"
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
				program.checkIds();

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

															ids = new ArrayList<String>();
															ids.add(lastToken());
															_declCmd = new DeclarationCommand();
													
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
				ids.forEach((name)-> mapIdentifier(name, DataType.INTEIRO));program.putCommandOnStack(_declCmd);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(T__5);
				ids.forEach((name)-> mapIdentifier(name, DataType.DECIMAL));program.putCommandOnStack(_declCmd);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				match(T__6);
				ids.forEach((name)-> mapIdentifier(name, DataType.TEXTO));program.putCommandOnStack(_declCmd);
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 67249920L) != 0) );
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

														Identifier id = getIdIfDeclared();
														id.setAssigned();
														program.putCommandOnStack(new ReadCommand(id));
													
			setState(105);
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
		public TerminalNode INT() { return getToken(IsiLanguageParser.INT, 0); }
		public TerminalNode DECIMAL() { return getToken(IsiLanguageParser.DECIMAL, 0); }
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
			setState(107);
			match(T__8);
			setState(108);
			match(AP);
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(109);
				match(INT);

														Integer literal = Integer.valueOf(lastToken());
														program.putCommandOnStack(new WriteCommand(new LiteralExpression<Integer>(literal)));
													
				}
				break;
			case DECIMAL:
				{
				setState(111);
				match(DECIMAL);

														Double literal = Double.valueOf(lastToken());
														program.putCommandOnStack(new WriteCommand(new LiteralExpression<Double>(literal)));
													
				}
				break;
			case TEXTO:
				{
				setState(113);
				match(TEXTO);

														String literal = lastToken();
														program.putCommandOnStack(new WriteCommand(new LiteralExpression<String>(literal)));
													
				}
				break;
			case ID:
				{
				setState(115);
				match(ID);

													program.putCommandOnStack(new WriteCommand(new IdentifierExpression(getIdIfDeclared())));
													
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(119);
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
			setState(121);
			match(ID);
			String idAtribuido = lastToken();
			setState(123);
			match(ATTR);
			setState(124);
			expr();

											Identifier id = program.getSymbolTable().get(idAtribuido);
											id.setAssigned();
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
		public List<TerminalNode> AC() { return getTokens(IsiLanguageParser.AC); }
		public TerminalNode AC(int i) {
			return getToken(IsiLanguageParser.AC, i);
		}
		public List<TerminalNode> FC() { return getTokens(IsiLanguageParser.FC); }
		public TerminalNode FC(int i) {
			return getToken(IsiLanguageParser.FC, i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
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
			setState(127);
			match(T__9);
			 DecisionCommand cmdIf = new DecisionCommand(); 
			setState(129);
			match(AP);
			setState(130);
			exprRel();
			 cmdIf.setCondition(_relationalExpression); 
			setState(132);
			match(FP);
			setState(133);
			match(T__10);
			setState(134);
			match(AC);
			 program.newLayer(); 
			setState(137); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(136);
				cmd();
				}
				}
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 67249920L) != 0) );
			setState(141);
			match(FC);
			 cmdIf.getTrueCommands().addAll(program.popStackCommands()); 
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(143);
				match(T__11);
				setState(144);
				match(AC);
				 program.newLayer(); 
				{
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(146);
					cmd();
					}
					}
					setState(149); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 67249920L) != 0) );
				}
				setState(151);
				match(FC);

														cmdIf.getFalseCommands().addAll(program.popStackCommands());
														program.putCommandOnStack(cmdIf);
													
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
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				paratodo();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				enquanto();
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
	public static class ParatodoContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(IsiLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IsiLanguageParser.ID, i);
		}
		public TerminalNode ACO() { return getToken(IsiLanguageParser.ACO, 0); }
		public EscopoContext escopo() {
			return getRuleContext(EscopoContext.class,0);
		}
		public List<TerminalNode> INT() { return getTokens(IsiLanguageParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(IsiLanguageParser.INT, i);
		}
		public List<TerminalNode> DECIMAL() { return getTokens(IsiLanguageParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(IsiLanguageParser.DECIMAL, i);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__12);

												// adiciona nova camada na pilha e cria o comando de loop
												program.newLayer();
												ForLoopCommand loopCommand = new ForLoopCommand();
											
			setState(162);
			match(ID);
			 loopCommand.getIteratorId().setName(lastToken()); 
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(164);
				match(T__4);
				 loopCommand.getIteratorId().setType(DataType.INTEIRO); 
				}
				break;
			case T__5:
				{
				setState(166);
				match(T__5);
				 loopCommand.getIteratorId().setType(DataType.DECIMAL); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(170);
			match(T__13);
			 program.getSymbolTable().add(loopCommand.getIteratorId()); 
			setState(172);
			match(ACO);
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(173);
				match(ID);
				 loopCommand.setLowerBound(new IdentifierExpression(getIdIfDeclared())); 
				}
				break;
			case INT:
				{
				setState(175);
				match(INT);
				 loopCommand.setLowerBound(new LiteralExpression<Integer>(Integer.valueOf(lastToken()))); 
				}
				break;
			case DECIMAL:
				{
				setState(177);
				match(DECIMAL);
				 loopCommand.setLowerBound(new LiteralExpression<Double>(Double.valueOf(lastToken()))); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(181);
			match(T__14);
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(182);
				match(ID);
				 loopCommand.setUpperBound(new IdentifierExpression(getIdIfDeclared())); 
				}
				break;
			case INT:
				{
				setState(184);
				match(INT);
				 loopCommand.setUpperBound(new LiteralExpression<Integer>(Integer.valueOf(lastToken()))); 
				}
				break;
			case DECIMAL:
				{
				setState(186);
				match(DECIMAL);
				 loopCommand.setUpperBound(new LiteralExpression<Double>(Double.valueOf(lastToken()))); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(190);
			match(T__15);
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(191);
				match(ID);
				 loopCommand.setStep(new IdentifierExpression(getIdIfDeclared())); 
				}
				break;
			case INT:
				{
				setState(193);
				match(INT);
				 loopCommand.setStep(new LiteralExpression<Integer>(Integer.valueOf(lastToken()))); 
				}
				break;
			case DECIMAL:
				{
				setState(195);
				match(DECIMAL);
				 loopCommand.setStep(new LiteralExpression<Double>(Double.valueOf(lastToken()))); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FP:
				{
				setState(199);
				match(FP);
				 loopCommand.setOpenInterval(true); 
				}
				break;
			case FCO:
				{
				setState(201);
				match(FCO);
				 loopCommand.setOpenInterval(false); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(205);
			escopo();

												loopCommand.setScope(program.popStackCommands());
												program.putCommandOnStack(loopCommand);
											
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
		public TerminalNode AC() { return getToken(IsiLanguageParser.AC, 0); }
		public TerminalNode FC() { return getToken(IsiLanguageParser.FC, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(T__16);
			 WhileLoopCommand whileCmd = new WhileLoopCommand(); 
			setState(210);
			match(AP);
			setState(211);
			exprRel();
			 whileCmd.setCondition(_relationalExpression); 
			setState(213);
			match(FP);
			setState(214);
			match(T__17);
			setState(215);
			match(AC);
			 program.newLayer(); 
			setState(218); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(217);
				cmd();
				}
				}
				setState(220); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 67249920L) != 0) );
			setState(222);
			match(FC);
			 
											whileCmd.getCommands().addAll(program.popStackCommands());
											program.putCommandOnStack(whileCmd);
										
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
		public TermoRelContext termoRel() {
			return getRuleContext(TermoRelContext.class,0);
		}
		public List<ExprRellContext> exprRell() {
			return getRuleContexts(ExprRellContext.class);
		}
		public ExprRellContext exprRell(int i) {
			return getRuleContext(ExprRellContext.class,i);
		}
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
		enterRule(_localctx, 30, RULE_exprRel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			termoRel();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPLOG) {
				{
				{
				setState(226);
				exprRell();
				}
				}
				setState(231);
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
	public static class ExprRellContext extends ParserRuleContext {
		public TerminalNode OPLOG() { return getToken(IsiLanguageParser.OPLOG, 0); }
		public TermoRelContext termoRel() {
			return getRuleContext(TermoRelContext.class,0);
		}
		public ExprRellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprRell; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterExprRell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitExprRell(this);
		}
	}

	public final ExprRellContext exprRell() throws RecognitionException {
		ExprRellContext _localctx = new ExprRellContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exprRell);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(OPLOG);
			 
											binaryRelExpression = new BinaryRelationalExpression(lastToken());
											binaryRelExpression.setLeftOperand(_relationalExpression);
											
			setState(234);
			termoRel();

											binaryRelExpression.setRightOperand(_relationalExpression);
											_relationalExpression = binaryRelExpression;
										
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
	public static class TermoRelContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(IsiLanguageParser.OPREL, 0); }
		public TermoRelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoRel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).enterTermoRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLanguageListener ) ((IsiLanguageListener)listener).exitTermoRel(this);
		}
	}

	public final TermoRelContext termoRel() throws RecognitionException {
		TermoRelContext _localctx = new TermoRelContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_termoRel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			expr();

											_relationalExpression = new RelationalExpression();
											_relationalExpression.setLeftMember(expression);
										
			setState(239);
			match(OPREL);
			 _relationalExpression.setOperator(lastToken()); 
			setState(241);
			expr();
			 _relationalExpression.setRightMember(expression); 
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
		enterRule(_localctx, 36, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			termo();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(245);
				exprl();
				}
				}
				setState(250);
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
		enterRule(_localctx, 38, RULE_exprl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(OP);
			 
											binaryExpression = new BinaryExpression(lastToken().charAt(0));
											binaryExpression.setLeftOperand(expression);
											
			setState(253);
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
		enterRule(_localctx, 40, RULE_termo);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(ID);
				 expression = new IdentifierExpression(getIdIfDeclared()); 
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(INT);
				 expression = new LiteralExpression<Integer>(Integer.valueOf(lastToken())); 
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				match(DECIMAL);
				 expression = new LiteralExpression<Double>(Double.valueOf(lastToken())); 
				}
				break;
			case TEXTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				match(TEXTO);
				 expression = new LiteralExpression<String>(lastToken()); 
				}
				break;
			case AP:
				enterOuterAlt(_localctx, 5);
				{
				setState(264);
				match(AP);
				setState(265);
				expr();
				setState(266);
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
			setState(270);
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
		"\u0004\u0001%\u0111\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\tv\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u008a\b\u000b"+
		"\u000b\u000b\f\u000b\u008b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0004\u000b\u0094\b\u000b\u000b\u000b\f\u000b"+
		"\u0095\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u009b\b\u000b\u0001"+
		"\f\u0001\f\u0003\f\u009f\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00a9\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00b4\b\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00bd\b\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00c6\b\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00cc\b\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u00db\b\u000e\u000b\u000e\f"+
		"\u000e\u00dc\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u00e4\b\u000f\n\u000f\f\u000f\u00e7\t\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u00f7\b\u0012\n\u0012\f\u0012\u00fa\t\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u010d\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0000\u0000\u0016\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*\u0000\u0001\u0001\u0000\u0014\u0015\u0119\u0000,\u0001\u0000\u0000"+
		"\u0000\u00026\u0001\u0000\u0000\u0000\u00049\u0001\u0000\u0000\u0000\u0006"+
		"N\u0001\u0000\u0000\u0000\bQ\u0001\u0000\u0000\u0000\nU\u0001\u0000\u0000"+
		"\u0000\f\\\u0001\u0000\u0000\u0000\u000ea\u0001\u0000\u0000\u0000\u0010"+
		"e\u0001\u0000\u0000\u0000\u0012k\u0001\u0000\u0000\u0000\u0014y\u0001"+
		"\u0000\u0000\u0000\u0016\u007f\u0001\u0000\u0000\u0000\u0018\u009e\u0001"+
		"\u0000\u0000\u0000\u001a\u00a0\u0001\u0000\u0000\u0000\u001c\u00d0\u0001"+
		"\u0000\u0000\u0000\u001e\u00e1\u0001\u0000\u0000\u0000 \u00e8\u0001\u0000"+
		"\u0000\u0000\"\u00ed\u0001\u0000\u0000\u0000$\u00f4\u0001\u0000\u0000"+
		"\u0000&\u00fb\u0001\u0000\u0000\u0000(\u010c\u0001\u0000\u0000\u0000*"+
		"\u010e\u0001\u0000\u0000\u0000,-\u0005\u0001\u0000\u0000-.\u0003\u0002"+
		"\u0001\u0000./\u0003\b\u0004\u0000/0\u0005\u0002\u0000\u000001\u0005\""+
		"\u0000\u000012\u0006\u0000\uffff\uffff\u00002\u0001\u0001\u0000\u0000"+
		"\u000035\u0003\u0004\u0002\u000043\u0001\u0000\u0000\u000058\u0001\u0000"+
		"\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u00007\u0003"+
		"\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u00009:\u0005\u0003\u0000"+
		"\u0000:;\u0005\u001a\u0000\u0000;A\u0006\u0002\uffff\uffff\u0000<=\u0005"+
		"\u001b\u0000\u0000=>\u0005\u001a\u0000\u0000>@\u0006\u0002\uffff\uffff"+
		"\u0000?<\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000"+
		"\u0000\u0000AB\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000\u0000CA\u0001"+
		"\u0000\u0000\u0000DE\u0005\u0004\u0000\u0000EF\u0003\u0006\u0003\u0000"+
		"FG\u0005\"\u0000\u0000G\u0005\u0001\u0000\u0000\u0000HI\u0005\u0005\u0000"+
		"\u0000IO\u0006\u0003\uffff\uffff\u0000JK\u0005\u0006\u0000\u0000KO\u0006"+
		"\u0003\uffff\uffff\u0000LM\u0005\u0007\u0000\u0000MO\u0006\u0003\uffff"+
		"\uffff\u0000NH\u0001\u0000\u0000\u0000NJ\u0001\u0000\u0000\u0000NL\u0001"+
		"\u0000\u0000\u0000O\u0007\u0001\u0000\u0000\u0000PR\u0003\f\u0006\u0000"+
		"QP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000"+
		"\u0000ST\u0001\u0000\u0000\u0000T\t\u0001\u0000\u0000\u0000UV\u0005\u001e"+
		"\u0000\u0000VW\u0003\b\u0004\u0000WX\u0005\u001f\u0000\u0000X\u000b\u0001"+
		"\u0000\u0000\u0000Y]\u0003\u000e\u0007\u0000Z]\u0003\u0016\u000b\u0000"+
		"[]\u0003\u0018\f\u0000\\Y\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000"+
		"\u0000\\[\u0001\u0000\u0000\u0000]\r\u0001\u0000\u0000\u0000^b\u0003\u0010"+
		"\b\u0000_b\u0003\u0012\t\u0000`b\u0003\u0014\n\u0000a^\u0001\u0000\u0000"+
		"\u0000a_\u0001\u0000\u0000\u0000a`\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000cd\u0005\"\u0000\u0000d\u000f\u0001\u0000\u0000\u0000ef\u0005"+
		"\b\u0000\u0000fg\u0005\u001c\u0000\u0000gh\u0005\u001a\u0000\u0000hi\u0006"+
		"\b\uffff\uffff\u0000ij\u0005\u001d\u0000\u0000j\u0011\u0001\u0000\u0000"+
		"\u0000kl\u0005\t\u0000\u0000lu\u0005\u001c\u0000\u0000mn\u0005\u0014\u0000"+
		"\u0000nv\u0006\t\uffff\uffff\u0000op\u0005\u0015\u0000\u0000pv\u0006\t"+
		"\uffff\uffff\u0000qr\u0005\u0013\u0000\u0000rv\u0006\t\uffff\uffff\u0000"+
		"st\u0005\u001a\u0000\u0000tv\u0006\t\uffff\uffff\u0000um\u0001\u0000\u0000"+
		"\u0000uo\u0001\u0000\u0000\u0000uq\u0001\u0000\u0000\u0000us\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0005\u001d\u0000\u0000x\u0013"+
		"\u0001\u0000\u0000\u0000yz\u0005\u001a\u0000\u0000z{\u0006\n\uffff\uffff"+
		"\u0000{|\u0005\u0016\u0000\u0000|}\u0003$\u0012\u0000}~\u0006\n\uffff"+
		"\uffff\u0000~\u0015\u0001\u0000\u0000\u0000\u007f\u0080\u0005\n\u0000"+
		"\u0000\u0080\u0081\u0006\u000b\uffff\uffff\u0000\u0081\u0082\u0005\u001c"+
		"\u0000\u0000\u0082\u0083\u0003\u001e\u000f\u0000\u0083\u0084\u0006\u000b"+
		"\uffff\uffff\u0000\u0084\u0085\u0005\u001d\u0000\u0000\u0085\u0086\u0005"+
		"\u000b\u0000\u0000\u0086\u0087\u0005\u001e\u0000\u0000\u0087\u0089\u0006"+
		"\u000b\uffff\uffff\u0000\u0088\u008a\u0003\f\u0006\u0000\u0089\u0088\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0089\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0005\u001f\u0000\u0000\u008e\u009a\u0006"+
		"\u000b\uffff\uffff\u0000\u008f\u0090\u0005\f\u0000\u0000\u0090\u0091\u0005"+
		"\u001e\u0000\u0000\u0091\u0093\u0006\u000b\uffff\uffff\u0000\u0092\u0094"+
		"\u0003\f\u0006\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001"+
		"\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0005"+
		"\u001f\u0000\u0000\u0098\u0099\u0006\u000b\uffff\uffff\u0000\u0099\u009b"+
		"\u0001\u0000\u0000\u0000\u009a\u008f\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0001\u0000\u0000\u0000\u009b\u0017\u0001\u0000\u0000\u0000\u009c\u009f"+
		"\u0003\u001a\r\u0000\u009d\u009f\u0003\u001c\u000e\u0000\u009e\u009c\u0001"+
		"\u0000\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u0019\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0005\r\u0000\u0000\u00a1\u00a2\u0006\r"+
		"\uffff\uffff\u0000\u00a2\u00a3\u0005\u001a\u0000\u0000\u00a3\u00a8\u0006"+
		"\r\uffff\uffff\u0000\u00a4\u00a5\u0005\u0005\u0000\u0000\u00a5\u00a9\u0006"+
		"\r\uffff\uffff\u0000\u00a6\u00a7\u0005\u0006\u0000\u0000\u00a7\u00a9\u0006"+
		"\r\uffff\uffff\u0000\u00a8\u00a4\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005"+
		"\u000e\u0000\u0000\u00ab\u00ac\u0006\r\uffff\uffff\u0000\u00ac\u00b3\u0005"+
		" \u0000\u0000\u00ad\u00ae\u0005\u001a\u0000\u0000\u00ae\u00b4\u0006\r"+
		"\uffff\uffff\u0000\u00af\u00b0\u0005\u0014\u0000\u0000\u00b0\u00b4\u0006"+
		"\r\uffff\uffff\u0000\u00b1\u00b2\u0005\u0015\u0000\u0000\u00b2\u00b4\u0006"+
		"\r\uffff\uffff\u0000\u00b3\u00ad\u0001\u0000\u0000\u0000\u00b3\u00af\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b5\u00bc\u0005\u000f\u0000\u0000\u00b6\u00b7\u0005"+
		"\u001a\u0000\u0000\u00b7\u00bd\u0006\r\uffff\uffff\u0000\u00b8\u00b9\u0005"+
		"\u0014\u0000\u0000\u00b9\u00bd\u0006\r\uffff\uffff\u0000\u00ba\u00bb\u0005"+
		"\u0015\u0000\u0000\u00bb\u00bd\u0006\r\uffff\uffff\u0000\u00bc\u00b6\u0001"+
		"\u0000\u0000\u0000\u00bc\u00b8\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00c5\u0005"+
		"\u0010\u0000\u0000\u00bf\u00c0\u0005\u001a\u0000\u0000\u00c0\u00c6\u0006"+
		"\r\uffff\uffff\u0000\u00c1\u00c2\u0005\u0014\u0000\u0000\u00c2\u00c6\u0006"+
		"\r\uffff\uffff\u0000\u00c3\u00c4\u0005\u0015\u0000\u0000\u00c4\u00c6\u0006"+
		"\r\uffff\uffff\u0000\u00c5\u00bf\u0001\u0000\u0000\u0000\u00c5\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00cb\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0005\u001d\u0000\u0000\u00c8\u00cc\u0006"+
		"\r\uffff\uffff\u0000\u00c9\u00ca\u0005!\u0000\u0000\u00ca\u00cc\u0006"+
		"\r\uffff\uffff\u0000\u00cb\u00c7\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0003"+
		"\n\u0005\u0000\u00ce\u00cf\u0006\r\uffff\uffff\u0000\u00cf\u001b\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0005\u0011\u0000\u0000\u00d1\u00d2\u0006"+
		"\u000e\uffff\uffff\u0000\u00d2\u00d3\u0005\u001c\u0000\u0000\u00d3\u00d4"+
		"\u0003\u001e\u000f\u0000\u00d4\u00d5\u0006\u000e\uffff\uffff\u0000\u00d5"+
		"\u00d6\u0005\u001d\u0000\u0000\u00d6\u00d7\u0005\u0012\u0000\u0000\u00d7"+
		"\u00d8\u0005\u001e\u0000\u0000\u00d8\u00da\u0006\u000e\uffff\uffff\u0000"+
		"\u00d9\u00db\u0003\f\u0006\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de"+
		"\u00df\u0005\u001f\u0000\u0000\u00df\u00e0\u0006\u000e\uffff\uffff\u0000"+
		"\u00e0\u001d\u0001\u0000\u0000\u0000\u00e1\u00e5\u0003\"\u0011\u0000\u00e2"+
		"\u00e4\u0003 \u0010\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e7"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e6\u001f\u0001\u0000\u0000\u0000\u00e7\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\u0019\u0000\u0000\u00e9\u00ea"+
		"\u0006\u0010\uffff\uffff\u0000\u00ea\u00eb\u0003\"\u0011\u0000\u00eb\u00ec"+
		"\u0006\u0010\uffff\uffff\u0000\u00ec!\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0003$\u0012\u0000\u00ee\u00ef\u0006\u0011\uffff\uffff\u0000\u00ef\u00f0"+
		"\u0005\u0018\u0000\u0000\u00f0\u00f1\u0006\u0011\uffff\uffff\u0000\u00f1"+
		"\u00f2\u0003$\u0012\u0000\u00f2\u00f3\u0006\u0011\uffff\uffff\u0000\u00f3"+
		"#\u0001\u0000\u0000\u0000\u00f4\u00f8\u0003(\u0014\u0000\u00f5\u00f7\u0003"+
		"&\u0013\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f7\u00fa\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000"+
		"\u0000\u0000\u00f9%\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0005\u0017\u0000\u0000\u00fc\u00fd\u0006\u0013\uffff"+
		"\uffff\u0000\u00fd\u00fe\u0003(\u0014\u0000\u00fe\u00ff\u0006\u0013\uffff"+
		"\uffff\u0000\u00ff\'\u0001\u0000\u0000\u0000\u0100\u0101\u0005\u001a\u0000"+
		"\u0000\u0101\u010d\u0006\u0014\uffff\uffff\u0000\u0102\u0103\u0005\u0014"+
		"\u0000\u0000\u0103\u010d\u0006\u0014\uffff\uffff\u0000\u0104\u0105\u0005"+
		"\u0015\u0000\u0000\u0105\u010d\u0006\u0014\uffff\uffff\u0000\u0106\u0107"+
		"\u0005\u0013\u0000\u0000\u0107\u010d\u0006\u0014\uffff\uffff\u0000\u0108"+
		"\u0109\u0005\u001c\u0000\u0000\u0109\u010a\u0003$\u0012\u0000\u010a\u010b"+
		"\u0005\u001d\u0000\u0000\u010b\u010d\u0001\u0000\u0000\u0000\u010c\u0100"+
		"\u0001\u0000\u0000\u0000\u010c\u0102\u0001\u0000\u0000\u0000\u010c\u0104"+
		"\u0001\u0000\u0000\u0000\u010c\u0106\u0001\u0000\u0000\u0000\u010c\u0108"+
		"\u0001\u0000\u0000\u0000\u010d)\u0001\u0000\u0000\u0000\u010e\u010f\u0007"+
		"\u0000\u0000\u0000\u010f+\u0001\u0000\u0000\u0000\u00146ANS\\au\u008b"+
		"\u0095\u009a\u009e\u00a8\u00b3\u00bc\u00c5\u00cb\u00dc\u00e5\u00f8\u010c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
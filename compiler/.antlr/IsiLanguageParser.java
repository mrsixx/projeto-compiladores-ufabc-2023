// Generated from d:\UFABC\COMPILADORES\projeto-compiladores-ufabc-2023\compiler\IsiLanguage.g4 by ANTLR 4.9.2

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

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IsiLanguageParser extends Parser {
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__16) | (1L << ID))) != 0) );
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

	public static class CmdLeituraContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLanguageParser.AP, 0); }
		public TerminalNode ID() { return getToken(IsiLanguageParser.ID, 0); }
		public TerminalNode FP() { return getToken(IsiLanguageParser.FP, 0); }
		public CmdLeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLeitura; }
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__16) | (1L << ID))) != 0) );
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__16) | (1L << ID))) != 0) );
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__16) | (1L << ID))) != 0) );
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

	public static class ExprRellContext extends ParserRuleContext {
		public TerminalNode OPLOG() { return getToken(IsiLanguageParser.OPLOG, 0); }
		public TermoRelContext termoRel() {
			return getRuleContext(TermoRelContext.class,0);
		}
		public ExprRellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprRell; }
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

	public static class ExprlContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(IsiLanguageParser.OP, 0); }
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public ExprlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprl; }
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

	public static class NumContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(IsiLanguageParser.INT, 0); }
		public TerminalNode DECIMAL() { return getToken(IsiLanguageParser.DECIMAL, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u0113\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4B\n"+
		"\4\f\4\16\4E\13\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5Q\n\5\3\6"+
		"\6\6T\n\6\r\6\16\6U\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\b_\n\b\3\t\3\t\3\t\5"+
		"\td\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13x\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u008c\n\r\r\r\16\r\u008d\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\6\r\u0096\n\r\r\r\16\r\u0097\3\r\3\r\3\r\5\r\u009d"+
		"\n\r\3\16\3\16\5\16\u00a1\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00ab\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b6"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00bf\n\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00c8\n\17\3\17\3\17\3\17\3\17\5\17\u00ce\n"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\6"+
		"\20\u00dd\n\20\r\20\16\20\u00de\3\20\3\20\3\20\3\21\3\21\7\21\u00e6\n"+
		"\21\f\21\16\21\u00e9\13\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\7\24\u00f9\n\24\f\24\16\24\u00fc\13\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u010f\n\26\3\27\3\27\3\27\2\2\30\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,\2\3\3\2\26\27\2\u011b\2.\3\2\2\2\48\3\2\2\2"+
		"\6;\3\2\2\2\bP\3\2\2\2\nS\3\2\2\2\fW\3\2\2\2\16^\3\2\2\2\20c\3\2\2\2\22"+
		"g\3\2\2\2\24m\3\2\2\2\26{\3\2\2\2\30\u0081\3\2\2\2\32\u00a0\3\2\2\2\34"+
		"\u00a2\3\2\2\2\36\u00d2\3\2\2\2 \u00e3\3\2\2\2\"\u00ea\3\2\2\2$\u00ef"+
		"\3\2\2\2&\u00f6\3\2\2\2(\u00fd\3\2\2\2*\u010e\3\2\2\2,\u0110\3\2\2\2."+
		"/\7\3\2\2/\60\5\4\3\2\60\61\5\n\6\2\61\62\7\4\2\2\62\63\7$\2\2\63\64\b"+
		"\2\1\2\64\3\3\2\2\2\65\67\5\6\4\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2"+
		"\289\3\2\2\29\5\3\2\2\2:8\3\2\2\2;<\7\5\2\2<=\7\34\2\2=C\b\4\1\2>?\7\35"+
		"\2\2?@\7\34\2\2@B\b\4\1\2A>\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3"+
		"\2\2\2EC\3\2\2\2FG\7\6\2\2GH\5\b\5\2HI\7$\2\2I\7\3\2\2\2JK\7\7\2\2KQ\b"+
		"\5\1\2LM\7\b\2\2MQ\b\5\1\2NO\7\t\2\2OQ\b\5\1\2PJ\3\2\2\2PL\3\2\2\2PN\3"+
		"\2\2\2Q\t\3\2\2\2RT\5\16\b\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V"+
		"\13\3\2\2\2WX\7 \2\2XY\5\n\6\2YZ\7!\2\2Z\r\3\2\2\2[_\5\20\t\2\\_\5\30"+
		"\r\2]_\5\32\16\2^[\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_\17\3\2\2\2`d\5\22\n\2"+
		"ad\5\24\13\2bd\5\26\f\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2de\3\2\2\2ef\7$\2"+
		"\2f\21\3\2\2\2gh\7\n\2\2hi\7\36\2\2ij\7\34\2\2jk\b\n\1\2kl\7\37\2\2l\23"+
		"\3\2\2\2mn\7\13\2\2nw\7\36\2\2op\7\26\2\2px\b\13\1\2qr\7\27\2\2rx\b\13"+
		"\1\2st\7\25\2\2tx\b\13\1\2uv\7\34\2\2vx\b\13\1\2wo\3\2\2\2wq\3\2\2\2w"+
		"s\3\2\2\2wu\3\2\2\2xy\3\2\2\2yz\7\37\2\2z\25\3\2\2\2{|\7\34\2\2|}\b\f"+
		"\1\2}~\7\30\2\2~\177\5&\24\2\177\u0080\b\f\1\2\u0080\27\3\2\2\2\u0081"+
		"\u0082\7\f\2\2\u0082\u0083\b\r\1\2\u0083\u0084\7\36\2\2\u0084\u0085\5"+
		" \21\2\u0085\u0086\b\r\1\2\u0086\u0087\7\37\2\2\u0087\u0088\7\r\2\2\u0088"+
		"\u0089\7 \2\2\u0089\u008b\b\r\1\2\u008a\u008c\5\16\b\2\u008b\u008a\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\7!\2\2\u0090\u009c\b\r\1\2\u0091\u0092\7\16"+
		"\2\2\u0092\u0093\7 \2\2\u0093\u0095\b\r\1\2\u0094\u0096\5\16\b\2\u0095"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7!\2\2\u009a\u009b\b\r\1\2\u009b"+
		"\u009d\3\2\2\2\u009c\u0091\3\2\2\2\u009c\u009d\3\2\2\2\u009d\31\3\2\2"+
		"\2\u009e\u00a1\5\34\17\2\u009f\u00a1\5\36\20\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\33\3\2\2\2\u00a2\u00a3\7\17\2\2\u00a3\u00a4\b\17"+
		"\1\2\u00a4\u00a5\7\34\2\2\u00a5\u00aa\b\17\1\2\u00a6\u00a7\7\7\2\2\u00a7"+
		"\u00ab\b\17\1\2\u00a8\u00a9\7\b\2\2\u00a9\u00ab\b\17\1\2\u00aa\u00a6\3"+
		"\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7\20\2\2\u00ad"+
		"\u00ae\b\17\1\2\u00ae\u00b5\7\"\2\2\u00af\u00b0\7\34\2\2\u00b0\u00b6\b"+
		"\17\1\2\u00b1\u00b2\7\26\2\2\u00b2\u00b6\b\17\1\2\u00b3\u00b4\7\27\2\2"+
		"\u00b4\u00b6\b\17\1\2\u00b5\u00af\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00be\7\21\2\2\u00b8\u00b9\7\34\2\2"+
		"\u00b9\u00bf\b\17\1\2\u00ba\u00bb\7\26\2\2\u00bb\u00bf\b\17\1\2\u00bc"+
		"\u00bd\7\27\2\2\u00bd\u00bf\b\17\1\2\u00be\u00b8\3\2\2\2\u00be\u00ba\3"+
		"\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c7\7\22\2\2\u00c1"+
		"\u00c2\7\34\2\2\u00c2\u00c8\b\17\1\2\u00c3\u00c4\7\26\2\2\u00c4\u00c8"+
		"\b\17\1\2\u00c5\u00c6\7\27\2\2\u00c6\u00c8\b\17\1\2\u00c7\u00c1\3\2\2"+
		"\2\u00c7\u00c3\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00cd\3\2\2\2\u00c9\u00ca"+
		"\7\37\2\2\u00ca\u00ce\b\17\1\2\u00cb\u00cc\7#\2\2\u00cc\u00ce\b\17\1\2"+
		"\u00cd\u00c9\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0"+
		"\5\f\7\2\u00d0\u00d1\b\17\1\2\u00d1\35\3\2\2\2\u00d2\u00d3\7\23\2\2\u00d3"+
		"\u00d4\b\20\1\2\u00d4\u00d5\7\36\2\2\u00d5\u00d6\5 \21\2\u00d6\u00d7\b"+
		"\20\1\2\u00d7\u00d8\7\37\2\2\u00d8\u00d9\7\24\2\2\u00d9\u00da\7 \2\2\u00da"+
		"\u00dc\b\20\1\2\u00db\u00dd\5\16\b\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3"+
		"\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e1\7!\2\2\u00e1\u00e2\b\20\1\2\u00e2\37\3\2\2\2\u00e3\u00e7\5$\23"+
		"\2\u00e4\u00e6\5\"\22\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8!\3\2\2\2\u00e9\u00e7\3\2\2\2"+
		"\u00ea\u00eb\7\33\2\2\u00eb\u00ec\b\22\1\2\u00ec\u00ed\5$\23\2\u00ed\u00ee"+
		"\b\22\1\2\u00ee#\3\2\2\2\u00ef\u00f0\5&\24\2\u00f0\u00f1\b\23\1\2\u00f1"+
		"\u00f2\7\32\2\2\u00f2\u00f3\b\23\1\2\u00f3\u00f4\5&\24\2\u00f4\u00f5\b"+
		"\23\1\2\u00f5%\3\2\2\2\u00f6\u00fa\5*\26\2\u00f7\u00f9\5(\25\2\u00f8\u00f7"+
		"\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\'\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7\31\2\2\u00fe\u00ff\b\25\1"+
		"\2\u00ff\u0100\5*\26\2\u0100\u0101\b\25\1\2\u0101)\3\2\2\2\u0102\u0103"+
		"\7\34\2\2\u0103\u010f\b\26\1\2\u0104\u0105\7\26\2\2\u0105\u010f\b\26\1"+
		"\2\u0106\u0107\7\27\2\2\u0107\u010f\b\26\1\2\u0108\u0109\7\25\2\2\u0109"+
		"\u010f\b\26\1\2\u010a\u010b\7\36\2\2\u010b\u010c\5&\24\2\u010c\u010d\7"+
		"\37\2\2\u010d\u010f\3\2\2\2\u010e\u0102\3\2\2\2\u010e\u0104\3\2\2\2\u010e"+
		"\u0106\3\2\2\2\u010e\u0108\3\2\2\2\u010e\u010a\3\2\2\2\u010f+\3\2\2\2"+
		"\u0110\u0111\t\2\2\2\u0111-\3\2\2\2\268CPU^cw\u008d\u0097\u009c\u00a0"+
		"\u00aa\u00b5\u00be\u00c7\u00cd\u00de\u00e7\u00fa\u010e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
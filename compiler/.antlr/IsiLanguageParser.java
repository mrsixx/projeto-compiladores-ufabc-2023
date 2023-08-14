// Generated from d:\UFABC\COMPILADORES\projeto-compiladores-ufabc-2023\compiler\IsiLanguage.g4 by ANTLR 4.9.2

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

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IsiLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
		private Identifier getIdIfDeclared() { 
				String id = lastToken();
				if (!symbolTable.exists(id)){
					throw new RuntimeException("Semantic ERROR - Undeclared Identifier: " + id);
				}
				return symbolTable.get(id);
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
			setState(103);
			match(T__7);
			setState(104);
			match(AP);
			setState(105);
			match(ID);

														Identifier id = getIdIfDeclared();
														// id.setAssigned(true);
														program.putCommandOnStack(new ReadCommand(id));
													
			setState(107);
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
			setState(109);
			match(T__8);
			setState(110);
			match(AP);
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(111);
				match(INT);

														Integer literal = Integer.valueOf(lastToken());
														program.putCommandOnStack(new WriteCommand(new LiteralExpression<Integer>(literal)));
													
				}
				break;
			case DECIMAL:
				{
				setState(113);
				match(DECIMAL);

														Float literal = Float.valueOf(lastToken());
														program.putCommandOnStack(new WriteCommand(new LiteralExpression<Float>(literal)));
													
				}
				break;
			case TEXTO:
				{
				setState(115);
				match(TEXTO);

														String literal = lastToken();
														program.putCommandOnStack(new WriteCommand(new LiteralExpression<String>(literal)));
													
				}
				break;
			case ID:
				{
				setState(117);
				match(ID);

													program.putCommandOnStack(new WriteCommand(new IdentifierExpression(getIdIfDeclared())));
													
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(121);
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
			setState(123);
			match(ID);
			String idAtribuido = lastToken();
			setState(125);
			match(ATTR);
			setState(126);
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
	}

	public final CmdIfContext cmdIf() throws RecognitionException {
		CmdIfContext _localctx = new CmdIfContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmdIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__9);
			setState(130);
			match(AP);
			setState(131);
			exprRel();
			setState(132);
			match(FP);
			setState(133);
			match(T__10);
			setState(134);
			escopo();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(135);
				match(T__11);
				setState(136);
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
	}

	public final CmdLoopContext cmdLoop() throws RecognitionException {
		CmdLoopContext _localctx = new CmdLoopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cmdLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				{
				setState(139);
				paratodo();
				}
				break;
			case T__16:
				{
				setState(140);
				enquanto();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(143);
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
	}

	public final ParatodoContext paratodo() throws RecognitionException {
		ParatodoContext _localctx = new ParatodoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_paratodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__12);
			setState(146);
			match(ID);
			setState(147);
			match(T__13);
			setState(148);
			match(ACO);
			setState(149);
			limInf();
			setState(150);
			match(T__14);
			setState(151);
			limSup();
			setState(152);
			match(T__15);
			setState(153);
			passo();
			setState(154);
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
	}

	public final EnquantoContext enquanto() throws RecognitionException {
		EnquantoContext _localctx = new EnquantoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__16);
			setState(157);
			match(AP);
			setState(158);
			exprRel();
			setState(159);
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

	public static class LimInfContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiLanguageParser.ID, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public LimInfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limInf; }
	}

	public final LimInfContext limInf() throws RecognitionException {
		LimInfContext _localctx = new LimInfContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_limInf);
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

	public static class LimSupContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiLanguageParser.ID, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public LimSupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limSup; }
	}

	public final LimSupContext limSup() throws RecognitionException {
		LimSupContext _localctx = new LimSupContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_limSup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(165);
				match(ID);
				}
				break;
			case INT:
			case DECIMAL:
				{
				setState(166);
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

	public static class PassoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiLanguageParser.ID, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public PassoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passo; }
	}

	public final PassoContext passo() throws RecognitionException {
		PassoContext _localctx = new PassoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_passo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(169);
				match(ID);
				}
				break;
			case INT:
			case DECIMAL:
				{
				setState(170);
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
	}

	public final ExprRelContext exprRel() throws RecognitionException {
		ExprRelContext _localctx = new ExprRelContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exprRel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			expr();
			setState(174);
			match(OPREL);
			setState(175);
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
		enterRule(_localctx, 38, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			termo();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(178);
				exprl();
				}
				}
				setState(183);
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
		enterRule(_localctx, 40, RULE_exprl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(OP);
			 
											binaryExpression = new BinaryExpression(lastToken().charAt(0));
											binaryExpression.setLeftOperand(expression);
											
			setState(186);
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
		enterRule(_localctx, 42, RULE_termo);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(ID);
				 expression = new IdentifierExpression(getIdIfDeclared()); 
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(INT);
				 expression = new LiteralExpression<Integer>(Integer.valueOf(lastToken())); 
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				match(DECIMAL);
				 expression = new LiteralExpression<Float>(Float.valueOf(lastToken())); 
				}
				break;
			case TEXTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				match(TEXTO);
				 expression = new LiteralExpression<String>(lastToken()); 
				}
				break;
			case AP:
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				match(AP);
				setState(198);
				expr();
				setState(199);
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
		enterRule(_localctx, 44, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00d0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\7\39\n\3\f\3\16\3<\13\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4D\n\4\f\4\16\4G\13\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5S"+
		"\n\5\3\6\6\6V\n\6\r\6\16\6W\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\ba\n\b\3\t\3"+
		"\t\3\t\5\tf\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13z\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008c\n\r\3\16\3\16\5\16\u0090"+
		"\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u00a6\n\21\3\22\3\22\5\22\u00aa"+
		"\n\22\3\23\3\23\5\23\u00ae\n\23\3\24\3\24\3\24\3\24\3\25\3\25\7\25\u00b6"+
		"\n\25\f\25\16\25\u00b9\13\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00cc\n\27\3\30\3\30"+
		"\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\4\4\2\35"+
		"\35!!\3\2\25\26\2\u00ce\2\60\3\2\2\2\4:\3\2\2\2\6=\3\2\2\2\bR\3\2\2\2"+
		"\nU\3\2\2\2\fY\3\2\2\2\16`\3\2\2\2\20e\3\2\2\2\22i\3\2\2\2\24o\3\2\2\2"+
		"\26}\3\2\2\2\30\u0083\3\2\2\2\32\u008f\3\2\2\2\34\u0093\3\2\2\2\36\u009e"+
		"\3\2\2\2 \u00a5\3\2\2\2\"\u00a9\3\2\2\2$\u00ad\3\2\2\2&\u00af\3\2\2\2"+
		"(\u00b3\3\2\2\2*\u00ba\3\2\2\2,\u00cb\3\2\2\2.\u00cd\3\2\2\2\60\61\7\3"+
		"\2\2\61\62\5\4\3\2\62\63\5\n\6\2\63\64\7\4\2\2\64\65\7\"\2\2\65\66\b\2"+
		"\1\2\66\3\3\2\2\2\679\5\6\4\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2"+
		"\2;\5\3\2\2\2<:\3\2\2\2=>\7\5\2\2>?\7\32\2\2?E\b\4\1\2@A\7\33\2\2AB\7"+
		"\32\2\2BD\b\4\1\2C@\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE"+
		"\3\2\2\2HI\7\6\2\2IJ\5\b\5\2JK\7\"\2\2K\7\3\2\2\2LM\7\7\2\2MS\b\5\1\2"+
		"NO\7\b\2\2OS\b\5\1\2PQ\7\t\2\2QS\b\5\1\2RL\3\2\2\2RN\3\2\2\2RP\3\2\2\2"+
		"S\t\3\2\2\2TV\5\16\b\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\13\3\2"+
		"\2\2YZ\7\36\2\2Z[\5\n\6\2[\\\7\37\2\2\\\r\3\2\2\2]a\5\20\t\2^a\5\30\r"+
		"\2_a\5\32\16\2`]\3\2\2\2`^\3\2\2\2`_\3\2\2\2a\17\3\2\2\2bf\5\22\n\2cf"+
		"\5\24\13\2df\5\26\f\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2fg\3\2\2\2gh\7\"\2"+
		"\2h\21\3\2\2\2ij\7\n\2\2jk\7\34\2\2kl\7\32\2\2lm\b\n\1\2mn\7\35\2\2n\23"+
		"\3\2\2\2op\7\13\2\2py\7\34\2\2qr\7\25\2\2rz\b\13\1\2st\7\26\2\2tz\b\13"+
		"\1\2uv\7\24\2\2vz\b\13\1\2wx\7\32\2\2xz\b\13\1\2yq\3\2\2\2ys\3\2\2\2y"+
		"u\3\2\2\2yw\3\2\2\2z{\3\2\2\2{|\7\35\2\2|\25\3\2\2\2}~\7\32\2\2~\177\b"+
		"\f\1\2\177\u0080\7\27\2\2\u0080\u0081\5(\25\2\u0081\u0082\b\f\1\2\u0082"+
		"\27\3\2\2\2\u0083\u0084\7\f\2\2\u0084\u0085\7\34\2\2\u0085\u0086\5&\24"+
		"\2\u0086\u0087\7\35\2\2\u0087\u0088\7\r\2\2\u0088\u008b\5\f\7\2\u0089"+
		"\u008a\7\16\2\2\u008a\u008c\5\f\7\2\u008b\u0089\3\2\2\2\u008b\u008c\3"+
		"\2\2\2\u008c\31\3\2\2\2\u008d\u0090\5\34\17\2\u008e\u0090\5\36\20\2\u008f"+
		"\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\5\f"+
		"\7\2\u0092\33\3\2\2\2\u0093\u0094\7\17\2\2\u0094\u0095\7\32\2\2\u0095"+
		"\u0096\7\20\2\2\u0096\u0097\7 \2\2\u0097\u0098\5 \21\2\u0098\u0099\7\21"+
		"\2\2\u0099\u009a\5\"\22\2\u009a\u009b\7\22\2\2\u009b\u009c\5$\23\2\u009c"+
		"\u009d\t\2\2\2\u009d\35\3\2\2\2\u009e\u009f\7\23\2\2\u009f\u00a0\7\34"+
		"\2\2\u00a0\u00a1\5&\24\2\u00a1\u00a2\7\35\2\2\u00a2\37\3\2\2\2\u00a3\u00a6"+
		"\7\32\2\2\u00a4\u00a6\5.\30\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2"+
		"\u00a6!\3\2\2\2\u00a7\u00aa\7\32\2\2\u00a8\u00aa\5.\30\2\u00a9\u00a7\3"+
		"\2\2\2\u00a9\u00a8\3\2\2\2\u00aa#\3\2\2\2\u00ab\u00ae\7\32\2\2\u00ac\u00ae"+
		"\5.\30\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae%\3\2\2\2\u00af"+
		"\u00b0\5(\25\2\u00b0\u00b1\7\31\2\2\u00b1\u00b2\5(\25\2\u00b2\'\3\2\2"+
		"\2\u00b3\u00b7\5,\27\2\u00b4\u00b6\5*\26\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9"+
		"\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8)\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00ba\u00bb\7\30\2\2\u00bb\u00bc\b\26\1\2\u00bc\u00bd\5"+
		",\27\2\u00bd\u00be\b\26\1\2\u00be+\3\2\2\2\u00bf\u00c0\7\32\2\2\u00c0"+
		"\u00cc\b\27\1\2\u00c1\u00c2\7\25\2\2\u00c2\u00cc\b\27\1\2\u00c3\u00c4"+
		"\7\26\2\2\u00c4\u00cc\b\27\1\2\u00c5\u00c6\7\24\2\2\u00c6\u00cc\b\27\1"+
		"\2\u00c7\u00c8\7\34\2\2\u00c8\u00c9\5(\25\2\u00c9\u00ca\7\35\2\2\u00ca"+
		"\u00cc\3\2\2\2\u00cb\u00bf\3\2\2\2\u00cb\u00c1\3\2\2\2\u00cb\u00c3\3\2"+
		"\2\2\u00cb\u00c5\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cc-\3\2\2\2\u00cd\u00ce"+
		"\t\3\2\2\u00ce/\3\2\2\2\20:ERW`ey\u008b\u008f\u00a5\u00a9\u00ad\u00b7"+
		"\u00cb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
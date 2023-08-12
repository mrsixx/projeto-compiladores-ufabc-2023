// Generated from IsiLanguage.g4 by ANTLR 4.13.0
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IsiLanguageParser}.
 */
public interface IsiLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(IsiLanguageParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(IsiLanguageParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#declara}.
	 * @param ctx the parse tree
	 */
	void enterDeclara(IsiLanguageParser.DeclaraContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#declara}.
	 * @param ctx the parse tree
	 */
	void exitDeclara(IsiLanguageParser.DeclaraContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(IsiLanguageParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(IsiLanguageParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#escopo}.
	 * @param ctx the parse tree
	 */
	void enterEscopo(IsiLanguageParser.EscopoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#escopo}.
	 * @param ctx the parse tree
	 */
	void exitEscopo(IsiLanguageParser.EscopoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(IsiLanguageParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(IsiLanguageParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#cmdLine}.
	 * @param ctx the parse tree
	 */
	void enterCmdLine(IsiLanguageParser.CmdLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#cmdLine}.
	 * @param ctx the parse tree
	 */
	void exitCmdLine(IsiLanguageParser.CmdLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#cmdLeitura}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeitura(IsiLanguageParser.CmdLeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#cmdLeitura}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeitura(IsiLanguageParser.CmdLeituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#cmdEscrita}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscrita(IsiLanguageParser.CmdEscritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#cmdEscrita}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscrita(IsiLanguageParser.CmdEscritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#cmdExpr}.
	 * @param ctx the parse tree
	 */
	void enterCmdExpr(IsiLanguageParser.CmdExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#cmdExpr}.
	 * @param ctx the parse tree
	 */
	void exitCmdExpr(IsiLanguageParser.CmdExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void enterCmdIf(IsiLanguageParser.CmdIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void exitCmdIf(IsiLanguageParser.CmdIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#exprRel}.
	 * @param ctx the parse tree
	 */
	void enterExprRel(IsiLanguageParser.ExprRelContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#exprRel}.
	 * @param ctx the parse tree
	 */
	void exitExprRel(IsiLanguageParser.ExprRelContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(IsiLanguageParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(IsiLanguageParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(IsiLanguageParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(IsiLanguageParser.TermoContext ctx);
}
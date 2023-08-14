// Generated from IsiLanguage.g4 by ANTLR 4.13.0
package parser;

	import ast.*;
	import symbols.*;
	import java.util.Arrays;
	import java.util.List;

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
	 * Enter a parse tree produced by {@link IsiLanguageParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(IsiLanguageParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(IsiLanguageParser.DeclaracoesContext ctx);
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
	 * Enter a parse tree produced by {@link IsiLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(IsiLanguageParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(IsiLanguageParser.TypeContext ctx);
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
	 * Enter a parse tree produced by {@link IsiLanguageParser#cmdLoop}.
	 * @param ctx the parse tree
	 */
	void enterCmdLoop(IsiLanguageParser.CmdLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#cmdLoop}.
	 * @param ctx the parse tree
	 */
	void exitCmdLoop(IsiLanguageParser.CmdLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#paratodo}.
	 * @param ctx the parse tree
	 */
	void enterParatodo(IsiLanguageParser.ParatodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#paratodo}.
	 * @param ctx the parse tree
	 */
	void exitParatodo(IsiLanguageParser.ParatodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void enterEnquanto(IsiLanguageParser.EnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void exitEnquanto(IsiLanguageParser.EnquantoContext ctx);
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
	 * Enter a parse tree produced by {@link IsiLanguageParser#exprl}.
	 * @param ctx the parse tree
	 */
	void enterExprl(IsiLanguageParser.ExprlContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#exprl}.
	 * @param ctx the parse tree
	 */
	void exitExprl(IsiLanguageParser.ExprlContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(IsiLanguageParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(IsiLanguageParser.NumContext ctx);
}
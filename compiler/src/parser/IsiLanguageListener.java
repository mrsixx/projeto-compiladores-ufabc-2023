// Generated from IsiLanguage.g4 by ANTLR 4.13.0
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IsiLanguageParser}.
 */
public interface IsiLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IsiLanguageParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(IsiLanguageParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLanguageParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(IsiLanguageParser.ProgramaContext ctx);
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
}
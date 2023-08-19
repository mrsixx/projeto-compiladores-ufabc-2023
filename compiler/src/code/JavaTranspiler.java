package code;

import org.antlr.v4.runtime.Parser;

import parser.IsiLanguageParser;

public class JavaTranspiler extends Transpiler {

	public JavaTranspiler(IsiLanguageParser parser) {
		super(parser);
		// TODO Auto-generated constructor stub
	}

	@Override
	String transpile() {
		StringBuilder sb = new StringBuilder();
		sb.append("import java.util.Scanner;\r\n");
		sb.append("public class MainClass {\n");
		sb.append("\tScanner keyboard = new Scanner(System.in);");
		sb.append("public static void main(String[] args) {\n");
		this.getParser()
			.getAST()
			.getCommands()
			.forEach((cmd)-> sb.append(cmd.javaCompile()));
		sb.append("}\n");
		sb.append("}\n");
		return sb.toString();
	}

}

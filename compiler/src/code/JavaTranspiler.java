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
		sb.append("public class MainClass {\n");
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

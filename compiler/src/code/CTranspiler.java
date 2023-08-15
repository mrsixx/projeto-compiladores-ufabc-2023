package code;

import org.antlr.v4.runtime.Parser;

import parser.IsiLanguageParser;

public class CTranspiler extends Transpiler {

	public CTranspiler(IsiLanguageParser parser) {
		super(parser);
	}

	@Override
	String transpile() {
		StringBuilder sb = new StringBuilder();
		sb.append("#include <stdio.h>\n");
		sb.append("int main(){\n");
		this.getParser()
			.getAST()
			.getCommands()
			.forEach((cmd)-> sb.append(cmd.cCompile()));
		sb.append("return 0;\n");
		sb.append("}\n");
		return sb.toString();
	}

}

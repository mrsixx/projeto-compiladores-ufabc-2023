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
			.forEach((cmd)-> {
				try {
					sb.append("\t");
					sb.append(cmd.cCompile());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		sb.append("return 0;\n");
		sb.append("}\n");
		return sb.toString();
	}

}

package code;

import java.io.FileWriter;
import java.io.PrintWriter;

import org.antlr.v4.runtime.Parser;

import parser.IsiLanguageParser;

public class CodeGenerator {
	private IsiLanguageParser parser;
	private LanguageType target;
	private TranspilerFactory _factory;

	public CodeGenerator(IsiLanguageParser parser, LanguageType target) {
		this.setParser(parser);
		this.setTarget(target);
		this._factory = new TranspilerFactory(parser);
	}
	
	public IsiLanguageParser getParser() {
		return parser;
	}

	public void setParser(IsiLanguageParser parser) {
		this.parser = parser;
	}

	public LanguageType getTarget() {
		return target;
	}

	public void setTarget(LanguageType target) {
		this.target = target;
	}
	
	public String compile() {
		var transpiler = _factory.getTranspiler(this.getTarget());
		this.getParser().prog();
		parser.showCommands();
		return transpiler.transpile();
	}
	
	public void generateFile(String fileName) {
		try {
			FileWriter fw = new FileWriter(this.mountFullFileName(fileName));
			PrintWriter pw = new PrintWriter(fw);
			String compiledCode = this.compile(); 
			pw.println(compiledCode);
			pw.close();
			fw.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private String mountFullFileName(String fileName) {
		switch (getTarget()) {
	     case C:
	       return fileName+".c";
	     case JAVA:
	       return fileName+".java";
	     default:
			throw new IllegalArgumentException("Unexpected language target.");
	   }
	}
	
}

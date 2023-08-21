package main;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import code.CodeGenerator;
import code.LanguageType;
import parser.IsiLanguageLexer;
import parser.IsiLanguageParser;

public class MainClass {

	public static void main(String[] args) {
		try {
			var type = LanguageType.JAVA;
			String filename = "input.isi";
			IsiLanguageLexer lexer = new IsiLanguageLexer(CharStreams.fromFileName(filename));
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			IsiLanguageParser parser = new IsiLanguageParser(tokenStream);
			System.out.println("Starting Expression Analysis");
			CodeGenerator generator = new CodeGenerator(parser, type);
			generator.generateFile(type == LanguageType.JAVA ? "MainClass" : filename.replace(".isi", ""));
			System.out.println("Compilation Done.");
			System.out.println("-----------------------------");			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}

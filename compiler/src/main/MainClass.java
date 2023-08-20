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
			String typeStr = args.length > 1 ? args[0] : "java";
			String filename = args.length > 1 ? args[1] : "input.isi";
			IsiLanguageLexer lexer = new IsiLanguageLexer(CharStreams.fromFileName(filename));
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			IsiLanguageParser parser = new IsiLanguageParser(tokenStream);
			System.out.println("Starting Expression Analysis");
			var type = (typeStr.toUpperCase() == "C") ? LanguageType.C : LanguageType.JAVA;
			CodeGenerator generator = new CodeGenerator(parser, type);
			generator.generateFile(type == LanguageType.JAVA ? "MainClass" : filename);
			System.out.println("Compilation Done.");
			System.out.println("-----------------------------");			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}

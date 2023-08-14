package main;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import parser.IsiLanguageLexer;
import parser.IsiLanguageParser;

public class MainClass {

	public static void main(String[] args) {
		try {
			IsiLanguageLexer lexer = new IsiLanguageLexer(CharStreams.fromFileName("input.isi"));
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			IsiLanguageParser parser = new IsiLanguageParser(tokenStream);
			System.out.println("Starting Expression Analysis");
			parser.prog();
			parser.showIdentifiers();
			parser.showCommands();
			System.out.println("Compilation Successful! Good Job");
			System.out.println("-----------------------------");			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}

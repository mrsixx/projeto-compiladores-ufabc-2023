package code;

import parser.IsiLanguageParser;

public class TranspilerFactory {
	private IsiLanguageParser parser;
	
	public TranspilerFactory(IsiLanguageParser parser) {
		this.parser = parser;
	}
	
	public Transpiler getTranspiler(LanguageType type) {
		switch (type) {
	     case C:
	       return new CTranspiler(this.parser);
	     case JAVA:
	       return new JavaTranspiler(this.parser);
	     default:
			throw new IllegalArgumentException("Unexpected language target.");
	   }
	}
}

package code;

import parser.IsiLanguageParser;

public abstract class Transpiler {
	private IsiLanguageParser parser;
	Transpiler(IsiLanguageParser parser){
		this.parser = parser;
	}
	
	protected IsiLanguageParser getParser() {
		return parser;
	}
	
	abstract String transpile();
}

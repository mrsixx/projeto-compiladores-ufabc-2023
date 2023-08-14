package symbols;

import java.util.HashMap;

public class SymbolTable {

	private HashMap<String, Identifier> symbols;
	
	public SymbolTable() {
		this.symbols = new HashMap<String, Identifier>();
	}	
	
	public Identifier get(String name) {
		return this.symbols.get(name);
	}
	
	public void add(Identifier id) {
		this.symbols.put(id.getName(), id);
	}
	
	public boolean exists(String name) {
		return this.symbols.containsKey(name);
	}

	public HashMap<String, Identifier> getSymbols() {
		return symbols;
	}

	public void setSymbols(HashMap<String, Identifier> symbols) {
		this.symbols = symbols;
	}
}

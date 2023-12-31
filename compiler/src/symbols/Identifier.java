package symbols;

import java.util.HashMap;

public class Identifier {
	private DataType	type;
	private String		name;
	private boolean		used;
	private boolean		assigned;
	
	public Identifier() { }
	
	public Identifier(String name, DataType type) {
		this.name = name;
		this.type = type;
	}	
	
	public DataType getType() {
		return type;
	}
	public void setType(DataType type) {
		this.type = type;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isAssigned() {
		return assigned;
	}

	public void setAssigned() {
		this.assigned = true;
	}

	public boolean isUsed() {
		return used;
	}

	public void setUsed() {
		this.used = true;
	}

	@Override
	public String toString() {
		return "Identifier [name=" + name + ", type=" + type + "]";
	}
}

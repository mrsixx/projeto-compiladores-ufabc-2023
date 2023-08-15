package ast;

import symbols.Identifier;

public class ReadCommand extends Command {
	private Identifier id;
	
	public ReadCommand(Identifier id) {
		this.setId(id);
	}

	public Identifier getId() {
		return id;
	}

	public void setId(Identifier id) {
		this.id = id;
	}
	
	@Override
	public String cCompile() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String javaCompile() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String toString() {
		return "ReadCommand [id=" + id + "]";
	}
	
}

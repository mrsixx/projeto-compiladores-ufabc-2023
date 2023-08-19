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
		return "scanf(\"%i\", &i);\n";
	}

	@Override
	public String javaCompile() {
		return "keyboard.nextDouble();\n";
	}

	@Override
	public String toString() {
		return "ReadCommand [id=" + id + "]";
	}
	
}

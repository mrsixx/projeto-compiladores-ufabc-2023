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
	public String cCompile() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("scanf(\"%");
		switch(id.getType()) {
			case INTEIRO:
				sb.append("d");
				break;
			case DECIMAL:
				sb.append("f");
				break;
			case TEXTO:
				sb.append("s");
				break;
			default: throw new Exception("Tipo não esperado.");		
		}
		sb.append("\", &");
		sb.append(id.getName());
		sb.append(");\n");
		return sb.toString();
	}

	@Override
	public String javaCompile() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append(id.getName());
		sb.append(" = keyboard.");
		switch(id.getType()) {
			case INTEIRO: return sb.append("nextInt();\n").toString();
			case DECIMAL: return sb.append("nextDouble();\n").toString();
			case TEXTO: return sb.append("nextLine();\n").toString();
			default: throw new Exception("Tipo não esperado.");		
		}
	}
	
}

package ast;

import java.util.List;

public class WhileLoopCommand extends Command {
	private String condition;
	private List<Command> lista;
	
	public WhileLoopCommand(String condition, List<Command> comandos) {
		this.condition = condition;
		this.lista = comandos;
	}

	@Override
	public String cCompile() {
		// TODO Auto-generated method stub
		return "";
	}



	@Override
	public String javaCompile() {
        StringBuilder str = new StringBuilder();
		str.append("while ("+condition+") {\n");
		for (Command cmd: lista) {
			str.append("\t\t\t"+cmd.javaCompile());
		}
		str.append("\n}\n");
        return str.toString();
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "CommandEnquanto [condition=" + condition + ", lista=" + lista + "]";
    }

}


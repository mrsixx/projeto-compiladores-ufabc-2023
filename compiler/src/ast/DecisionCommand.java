package ast;

import java.util.ArrayList;

public class DecisionCommand extends Command {

	private String condition;
	private ArrayList<Command> listaTrue;
	private ArrayList<Command> listaFalse;

	public DecisionCommand(String condition, ArrayList<Command> lt, ArrayList<Command> lf) {
		this.condition = condition;
		this.listaTrue = lt;
		this.listaFalse = lf;
	}

	@Override
	public String cCompile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String javaCompile() {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		str.append("if (" + condition + ") {\n");
		for (Command cmd : listaTrue) {
			str.append("\t\t\t" + cmd.javaCompile());
		}
		str.append("}\n");
		if (listaFalse.size() > 0) {
			str.append("\t\telse {\n");
			for (Command cmd : listaFalse) {
				str.append("\t\t\t" + cmd.javaCompile());
			}
			str.append("}\n");

		}
		return str.toString();
	}

	@Override
	public String toString() {
		return "CommandDecisao [condition=" + condition + ", listaTrue=" + listaTrue + ", listaFalse=" + listaFalse
				+ "]";
	}
}

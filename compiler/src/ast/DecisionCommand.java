package ast;
import java.util.ArrayList;
import java.util.List;

public class DecisionCommand extends Command {

	private RelationalExpression condition;
	private List<Command> trueCommands;
	private List<Command> falseCommands;

	public DecisionCommand() {
		this.trueCommands = new ArrayList<Command>();
		this.setFalseCommands(new ArrayList<Command>());
	}

	public RelationalExpression getCondition() {
		return condition;
	}

	public void setCondition(RelationalExpression condition) {
		this.condition = condition;
	}

	public void setFalseCommands(List<Command> falseCommands) {
		this.falseCommands = falseCommands;
	}

	public List<Command> getTrueCommands() {
		return trueCommands;
	}

	public List<Command> getFalseCommands() {
		return falseCommands;
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
		str.append("if (" + getCondition() + ") {\n");
		for (Command cmd : getTrueCommands()) {
			str.append("\t\t\t" + cmd.javaCompile());
		}
		str.append("}\n");
		if (getFalseCommands().size() > 0) {
			str.append("\t\telse {\n");
			for (Command cmd : getFalseCommands()) {
				str.append("\t\t\t" + cmd.javaCompile());
			}
			str.append("}\n");

		}
		return str.toString();
	}

	@Override
	public String toString() {
		return "CommandDecisao [condition=" + getCondition() + ", listaTrue=" + getTrueCommands() + ", listaFalse=" + getFalseCommands()
				+ "]";
	}
}

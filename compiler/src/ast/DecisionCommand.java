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
	public String cCompile() throws Exception {
		StringBuilder str = new StringBuilder();
		str.append("if (");
		str.append(getCondition().cCompile());
		str.append(") {\n");
		for (Command cmd : getTrueCommands()) {
			str.append("\t\t");
			str.append(cmd.cCompile());
			str.append("\n");
		}
		str.append("\t}\n");
		if (getFalseCommands().size() > 0) {
			str.append("\telse {\n");
			for (Command cmd : getFalseCommands()) {
				str.append("\t\t");
				str.append(cmd.cCompile());
				str.append("\n");
			}
			str.append("\t}\n");
		}
		return str.toString();
	}

	@Override
	public String javaCompile() throws Exception {
		StringBuilder str = new StringBuilder();
		str.append("if (");
		str.append(getCondition().javaCompile());
		str.append(") {\n");
		for (Command cmd : getTrueCommands()) {
			str.append("\t\t");
			str.append(cmd.javaCompile());
			str.append("\n");
		}
		str.append("\t}\n");
		if (getFalseCommands().size() > 0) {
			str.append("\telse {\n");
			for (Command cmd : getFalseCommands()) {
				str.append("\t\t");
				str.append(cmd.javaCompile());
				str.append("\n");
			}
			str.append("\t}\n");
		}
		return str.toString();
	}
}

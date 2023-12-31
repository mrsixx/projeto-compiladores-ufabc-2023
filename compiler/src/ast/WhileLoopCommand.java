package ast;

import java.util.ArrayList;
import java.util.List;

public class WhileLoopCommand extends Command {
	private RelationalExpression condition;
	private List<Command> commands;
	
	public WhileLoopCommand() {
		this.commands = new ArrayList<Command>();
	}
	
	public RelationalExpression getCondition() {
		return condition;
	}

	public void setCondition(RelationalExpression condition) {
		this.condition = condition;
	}

	public List<Command> getCommands() {
		return commands;
	}
	
	@Override
	public String cCompile() throws Exception {
		StringBuilder str = new StringBuilder();
        str.append("while (");
        str.append(this.getCondition().cCompile());
        str.append(") {\n");
		for (Command cmd: getCommands()) {
			str.append("\t\t");
			str.append(cmd.cCompile());
		}
		str.append("\t}\n");
        return str.toString();
	}

	@Override
	public String javaCompile() throws Exception {
        StringBuilder str = new StringBuilder();
        str.append("while (");
        str.append(this.getCondition().javaCompile());
        str.append(") {\n");
		for (Command cmd: getCommands()) {
			str.append("\t\t");
			str.append(cmd.javaCompile());
		}
		str.append("\t}\n");
        return str.toString();
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "CommandEnquanto [condition=" + getCondition() + ", lista=" + getCommands() + "]";
    }
}


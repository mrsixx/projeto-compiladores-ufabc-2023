package ast;

import java.util.List;

import symbols.Identifier;

public class ForLoopCommand extends Command {
	private Identifier iteratorId;
	private Expression lowerBound;
	private Expression upperBound;
	private Expression step;
	private boolean isOpenInterval;
	private List<Command> scope;
	
	public ForLoopCommand() {
		this.setIteratorId(new Identifier());
		this.getIteratorId().setAssigned();
	}

	public Identifier getIteratorId() {
		return iteratorId;
	}
	
	public void setIteratorId(Identifier controlVariableId) {
		this.iteratorId = controlVariableId;
	}

	public Expression getLowerBound() {
		return lowerBound;
	}

	public void setLowerBound(Expression lowerBound) {
		this.lowerBound = lowerBound;
	}

	public Expression getUpperBound() {
		return upperBound;
	}

	public void setUpperBound(Expression upperBound) {
		this.upperBound = upperBound;
	}

	public Expression getStep() {
		return step;
	}

	public void setStep(Expression step) {
		this.step = step;
	}

	public boolean isOpenInterval() {
		return isOpenInterval;
	}

	public void setOpenInterval(boolean isOpenInterval) {
		this.isOpenInterval = isOpenInterval;
	}
	
	public List<Command> getScope() {
		return scope;
	}

	public void setScope(List<Command> scope) {
		this.scope = scope;
	}
	
	@Override
	public String cCompile() throws Exception {
		StringBuilder str = new StringBuilder();
		// for (int i = 0; i < 10; i+= 1)
		var iterator = getLoopIteratorDeclaration();
        str.append("for (");
        str.append(iterator.cCompile().replace(";\n", ""));
        str.append(" = ");
        str.append(this.getLowerBound().cCompile());
        str.append(";");
        str.append(this.getIteratorId().getName());
        str.append(isOpenInterval ? '<' : "<=");
        str.append(this.getUpperBound().cCompile());
        str.append(";");
        str.append(this.getIteratorId().getName());
        str.append(" += ");
        str.append(this.getStep().cCompile());
        str.append(") {\n");
		for (Command cmd: this.getScope()) {
			str.append("\t\t");
			str.append(cmd.cCompile());
			str.append("\n");
		}
		str.append("\t}\n");
        return str.toString();
	}

	@Override
	public String javaCompile() throws Exception {
		StringBuilder str = new StringBuilder();
		// for (int i = 0; i < 10; i+= 1)
		var iterator = getLoopIteratorDeclaration();
        str.append("for (");
        str.append(iterator.javaCompile().replace(";\n", ""));
        str.append(" = ");
        str.append(this.getLowerBound().javaCompile());
        str.append(";");
        str.append(this.getIteratorId().getName());
        str.append(isOpenInterval ? '<' : "<=");
        str.append(this.getUpperBound().javaCompile());
        str.append(";");
        str.append(this.getIteratorId().getName());
        str.append(" += ");
        str.append(this.getStep().javaCompile());
        str.append(") {\n");
		for (Command cmd : this.getScope()) {
			str.append("\t\t");
			str.append(cmd.javaCompile());
			str.append("\n");
		}
		str.append("\t}\n");
        return str.toString();
	}
	
	private DeclarationCommand getLoopIteratorDeclaration() {
		var declarationCmd = new DeclarationCommand();
		declarationCmd.getIds().add(this.getIteratorId());
		return declarationCmd;
	}

	@Override
	public String toString() {
		return "ForLoopCommand [iteratorId=" + iteratorId + ", [" + lowerBound + ", upperBound=" + upperBound
				+ ", step=" + step + ", isOpenInterval=" + isOpenInterval + ", scope=" + scope + "]";
	}
	
	
}

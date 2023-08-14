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
	public String cCompile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String javaCompile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "ForLoopCommand [iteratorId=" + iteratorId + ", [" + lowerBound + ", upperBound=" + upperBound
				+ ", step=" + step + ", isOpenInterval=" + isOpenInterval + ", scope=" + scope + "]";
	}
	
	
}

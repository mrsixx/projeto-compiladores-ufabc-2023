package ast;

public class WriteCommand extends Command {
	private Expression expression;
	
	public WriteCommand(Expression expression) {
		this.setExpression(expression);
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
		return "WriteCommand [expression=" + getExpression() + "]";
	}

	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}
}

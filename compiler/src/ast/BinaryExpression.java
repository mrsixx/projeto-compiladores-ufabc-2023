package ast;

public class BinaryExpression extends Expression {
	private char operator;
	private Expression leftOperand;
	private Expression rightOperand;
	
	public BinaryExpression(char operator) {
		this.setOperator(operator);
	}

	public char getOperator() {
		return operator;
	}

	public void setOperator(char operator) {
		this.operator = operator;
	}

	public Expression getLeftOperand() {
		return leftOperand;
	}

	public void setLeftOperand(Expression leftOperand) {
		this.leftOperand = leftOperand;
	}

	public Expression getRightOperand() {
		return rightOperand;
	}

	public void setRightOperand(Expression rightOperand) {
		this.rightOperand = rightOperand;
	}

	@Override
	public String toString() {
		return "BinaryExpression ["+ leftOperand + operator + rightOperand + "]";
	}
}

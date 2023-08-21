package ast;

import symbols.DataType;

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

	@Override
	public String cCompile() {
		StringBuilder sb = new StringBuilder();
		try {
			sb.append("(");
			sb.append(this.getLeftOperand().cCompile());
			sb.append(")");
			sb.append(this.getOperator());
			sb.append("(");
			sb.append(this.getRightOperand().cCompile());
			sb.append(")");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	@Override
	public String javaCompile() {
		StringBuilder sb = new StringBuilder();
		try {
			sb.append("(");
			sb.append(this.getLeftOperand().javaCompile());
			sb.append(")");
			sb.append(this.getOperator());
			sb.append("(");
			sb.append(this.getRightOperand().javaCompile());
			sb.append(")");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	@Override
	public DataType resolveType() throws Exception {
		var leftType = this.getLeftOperand().resolveType();
		var rightType = this.getRightOperand().resolveType();
		if(leftType == rightType)
			return leftType;
		
		if (leftType == DataType.TEXTO || rightType == DataType.TEXTO)
			throw new Exception("Mismatched types on binary expression.");
		
		if(leftType == DataType.DECIMAL || rightType == DataType.DECIMAL)
			return DataType.DECIMAL;
		
		return leftType;
	}
}

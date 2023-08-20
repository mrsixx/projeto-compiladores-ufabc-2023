package ast;

import symbols.DataType;

public class BinaryRelationalExpression extends RelationalExpression {
	private String operator;
	private RelationalExpression leftOperand;
	private RelationalExpression rightOperand;
	
	public BinaryRelationalExpression(String operator) {
		this.setOperator(operator);
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public RelationalExpression getLeftOperand() {
		return leftOperand;
	}

	public void setLeftOperand(RelationalExpression leftOperand) {
		this.leftOperand = leftOperand;
	}

	public RelationalExpression getRightOperand() {
		return rightOperand;
	}

	public void setRightOperand(RelationalExpression rightOperand) {
		this.rightOperand = rightOperand;
	}

	@Override
	public String toString() {
		return "RelationalExpression ["+ leftOperand + operator + rightOperand + "]";
	}

	@Override
	public String cCompile() {
		StringBuilder sb = new StringBuilder();
		try {
			sb.append(this.getLeftOperand().cCompile());
			sb.append(logicalOperator(this.getOperator()));
			sb.append(this.getRightOperand().cCompile());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	@Override
	public String javaCompile() {
		StringBuilder sb = new StringBuilder();
		try {
			sb.append(this.getLeftOperand().javaCompile());
			sb.append(logicalOperator(this.getOperator()));
			sb.append(this.getRightOperand().javaCompile());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
	
	@Override
	public DataType resolveType() throws Exception {
		return DataType.LOGICO;
	}
	
	private String logicalOperator(String isiLogOp) throws Exception {
		switch(isiLogOp) 
		{
			case "e": return " && ";
			case "ou": return " || ";
			case "nao": return "!";
			default: throw new Exception("Operator not recognized.");
		}
	}
}

package ast;

import symbols.DataType;

public class RelationalExpression extends Expression {
	private Expression leftMember;
	private Expression rightMember;
	private String 	   operator;
	private boolean 	negated;

	public Expression getLeftMember() {
		return leftMember;
	}
	
	public void setNegation(boolean negated) {
		this.negated = negated;
	}
	
	public void setLeftMember(Expression leftMember) {
		this.leftMember = leftMember;
	}

	public Expression getRightMember() {
		return rightMember;
	}

	public void setRightMember(Expression rightMember) {
		this.rightMember = rightMember;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	@Override
	public String cCompile() {
		StringBuilder sb = new StringBuilder();
		try {
			if(this.negated)
				sb.append("!");
			sb.append("(");
			sb.append(this.getLeftMember().cCompile());
			sb.append(this.getOperator());
			sb.append(this.getRightMember().cCompile());
			sb.append(")");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
	@Override
	public String javaCompile() throws Exception {
		StringBuilder sb = new StringBuilder();
		try {
			if(this.negated)
				sb.append("!");
			sb.append("(");
			sb.append(this.getLeftMember().javaCompile());
			sb.append(this.getOperator());
			sb.append(this.getRightMember().javaCompile());
			sb.append(")");		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
	
	@Override
	public String toString() {
		return "RelationalExpression [leftMember=" + leftMember + ", rightMember=" + rightMember + ", operator="
				+ operator + "]";
	}

	@Override
	public DataType resolveType() throws Exception {
		return DataType.LOGICO;
	}
}

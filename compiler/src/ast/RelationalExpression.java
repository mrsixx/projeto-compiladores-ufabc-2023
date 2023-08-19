package ast;
public class RelationalExpression extends Expression {
	private Expression leftMember;
	private Expression rightMember;
	private String 	   operator;

	public Expression getLeftMember() {
		return leftMember;
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
		return "RelationalExpression [leftMember=" + leftMember + ", rightMember=" + rightMember + ", operator="
				+ operator + "]";
	}
}

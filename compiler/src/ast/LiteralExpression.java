package ast;

public class LiteralExpression<T> extends Expression {
	private T value;
	
	public LiteralExpression(T value) {
		setValue(value);
	}
	
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "LiteralExpression [value=" + value + "]";
	}
	
}

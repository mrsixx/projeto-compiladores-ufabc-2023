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
	
	public boolean isInteger() {
		return (value instanceof Integer);
	}
	
	public boolean isDecimal() {
		return (value instanceof Float);
	}
	
	public boolean isText() {
		return (value instanceof String);
	}
	
	@Override
	public String toString() {
		return "LiteralExpression [value=" + value + "]";
	}

	@Override
	public String cCompile() {
		return String.valueOf(getValue());
	}

	@Override
	public String javaCompile() {
		return String.valueOf(getValue());
	}
	
}

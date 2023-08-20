package ast;

import symbols.DataType;

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
		return (value instanceof Double);
	}
	
	public boolean isText() {
		return (value instanceof String);
	}
	
	@Override
	public String toString() {
		return "LiteralExpression [value=" + value + "]";
	}

	@Override
	public String cCompile() throws Exception {
		return String.valueOf(getValue());
	}

	@Override
	public String javaCompile() throws Exception {
		return String.valueOf(getValue());
	}

	@Override
	public DataType resolveType() throws Exception {
		if(isText()) return DataType.TEXTO;
		if(isInteger()) return DataType.INTEIRO;
		if(isDecimal()) return DataType.DECIMAL;
		
		throw new Exception("Unknown data type");
		
	}
	
}

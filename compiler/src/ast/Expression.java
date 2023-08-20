package ast;

import symbols.DataType;

public abstract class Expression {
	public abstract String cCompile() throws Exception;
	public abstract String javaCompile() throws Exception;
	public abstract DataType resolveType() throws Exception;
}

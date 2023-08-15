package ast;

public abstract class Expression {
	public abstract String cCompile();
	public abstract String javaCompile();
}

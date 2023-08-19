package ast;

public abstract class Expression {
	public abstract String cCompile() throws Exception;
	public abstract String javaCompile() throws Exception;
}

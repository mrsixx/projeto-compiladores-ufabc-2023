package ast;

import symbols.DataType;

public abstract class Command {
	public abstract String cCompile() throws Exception;
	public abstract String javaCompile() throws Exception;
	
	public String dataTypeToCType(DataType type) throws Exception {
		switch (type) {
			case INTEIRO: return "int";
			case DECIMAL: return "float";
			case TEXTO: return "char*";
			default: throw new Exception("Tipo n�o mapeado.");
		}
	}
	
	public String dataTypeToJavaType(DataType type) throws Exception {
		switch (type) {
			case INTEIRO: return "int";
			case DECIMAL: return "double";
			case TEXTO: return "String";
			default: throw new Exception("Tipo n�o mapeado.");
		}
	}
}

package ast;

import symbols.DataType;

public abstract class Command {
	public abstract String cCompile();
	public abstract String javaCompile();
	
	public String dataTypeToCType(DataType type) throws Exception {
		switch (type) {
			case INTEIRO: return "int";
			case DECIMAL: return "float";
			case TEXTO: return "char*";
			default: throw new Exception("Tipo não mapeado.");
		}
	}
	
	public String dataTypeToJavaType(DataType type) throws Exception {
		switch (type) {
			case INTEIRO: return "int";
			case DECIMAL: return "float";
			case TEXTO: return "String";
			default: throw new Exception("Tipo não mapeado.");
		}
	}
}

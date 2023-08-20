package ast;

import symbols.DataType;
import symbols.Identifier;

public class IdentifierExpression extends Expression {
	private Identifier id;
	
	public IdentifierExpression(Identifier id) {
		this.setId(id);
		this.getId().setUsed();
	}

	public Identifier getId() {
		return id;
	}

	public void setId(Identifier id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "IdentifierExpression [id=" + id + "]";
	}

	@Override
	public String cCompile() {
		return this.getId().getName();
	}

	@Override
	public String javaCompile() throws Exception {
		return this.getId().getName();
	}

	@Override
	public DataType resolveType() throws Exception {
		return this.getId().getType();
	}
	
}

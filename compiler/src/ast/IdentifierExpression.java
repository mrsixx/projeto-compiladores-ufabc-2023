package ast;

import symbols.Identifier;

public class IdentifierExpression extends Expression {
	private Identifier id;
	
	public IdentifierExpression(Identifier id) {
		this.setId(id);
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
	
}

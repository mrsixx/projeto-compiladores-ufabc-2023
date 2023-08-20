package ast;
import exceptions.IsiSemanticException;
import symbols.*;

public class AttributionCommand extends Command {
	private Identifier id;
	private Expression expression;
	
	public AttributionCommand(Identifier id, Expression expression) {
		super();
		this.setId(id);
		this.setExpression(expression);
	}

	public Identifier getId() {
		return id;
	}

	public void setId(Identifier id) {
		this.id = id;
	}

	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
		this.getId().setAssigned();
	}
	private void validate() throws Exception {
		var idType = this.getId().getType();
		var expType = this.getExpression().resolveType(); 
		if(idType != expType)
			throw new IsiSemanticException("Cannot assign value of type "+expType+" into "+this.getId().getName()+" ("+idType+" variable)");
		
	}
	
	@Override
	public String cCompile() throws Exception {
		this.validate();
		StringBuilder sb = new StringBuilder();
		sb.append(getId().getName());
		sb.append(" = ");
		sb.append(getExpression().cCompile());
		sb.append(";\n");
		return sb.toString();
	}

	@Override
	public String javaCompile() throws Exception {
		this.validate();
		StringBuilder sb = new StringBuilder();
		sb.append(getId().getName());
		sb.append(" = ");
		sb.append(getExpression().javaCompile());
		sb.append(";\n");
		return sb.toString();
	}


}

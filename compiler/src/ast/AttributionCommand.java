package ast;
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
	}

	@Override
	public String cCompile() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append(getId().getName());
		sb.append(" = ");
		sb.append(getExpression().cCompile());
		sb.append(";\n");
		return sb.toString();
	}

	@Override
	public String javaCompile() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append(getId().getName());
		sb.append(" = ");
		sb.append(getExpression().javaCompile());
		sb.append(";\n");
		return sb.toString();
	}


}

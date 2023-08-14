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
	public String cCompile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String javaCompile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "AttributionCommand [id=" + id.getName() + ":"+ id.getType() +", expression=" + expression + "]";
	}

}

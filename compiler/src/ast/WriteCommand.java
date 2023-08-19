package ast;

import symbols.DataType;
import symbols.Identifier;

public class WriteCommand extends Command {
	private Expression expression;
	
	public WriteCommand(Expression expression) {
		this.setExpression(expression);
	}
	
	@Override
	public String cCompile() {
		StringBuilder sb = new StringBuilder();
		// caso seja o print do valor de uma variavel
		if(expression instanceof IdentifierExpression)
		{
			Identifier id = ((IdentifierExpression)expression).getId();
			String fmt = getPrintMethodArgumentByIdentifierType(id);
			sb.append("printf(\"%"+fmt+"\\n\", "+id.getName()+");\n");
			return sb.toString();
		}
		//caso seja o print de um valor literal
		
		var exp = ((LiteralExpression)expression);
		
		if(exp.isText())
			return sb.append("printf("+exp.getValue()+");\n").toString();
		if(exp.isInteger())
			return sb.append("printf(\"%d\\n\", "+exp.getValue()+");\n").toString();
		if(exp.isDecimal())
			return sb.append("printf(\"%f\\n\", "+exp.getValue()+");\n").toString();
		return "";
	}

	@Override
	public String javaCompile() throws Exception {
		StringBuilder sb = new StringBuilder();
		// caso seja o print do valor de uma variavel
		if(expression instanceof IdentifierExpression)
		{
			Identifier id = ((IdentifierExpression)expression).getId();
			sb.append("System.out.println("+id.getName()+");\n");
			return sb.toString();
		}
		//caso seja o print de um valor literal
		
		var exp = ((LiteralExpression)expression);
		sb.append("System.out.println("+exp.getValue()+");\n");
		return sb.toString();
	}

	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}
	
	private String getPrintMethodArgumentByIdentifierType(Identifier id) {
		switch (id.getType()){
		case TEXTO: 
			return "s";
		case INTEIRO:
			return "d";
		case DECIMAL:
			return "f"; 
		default:
			throw new IllegalArgumentException("Unexpected value: " + id.getType());
		}
	}
}

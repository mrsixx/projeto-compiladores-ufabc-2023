package ast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import symbols.Identifier;

public class DeclarationCommand extends Command {
	private List<Identifier> ids;
	
	public DeclarationCommand() {
		ids = new ArrayList<Identifier>();
	}
	
	public List<Identifier> getIds() {
		return ids;
	}
	
	@Override
	public String cCompile() {
		StringBuilder sb = new StringBuilder();
		try {
			String type = this.dataTypeToCType(getIds().get(0).getType());
			mountDeclaration(sb, type);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	@Override
	public String javaCompile() {
		StringBuilder sb = new StringBuilder();
		try {
			String type = this.dataTypeToJavaType(getIds().get(0).getType());
			mountDeclaration(sb, type);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	private void mountDeclaration(StringBuilder sb, String type) {
		sb.append(type + " ");
		Iterator<Identifier> iterator = getIds().iterator();
		sb.append(iterator.next().getName());
		// caso o haja mais de uma declaração
		iterator.forEachRemaining((id) -> sb.append(", "+id.getName()));
		sb.append(";\n");
	}

	@Override
	public String toString() {
		return "DeclarationCommand [ids=" + ids + "]";
	}
	
}

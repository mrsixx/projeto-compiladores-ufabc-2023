package ast;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import symbols.SymbolTable;

public class Program {
	private SymbolTable symbolTable;
	private List<Command> commands;
	private Stack<List<Command>> stack;

	public Program() {
		commands = new ArrayList<Command>();
		stack = new Stack<List<Command>>();
		setSymbolTable(new SymbolTable());
		newLayer();
	}

	public List<Command> getCommands() {
		return commands;
	}
	
	public void addCommand(Command command) {
		this.commands.add(command);
	}

	public SymbolTable getSymbolTable() {
		return symbolTable;
	}

	public void setSymbolTable(SymbolTable symbols) {
		this.symbolTable = symbols;
	}

	public void newLayer() {
		this.stack.push(new ArrayList<Command>());
	}
	
	public void putCommandOnStack(Command command) {
		this.stack.peek().add(command);
	}
	
	public List<Command> popStackCommands() {
		return this.stack.pop();
	}
	
	public void cleanStack() {
		this.commands.addAll(this.stack.pop());
	}
	
	public void checkIds( ) {
		this.getSymbolTable().getSymbols().values().stream().forEach((id)-> {
			if(id.isUsed() && !id.isAssigned())
				System.out.println("WARNING: The variable "+ id.getName() +" may not have been initialized.");
			if(!id.isUsed())
				System.out.println("WARNING: The value of the variable "+id.getName()+" is not used");
		}
	);
	}
}

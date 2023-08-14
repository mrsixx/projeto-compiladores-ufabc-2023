package ast;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import symbols.SymbolTable;

public class Program {
	private SymbolTable symbols;
	private List<Command> commands;
	private Stack<List<Command>> stack;

	public Program() {
		commands = new ArrayList<Command>();
		stack = new Stack<List<Command>>();
		newLayer();
	}

	public List<Command> getCommands() {
		return commands;
	}
	
	public void addCommand(Command command) {
		this.commands.add(command);
	}

	public SymbolTable getSymbols() {
		return symbols;
	}

	public void setSymbols(SymbolTable symbols) {
		this.symbols = symbols;
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
}

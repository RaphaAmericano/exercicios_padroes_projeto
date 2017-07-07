package command;

public class ControleRemoto {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	
	public ControleRemoto(){
		onCommands = new Command[7];
		offCommands = new Command[7];
		undoCommand = null;
	}
	public void setCommand( int slot, Command onCommand, Command offCommand){
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	public void botaoOnFoiPressionado(int slot){
		onCommands[slot].executar();
		undoCommand = onCommands[slot];
	}
	public void botaoOffFoiPressionado( int slot){
		offCommands[slot].executar();
		undoCommand = offCommands[slot];
	}
	public void botaoUndoPressionado(){
		undoCommand.undo();
	}
}

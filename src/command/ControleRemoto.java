package command;

public class ControleRemoto {
	Command[] onCommands;
	Command[] offCommands;
	
	public ControleRemoto(){
		onCommands = new Command[7];
		offCommands = new Command[7];
	}
	public void setCommand( int slot, Command onCommand, Command offCommand){
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	public void botaoOnFoiPressionado(int slot){
		onCommands[slot].executar();
	}
	public void botaoOffFoiPressionado( int slot){
		offCommands[slot].executar();
	}
}

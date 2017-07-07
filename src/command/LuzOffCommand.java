package command;

public class LuzOffCommand implements Command{
	Luz luz;
	public LuzOffCommand(Luz luz){
		this.luz = luz;
	}
	public void executar(){
		luz.off();
	}
	public void undo(){
		luz.on();
	}
}

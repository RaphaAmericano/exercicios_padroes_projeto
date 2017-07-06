package command;

public class LuzOnCommand implements Command{
	Luz luz;
	public LuzOnCommand( Luz luz){
		this.luz = luz;
	}
	public void executar(){
		luz.on();
	}
}

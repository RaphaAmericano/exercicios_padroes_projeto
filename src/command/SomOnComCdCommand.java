package command;

public class SomOnComCdCommand implements Command{
	Som som;
	public SomOnComCdCommand(Som som){
		this.som = som;
	}
	public void executar(){
		som.on();
		som.setCd();
		som.setVolume(11);
	}
	public void undo(){
		som.off();
	}
}

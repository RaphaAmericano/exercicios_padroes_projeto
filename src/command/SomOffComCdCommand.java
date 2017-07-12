package command;

public class SomOffComCdCommand implements Command{
	Som som;
	public SomOffComCdCommand (Som som) {
		this.som = som;
	}
	public  void executar(){
		som.off();
	}
	public void undo(){
		som.on();
		som.setCd();
		som.setVolume(11);
	}
}

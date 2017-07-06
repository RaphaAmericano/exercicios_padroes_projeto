package command;

public class ControleRemotoSimples {
	Command slot;
	public ControleRemotoSimples(){
		
	}
	public void setCommand( Command command){
		slot = command;
	}
	public void botaoFoiPressionado(){
		slot.executar();
	}
}

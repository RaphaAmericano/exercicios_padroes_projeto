package command;

public class TesteControleRemoto {

	public static void main(String[] args) {
		ControleRemotoSimples controle = new ControleRemotoSimples();
		
		Luz luz = new Luz("Varanda");
		LuzOnCommand luzLigada = new LuzOnCommand(luz);
		
		controle.setCommand(luzLigada);
		controle.botaoFoiPressionado();
	}

}

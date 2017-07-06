package command;

public class CarregadorControle {

	public static void main(String[] args) {
		ControleRemoto controle = new ControleRemoto();
		
		Luz luzCozinha = new Luz("Luz da Cozinha");
		Luz luzQuarto = new Luz("Luz do Quarto");
		//PortaGaragem porta = new PortaGaragem("");
		
		LuzOnCommand luzCozinhaOnCommand = new LuzOnCommand(luzCozinha);
		LuzOffCommand luzCozinhaOffCommand = new LuzOffCommand(luzQuarto);
		
		LuzOnCommand luzQuartoOnCommand = new LuzOnCommand(luzQuarto);
		LuzOffCommand luzQuartoOffCommand = new LuzOffCommand(luzQuarto);
		
		//PortaGaragemAbertaCommand portaAbertaCommand = new PortaGaragemAbertaCommand(porta);
		//PortaGaragemFechadaCommand portaFechadaCommand = new PortaGaragemFechadaCommand(porta);
		
		controle.setCommand(0, luzCozinhaOnCommand, luzCozinhaOffCommand);
		controle.setCommand(1, luzCozinhaOnCommand, luzCozinhaOffCommand);
		//controle.setCommand(2, portaAbertaCommand, portaFechadaCommand);
		
		controle.botaoOnFoiPressionado(0);
		controle.botaoOffFoiPressionado(0);
	}
}

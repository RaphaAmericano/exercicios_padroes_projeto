package observer;

public class EstacaoClimatica {

	public static void main(String[] args) {
		DadosClima dadosClima = new DadosClima();
		
		VisorCondicoesAtuais condicoesAtuais = new VisorCondicoesAtuais(dadosClima);
		
		dadosClima.setMedicoes(30,  65, 30);
		dadosClima.setMedicoes(32, 70, 29);
		dadosClima.setMedicoes(38, 90, 29);
	}

}

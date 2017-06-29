package strategy;

public class SimuladorPato {

	public static void main(String[] args) {
		Pato malhado = new PatoMalhado();
		malhado.executarQuack();
		malhado.executarVoar();
		
		Pato decorativo = new PatoDecorativo();
		decorativo.executarVoar();
		decorativo.setComportamentoVoador(new VoarSobreRochas());
		decorativo.executarVoar();
	}
}

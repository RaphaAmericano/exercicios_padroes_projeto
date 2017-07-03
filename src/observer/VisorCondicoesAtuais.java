package observer;

public class VisorCondicoesAtuais implements Observador, ElementoDoVisor{
	private float temperatura;
	private float umidade;
	private float pressao; //Verificar
	private Publicador dadosClima;

	public VisorCondicoesAtuais( Publicador dadosClima){
		this.dadosClima = dadosClima;
		dadosClima.registrarObservador( this );
	}
	public void atualizar( float temperatura, float umidade, float pressao){
		this.temperatura = temperatura;
		this.umidade = umidade;
		mostrar();
	}
	public void mostrar(){
		System.out.println("Condições Atuais: " + temperatura + " graus e " + umidade + "% umidade");
	}
}

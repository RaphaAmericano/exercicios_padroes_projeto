package strategy;

public class PatoMalhado extends Pato implements Voar, Quackar {
	public PatoMalhado(){}
	public PatoMalhado(){
		quackador = new QuackarAgudo();
		voador = new VoarComAsas();
	}
	
	public void mostrar(){
		Systen.out.println("Pato Malhado");
	}
}

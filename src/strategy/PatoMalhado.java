package strategy;

public class PatoMalhado extends Pato  {

	public PatoMalhado(){
		quackador = new QuackarAgudo();
		voador = new VoarComAsas();
	}
	
	public void mostrar(){
		System.out.println("Pato Malhado");
	}
}

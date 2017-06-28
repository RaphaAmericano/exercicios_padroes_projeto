package strategy;

public abstract class Pato {
	Voar voador;
	Quackaar quackador;
	
	public void executarQuack(){
		quackador.quackar();
	}
	public void executarVoar(){
		voador.voar();
	}
	
	public abstract void mostrar(){
		
	}
}

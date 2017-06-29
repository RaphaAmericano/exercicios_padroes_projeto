package strategy;

public abstract class Pato {
	Voar voador;
	Quackar quackador;
	
	public void executarQuack(){
		quackador.quackar();
	}
	public void executarVoar(){
		voador.voar();
	}
	
	public abstract void mostrar(){
		
	}
	public void nadar(){
		System.out.println("Todoso os patos nadam, até os de madeira!");
	}
}

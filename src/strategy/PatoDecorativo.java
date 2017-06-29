package strategy;

public class PatoDecorativo extends Pato{
	public PatoDecorativo(){
		voador = new NaoVoarDeFormaNenhuma();
		quackador = new QuackarAgudo();
	}
	public void mostrar(){
		System.out.println("Sou um pato decorativo");
	}
}

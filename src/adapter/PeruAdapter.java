package adapter;

public class PeruAdapter implements Pato{
	Peru peru;
	
	public PeruAdapter(Peru peru){
		this.peru = peru;
	}
	public void quackar(){
		peru.gluglu();
	}
	public void voar(){
		peru.voar();
		System.out.println("...Parecido com um pato!");
	}
}

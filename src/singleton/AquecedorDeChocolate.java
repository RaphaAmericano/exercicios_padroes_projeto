package singleton;

public class AquecedorDeChocolate {
	private boolean vazio;
	private boolean aquecido;
	private static AquecedorDeChocolate unicaInstancia;
	
	private AquecedorDeChocolate() {
		vazio = true;
		aquecido = false;
	}
	public static AquecedorDeChocolate getInstance(){
		if( unicaInstancia == null ){
			unicaInstancia = new AquecedorDeChocolate();
		}
		return unicaInstancia;
	}
	public void encher(){
		if ( isVazio() ){
			vazio = false;
			aquecido = false;
		}
	}
	public boolean isVazio(){
		return vazio;
	}
	public boolean isAquecido(){
		return aquecido;
	}
}

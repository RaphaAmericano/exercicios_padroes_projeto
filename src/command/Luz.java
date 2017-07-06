package command;

public class Luz {
	Boolean ligado;
	String localizacao;
	public Luz(String local){
		this.ligado = false;
		this.localizacao = local;
	}
	public void on(){
		if(this.ligado == true){
			System.out.print("Já está ligada");
		}
		if(this.ligado == false ){
			this.ligado = true;
			System.out.print("Ligou");
		}
	}
	public void off(){
		if(this.ligado == false){
			System.out.print("Já está desligada");
		}
		if(this.ligado == true ){
			this.ligado = false;
			System.out.print("Desligou");
		}
	}
}

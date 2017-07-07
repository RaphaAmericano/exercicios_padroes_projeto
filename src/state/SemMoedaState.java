package state;

public class SemMoedaState implements State{
	MaquinaChiclete maquinaDeChiclete;
	
	public SemMoedaState(MaquinaChiclete maquinaDeChiclete){
		this.maquinaDeChiclete = maquinaDeChiclete;
	}
	public void inserirMoeda(){
		System.out.println("Moeda inserida");
		maquinaDeChiclete.setState(MaquinaChiclete.getTemMoedaState());
	}
	public void ejetarMoeda(){
		System.out.println("Não inseriu moeda");
	}
	public void pressionarAlavanca(){
		System.out.println("Alavanca pressionada, mas não há moeda");
	}
	public void ejetarChiclete(){
		System.out.println("Você deve pagar primeiro");
	}
	public String toString(){
		return "Esperando uma moeda";
	}
}

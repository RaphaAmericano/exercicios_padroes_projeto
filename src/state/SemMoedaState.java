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
		System.out.println("N�o inseriu moeda");
	}
	public void pressionarAlavanca(){
		System.out.println("Alavanca pressionada, mas n�o h� moeda");
	}
	public void ejetarChiclete(){
		System.out.println("Voc� deve pagar primeiro");
	}
	public String toString(){
		return "Esperando uma moeda";
	}
}

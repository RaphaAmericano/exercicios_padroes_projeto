package state;

public class MaquinaVaziaState implements State{
	MaquinaChiclete maquinaDeChiclete;
	
	public MaquinaVaziaState(MaquinaChiclete maquinaDeChiclete){
		this.maquinaDeChiclete = maquinaDeChiclete;
	}
	public void inserirMoeda(){
		System.out.println("N�o h� chiclete na maquina, n�o adianta inserir moedas");
	}
	public void ejetarMoeda(){
		System.out.println("N�o inseriu moeda");
	}
	public void pressionarAlavanca(){
		System.out.println("Voc� virou, mas n�o h� chiclete");
	}
	public void ejetarChiclete(){
		System.out.println("Sem chiclete entregue");
	}
	public String toString(){
		return "Acabou o chiclete";
	}
}

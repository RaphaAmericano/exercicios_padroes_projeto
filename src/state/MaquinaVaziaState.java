package state;

public class MaquinaVaziaState implements State{
	MaquinaChiclete maquinaDeChiclete;
	
	public MaquinaVaziaState(MaquinaChiclete maquinaDeChiclete){
		this.maquinaDeChiclete = maquinaDeChiclete;
	}
	public void inserirMoeda(){
		System.out.println("Não há chiclete na maquina, não adianta inserir moedas");
	}
	public void ejetarMoeda(){
		System.out.println("Não inseriu moeda");
	}
	public void pressionarAlavanca(){
		System.out.println("Você virou, mas não há chiclete");
	}
	public void ejetarChiclete(){
		System.out.println("Sem chiclete entregue");
	}
	public String toString(){
		return "Acabou o chiclete";
	}
}

package state;

public class TemMoedaState implements State{
	MaquinaChiclete maquinaDeChiclete;
	
	public TemMoedaState(MaquinaChiclete maquinaDeChiclete){
		this.maquinaDeChiclete = maquinaDeChiclete;
	}
	public void inserirMoeda(){
		System.out.println("Voc� n�o pode inserir outra moeda");
	}
	public void ejetarMoeda(){
		System.out.println("Moeda voltou");
		maquinaDeChiclete.setarState(maquinaDeChiclete.getSemMoedaState());
	}
	public void pressionarAlavanca(){
		System.out.println("Voc� virou, mas n�o h� chiclete");
		maquinaDeChiclete.setarState(maquinaDeChiclete.getChicleteVendidoState());
	}
	public void ejetarChiclete(){
		System.out.println("Sem chiclete entregue");
	}
	public void dispensar(){
		System.out.println("Sem gomas dispensadas");
			
	}
	public String toString(){
		return "Esperando virar a alavanca";
	}
}

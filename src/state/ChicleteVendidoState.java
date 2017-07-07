package state;

public class ChicleteVendidoState implements State{
	MaquinaChiclete maquinaDeChiclete;
	
	public ChicleteVendidoState(MaquinaChiclete maquinaDeChiclete){
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
	public void dispensar(){
		maquinaDeChiclete.ejetarChiclete();
		if(maquinaDeChiclete.getCount() > 0 ){
			maquinaDeChiclete.setarState(maquinaDeChiclete.getSemMoedaState());
		} else {
			System.out.println("Opa! Sem gomas");
			maquinaDeChiclete.setarState(maquinaDeChiclete.getChicleteVendidoState());
		}
	}
	public String toString(){
		return "Chiclete liberado";
	}
}

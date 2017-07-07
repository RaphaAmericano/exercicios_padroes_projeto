package state;

public class MaquinaChiclete {
	final static int CHICLETE_VENDIDO = 0;
	final static int MAQUINA_VAZIA = 1;
	final static int TEM_MOEDA = 2;
	final static int SEM_MOEDA = 3;
	
	int state = SOLD_OUT;
	int count = 0;
	
	public MaquinaChiclete(int count ){
		this.count = count;
		if( count > 0 ){
			state = TEM_MOEDA;
		}
	}
	public void inserirMoeda(){
		if(state == TEM_MOEDA){
			println("N�o pode inserir outra moeda");
		} else if ( State == MAQUINA_VAZIA){
			println("N�o pode inserir moeda pois a m�quina est� vazia");
		} else if (state == CHICLETE_VENDIDO){
			println("Favor aguardar, chiclete a caminho");
		} else if (state == SEM_MOEDA){
			state = TEM_MOEDA;
			println("Voc� inseriu uma moeda");
		}
	}
	public void ejetarMoeda(){
		if(state == TEM_MOEDA ){
			System.out.println("Moeda voltou");
			state = SEM_MOEDA;
		} else if (state == SEM_MOEDA){
			System.out.println("Duas vezes n�o te dar�o outro ciclete");
		} else if ( state == MAQUINA_VAZIA){
			System.out.println("N�o h� chiclete");
		} else if (state == TEM_MOEDA){
			System.out.println("Voc� virou..");
			state = SOLD;
			dispense();
		}
	}
}

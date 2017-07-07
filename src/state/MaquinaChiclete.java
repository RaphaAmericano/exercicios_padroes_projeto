package state;

public class MaquinaChiclete {
	final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 3;
	
	int state = SOLD_OUT;
	int count = 0;
	
	public MaquinaChiclete(int count ){
		this.count = count;
		if( count > 0 ){
			state = NO_QUARTER;
		}
	}
	public void inserirMoeda(){
		if(state == TEM_MOEDA){
			println("Não pode inserir outra moeda");
		} else if ( State == MAQUINA_VAZIA){
			println("Não pode inserir moeda pois a máquina está vazia");
		} else if (state == CHICLETE_VENDIDO){
			println("Favor aguardar, chiclete a caminho");
		} else if (state == SEM_MOEDA){
			state = TEM_MOEDA;
			println("Você inseriu uma moeda");
		}
	}
}

package state;

public class InserirMoeda {
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

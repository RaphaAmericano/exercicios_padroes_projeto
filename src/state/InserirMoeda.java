package state;

public class InserirMoeda {
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

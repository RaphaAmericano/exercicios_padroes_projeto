package state;

public class MaquinaChiclete {
	State maquinaVaziaState;
	State semMoedaState;
	State temMoedaState;
	State chicleteVendidoState;
	State state = maquinaVaziaState;
	
	/*final static int CHICLETE_VENDIDO = 0;
	final static int MAQUINA_VAZIA = 1;
	final static int TEM_MOEDA = 2;
	final static int SEM_MOEDA = 3;
	
	
	int state = MAQUINA_VAZIA;
	*/
	int count = 0;
	
	public MaquinaChiclete(int numeroDeGomas ){
		maquinaVaziaState = new MaquinaVaziaState(this);
		semMoedaState = new SemMoedaState(this);
		temMoedaState = new TemMoedaState(this);
		chicleteVendidoState = new ChicleteVendidoState(this);
		
		this.count = numeroDeGomas;
		
		this.count = count;
		if( numeroDeGomas > 0 ){
			state = semMoedaState;
		}
	}
	public void inserirMoeda(){
		/*
		if(state == TEM_MOEDA){
			System.out.println("Não pode inserir outra moeda");
		} else if ( state == MAQUINA_VAZIA){
			System.out.println("Não pode inserir moeda pois a máquina está vazia");
		} else if (state == CHICLETE_VENDIDO){
			System.out.println("Favor aguardar, chiclete a caminho");
		} else if (state == SEM_MOEDA){
			state = TEM_MOEDA;
			System.out.println("Você inseriu uma moeda");
		}
		*/
		state.inserirMoeda();
	}
	public void ejetarMoeda(){
		/*
		if(state == TEM_MOEDA ){
			System.out.println("Moeda voltou");
			state = SEM_MOEDA;
		} else if (state == SEM_MOEDA){
			System.out.println("Duas vezes não te darão outro ciclete");
		} else if ( state == MAQUINA_VAZIA){
			System.out.println("Não há chiclete");
		} else if (state == TEM_MOEDA){
			System.out.println("VocÊ virou..");
		}
		*/
		state.ejetarMoeda();
	}
	public void pressionarAlavanca(){
		/*
		if(state == MAQUINA_VAZIA ){
			System.out.println("Moeda voltou");
		} else if (state == SEM_MOEDA){
			System.out.println("Mudar texto aqui");
		} else if ( state == MAQUINA_VAZIA){
			System.out.println("Não há chiclete");
		} else if (state == TEM_MOEDA){
			System.out.println("Você virou..");
			state = MAQUINA_VAZIA;
			dispense();
		}
		*/
		state.pressionarAlavanca();
		state.dispensar();
	}
	public void ejetarChiclete(){
		state.ejetarChiclete();
	}
	public void dispense(){
		/*
		if( state == TEM_MOEDA){
			System.out.println("La vem goma");
			count = count - 1;
			if( count == 0 ){
				System.out.println("OPA! Acabou a goma");
				state = MAQUINA_VAZIA;
			} else {
				state = SEM_MOEDA;
			}
		} else if ( state == SEM_MOEDA ){
			System.out.println("Você precisa pagar antes");
		} else if (state == MAQUINA_VAZIA ){
			System.out.println( "Não há chicletes");
		} else if (state == TEM_MOEDA){
			System.out.println("Sem chicletes");
		}
		*/
	}
	void setarState(State state ){
		this.state = state;
	}
	public void refil(int numGomas){
		this.count = numGomas;
		state = semMoedaState;
	}
	void entregarChiclete(){
		System.out.println("Descendo goma de mascar");
		if( count != 0 ){
			count = count - 1;
		}
	}
	int getCount(){
		return count;
	}
	public State getState(){
		return state;
	}
	public State getMaquinaVaziaState(){
		return maquinaVaziaState;
	}
	public State getSemMoedaState(){
		return semMoedaState;
	}
	public State getTemMoedaState(){
		return temMoedaState;
	}
	public State getChicleteVendidoState(){
		return chicleteVendidoState;
	}
	public String toString(){
		StringBuffer result = new StringBuffer();
		result.append("\nMighth Gumbal, Inc.");
		result.append("\nJava-enable");
		result.append("Inventário: " +count+ " gomas" );
		if( count != 1 ){
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is" + state + "\n");
		result.append("\n");
		return result.toString();
	}
}

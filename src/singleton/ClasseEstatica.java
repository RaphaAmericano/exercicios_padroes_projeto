package singleton;

public class ClasseEstatica {
	private static ClasseEstatica unicaInstancia;
	
	
	private ClasseEstatica(){};
	
	public static ClasseEstatica getInstance(){
		if ( unicaInstancia == null ){
			return new ClasseEstatica();	
		}
		return unicaInstancia;
	}
}

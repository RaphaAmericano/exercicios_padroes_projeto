package template_method;

public class Cafe extends BebidaCafeina{
	void prepararReceita(){
		ferverAgua();
		colocarCafe();
		colocarNaXicara();
		adicionarAcucarLeite();
	}
	//
	public void misturarProduto(){
		System.out.println("Misturando chá");
	}
	public void adicionarCondimentos(){
		System.out.println("Adicionando limão");
	}
	//
	public void ferverAgua(){
		
	}
	public void colocarCafe(){
		
	}
	public void colocarNaXicara(){
		
	}
	public void adicionarAcucarLeite(){
		
	}
	public void gancho(){
		System.out.println("Funcinando");
	}
}

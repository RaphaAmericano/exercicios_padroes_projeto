package template_method;

public class Cha extends BebidaCafeina{
	void prepararReceita(){
		ferverAgua();
		colocarCha();
		colocarNaXicara();
		adicionarLimao();
	}	
	public void misturarProduto(){
		System.out.println("Misturar caf�");
	}
	public void adicionarCondimentos(){
		System.out.println("Adicionando a�ucar e leite");
	}
	//----
	public void ferverAgua(){
		
	}
	public void colocarCha(){
		
	}
	public void colocarNaXicara(){
		
	}
	public void adicionarLimao(){
		
	}
}
package template_method;

public abstract class BebidaCafeina {
	final void prepararReceira(){
		ferverAgua();
		misturarProduto();
		colocarNaXicara();
		adicionarCondimentos();
		gancho();
	}
	abstract void misturarProduto();
	abstract void adicionarCondimentos();
	
	public void ferverAgua(){
		System.out.println("Fervendo água");
	}
	public void colocarNaXicara(){
		System.out.println("Colocando na xícara");
	}
	void gancho(){
		
	}
}
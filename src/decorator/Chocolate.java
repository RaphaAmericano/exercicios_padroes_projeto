package decorator;

public class Chocolate extends IngredientesDecorator{
	Bebida bebida;
	public Chocolate( Bebida bebida){
		this.bebida = bebida;
	}
	public String getDescricao(){
		return bebida.getDescricao() + " , Chocolate";
	}
	public double preco(){
		return 0.20 + bebida.preco();
	}
}

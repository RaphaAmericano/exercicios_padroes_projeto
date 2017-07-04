package decorator;

public class Soja extends IngredientesDecorator{
	Bebida bebida;
	public Soja(Bebida bebida){
		this.bebida = bebida;	
	}
	public getDescricao(){
		return bebida.getDescricao() + ", Soja";
	}
	public double preco(){
		double preco = bebida.preco();
		if ( getTamanho() == Bebida.PEQUENA){
			preco += 0.10;
		}
		if( getTamanho == Bebida.MEDIA){
			preco += 0.15;
		}
		if( getTamanho() == Bebida.GRANDE ){
			preco += 0.20;
		}
		return preco;
	}
	
}
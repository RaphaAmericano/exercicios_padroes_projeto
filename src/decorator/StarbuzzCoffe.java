package decorator;

public class StarbuzzCoffe {

	public static void main(String[] args) {
		Bebida bebida = new Expresso();
		
		System.out.println(bebida.getDescricao() + " $ " + bebida.preco() );
		
		Bebida bebida2 = new Capuccino();
		bebida2 = new Chocolate( bebida2);
		bebida2 = new Chocolate( bebida2 );
		bebida2 = new Creme(bebida2);
		System.out.println(bebida2.getDescricao() + " $ " + bebida2.preco() );
		
		Bebida bebida3 = new Capuccino();
		bebida3 new Soja( bebida3 );
		bebida3 = new Chocolate( bebida3);
		System.out.println( bebida3.getDescricao() + " $ " + bebida3.preco() );
	}
}

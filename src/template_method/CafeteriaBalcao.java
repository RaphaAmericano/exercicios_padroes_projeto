package template_method;

public class CafeteriaBalcao {

	public static void main(String[] args) {
		BebidaCafeina meuCha = new Cha();
		BebidaCafeina meuCafe = new Cafe();
		meuCha.prepararReceira();
		meuCafe.prepararReceira();
	}

}

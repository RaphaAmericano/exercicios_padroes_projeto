package facade;

public class HomeTheaterTestDrive {

	public static void main(String[] args) {
		HomeTheaterFacade homeTheater = new HomeTheaterFacade( amp, radio, dvd, cd, projetor, luzes, tela, pipoqueira);
		
		homeTheater.verFilme("Homem Aranha");
		homeTheater.finalizarFilme();
	}
}

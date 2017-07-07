package state;

public class TesteMaquina {

	public static void main(String[] args) {
		MaquinaChiclete maquinaDeChiclete = new MaquinaChiclete(5);
		System.out.println(maquinaDeChiclete);
		
		maquinaDeChiclete.inserirMoeda();
		maquinaDeChiclete.turnoCrank();
		System.out.println(maquinaDeChiclete);
	}
}

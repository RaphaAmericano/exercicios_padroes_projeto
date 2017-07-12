package observer;
import java.awt.BorderLayout;
import javax.swing.*;

public class SwingMainTeste {
	JFrame frame;
	
	public static void main(String[] args) {
		SwingMainTeste example = new SwingMainTeste();
		example.go();
	}
	public void go(){
		frame = new JFrame();
		JButton button = new JButton("Hello, World");
		frame.getContentPane().add(BorderLayout.CENTER, button);
	}

}

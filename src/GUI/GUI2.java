package GUI;

import javax.swing.JFrame;

public class GUI2 {

	public GUI2() {
		JFrame frame=new JFrame ("ventana sin herencia");
		frame.setSize(370, 470);
		frame.setLocationRelativeTo(null);
		frame.setResizable(true);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

}

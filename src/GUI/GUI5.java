package GUI;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI5 extends JFrame{
	public GUI5(){
		super ("ventana/herebcia");
		getContentPane().setLayout(new FlowLayout());
		JButton boton=new JButton("boton");
		JLabel etiqueta=new JLabel("Dato");
		JTextField textField=new JTextField(10);
		JCheckBox checkBox=new JCheckBox("check box");
		getContentPane().add(boton);
		getContentPane().add(etiqueta);
		getContentPane().add(textField);
		getContentPane().add(checkBox);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	

}

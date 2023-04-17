package GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GUI8 extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4103202947956236695L;
	private JTextField textfield1;
	private JLabel label1;
	private JButton boton1;
	public GUI8(){
	super("Gui8: Activacion Oyente"); // o usar setTitle("Gui8: Activacion Oyente");
	 setLayout(null);
	 setSize(300,150);
	 setResizable(false); 
	 setDefaultCloseOperation(EXIT_ON_CLOSE);
	 
	 /* Etiqueta sirve para escribir texto, adicionalmente puede para mostrar una imagen*/
	  label1=new JLabel("Nombre:");
	  label1.setBounds(10,10,100,30); 
	  add(label1);
	  /* Campo de texto */
	  textfield1=new JTextField();
	  textfield1.setBounds(80,10,150,30);
	  add(textfield1);
	  
	   boton1=new JButton("Saludar");
	   boton1.setBounds(10,80,100,30);
	   add(boton1);
	   boton1.addActionListener(this);
	   setVisible(true);
	}
	@Override
	 public void actionPerformed(ActionEvent e) {
	 if (e.getSource()==boton1) 
		 JOptionPane.showMessageDialog(null,"Hola "+textfield1.getText()+" como estas?");
}}


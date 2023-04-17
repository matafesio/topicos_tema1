package GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class GUI11 extends JFrame implements ActionListener{

	private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JTextField textfield1;
    private JTextField textfield2;
    private JTextField textfield3;
    private JTextField textfield4;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    
    public GUI11(){
        super("Captura Datos");
        setLayout(null);
        setSize(350,350);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        label1 = new JLabel("Nombre ");
        label1.setBounds(10, 10, 100, 30);
        add(label1);
        
        label2 = new JLabel("Num,Ctrl ");
        label2.setBounds(10, 40, 100, 30);
        add(label2);
        
        label3 = new JLabel("Edad ");
        label3.setBounds(10, 70, 100, 30);
        add(label3);
        
        label4 = new JLabel("Semestre ");
        label4.setBounds(10, 100, 100, 30);
        add(label4);
        
        textfield1 = new JTextField();
        textfield1.setBounds(80, 10, 150, 30);
        add(textfield1);
        
        textfield2 = new JTextField();
        textfield2.setBounds(80, 40, 150, 30);
        add(textfield2);
        
        textfield3 = new JTextField();
        textfield3.setBounds(80, 70, 150, 30);
        add(textfield3);
        
        textfield4 = new JTextField();
        textfield4.setBounds(80, 100, 150, 30);
        add(textfield4);
        
        boton1 = new JButton ("Añadir");
        boton1.setBounds(10, 140, 80, 30);
        add(boton1);
        boton1.addActionListener(this);
        setVisible(true);
        
        boton2 = new JButton ("Eliminar");
        boton2.setBounds(100, 140, 80, 30);
        add(boton2);
        boton2.addActionListener(this);
        setVisible(true);
        
         boton3 = new JButton ("Eliminar todos");
        boton3.setBounds(190, 140, 120, 30);
        add(boton3);
        boton3.addActionListener(this);
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==boton3){
            JOptionPane.showMessageDialog(null,"Buenas tardes");
        }
    }
    
}


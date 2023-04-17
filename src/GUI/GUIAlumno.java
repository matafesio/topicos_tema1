package GUI;

import TDA.Alumno;
import TDA.ListaAlumnos;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class GUIAlumno extends JFrame implements ActionListener {
    
    private ListaAlumnos lista;
    private Container contenedor;
    private JLabel noCtrl;
    private JLabel nombre;
    private JLabel semestre;
    private JLabel edad;
    private JLabel total;
    private JTextField cNumero;
    private JTextField cNombre;
    private JTextField cSemestre;
    private JTextField cEdad;
    private JTextField cTotal;
    private JButton añadir;
    private JButton eliminar;
    private JButton eliminarTodo;
    private JList listaNombres;
    private DefaultListModel modelo;
    private JScrollPane scrollLista;
    
    public GUIAlumno(){
        lista=new ListaAlumnos();
        inicio();
        setTitle("Captura datos");
        setSize(300,350);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void inicio(){
        contenedor=getContentPane();
        contenedor.setLayout(null);
        
        noCtrl = new JLabel();
        noCtrl.setText("No. Ctrl:");
        noCtrl.setBounds(10, 10, 100, 30);
        cNumero = new JTextField();
        cNumero.setBounds(90, 10, 150, 30);
        
        nombre = new JLabel();
        nombre.setText("Nombre:");
        nombre.setBounds(10, 45, 100, 30);
        cNombre = new JTextField();
        cNombre.setBounds(90, 45, 150, 30);
        
        edad = new JLabel();
        edad.setText("Edad:");
        edad.setBounds(10, 80, 100, 30);
        cEdad = new JTextField();
        cEdad.setBounds(90, 80, 150, 30);
        
        semestre = new JLabel();
        semestre.setText("Semestre:");
        semestre.setBounds(10, 115, 100, 30);
        cSemestre = new JTextField();
        cSemestre.setBounds(90, 115, 150, 30);
        
        total=new JLabel();
        total.setText("No. registro: ");
        total.setBounds(10, 140, 100, 30);
        cTotal=new JTextField();
        cTotal.setBounds(20, 256, 135, 23);
        
        añadir = new JButton ("Añadir");
        añadir.setBounds(10, 280, 80, 23);
        añadir.addActionListener(this);
        
        eliminar = new JButton ("Eliminar");
        eliminar.setBounds(100, 280, 80, 23);
        eliminar.addActionListener(this);
        
        eliminarTodo = new JButton ("Limpiar lista");
        eliminarTodo.setBounds(190, 280, 120, 23);
        eliminarTodo.addActionListener(this);
        setVisible(true);
        
        listaNombres=new JList();
        listaNombres.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        modelo=new DefaultListModel();
        
        scrollLista=new JScrollPane();
        scrollLista.setBounds(10, 170, 280, 100);
        scrollLista.setViewportView(listaNombres);
        
        contenedor.add(noCtrl);
        contenedor.add(cNumero);
        contenedor.add(nombre);
        contenedor.add(cNombre);
        contenedor.add(edad);
        contenedor.add(cEdad);
        contenedor.add(semestre);
        contenedor.add(cSemestre);
        contenedor.add(total);
        contenedor.add(añadir);
        contenedor.add(eliminar);
        contenedor.add(eliminarTodo);
        contenedor.add(scrollLista);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==añadir){
            añadirAlumno();
        }
        if(e.getSource()==eliminar){
            eliminarAlumno(listaNombres.getSelectedIndex());
        }
        if(e.getSource()==eliminarTodo){
            EliminarTodo();
        }
    }
    
    private void añadirAlumno() {
        Alumno p = new Alumno(cNumero.getText(), cNombre.getText(),(Byte.parseByte(cSemestre.getText())), (Byte.parseByte(cEdad.getText())));
        lista.Añadir(p);
        String cad = cNombre.getText() + " " + cNumero.getText() + " "+ cSemestre.getText() + " " + cEdad.getText();
        modelo.addElement(cad);
        listaNombres.setModel(modelo);
        int x = modelo.getSize();
        total.setText("No.Registro: " + x);
        cNumero.setText("");
        cNombre.setText("");
        cEdad.setText("");
        cSemestre.setText("");
        cTotal.setText("");
    }
    
    private void eliminarAlumno(int indice) {
        if (indice >= 0) { 
            modelo.removeElementAt(indice);
            lista.Eliminar(indice);
            int x = modelo.getSize();
            total.setText("No.Registro: " + x);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento");
        }
    }
    
    private void EliminarTodo() {
        lista.EliminaTodo(); 
        modelo.clear(); 
        int x = modelo.getSize();
        total.setText("No.Registro: " + x);
}
}


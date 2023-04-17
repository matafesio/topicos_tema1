package TDA;

import javax.swing.JOptionPane;

import GUI.GUI1;
import GUI.GUI10;
import GUI.GUI11;
import GUI.GUI2;
import GUI.GUI3;
import GUI.GUI5;
import GUI.GUI6;
import GUI.GUI7;
import GUI.GUI8;
import GUI.GUIAlumno;
import GUI.GUi9;

public class TopicosTema1 {
	/*public static void MenuAlumno() {
		ListaAlumnos obj=new ListaAlumnos();
		byte op=0;
		do {
			op=Byte.parseByte(JOptionPane.showInputDialog(null,"1)Añadir \n 2)Eliminar \n 3)Elimiar todos \n 4)Salir "));
			switch(op) {
			case 1:
				obj.Añadir(CrearAlumn());
				break;
			case 2:
				obj.Eliminar(op);
				break;
			case 3:
			obj.EliminaTodo();
				break;
			case 4:
				for(int i=0;i<obj.Lista.size();i++) 
				System.out.println(obj.Lista.get(i));
				System.out.println("\n");
				break;
				default:
					System.out.println("Error opcion no definida");
				
				}
		}while ((byte)op!=5);
		
	}

	  private static Alumno CrearAlumn(){
	        Alumno aux=new Alumno();
	        aux.setNomAlum("Daniel");
	        aux.setNumC("21010925");
	        aux.setEdadAlum((byte)19);
	        aux.setSemAlum((byte)6);
	        return aux;
	    }
*/
	public static void main(String[] args) {
		//GUI1 si=new GUI1();
		//GUI2 no=new GUI2();
		//GUI3 maybe=new GUI3();
		//GUI5 nose=new GUI5();
		//GUI6 aaa=new GUI6();
		//GUI11 aaaaa=new GUI11();
		//MenuAlumno();
		GUIAlumno g=new GUIAlumno();
		
	}

}

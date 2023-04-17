package TDA;

import java.util.*;
public class ListaAlumnos {
	ArrayList<Alumno> Lista;

	public ListaAlumnos() {
		Lista=new  ArrayList<Alumno>();
		
	}
	public void Añadir(Alumno p) {
		Lista.add(p);
	}
	public void Eliminar(int pos) {
		Lista.remove(pos);
	}
	public void EliminaTodo() {
		Lista.removeAll(Lista);
	}

}
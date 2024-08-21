package Ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class mainEjercicio1_b {

	public static void main(String[] args) {
		
		TreeSet<Profesor> listaProfesores = new TreeSet<Profesor>();
		
		listaProfesores.add(new Profesor("Juan Pérez", 45, "Titular", 20));
        listaProfesores.add(new Profesor("María González", 38, "Suplente", 15));
        listaProfesores.add(new Profesor("Carlos López", 50, "Titular", 25));
        listaProfesores.add(new Profesor("Ana Martínez", 42, "Ayudante", 18));
        listaProfesores.add(new Profesor("Luis Fernández", 30, "Jefe de Trabajos Prácticos", 8));
	
        Iterator<Profesor> iterador = listaProfesores.iterator();
        while (iterador.hasNext()) {
        	
            System.out.println(iterador.next());
        }

        
	}

}

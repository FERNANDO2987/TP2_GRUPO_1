package Ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class mainEjercicio1_b {

	public static void main(String[] args) {
		
		TreeSet<Profesor> listaProfesores = new TreeSet<Profesor>();
		
		listaProfesores.add(new Profesor("Juan P�rez", 45, "Titular", 20));
        listaProfesores.add(new Profesor("Mar�a Gonz�lez", 38, "Suplente", 15));
        listaProfesores.add(new Profesor("Carlos L�pez", 50, "Titular", 25));
        listaProfesores.add(new Profesor("Ana Mart�nez", 42, "Ayudante", 18));
        listaProfesores.add(new Profesor("Luis Fern�ndez", 30, "Jefe de Trabajos Pr�cticos", 8));
	
        Iterator<Profesor> iterador = listaProfesores.iterator();
        while (iterador.hasNext()) {
        	
            System.out.println(iterador.next());
        }

        
	}

}

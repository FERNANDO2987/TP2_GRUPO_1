package ejercicio1;
import java.util.ArrayList;  
import java.util.Iterator;  

public class mainEjercicio1_a {

	public static void main(String[] args) {  
        ArrayList<Profesor> listaProfesores = new ArrayList<>();  

        listaProfesores.add(new Profesor("Juan Pérez", 45, "Titular", 20));  
        listaProfesores.add(new Profesor("María González", 38, "Suplente", 15));  
        listaProfesores.add(new Profesor("Carlos López", 50, "Titular", 25));  
        listaProfesores.add(new Profesor("Ana Martínez", 42, "Ayudante", 18));  
        listaProfesores.add(new Profesor("Luis Fernández", 32, "Jefe de Trabajos Prácticos", 8));  

        Iterator<Profesor> iterador = listaProfesores.iterator();  
        while (iterador.hasNext()) {  
            System.out.println(iterador.next());  
        }  
    }  

}

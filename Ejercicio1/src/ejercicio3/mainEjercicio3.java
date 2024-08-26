package ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio3 {

	public static void main(String[] args) 
	{
		ArrayList<IEdificio> listaEdifiocs = new ArrayList<>();
		listaEdifiocs.add(new Polideportivo("Polideportivo Angelito Di Maria", 800.2));
		listaEdifiocs.add(new Polideportivo("Polideportivo Emiliano Martinez", 1200.25));
		listaEdifiocs.add(new Polideportivo("Polideportivo Lionel Andres Messi", 1000.05));
		listaEdifiocs.add(new EdificioDeOficinas(65));
		listaEdifiocs.add(new EdificioDeOficinas(20));
		
		Iterator<IEdificio> iterador = listaEdifiocs.iterator();
		while(iterador.hasNext())
		{
			System.out.println(iterador.next());
		}

	}

}

package Ejercicio1;

public class Principal {
	///Punto 8 
	public static void main(String[] args) {
		Empleado[] empleados = new Empleado[5];
		int[] proximosID  = new int[5];
		
		empleados[0] = new Empleado("Santiago",18);
		proximosID[0] = Empleado.devuelveProximoID();
		empleados[1] = new Empleado("Alvaro",79);
		proximosID[1] = Empleado.devuelveProximoID();
		empleados[2] = new Empleado("Eustaquio",26);
		proximosID[2] = Empleado.devuelveProximoID();
		empleados[3] = new Empleado();
		proximosID[3] = Empleado.devuelveProximoID();
		empleados[4] = new Empleado();
		proximosID[4] = Empleado.devuelveProximoID();
		
		empleados[3].setNombre("Ariana");
		empleados[3].setEdad(65);
		
		empleados[4].setNombre("Matias");
		empleados[4].setEdad(24);
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println(empleados[i].toString());
			System.out.println("El proximo ID sera el " + proximosID[i]);
		}
	}
}

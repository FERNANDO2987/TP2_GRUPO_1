package Ejercicio1;

public class Empleado {
	private final int id;
	private String nombre;
	private int edad;
	private static int cont = 1000;

	//Punto 5
	//Constructores
	public Empleado(String nombre, int edad)
	{
		this.id = cont;
		this.nombre = nombre;
		this.edad = edad;
		
		cont++;
	}
	
	//Constructor vacio
	 public Empleado() {
	        this.id = cont++;
	        this.nombre = "sin nombre";
	        this.edad = 99;
	    }
	 
	//Getters y setters
	public int getId() {
		return id;
	}
	
	//Sin setId porque ahora es una constante
		
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//Metodos
	
	public static int devuelveProximoID()
	{
		return cont;
	}

	//toString
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}



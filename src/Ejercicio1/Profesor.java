package Ejercicio1;

public class Profesor extends Empleado{
	
	private String cargo;
	private int antiguedad;
	
	// Constructores
	public Profesor()
	{
		super();
		cargo = "Sin cargo";
		antiguedad = 0;
	}
	
	public Profesor(String nombre, int edad, String cargo, int antiguedad)
	{
		super(nombre, edad);
		this.cargo = cargo;
		this.antiguedad = antiguedad;
	}
	
	// Getters & Setters
	public String getCargo() 
	{
		return cargo;
	}
	
	public void setCargo(String cargo) 
	{
		this.cargo = cargo;
	}
		
	public int getAntiguedad() 
	{
		return antiguedad;
	}
	
	public void setAntiguedad(int antiguedad) 
	{
		this.antiguedad = antiguedad;
	}
}
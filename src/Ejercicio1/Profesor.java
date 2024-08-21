package Ejercicio1;

public class Profesor extends Empleado implements Comparable<Profesor>{
	
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
	
	  @Override
    public String toString() {
    	return "id=" + getId() + ", nombre=" + getNombre() + ", edad=" + getEdad() + 
                ", cargo=" + cargo + ", antiguedadDocente=" + antiguedad;
    }

	@Override
	public int compareTo(Profesor o) {
		
		// TODO Auto-generated method stub
				if(o.antiguedad == this.antiguedad)
					return 0;
				if(o.antiguedad < this.antiguedad) {					
					return 1;
				}
				return -1;
	}

	
	
}
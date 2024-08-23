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



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		if (antiguedad != other.antiguedad)
			return false;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		return true;
	}

	

	
	
}
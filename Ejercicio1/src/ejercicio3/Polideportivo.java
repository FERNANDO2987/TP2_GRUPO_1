package ejercicio3;

public class Polideportivo implements IEdificio, IInstalacionDeportiva 
{
	private String nombre;
	private double superficie;
	private int tipoDeInstalacion;
	
	public Polideportivo() {
		
	}
	
	public Polideportivo(String nombre, double superficie) 
	{
		this.nombre = nombre;
		this.superficie = superficie;
	}
	
	public double getSuperficieEdificio() {
		return superficie;
	}
	
	public int getTipoDeInstalacion() {
		return tipoDeInstalacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public void setTipoDeInstalacion(int tipoDeInstalacion) {
		this.tipoDeInstalacion = tipoDeInstalacion;
	}
	
	@Override
	public String toString() {
		return "Polideportivo: nombre = " + nombre + ", superficie = " + superficie;
	}
	
}

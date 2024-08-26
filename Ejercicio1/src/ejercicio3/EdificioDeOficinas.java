package ejercicio3;

public class EdificioDeOficinas implements IEdificio
{
	int nroOficinas;
	double superficie;
	
	public EdificioDeOficinas() {
		
	}
	
	public EdificioDeOficinas(int nroOficinas) 
	{
		this.nroOficinas = nroOficinas;
	}
	
	public double getSuperficieEdificio() {
		return superficie;
	}
	
	@Override
	public String toString() {
		return "Edificio De Oficinas: nroOficinas = " + nroOficinas;
	}
}

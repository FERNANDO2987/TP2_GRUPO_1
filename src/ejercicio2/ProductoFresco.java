package ejercicio2;

public class ProductoFresco extends Producto {
	private String fechaEnvasado;
	private String paisDeOrigen;
	
	
	public ProductoFresco() {
		super();
	}
	public ProductoFresco(String fechaCaducidad, int nroLote, String fechaEnvasado, String paisDeOrigen) {
		super(fechaCaducidad, nroLote);
		this.fechaEnvasado = fechaEnvasado;
		this.paisDeOrigen = paisDeOrigen;
	}
	public String getFechaEnvasado() {
		return fechaEnvasado;
	}
	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}
	public String getPaisDeOrigen() {
		return paisDeOrigen;
	}
	public void setPaisDeOrigen(String paisDeOrigen) {
		this.paisDeOrigen = paisDeOrigen;
	}
	@Override
	public String toString() {
		return super.toString() + " fechaEnvasado=" + fechaEnvasado + ", paisDeOrigen=" + paisDeOrigen;
	}	
	
}

package ejercicio2;

public class ProductoCongelado extends Producto {
	private float tempCongelacionRecomendada;

	
	public ProductoCongelado() {
		super();
	}

	public ProductoCongelado(String fechaCaducidad, int nroLote, float tempCongelacionRecomendada) {
		super(fechaCaducidad, nroLote);
		this.tempCongelacionRecomendada = tempCongelacionRecomendada;
	}

	public float getTempCongelacionRecomendada() {
		return tempCongelacionRecomendada;
	}

	public void setTempCongelacionRecomendada(float tempCongelacionRecomendada) {
		this.tempCongelacionRecomendada = tempCongelacionRecomendada;
	}

	@Override
	public String toString() {
		return super.toString() + " tempCongelacionRecomendada=" + tempCongelacionRecomendada;
	}
	
}

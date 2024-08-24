package ejercicio2;

public class ProductoRefrigerado extends Producto {
	private String codigoOrgSupAlimentaria;
	
	public ProductoRefrigerado() {
		super();
	}

	public ProductoRefrigerado(String fechaCaducidad, int nroLote, String codigoOrgSupAlimentaria) {
		super(fechaCaducidad, nroLote);
		this.codigoOrgSupAlimentaria = codigoOrgSupAlimentaria;
	}

	public String getCodigoOrgSupAlimentaria() {
		return codigoOrgSupAlimentaria;
	}

	public void setCodigoOrgSupAlimentaria(String codigoOrgSupAlimentaria) {
		this.codigoOrgSupAlimentaria = codigoOrgSupAlimentaria;
	}

	@Override
	public String toString() {
		return super.toString() + " codigoOrgSupAlimentaria=" + codigoOrgSupAlimentaria;
	}	
}

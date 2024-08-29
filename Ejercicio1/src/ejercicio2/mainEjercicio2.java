package ejercicio2;

public class mainEjercicio2 {

	public static void main(String[] args) {
		

		 
        ProductoCongelado productoCongelado = new ProductoCongelado("2025-12-31", 1001, -18.0f);  
        
        
        ProductoFresco productoFresco = new ProductoFresco("2023-09-30", 2002, "2023-08-01", "España");  
        
        
        ProductoRefrigerado productoRefrigerado = new ProductoRefrigerado("2024-06-15", 3003, "A1234");  

         
        System.out.println(productoCongelado);  
        System.out.println(productoFresco);  
        System.out.println(productoRefrigerado);  
		

	}

}

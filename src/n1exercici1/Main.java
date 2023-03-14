package n1exercici1;
import java.util.ArrayList; // import the ArrayList class
import java.lang.*;
public class Main {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
						
		Producte producto1= new Producte("azúcar",3);
		Producte producto2= new Producte("arroz",4);
	
		Venda ventas= new Venda();
		
		//ventas.addProducto(producto1);
		//ventas.addProducto(producto2);
		
		
		try {
			ventas.calcularTotal();
		} catch (ArrayIndexOutOfBoundsException | VendaBuidaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		System.out.println(ventas.getPreuTotalDeVenda());
			
	}
}

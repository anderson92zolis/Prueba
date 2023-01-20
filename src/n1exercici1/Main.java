package n1exercici1;
import java.util.ArrayList; // import the ArrayList class

public class Main {
	
	public static ArrayList<Producte> llistacolleccioDeProductes=new ArrayList<Producte>();;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Producte producto1= new Producte("azúcar",3);
		Producte producto2= new Producte("arroz",4);
		Producte producto3= new Producte("leche",5);
				
		llistacolleccioDeProductes.add(producto1);
		llistacolleccioDeProductes.add(producto2);
		llistacolleccioDeProductes.add(producto3);
		
		llistacolleccioDeProductes.clear();
		
		
		Venda colleccioDeProductes= new Venda(llistacolleccioDeProductes);
		colleccioDeProductes.ExaminacalcularTotal();
		//System.out.println(colleccioDeProductes.getPreuTotalDeVenda());
	}
}

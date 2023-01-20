package n1exercici1;
import java.util.ArrayList;

public class Venda {
	
	private ArrayList<Producte> colleccioDeProductes;
	private int preuTotalDeVenda;
	
	public Venda(ArrayList<Producte> llistacolleccioDeProductes) {
		colleccioDeProductes= llistacolleccioDeProductes;
	}
		
	//methods
	
	public ArrayList<Producte> getColleccioDeProductes() {
		return colleccioDeProductes;
	}
	
	public int getPreuTotalDeVenda() {
		return preuTotalDeVenda;
	} 
	
	public void setColleccioDeProductes(ArrayList<Producte> colleccioDeProductes) {
		this.colleccioDeProductes = colleccioDeProductes;
	}
	
	public void setPreuTotalDeVenda(int preuTotalDeVenda) {
		this.preuTotalDeVenda = preuTotalDeVenda;
	}

	public void  ExaminacalcularTotal()  {
	// necesidad de creaer crear un try/catch por que el error es de tipo Exception.
		try {			
			calcularTotal();
			
		} catch (VendaBuidaException e){	 
				System.out.println(e.getMessage());
	      }
	}
	
	
	public void calcularTotal() throws VendaBuidaException {
		//Si la collecció té productes, llavors ha de recórrer la collecció i guardar la suma de tots els preus dels productes a l’atribut preu total de la venda
		int suma=0;
		if (colleccioDeProductes.size()>0) {
			for (int i = 0; i < colleccioDeProductes.size(); i++) {
			     suma +=  colleccioDeProductes.get(i).getPreu();
				}
			}  else {
				throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");
				}
		preuTotalDeVenda=suma;
		}
}

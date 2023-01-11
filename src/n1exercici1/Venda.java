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
	public void setColleccioDeProductes(ArrayList<Producte> colleccioDeProductes) {
		this.colleccioDeProductes = colleccioDeProductes;
	}
	public int getPreuTotalDeVenda() {
		return preuTotalDeVenda;
	}
	public void setPreuTotalDeVenda(int preuTotalDeVenda) {
		this.preuTotalDeVenda = preuTotalDeVenda;
	}

	public void calcularTotal()  {
		try {
			getMessage();
			//preuTotalDeVenda(colleccioDeProductes); //Si la col·lecció té productes, llavors ha de recórrer la col·lecció i guardar la suma de tots els preus dels productes a l’atribut preu total de la venda.;;
			//System.out.println(">0");
			
		} catch (Exception e){	 
				System.out.println("Per fer una venda primer has d’afegir productes");
				//VendaBuidaException vendaBuidaException = new VendaBuidaException();
				//Exception vendaBuidaException = new VendaBuidaException();
				//vendaBuidaException.getMessage();	
				//System.out.println("<0");
	      }
	}
	
	public void getMessage() throws VendaBuidaException{
		if (colleccioDeProductes.size()>0) {
			preuTotalDeVenda(colleccioDeProductes);
		}  
		else {
			throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");
			}
	}
	
	public void preuTotalDeVenda(ArrayList<Producte> colleccioDeProductes) {
		int suma= 0;
		for (int i = 0; i < colleccioDeProductes.size(); i++) {
		     suma +=  colleccioDeProductes.get(i).getPreu();
			}
		preuTotalDeVenda=suma;
		}
}

package n1exercici1;
import java.util.ArrayList;

public class Venda {
	
	private ArrayList<Producte> colleccioDeProductes= new ArrayList<Producte>();;
	private int preuTotalDeVenda;
	
	public Venda() {
	}
		
	//getter&setters
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
		
	public void calcularTotal() throws VendaBuidaException {
		//Si la collecció té productes, llavors ha de recórrer la collecció i guardar la suma de tots els preus dels productes a l’atribut preu total de la venda
		int suma=0;
		
		if (colleccioDeProductes.size()>0) {
			for (int i = 0; i < colleccioDeProductes.size(); i++) {
			     suma +=  colleccioDeProductes.get(i).getPreu();
			}
		} else {
				throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");
				}
		preuTotalDeVenda=suma;
		}

	public void addProducto(Producte producto) {
		colleccioDeProductes.add(producto);
		}
}

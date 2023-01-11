package n1exercici1;

public class Producte {
	private String nom;
	private int preu;

	public Producte(String nom,int preu){
		this.nom=nom;
		this.preu=preu;
	}
	// getter
	public String getNom() {
		return nom;
	}
	
	public int getPreu() {
		return preu;
	}
	//setter
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPreu(int preu) {
		this.preu = preu;
	}
	@Override
	public String toString() {
		return "Clase Producte [nom=" + nom + ", preu=" + preu + "]";
	}
	
	
	
}

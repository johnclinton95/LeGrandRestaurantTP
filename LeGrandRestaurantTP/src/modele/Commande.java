package modele;

public class Commande {
	private double prix;
	private String nom;
	
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Commande(double prix, String nom) {
		super();
		this.prix = prix;
		this.nom = nom;
	}
 
}

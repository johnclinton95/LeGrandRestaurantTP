package modele;


public class Serveur {


	private String nom;
	double salaire;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getSalaire() {
		return salaire;
	}


	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public Serveur(String nom, double salaire) {
		this.nom= nom;
		this.salaire= salaire;
	}
}

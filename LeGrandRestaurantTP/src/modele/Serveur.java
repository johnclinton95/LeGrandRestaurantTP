package modele;


public class Serveur {


	private String nom;
	double chiffreVente;
    
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getVente() {
		return chiffreVente;
	}

	public void setVente(Commande commande) {
		this.chiffreVente += commande.getPrix();
	}

	public Serveur(String nom, double chiffreVente) {
		this.nom= nom;
		this.chiffreVente= chiffreVente;
	}
}

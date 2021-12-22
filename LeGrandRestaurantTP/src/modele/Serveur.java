package modele;


public class Serveur {

	public double ChiffreAffaire;

	public double getChiffreAffaire() {
		return ChiffreAffaire;
	}

	public void setChiffreAffaire(double chiffreAffaire) {
		ChiffreAffaire = chiffreAffaire;
	}

	public void PrendreCommande(double montantCommande) {
		this.ChiffreAffaire += montantCommande;
	}

	public Serveur(String nom, double salaire) {

	}
}

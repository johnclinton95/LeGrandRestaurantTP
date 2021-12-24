package modele;

import java.util.ArrayList;

public class Restaurant {

	private ArrayList<Serveur> serveurs;
	private  double chiffreAffaire;

	public double getChiffreAffaire() {
		return chiffreAffaire;
	}

	public void setChiffreAffaire(double chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}
	
	public Restaurant(ArrayList<Serveur> serveurs) {
		this.serveurs=serveurs;
	}

	public double chiffreAffaire() {
		double res=0;
		for(Serveur s: serveurs)
			res=+ s.ChiffreAffaire;
		return res;
	}
}

package modele;

import java.util.ArrayList;

public class Restaurant {

	private ArrayList<Serveur> serveurs;

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

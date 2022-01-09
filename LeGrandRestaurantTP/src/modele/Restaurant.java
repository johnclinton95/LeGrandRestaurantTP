package modele;

import java.util.ArrayList;

public class Restaurant {

	private ArrayList<Serveur> serveurs;
	private  double chiffreAffaire;
	private ArrayList<Integer> ListeTable;
	public double getChiffreAffaire() {
		return chiffreAffaire;
	}

	public Integer remove(int index) {
		return ListeTable.remove(index);
	}
	public boolean add(int index) {
		return ListeTable.add(index);
	}
	public Integer TableOcc(int index) {
		return ListeTable.size();
	}
	public Restaurant(ArrayList<Serveur> serveurs, double chiffreAffaire, ArrayList<Integer> listeTable) {
		super();
		this.serveurs = serveurs;
		this.chiffreAffaire = chiffreAffaire;
		ListeTable = listeTable;
	}

	public void setChiffreAffaire(double chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}

	public Restaurant(ArrayList<Serveur> serveurs) {
		this.serveurs=serveurs;
	}

	
}

package modele;

import java.util.ArrayList;

public class Restaurant {

	private ArrayList<Serveur> serveurs;
	private  double chiffreAffaire;
	private ArrayList<Table> ListeTable;
	public double getChiffreAffaire() {
		return chiffreAffaire;
	}

	public void remove(Table table) {
		 ListeTable.remove(table);
	}
	public void add(Table table) {
		 ListeTable.add(table);
	}
	public Integer TableOcc() {
		return ListeTable.size();
	}
	public Restaurant(ArrayList<Serveur> serveurs, double chiffreAffaire, ArrayList<Table> listeTable) {
		super();
		this.serveurs = serveurs;
		this.chiffreAffaire = chiffreAffaire;
		ListeTable = listeTable;
	}

	public void setChiffreAffaire(double chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}

	public Restaurant(ArrayList<Serveur> serveurs, ArrayList<Table>tables) {
		this.serveurs=serveurs;
		this.ListeTable=tables;
	}
	
	public double chiffreDaffaire(ArrayList<Serveur>serveurs) {
		double chiffre=0;
		for(Serveur serveur: serveurs)
			chiffre=+ serveur.chiffreVente;
		return chiffre;
	}

	
}

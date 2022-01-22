package modele;

import java.util.ArrayList;

public class Filiale extends Restaurant {
	

private ArrayList<Menu> menus;
private String nom;

public Filiale(ArrayList<Serveur> serveurs,double chiffreAffaire, ArrayList<Table> tables, ArrayList<Menu> menus) {
	super(serveurs, chiffreAffaire, tables);
	this.menus = menus;
}
	public String getNom() {
		return this.nom;
	}
	public ArrayList<Menu> getMenu(){
		return this.menus;
	}
}

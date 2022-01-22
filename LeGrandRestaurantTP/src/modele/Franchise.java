package modele;

import java.util.ArrayList;

public class Franchise extends Restaurant{

	private ArrayList<Menu> menus;
	private String nom;

	public Franchise(ArrayList<Serveur> serveurs, double chiffreAffaire, ArrayList<Table> listeTable, ArrayList<Menu>menus) {
		super(serveurs, chiffreAffaire, listeTable);
		this.menus = menus;
		
	}
	
		
	public String getNom() {
		return nom;
	}
	public ArrayList<Menu> getMenu(){
		return menus;
	}
}

package modele;

import java.util.ArrayList;

import lombok.Builder;
import lombok.Getter;
@Getter
public class Menu {
	private ArrayList<Plat> plat;
	private String nom;

	@Builder

	public Menu(ArrayList<Plat> plat, String nom) {
		this.plat = plat;
		this.nom = nom;
	}
	
	
	
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Plat> getPlat() {
		return plat;
	}

	public void setPlat(ArrayList<Plat> plat) {
		this.plat = plat;
	}

}

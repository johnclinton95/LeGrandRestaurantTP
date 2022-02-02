package modele;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Commande {
	private double prix;
	private String nom;
	private boolean boisson;
	private boolean epinglee=false;
	private boolean transmettreGendarmerie=false;
	
	@Builder
	public Commande(double prix,boolean boisson) {
		this.prix = prix;
		this.boisson=boisson;
	} 
	
	
	
	

	
	
	
	
	
	public boolean isBoisson() {
		return boisson;
	}
	public void setBoisson(boolean boisson) {
		this.boisson = boisson;
	}
	public boolean isTransmettreGendarmerie() {
		return transmettreGendarmerie;
	}
	public void setTransmettreGendarmerie(boolean transmettreGendarmerie) {
		this.transmettreGendarmerie = transmettreGendarmerie;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public boolean isEpinglee() {
		return epinglee;
	}
	public void setEpinglee(boolean epinglee) {
		this.epinglee = epinglee;
	}
	
	

}

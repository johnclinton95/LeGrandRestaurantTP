package modele;

import java.util.ArrayList;

import lombok.Builder;
import lombok.Getter;
@Getter
public class Serveur {
	public double ChiffreAffaires=0;
	
	private String nom;
	private ArrayList<Table> ListeTable;
	private ArrayList<Commande> listeCommande= new ArrayList<Commande>();
	private ArrayList<Commande> tachesCuisine = new ArrayList<Commande>();
	

	

	public void PrendreCommande(Commande commande)
    {		
        ChiffreAffaires += commande.getPrix() ;
    }
	public void AddCommande(Commande commande)
	{
		if(!commande.isBoisson())
		{
			tachesCuisine.add(commande);
		}
		listeCommande.add(commande);
	}
	@Builder
	public Serveur(String nom) {
		this.nom= nom;
	}
	public void addTable(Table table)
	{
		if(table.AffecteeAuServeur==false)
		{
			table.AffecteeAuServeur=true;
			ListeTable.add(table);
		}
		else
		{
			System.out.println("table number "+ table.getTableNumber()+"is occupied");
		}
	}
	public void CommandeEpinglee(Commande commande)
	{
		commande.setEpinglee(true);
	}
	public void TransmettreGendarmerie(Commande commande)
	{
		commande.setTransmettreGendarmerie(true);
		listeCommande.remove(commande);
	}
	public ArrayList<Commande> TransmettreRestaurant()
	{
		return listeCommande;
	}
	
	public ArrayList<Commande> getTachesCuisine() {
		return tachesCuisine;
	}

	public void setTachesCuisine(ArrayList<Commande> tachesCuisine) {
		this.tachesCuisine = tachesCuisine;
	}

	public ArrayList<Commande> getListeCommande() {
		return listeCommande;
	}

	public void setListeCommande(ArrayList<Commande> listeCommande) {
		this.listeCommande = listeCommande;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public ArrayList<Table> getListeTable() {
		return ListeTable;
	}
	public void setListeTable(ArrayList<Table> listeTable) {
		ListeTable = listeTable;
	}
	
	
}


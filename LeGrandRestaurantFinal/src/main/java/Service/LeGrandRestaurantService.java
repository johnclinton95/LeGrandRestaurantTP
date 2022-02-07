package Service;

import java.util.ArrayList;

import modele.Commande;
import modele.Filiale;
import modele.Franchise;
import modele.Menu;
import modele.Plat;
import modele.Restaurant;
import modele.Serveur;
import modele.Table;

public class LeGrandRestaurantService {
	
	public double getchiffreAffairesServeur(Serveur serveur,ArrayList<Commande> commandes)
	{
		for(Commande commade : commandes)
		{
			serveur.PrendreCommande(commade);
		}
		return serveur.ChiffreAffaires;
	}
	public double getchiffreAffairesRestaurant(Restaurant restaurant)
	{
		return restaurant.ChiffreAffaires();
	}
	public void getDebutDeService(Restaurant restaurant,ArrayList<Table> tables)
	{
		Table table = tables.get(0);
		Serveur serveur1 = restaurant.getServeurs().get(0);
		Serveur serveur2 = restaurant.getServeurs().get(1);
		restaurant.affectationTable(table);
		serveur1.addTable(table);
		serveur2.addTable(table);
	}
	public void getEpinglage(Serveur serveur,ArrayList<Commande> commandes)
	{
		Commande commande = commandes.get(0);
		serveur.CommandeEpinglee(commande);
		serveur.setListeCommande(commandes);
		serveur.TransmettreGendarmerie(commande);
	}
	public void getTableLibre(Restaurant restaurant)
	{
		Table table1 = restaurant.getListeTable().get(0);
		Table table2 = restaurant.getListeTable().get(1);
		restaurant.AddTableClient(table1);
		restaurant.RemoveTableClient(table2);
	}
	public boolean getTacheCuisine(Serveur serveur,Commande commande)
	{
		boolean tacheCuisine;
			if(serveur.getTachesCuisine().contains(commande))
			{
				tacheCuisine= true;
			}
			else
			{
				tacheCuisine= false;
			}
			return tacheCuisine;
	}
	public double getFiliale(Franchise franchise, Filiale filiale) {
		Plat plat1 =franchise.getMenuFranchise().get(0).getPlat().get(0);
		franchise.ChangerPrixPlat(plat1,6);
		double prixPlatFranchise=plat1.getPrix();
		return prixPlatFranchise;
	}
	public ArrayList<Menu> getCarteRestaurant(Franchise franchise,ArrayList<Menu> menus) {
		franchise.setMenuRestaurant(menus);
		franchise.CarteRestaurant();
		return franchise.getCarteRestaurant();
	}
	
	
}

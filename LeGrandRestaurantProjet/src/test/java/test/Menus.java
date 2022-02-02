package test;

import modele.Franchise;
import modele.Serveur;
import modele.Table;
import modele.Menu;
import modele.Plat;
import modele.Filiale;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Menus {


	@Test
	void Filiale()
	{
		ArrayList<Serveur> serveurs = new ArrayList<Serveur>();
		ArrayList<Table> tables = new ArrayList<Table>();
		ArrayList<Menu> menus1 = new ArrayList<Menu>();
		ArrayList<Menu> menus2 = new ArrayList<Menu>();
		ArrayList<Plat> plats = new ArrayList<Plat>();
		Plat plat = Plat
				.builder()
				.prix(5)
				.name("kebab")
				.build();
		plats.add(plat);
		Menu menufranchise = Menu
				.builder()
				.plat(plats)
				.nom("menu")
				.build();
		menus1.add(menufranchise);
		menus2.add(menufranchise);
		Franchise franchise= Franchise
				.builder()
				.serveurs(serveurs)
				.ListeTable(tables)
				.menu(menus1)
				.build();
		Filiale filiale = Filiale.builder()
				.ListeTable(tables)
				.menu(menus2)
				.serveurs(serveurs)
				.franchise(franchise)
				.build();
		filiale.setMenu(menus2);
		franchise.ChangerPrixPlat(plat,6);
		
		double prixPlatFranchise=franchise.getMenu().get(0).getPlat().get(0).getPrix();
		double prixPlatfiliale= filiale.getMenu().get(0).getPlat().get(0).getPrix();
		Assert.assertEquals(prixPlatFranchise,prixPlatfiliale);
		
	}
}

package test;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import Controller.LeGrandRestaurantController;
import Service.LeGrandRestaurantService;
import modele.Filiale;
import modele.Franchise;
import modele.Menu;
import modele.Plat;
import modele.Serveur;
import modele.Table;

public class MenusTest {
	LeGrandRestaurantService leGrandRestaurantService = new LeGrandRestaurantService();
	LeGrandRestaurantController leGrandRestaurantController= new LeGrandRestaurantController(leGrandRestaurantService);
	/*
	 ÉTANT DONNE un restaurant ayant le statut de filiale d'une franchise
	ET une franchise définissant un menu ayant un plat
	QUAND la franchise modifie le prix du plat
	ALORS le prix du plat dans le menu du restaurant est celui défini par la franchise
	 */
	@Test
	void Filiale()
	{
		ArrayList<Serveur> serveurs = new ArrayList<Serveur>();
		ArrayList<Table> tables = new ArrayList<Table>();
		ArrayList<Menu> menus1 = new ArrayList<Menu>();
		ArrayList<Menu> menus2 = new ArrayList<Menu>();
		ArrayList<Plat> plats1 = new ArrayList<Plat>();
		ArrayList<Plat> plats2 = new ArrayList<Plat>();
		Plat plat1 = Plat
				.builder()
				.prix(5)
				.name("kebab")
				.build();
		Plat plat2 = Plat
				.builder()
				.prix(6)
				.name("soupe")
				.build();
		plats1.add(plat1);
		plats2.add(plat2);
		Menu menufranchise1 = Menu
				.builder()
				.plat(plats1)
				.nom("menu")
				.build();
		Menu menufranchise2 = Menu
				.builder()
				.plat(plats2)
				.nom("menu")
				.build();
		menus1.add(menufranchise1);
		menus2.add(menufranchise2);
		Franchise franchise= Franchise
				.builder()
				.serveurs(serveurs)
				.ListeTable(tables)
				.menuFranchise(menus1)
				.build();
		Filiale filiale = Filiale.builder()
				.ListeTable(tables)
				.menu(menus2)
				.serveurs(serveurs)
				.franchise(franchise)
				.build();
		double prixPlatFranchise=leGrandRestaurantController.Filiale(franchise, filiale);
		double prixPlatfiliale= filiale.getMenu().get(0).getPlat().get(0).getPrix();
		Assert.assertEquals(prixPlatFranchise,prixPlatfiliale);
	}

}

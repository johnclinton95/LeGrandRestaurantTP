package test;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import Controller.LeGrandRestaurantController;
import Service.LeGrandRestaurantService;
import modele.Franchise;
import modele.Menu;
import modele.Plat;
import modele.Serveur;
import modele.Table;

public class CarteRestaurantTest {
	LeGrandRestaurantService leGrandRestaurantService = new LeGrandRestaurantService();
	LeGrandRestaurantController leGrandRestaurantController= new LeGrandRestaurantController(leGrandRestaurantService);
	/*
	 ÉTANT DONNE un restaurant appartenant à une franchise et définissant un menu ayant un plat
	QUAND la franchise ajoute un nouveau plat
	ALORS la carte du restaurant propose le premier plat au prix du restaurant et le second au prix de la franchise
	 */
	@Test
	void CarteRestaurant()
	{
		ArrayList<Serveur> serveurs = new ArrayList<Serveur>();
		ArrayList<Table> tables = new ArrayList<Table>();
		ArrayList<Menu> menus1 = new ArrayList<Menu>();
		ArrayList<Menu> menus2 = new ArrayList<Menu>();
		ArrayList<Menu> menus3 = new ArrayList<Menu>();
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
		ArrayList<Menu> Menus =leGrandRestaurantController.CarteRestaurant(franchise, menus2);
		menus3.addAll(menus1);
		menus3.addAll(menus2);
		Assert.assertEquals(menus3,Menus);		
	}

}

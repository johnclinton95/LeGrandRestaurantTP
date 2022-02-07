package test;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.Test;

import Controller.LeGrandRestaurantController;
import Service.LeGrandRestaurantService;
import modele.Restaurant;
import modele.Serveur;
import modele.Table;

public class InstallationTest {
	LeGrandRestaurantService leGrandRestaurantService = new LeGrandRestaurantService();
	LeGrandRestaurantController leGrandRestaurantController= new LeGrandRestaurantController(leGrandRestaurantService);
	
	/*
	 ÉTANT DONNE une table dans un restaurant ayant débuté son service
	QUAND un client est affecté à une table
	ALORS cette table n'est plus sur la liste des tables libres du restaurant

	ÉTANT DONNE une table occupée par un client
	QUAND la table est libérée
	ALORS cette table appraît sur la liste des tables libres du restaurant
	 */
	
	@Test
	void TableLibre()
	{
		ArrayList<Serveur> serveurs = new ArrayList<Serveur>();
		ArrayList<Table> tables = new ArrayList<Table>();
		Table table1= new Table();
		Table table2= new Table();
		tables.add(table1);
		tables.add(table2);
		Serveur serveur2 =Serveur
				.builder()
				.nom("yassine")
				.build() ;
		serveurs.add(serveur2);
		Restaurant restaurant= new Restaurant( serveurs,tables) ; 
		leGrandRestaurantController.TableLibre(restaurant);
		assertTrue(restaurant.getListeTable().contains(table1)==false);
		assertTrue(restaurant.getListeTable().contains(table2)==true);
	}


}

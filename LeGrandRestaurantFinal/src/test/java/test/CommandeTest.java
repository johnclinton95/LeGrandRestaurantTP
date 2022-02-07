package test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.Test;

import Controller.LeGrandRestaurantController;
import Service.LeGrandRestaurantService;
import modele.Commande;
import modele.Serveur;

public class CommandeTest {
	LeGrandRestaurantService leGrandRestaurantService = new LeGrandRestaurantService();
	LeGrandRestaurantController leGrandRestaurantController= new LeGrandRestaurantController(leGrandRestaurantService);
	ArrayList<Commande> commandes = new ArrayList<Commande>();
	/*
	 ÉTANT DONNE un serveur dans un restaurant
	QUAND il prend une commande de nourriture
	ALORS cette commande apparaît dans la liste de tâches de la cuisine de ce restaurant

	ÉTANT DONNE un serveur dans un restaurant
	QUAND il prend une commande de boissons
	ALORS cette commande n'apparaît pas dans la liste de tâches de la cuisine de ce restaurant
	 */
	@Test
	void TacheCuisine()
	{
		Serveur serveur2 =Serveur
				.builder()
				.nom("yassine")
				.build() ;
		Commande commande= Commande
				.builder()
				.prix(10.3)
				.boisson(false)
				.build();
		serveur2.AddCommande(commande);
		Commande commandeBoisson= Commande
				.builder()
				.prix(5)
				.boisson(true)
				.build();
		boolean tachesCuisine = leGrandRestaurantController.TacheCuisine(serveur2, commande);
		assertTrue(tachesCuisine==true);
		tachesCuisine = leGrandRestaurantController.TacheCuisine(serveur2, commandeBoisson);
		assertFalse(tachesCuisine==true);
	}

}

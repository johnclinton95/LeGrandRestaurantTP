package test;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import Controller.LeGrandRestaurantController;
import Service.LeGrandRestaurantService;
import modele.Commande;
import modele.Restaurant;
import modele.Serveur;
import modele.Table;


public class ChiffreAffairesRestaurantTest {
	/*
	 	ÉTANT DONNÉ un restaurant ayant X serveurs
		QUAND tous les serveurs prennent une commande d'un montant Y
		ALORS le chiffre d'affaires de la franchise est X * Y 
	*/
	@Test
	public void chiffreAffairesRestaurant() {
		LeGrandRestaurantService leGrandRestaurantService = new LeGrandRestaurantService();
		LeGrandRestaurantController leGrandRestaurantController= new LeGrandRestaurantController(leGrandRestaurantService);
		ArrayList<Serveur> serveurs = new ArrayList<Serveur>();
		ArrayList<Table> tables = new ArrayList<Table>();
		Commande commande= Commande.builder()
				.prix(10.3)
				.boisson(false)
				.build();
		Serveur serveur1 = Serveur.builder()
				.nom("john")
				.build();
		ArrayList<Commande> commandes=new ArrayList<Commande>();
		commandes.add(commande);
		leGrandRestaurantController.chiffreAffairesServeur(serveur1,commandes);
		Serveur serveur2 = Serveur.builder()
				.nom("yassine")
				.build();
		leGrandRestaurantController.chiffreAffairesServeur(serveur2,commandes);
		Serveur serveur3 = Serveur.builder()
				.nom("aymane")
				.build();
		leGrandRestaurantController.chiffreAffairesServeur(serveur3,commandes);
		serveurs.add(serveur1);
		serveurs.add(serveur2);
		serveurs.add(serveur3);
		Restaurant restaurant= new Restaurant( serveurs,tables) ;
		double chiffresAffaires =leGrandRestaurantController.chiffreAffairesRestaurant(restaurant);
		double result=10.3*3;
		Assert.assertEquals(chiffresAffaires,result);
	}

}

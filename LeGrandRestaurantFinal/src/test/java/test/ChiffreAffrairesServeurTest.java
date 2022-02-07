package test;
import java.util.ArrayList;
import org.testng.Assert;
import org.testng.annotations.Test;
import Controller.LeGrandRestaurantController;
import Service.LeGrandRestaurantService;
import modele.Commande;
import modele.Serveur;

public class ChiffreAffrairesServeurTest {	
	
	@Test
	void DebutService()
	{
		/*
		 ÉTANT DONNÉ un nouveau serveur
		QUAND on récupére son chiffre d'affaires
		ALORS celui-ci est à 0
		*/
		LeGrandRestaurantService leGrandRestaurantService = new LeGrandRestaurantService();
		LeGrandRestaurantController leGrandRestaurantController= new LeGrandRestaurantController(leGrandRestaurantService);
		Serveur serveur = new Serveur("yassine");
		ArrayList<Commande> commandes=new ArrayList<Commande>();
		
		double chiffresAffaires = leGrandRestaurantController.chiffreAffairesServeur(serveur,commandes);
		Assert.assertEquals(chiffresAffaires,0 );
	}
	/*
	 	ÉTANT DONNÉ un serveur ayant déjà pris une commande
		QUAND il prend une nouvelle commande
		ALORS son chiffre d'affaires est la somme des deux commandes
	*/
	@Test
	void chiffreAffairesServeur()
	{
		LeGrandRestaurantService leGrandRestaurantService = new LeGrandRestaurantService();
		LeGrandRestaurantController leGrandRestaurantController= new LeGrandRestaurantController(leGrandRestaurantService);
		Serveur serveur = new Serveur("yassine");
		ArrayList<Commande> commandes=new ArrayList<Commande>();
		Commande commande= Commande
				.builder()
				.prix(10.3)
				.boisson(false)
				.build();
		Commande commande1= Commande
				.builder()
				.prix(15)
				.boisson(false)
				.build();
		commandes.add(commande);
		commandes.add(commande1);
		double chiffresAffaires = leGrandRestaurantController.chiffreAffairesServeur(serveur,commandes);
		Assert.assertEquals(chiffresAffaires , 25.3);
	}
}

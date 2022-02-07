package test;

import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.Test;

import Controller.LeGrandRestaurantController;
import Service.LeGrandRestaurantService;
import modele.Commande;
import modele.Serveur;

public class EpinglageTest {
	
	LeGrandRestaurantService leGrandRestaurantService = new LeGrandRestaurantService();
	LeGrandRestaurantController leGrandRestaurantController= new LeGrandRestaurantController(leGrandRestaurantService);
	Serveur serveur =Serveur
			.builder()
			.nom("yassine")
			.build() ;
	Commande commande= Commande
			.builder()
			.prix(10.3)
			.boisson(false)
			.build();
	ArrayList<Commande> commandes = new ArrayList<Commande>();
	/*
	 ÉTANT DONNE un serveur ayant pris une commande
	QUAND il la déclare comme non-payée
	ALORS cette commande est marquée comme épinglée
	 */
	@Test
	void CommandeEpinglee()
	{
		commandes.add(commande);
		leGrandRestaurantController.Epinglage(serveur, commandes);
		assertTrue(commande.isEpinglee()==true);
	}
	/*
	 ÉTANT DONNE un serveur ayant épinglé une commande
	QUAND elle date d'il y a au moins 15 jours
	ALORS cette commande est marquée comme à transmettre gendarmerie

	ÉTANT DONNE une commande à transmettre gendarmerie
	QUAND on consulte la liste des commandes à transmettre du restaurant
	ALORS elle y figure

	ÉTANT DONNE une commande à transmettre gendarmerie
	QUAND elle est marquée comme transmise à la gendarmerie
	ALORS elle ne figure plus dans la liste des commandes à transmettre du restaurant
	 */
	@Test
	void TransmettreGendarmerie()
	{
		commandes.add(commande);
		leGrandRestaurantController.Epinglage(serveur, commandes);
		assertTrue(commande.isTransmettreGendarmerie()==true);
		assertNull(serveur.getListeTable());
	}

}

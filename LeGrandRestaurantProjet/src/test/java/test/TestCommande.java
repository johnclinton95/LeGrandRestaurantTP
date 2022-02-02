package test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import modele.Commande;
import modele.Serveur;

public class TestCommande {
	
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
		assertTrue(serveur2.getTachesCuisine().contains(commande)==true);
		Commande commandeBoisson= Commande
				.builder()
				.prix(5)
				.boisson(true)
				.build();
		assertFalse(serveur2.getTachesCuisine().contains(commandeBoisson)==true);
	}
	
	
}

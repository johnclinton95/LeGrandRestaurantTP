package test;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;
import modele.Restaurant;
import modele.Serveur;
import modele.Commande;
import modele.Table;


public class ChiffreAffaires {
	
	
	@Test
	public void Serveur()
	{
		Serveur serveur = new Serveur("yassine");
		Assert.assertEquals(0, serveur.ChiffreAffaires);

		Commande commande= Commande
				.builder()
				.prix(10.3)
				.boisson(false)
				.build();
		serveur.PrendreCommande(commande);
		Assert.assertEquals(10.3, serveur.ChiffreAffaires);

		Commande commande1= Commande
				.builder()
				.prix(15)
				.boisson(false)
				.build();
		serveur.PrendreCommande(commande1);
		Assert.assertEquals(25.3, serveur.ChiffreAffaires);
		
	}

	@Test
	public void Restaurant() {
		ArrayList<Serveur> serveurs = new ArrayList<Serveur>();
		ArrayList<Table> tables = new ArrayList<Table>();
		Commande commande= Commande.builder()
				.prix(10.3)
				.boisson(false)
				.build();
		Serveur serveur1 = Serveur.builder()
				.nom("john")
				.build();
		serveur1.PrendreCommande(commande);
		Serveur serveur2 = Serveur.builder()
				.nom("yassine")
				.build();
		serveur2.PrendreCommande(commande);
		Serveur serveur3 = Serveur.builder()
				.nom("aymane")
				.build();
		serveur3.PrendreCommande(commande);
		serveurs.add(serveur1);
		serveurs.add(serveur2);
		serveurs.add(serveur3);
		Restaurant restaurant= new Restaurant( serveurs,tables) ; 	
		double result=10.3*3;
		Assert.assertEquals(restaurant.ChiffreAffaires(),result);
	}

}

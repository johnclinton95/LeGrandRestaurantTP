package test;




import org.junit.Assert;
import org.junit.Test;

import modele.Serveur;
import utilities.ServeurBuilder;

public class RestaurantTest {

	@Test
	public void test() {

	}


	@Test
	public void Serveur_Initial()
	{
		// Étant donné un nouveau serveur
		Serveur serveur = new  ServeurBuilder().build();
		// Quand je calcule son chiffre d'affaire
		double chiffreAffaires = serveur.ChiffreAffaire;

		// Alors il est de zéro
		Assert.assertEquals(0, chiffreAffaires);
	}
	
	@Test
	public void Serveur_Commande()
	{
		// Étant donné un nouveau serveur
		var serveur = new ServeurBuilder().build();

		// Quand il prend une commande
		double montantCommande = new Double(67.8);
		serveur.PrendreCommande(montantCommande);

		// Alors son chiffre d'affaires est le montant de cette commande
		double chiffreAffaires = serveur.ChiffreAffaire;
		Assert.assertEquals(montantCommande, chiffreAffaires);
	}

}

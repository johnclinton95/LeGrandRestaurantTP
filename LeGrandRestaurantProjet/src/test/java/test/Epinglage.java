package test;

import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.Test;

import modele.Commande;
import modele.Serveur;

public class Epinglage {

	@Test
	void CommandeEpinglee()
	{
		Serveur serveur1 =Serveur
				.builder()
				.nom("yassine")
				.build() ;
		Commande commande= Commande
				.builder()
				.prix(10.3)
				.boisson(false)
				.build();
		serveur1.CommandeEpinglee(commande);
		assertTrue(commande.isEpinglee()==true);
	}
	@Test
	void TransmettreGendarmerie()
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
		ArrayList<Commande> commandes = new ArrayList<Commande>();
		commandes.add(commande);
		serveur2.setListeCommande(commandes);
		serveur2.TransmettreGendarmerie(commande);
		assertTrue(commande.isTransmettreGendarmerie()==true);
		assertNull(serveur2.getListeTable());
	}

}

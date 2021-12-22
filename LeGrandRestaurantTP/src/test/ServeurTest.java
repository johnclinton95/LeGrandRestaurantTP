package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import modele.Restaurant;
import modele.Serveur;
import utilities.ServerGenerator;
import utilities.ServeurBuilder;

public class ServeurTest {

	
	@SuppressWarnings("deprecation")
	@Test
	public void Serveur_2_Commandes()
    {
        // �tant donn� un serveur ayant d�j� une commande
        Serveur serveur = new ServeurBuilder().build();
        double montantPremi�reCommande = 67.8;
        serveur.PrendreCommande(montantPremi�reCommande);

        // Quand il prend une autre commande
        double montantSecondeCommande = 178;
        serveur.PrendreCommande(montantSecondeCommande);

        // Alors son chiffre d'affaires est l'addition des deux
        Assert.assertEquals(
            montantPremi�reCommande + montantSecondeCommande,
            serveur.ChiffreAffaire
        );
    }

	@SuppressWarnings("deprecation")
	public void Restaurant2Serveurs()
    {
        // �tant donn� un restaurant ayant 2 serveurs
        ArrayList<Serveur> serveurs = new ServerGenerator().Generate(2);
        Restaurant restaurant = new Restaurant(serveurs);

        // Quand chacun prend une commande
        double montantCommande = 67.8;
        
        for (Serveur serveur : serveurs) 
            serveur.PrendreCommande(montantCommande);

        // Alors le chiffre d'affaire du restaurant est la somme des deux
        Assert.assertEquals(
            montantCommande * 2,
            restaurant.chiffreAffaire()
        );
    }
}

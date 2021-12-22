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
        // Étant donné un serveur ayant déjà une commande
        Serveur serveur = new ServeurBuilder().build();
        double montantPremièreCommande = 67.8;
        serveur.PrendreCommande(montantPremièreCommande);

        // Quand il prend une autre commande
        double montantSecondeCommande = 178;
        serveur.PrendreCommande(montantSecondeCommande);

        // Alors son chiffre d'affaires est l'addition des deux
        Assert.assertEquals(
            montantPremièreCommande + montantSecondeCommande,
            serveur.ChiffreAffaire
        );
    }

	@SuppressWarnings("deprecation")
	public void Restaurant2Serveurs()
    {
        // Étant donné un restaurant ayant 2 serveurs
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

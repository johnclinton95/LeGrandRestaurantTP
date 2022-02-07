package test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.Test;

import Controller.LeGrandRestaurantController;
import Service.LeGrandRestaurantService;
import modele.Restaurant;
import modele.Serveur;
import modele.Table;

public class DebutServiceTest {
	/*
	 ÉTANT DONNE un restaurant ayant 3 tables
	QUAND le service commence
	ALORS elles sont toutes affectées au Maître d'Hôtel

	ÉTANT DONNÉ un restaurant ayant 3 tables dont une affectée à un serveur
	QUAND le service débute
	ALORS la table éditée est affectée au serveur et les deux autres au maître d'hôtel

	ÉTANT DONNÉ un restaurant ayant 3 tables dont une affectée à un serveur
	QUAND le service débute
	ALORS il n'est pas possible de modifier le serveur affecté à la table

	ÉTANT DONNÉ un restaurant ayant 3 tables dont une affectée à un serveur
	ET ayant débuté son service
	QUAND le service se termine
	ET qu'une table est affectée à un serveur
	ALORS la table éditée est affectée au serveur et les deux autres au maître d'hôtel
	 */
	@Test
	void DebutDeService()
	{
		LeGrandRestaurantService leGrandRestaurantService = new LeGrandRestaurantService();
		LeGrandRestaurantController leGrandRestaurantController= new LeGrandRestaurantController(leGrandRestaurantService);
		ArrayList<Serveur> serveurs = new ArrayList<Serveur>();
		ArrayList<Table> tables = new ArrayList<Table>();
		Serveur serveur1 =Serveur
				.builder()
				.nom("john")
				.build() ;
		Serveur serveur2 =Serveur
				.builder()
				.nom("yassine")
				.build() ;
		Table table1= new Table();
		Table table2= new Table();
		Table table3= new Table();
		tables.add(table3);
		tables.add(table1);
		tables.add(table2);
		serveurs.add(serveur1);
		serveurs.add(serveur2);
		Restaurant restaurant= new Restaurant( serveurs,tables) ;
		leGrandRestaurantController.DebutDeService(restaurant, tables);
		assertFalse(table1.isAffecteeAuServeur()==true);
		assertFalse(table2.isAffecteeAuServeur()==true);
		assertTrue(table3.isAffecteeAuServeur()==true);
		assertNull(serveur2.getListeTable());
		
		
	}

}

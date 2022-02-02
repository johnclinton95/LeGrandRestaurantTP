package test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.Test;

import modele.Restaurant;
import modele.Serveur;
import modele.Table;

public class DebutService {
	@Test
	void DebutDeService()
	{
		ArrayList<Serveur> serveurs = new ArrayList<Serveur>();
		ArrayList<Table> tables = new ArrayList<Table>();
		Serveur serveur1 =Serveur
				.builder()
				.nom("john")
				.build() ;
		Table table1= new Table();
		Table table2= new Table();
		Table table3= new Table();
		tables.add(table1);
		tables.add(table2);
		tables.add(table3);
		serveurs.add(serveur1);
		Restaurant restaurant= new Restaurant( serveurs,tables) ;
		restaurant.affectationTable(table3);
		serveur1.addTable(table3);
		assertFalse(table1.isAffecteeAuServeur()==true);
		assertFalse(table2.isAffecteeAuServeur()==true);
		assertTrue(table3.isAffecteeAuServeur()==true);
		Serveur serveur2 =Serveur
				.builder()
				.nom("yassine")
				.build() ;
		serveur2.addTable(table3);
		assertNull(serveur2.getListeTable());
	}




	

}

package test;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.Test;

import modele.Restaurant;
import modele.Serveur;
import modele.Table;

public class Installation {
	@Test
	void TableLibre()
	{
		ArrayList<Serveur> serveurs = new ArrayList<Serveur>();
		ArrayList<Table> tables = new ArrayList<Table>();
		Table table1= new Table();
		tables.add(table1);
		Serveur serveur2 =Serveur
				.builder()
				.nom("yassine")
				.build() ;
		serveurs.add(serveur2);
		Restaurant restaurant= new Restaurant( serveurs,tables) ; 
		restaurant.AddTableClient(table1);
		assertTrue(restaurant.getListeTable().contains(table1)==false);
		restaurant.RemoveTableClient(table1);
		assertTrue(restaurant.getListeTable().contains(table1)==true);
	}

}

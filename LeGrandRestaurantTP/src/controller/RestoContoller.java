package controller;



import modele.Client;
import modele.Commande;
import modele.Cuisine;
import modele.Menu;
import modele.Restaurant;
import modele.Serveur;
import modele.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class RestoContoller {

	private Commande commande;
	private Cuisine cuisine;
	private Restaurant resto;
	private Serveur server;
	private Client client;

	@RestController
	@RequestMapping(value= "/commande")
	public void PrendreCommande(Boolean TypeCommnade, Serveur serveur, Commande commande) {

		/// on augmente le chiffre d'affaire du resto
		this.resto.setChiffreAffaire(resto.getChiffreAffaire()+commande.getPrix());
		   serveur.setVente(commande);
		// on augmente la commande dans la liste de commande de la cuisine Typecommande=1 quand c'est de la nourriture
		if(TypeCommnade) // true --> manger false boisson
			cuisine.getCommandes().put(serveur, commande);

	}
	
	public void installationClient(Table table) {
		// on affecte au client une table et on retire cette table de la liste de table disponible
		client.setTable(table);
		resto.remove(table);
	}
	
	public void liberation(Client client) {
		// le client libere la table on la rajoute a la liste de table dispo dans le restau
		resto.add(client.getTable());
	}
	
	public int commandeFiliale(Menu menu) {// si le client pren
		
		return 0;
	}
}

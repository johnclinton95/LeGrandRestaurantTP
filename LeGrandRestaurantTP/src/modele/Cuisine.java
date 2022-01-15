package modele;

import java.util.Map;

public class Cuisine {
	private Restaurant resto;
	private Map<Serveur, Commande> commandes;
	

	public Cuisine(Restaurant resto, Map<Serveur, Commande> commandes) {
		super();
		this.resto = resto;
		this.commandes = commandes;
	}

	public Restaurant getResto() {
		return resto;
	}

	public void setResto(Restaurant resto) {
		this.resto = resto;
	}

	public Map<Serveur, Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(Map<Serveur, Commande> commandes) {
		this.commandes = commandes;
	}
	private void addCommande(Serveur serveur, Commande commande) {
		commandes.put(serveur, commande);
	}


}

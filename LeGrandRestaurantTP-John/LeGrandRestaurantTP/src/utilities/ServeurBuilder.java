package utilities;

import modele.Serveur;

public class ServeurBuilder {

	private String nom = "";

	 public ServeurBuilder Nommé(String nom)
     {
         this.nom = nom;
         return this;
     }

	public Serveur build() {
		return new  Serveur(nom, 0.0);
	}
}

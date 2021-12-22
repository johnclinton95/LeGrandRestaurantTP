package utilities;

import java.util.ArrayList;


import modele.Serveur;

public class ServerGenerator {
	private ServeurBuilder builder = new ServeurBuilder();

	public ServerGenerator Nomm�s(String nom)
	{
		this.builder = builder.Nomm�(nom);
		return this;
	}

	public ArrayList<Serveur> Generate(int howMany)
	{
		ArrayList<Serveur> serveurs= new ArrayList<Serveur>();
		for (var i = 0; i < howMany; i++)
		{
			serveurs.add( builder.build());
		}

		return serveurs;
	}
}
package modele;
import java.util.ArrayList;

import lombok.Builder;
import lombok.Getter;
@Getter
public class Franchise extends Restaurant{
	ArrayList<Menu> menu;
	
	@Builder
	public Franchise(ArrayList<Serveur> serveurs, ArrayList<Table> ListeTable, ArrayList<Menu> menu) {
		super(serveurs, ListeTable);
		this.menu=menu;
	}
	
	public ArrayList<Menu> getMenu() {
		return menu;
	}

	public void setMenu(ArrayList<Menu> menu) {
		this.menu = menu;
	}
	public void ChangerPrixPlat(Plat plat,double prix)
	{
		plat.setPrix(prix);
	}

}


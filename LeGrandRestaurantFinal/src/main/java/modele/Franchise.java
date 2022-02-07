package modele;
import java.util.ArrayList;

import lombok.Builder;
import lombok.Getter;
@Getter
public class Franchise extends Restaurant{
	ArrayList<Menu> menuFranchise;
	ArrayList<Menu> carteRestaurant= new ArrayList<Menu>();
	
	@Builder
	public Franchise(ArrayList<Serveur> serveurs, ArrayList<Table> ListeTable, ArrayList<Menu> menuFranchise) {
		super(serveurs, ListeTable);
		this.menuFranchise=menuFranchise;
	}
	public void CarteRestaurant() {
		carteRestaurant.addAll(menuFranchise);
		carteRestaurant.addAll(getMenuRestaurant());
	}
	
	public ArrayList<Menu> getMenuFranchise() {
		return menuFranchise;
	}

	public void setMenuFranchise(ArrayList<Menu> menuFranchise) {
		this.menuFranchise = menuFranchise;
	}
	public void ChangerPrixPlat(Plat plat,double prix)
	{
		plat.setPrix(prix);
	}

}

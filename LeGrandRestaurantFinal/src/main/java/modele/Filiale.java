package modele;
import java.util.ArrayList;

import lombok.Builder;
import lombok.Getter;


@Getter
public class Filiale extends Restaurant{
	private Franchise franchise;
	private ArrayList<Menu> menu;
	@Builder
	public Filiale(ArrayList<Serveur> serveurs, ArrayList<Table> ListeTable,Franchise franchise,ArrayList<Menu> menu) {
		super(serveurs, ListeTable);
		this.franchise=franchise;
		this.menu=menu;
	} 
	

	public Franchise getFranchise() {
		return franchise;
	}

	public void setFranchise(Franchise franchise) {
		this.franchise = franchise;
	}

	public ArrayList<Menu> getMenu() {
		return menu;
	}

	public void setMenu(ArrayList<Menu> menu) {
		this.menu = menu;
	}
	
}

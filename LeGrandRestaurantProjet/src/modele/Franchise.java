package modele;
import java.util.ArrayList;

public class Franchise extends Restaurant{
	ArrayList<Menu> menu;
	
	
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


}


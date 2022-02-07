package modele;
import java.util.ArrayList;

import lombok.AllArgsConstructor;

import lombok.Getter;



@Getter
@AllArgsConstructor
public class Restaurant {
	private ArrayList<Serveur> serveurs;
	private ArrayList<Table> ListeTable;
	private ArrayList<Table> affecteAuCLients = new ArrayList<Table>();
	private ArrayList<Menu> menuRestaurant;
	
	public Restaurant(ArrayList<Serveur> serveurs,ArrayList<Table> ListeTable) {
		this.serveurs=serveurs;
		this.ListeTable=ListeTable;
	} 
	

	public ArrayList<Menu> getMenuRestaurant() {
		return menuRestaurant;
	}
	public void setMenuRestaurant(ArrayList<Menu> menuRestaurant) {
		this.menuRestaurant = menuRestaurant;
	}
	public ArrayList<Table> TableDispon()
	{
		return ListeTable;
	}

	
	
	public void RemoveTableClient(Table table)
	{
		table.setAffecteeAuClient(false);
		affecteAuCLients.remove(table);
		ListeTable.add(table);
	}
	public void AddTableClient(Table table)
	{
		if(table.isAffecteeAuClient()==false)
		{
			table.setAffecteeAuClient(true);
			affecteAuCLients.add(table);
			ListeTable.remove(table);
		}		
	}
	
	
	
	
	public double ChiffreAffaires ()
	{
		double sum =0;
		for(Serveur i : serveurs)
		{
			sum += i.ChiffreAffaires;
		}
		return sum;
	}
    public void affectationTable(Table table)
    {
    	table.AffecteeAuServeur=true;    	
    }
	
	public ArrayList<Serveur> getServeurs() {
		return serveurs;
	}
	public void setServeurs(ArrayList<Serveur> serveurs) {
		this.serveurs = serveurs;
	}
	public ArrayList<Table> getListeTable() {
		return ListeTable;
	}
	public void setListeTable(ArrayList<Table> listeTable) {
		ListeTable = listeTable;
	}
	public ArrayList<Table> getAffecteAuCLients() {
		return affecteAuCLients;
	}
	public void setAffecteAuCLients(ArrayList<Table> affecteAuCLients) {
		this.affecteAuCLients = affecteAuCLients;
	}
	

	
}

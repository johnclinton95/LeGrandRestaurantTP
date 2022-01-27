package modele;
import java.util.ArrayList;

public class Restaurant {
	private ArrayList<Serveur> serveurs;
	private ArrayList<Table> ListeTable;
	public Restaurant(ArrayList<Serveur> serveurs,ArrayList<Table> ListeTable) {
		this.serveurs=serveurs;
		this.ListeTable=ListeTable;
	}
	public ArrayList<Table> TableDispon()
	{
		return ListeTable;
	}
	public void RemoveTable(Table table)
	{
		ListeTable.remove(table);
	}
	public void AddTable(Table table)
	{
		ListeTable.add(table);
	}
	public double ChiffreAffaires ()
	{
		double sum =0;
		for(Serveur i : serveurs)
		{
			sum=+ i.ChiffreAffaires;
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

	
}

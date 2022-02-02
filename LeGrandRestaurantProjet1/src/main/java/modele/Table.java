package modele;


public class Table {
	private int tableNumber;
	boolean AffecteeAuServeur	= false;
	boolean AffecteeAuClient	= false;
	public boolean isAffecteeAuServeur() {
		return AffecteeAuServeur;
	}
	public void setAffecteeAuServeur(boolean affecteeAuServeur) {
		AffecteeAuServeur = affecteeAuServeur;
	}
	public int getTableNumber() {
		return tableNumber;
	}
	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}
	public boolean isAffecteeAuClient() {
		return AffecteeAuClient;
	}
	public void setAffecteeAuClient(boolean affecteeAuClient) {
		AffecteeAuClient = affecteeAuClient;
	}
}

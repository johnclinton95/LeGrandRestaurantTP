package modele;

public class Client {
	private double note;
	private Table table;
	private String nom;

	public Client(String nom, Table table, double note) {
		this.nom = nom;
		this.table = table;
		this.note = note;
	}

	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}

	public boolean regleFacture() {
		return true;
	}
	public Table getTable() {
		return this.table;
	}
}

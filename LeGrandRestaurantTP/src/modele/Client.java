package modele;

public class Client {
	private double note;
	private double numeroTable;
	public double getNumeroTable() {
		return numeroTable;
	}

	public void setNumeroTable(double numeroTable) {
		this.numeroTable = numeroTable;
	}

	public Client() {

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
}

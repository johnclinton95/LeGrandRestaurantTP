package modele;

public class Client {
	private double note;
	private int numeroTable;
	
	public int getNumeroTable() {
		return numeroTable;
	}

	public void setNumeroTable(int numeroTable) {
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

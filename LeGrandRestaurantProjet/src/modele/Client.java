package modele;

public class Client {
	private double note;
	private int numeroTable;
	
	
	public Client(double note,int numeroTable) {
		this.note=note;
		this.numeroTable=numeroTable;
	}
	
	public int getNumeroTable() {
		return numeroTable;
	}

	public void setNumeroTable(int numeroTable) {
		this.numeroTable = numeroTable;
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
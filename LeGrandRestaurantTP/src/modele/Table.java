package modele;

public class Table {

	private int numeroTable;
	private boolean statut;

	public Table(int numeroTable, boolean statut) {
		super();
		this.numeroTable = numeroTable;
		this.statut = statut;
	}

	public int getNumeroTable() {
		return numeroTable;
	}

	public void setNumeroTable(int numeroTable) {
		this.numeroTable = numeroTable;
	}

	public boolean isStatut() {
		return statut;
	}

	public void setStatut(boolean statut) {
		this.statut = statut;
	}


}

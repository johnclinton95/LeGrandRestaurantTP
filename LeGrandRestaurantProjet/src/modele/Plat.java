package modele;

public class Plat {
	private String name;
	private double prix;

	public Plat(double prix, String name) {
		this.prix = prix;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	

}

package ChainOfResponsabiliteObserver;

public class Departemet {

	private String nom;
	private Budget budget;

	public Departemet(String nom, Budget budget) {
		this.nom = nom;
		this.budget = budget;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Budget getbudget() {
		return budget;
	}

	public void setbudget(Budget budget) {
		this.budget = budget;
	}

	@Override
	public String toString() {
		return "Departemet [nom=" + nom + ", budget=" + budget + "]";
	}

}

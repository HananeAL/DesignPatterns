package ChainOfResponsabiliteObserver;

import java.util.Observable;

public class Demande extends Observable {

	private double montantGlobal;
	private Etat status;
	private Departemet departemet;

	public Demande(double montantGlobal) {
		this.montantGlobal = montantGlobal;
	}

	public double getMontantGlobal() {
		return montantGlobal;
	}

	public void setMontantGlobal(double montantGlobal) {
		this.montantGlobal = montantGlobal;
	}

	public Etat getStatus() {
		return status;
	}

	public void setStatus(Etat status) {
		this.status = status;
	}

	public Departemet getDepartemet() {
		return departemet;
	}

	public void setDepartemet(Departemet departemet) {
		this.departemet = departemet;
	}

	@Override
	public String toString() {
		return "Demande [montantGlobal=" + montantGlobal + ", status=" + status + "]";
	}

}

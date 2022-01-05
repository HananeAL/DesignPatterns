package ChainOfResponsabiliteObserver;

import java.util.Observable;
import java.util.Observer;

public class Budget implements Observer {

	private double montant;
	private double montantBloque;

	public Budget(double montant, double montantBloque) {
		this.montant = montant;
		this.montantBloque = montantBloque;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public double getMontantBloque() {
		return montantBloque;
	}

	public void setMontantBloque(double montantBloque) {
		this.montantBloque = montantBloque;
	}

	@Override
	public String toString() {
		return "Budget [montant=" + montant + ", montantBloque=" + montantBloque + "]";
	}

	@Override
	public void update(Observable o, Object montant) {
		if ((Double) montant == 0)
			this.setMontant(this.montant - montantBloque);
		this.setMontantBloque((Double) montant);
	}

}

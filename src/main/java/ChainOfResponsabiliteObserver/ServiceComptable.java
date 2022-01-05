package ChainOfResponsabiliteObserver;

public class ServiceComptable extends OrderHandler {

	@Override
	public void handelRequest(Demande demande) {
		if (demande.getMontantGlobal() < demande.getDepartemet().getbudget().getMontant()) {
			demande.setStatus(Etat.APPROUVEE);
		} else
			demande.setStatus(Etat.BLOQUEE);
	}

}

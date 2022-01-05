package decorator;

public class Inondation extends AssuranceDecorator {

	public Inondation(AssuranceVoiture assuranceVoiture) {
		super(assuranceVoiture);
	}

	@Override
	public double cout() {
		return assuranceVoiture.cout() + 550;
	}

	@Override
	public void description() {
		System.out.println("Une Assurance Decorator d'Inondation");
	}

}

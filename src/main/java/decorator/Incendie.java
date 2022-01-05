package decorator;

public class Incendie extends AssuranceDecorator {

	public Incendie(AssuranceVoiture assuranceVoiture) {
		super(assuranceVoiture);
	}

	@Override
	public double cout() {
		return assuranceVoiture.cout() + 600;
	}

	@Override
	public void description() {
		System.out.println("Une Assurance Decorator d'Incendie");
	}

}

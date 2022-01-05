package decorator;

public class BrisDeGlace extends AssuranceDecorator {

	public BrisDeGlace(AssuranceVoiture assuranceVoiture) {
		super(assuranceVoiture);
	}

	@Override
	public double cout() {
		return assuranceVoiture.cout() + 700;
	}

	@Override
	public void description() {
		System.out.println("Une Assurance Decorator du Bris de glace");
	}

}

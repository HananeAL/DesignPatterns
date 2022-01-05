package decorator;

public class Vol extends AssuranceDecorator {

	public Vol(AssuranceVoiture assuranceVoiture) {
		super(assuranceVoiture);
	}

	@Override
	public double cout() {
		return assuranceVoiture.cout() + 500;
	}

	@Override
	public void description() {
		System.out.println("Une Assurance Decorator du Vol");
	}

}

package decorator;

public class DammageAndCollision extends AssuranceDecorator {

	public DammageAndCollision(AssuranceVoiture assuranceVoiture) {
		super(assuranceVoiture);
	}

	@Override
	public double cout() {
		return assuranceVoiture.cout() + 650;
	}

	@Override
	public void description() {
		System.out.println("Une Assurance Decorator du dommage et Collision");
	}

}

package decorator;

public abstract class AssuranceDecorator extends AssuranceVoiture {

	protected AssuranceVoiture assuranceVoiture;

	public AssuranceDecorator(AssuranceVoiture assuranceVoiture) {
		this.assuranceVoiture = assuranceVoiture;
	}

	public abstract double cout();

	public abstract void description();

}

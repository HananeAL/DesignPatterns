package decorator;

public class Application {

	public static void main(String[] args) {

		AssuranceVoiture responsabiliteCivile = new ResponsabiliteCivile();

		responsabiliteCivile.description();
		System.out.println(responsabiliteCivile.cout());

		responsabiliteCivile = new DammageAndCollision(responsabiliteCivile);
		responsabiliteCivile.description();
		System.out.println(responsabiliteCivile.cout());

		responsabiliteCivile = new Vol(responsabiliteCivile);
		responsabiliteCivile.description();
		System.out.println(responsabiliteCivile.cout());

		responsabiliteCivile = new BrisDeGlace(responsabiliteCivile);
		responsabiliteCivile.description();
		System.out.println(responsabiliteCivile.cout());

		responsabiliteCivile = new Incendie(responsabiliteCivile);
		responsabiliteCivile.description();
		System.out.println(responsabiliteCivile.cout());

		responsabiliteCivile = new Inondation(responsabiliteCivile);
		responsabiliteCivile.description();
		System.out.println(responsabiliteCivile.cout());

	}

}

package ChainOfResponsabiliteObserver;

public class Application {

	public static void main(String[] args) {

		Budget budget = new Budget(18000, 0);
		Departemet departement1 = new Departemet("departement1", budget);
		Demande demande = new Demande(2000);

		demande.setDepartemet(departement1);
		demande.addObserver(budget);

		System.out.println("--- Service Comptable ---");
		ServiceComptable serviceComptable = new ServiceComptable();
		serviceComptable.handelRequest(demande);
		System.out.println(demande.toString());
		System.out.println(budget.toString());

		System.out.println("--- Service Patrimoine ---");
		ServicePatrimoine servicePatrimoine = new ServicePatrimoine();
		servicePatrimoine.handelRequest(demande);
		System.out.println(demande.toString());
		System.out.println(budget.toString());

	}
}

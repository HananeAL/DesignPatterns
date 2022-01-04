package composite;

public class Application {

	public static void main(String[] args) {

		Composite racine = new Composite("category1");
		Composite comp1 = new Composite("category02");
		Composite comp2 = new Composite("category3");
		Composite comp3 = new Composite("category01");

		Leaf leaf1 = new Leaf("product1");
		Leaf leaf3 = new Leaf("product03");

		racine.addComponent(leaf1);
		racine.addComponent(comp3);
		racine.addComponent(comp1);

		comp1.addComponent(comp2);

		comp2.addComponent(leaf3);

		racine.getComponent();

		racine.removeComponent(comp1);

		racine.getComponent();
	}

}

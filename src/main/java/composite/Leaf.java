package composite;

public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void getComponent() {
		String tab = "";
		for (int i = 0; i < level; i++) {
			tab += "    ";
		}
		System.out.println(tab + name);

	}
}

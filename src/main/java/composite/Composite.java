package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	public Composite(String name) {
		super(name);

	}

	List<Component> Components = new ArrayList<>();

	@Override
	public void getComponent() {
		String tab = "";
		for (int i = 0; i < level; i++) {
			tab += "    ";
		}
		System.out.println(tab + name);

		// tout lest elets qui trouve dans folder (composite)
		for (Component c : Components) {
			c.getComponent();
		}

	}

	public Component addComponent(Component c) {
		c.level = this.level + 1;
		Components.add(c);
		return c;
	}

	public void removeComponent(Component c) {
		Components.remove(c);
	}

	public List<Component> getComponents() {
		return Components;
	}
}

package command;

import java.util.LinkedHashMap;

public class RemoteController {

	String lastRef;
	Command command;
	LinkedHashMap<String, Command> commands = new LinkedHashMap<String, Command>();

	public void addCommande(String ref, Command command) {
		commands.put(ref, command);
	}

	public void buttonLastPressed(String ref) {
		if (commands.get(ref) != null)
			commands.get(ref).execute();
		lastRef = ref;
	}

	public void CancelLastPressed() {
		commands.get(lastRef).cancel();
	}
}

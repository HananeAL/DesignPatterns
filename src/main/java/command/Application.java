package command;

public class Application {

	public static void main(String[] args) {

		RemoteController remoteController = new RemoteController();

		Tv tv = new Tv();
		Light light = new Light();
		Radio radio = new Radio();

		Command tvOnCommand = new TvOnCommand(tv);
		Command tvOffCommand = new TvOffCommand(tv);

		Command lightOnCommand = new LightOnCommand(light);
		Command lightOffCommand = new LightOffCommand(light);

		Command radioOnCommand = new RadioOnCommand(radio);
		Command radioOffCommand = new RadioOffCommand(radio);

		remoteController.addCommande("tvOn", tvOnCommand);
		remoteController.addCommande("tvOff", tvOffCommand);

		remoteController.addCommande("lightOn", lightOnCommand);
		remoteController.addCommande("lightOff", lightOffCommand);

		remoteController.addCommande("radioOn", radioOnCommand);
		remoteController.addCommande("radioOff", radioOffCommand);

		System.out.println("------- TV -------");
		System.out.print("Last button pressed : ");
		remoteController.buttonLastPressed("tvOn");
		System.out.print("Cancel the last button pressed : ");
		remoteController.CancelLastPressed();

		System.out.println("------- Light -------");
		System.out.print("Last button pressed : ");
		remoteController.buttonLastPressed("lightOn");
		System.out.print("Cancel the last button pressed :");
		remoteController.CancelLastPressed();

		System.out.println("------- Radio -------");
		System.out.print("Last button pressed : ");
		remoteController.buttonLastPressed("radioOff");
		System.out.print("Cancel the last button pressed : ");
		remoteController.CancelLastPressed();

	}
}

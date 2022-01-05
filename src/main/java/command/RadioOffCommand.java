package command;

public class RadioOffCommand implements Command {

	private Radio radio;

	public RadioOffCommand(Radio radio) {
		this.radio = radio;
	}

	@Override
	public void execute() {
		radio.off();
	}

	@Override
	public void cancel() {
		radio.on();
	}
}

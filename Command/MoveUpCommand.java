package main;

public class MoveUpCommand implements Command {
	private Screen screen;
	
	public MoveUpCommand(Screen screen) {
		this.screen = screen;
	}
	
	@Override
	public void execute() {
		screen.moveUp();
	}

}

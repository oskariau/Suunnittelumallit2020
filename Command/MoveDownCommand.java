package main;

public class MoveDownCommand implements Command {
	private Screen screen;
	
	public MoveDownCommand(Screen screen) {
		this.screen = screen;
	}
	
	@Override
	public void execute() {
		screen.moveDown();
	}

}

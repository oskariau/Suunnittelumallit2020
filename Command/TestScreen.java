package main;

public class TestScreen {
	public static void main(String[] args) {
	
		Screen screen = new Screen();
		Command moveUp = new MoveUpCommand(screen);
		Command moveDown = new MoveDownCommand(screen);
		WallButton button1 = new WallButton(moveUp);
		WallButton button2 = new WallButton(moveDown);
		
		button1.push();
		button2.push();
		button1.push();
		button2.push();
	}
}

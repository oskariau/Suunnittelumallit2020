package main;

public class Employee {
	private Boss myBoss;
	
	public Employee(Boss b) {
		myBoss = b;
	}
	
	public void askRaise(double raise) {
		myBoss.handleRaise(raise);
	}
}

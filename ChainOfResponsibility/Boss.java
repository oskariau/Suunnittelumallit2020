package main;

public abstract class Boss {
	private Boss nextBoss;
	private double highestRaiseICanHandle;
	
	public Boss(Boss b, double raise) {
		nextBoss = b;
		highestRaiseICanHandle = raise;
	}
	
	public boolean handleRaise(double raise) {
		if (raise > highestRaiseICanHandle) {
			System.out.println("I must ask my boss");
			if (nextBoss != null) {
				return nextBoss.handleRaise(raise);
			}else {
				return false;
			}
		} else {
			System.out.println("You got a raise");
			return true;
		}
		
	}
}

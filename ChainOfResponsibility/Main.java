package main;

public class Main {

	public static void main(String[] args) {
		
		Boss boss3 = new BigBoss(null);
		Boss boss2 = new MiddleBoss(boss3);
		Boss boss1 = new SmallBoss(boss2);
		
		Employee e = new Employee(boss1);

		e.askRaise(6.0);
	}

}

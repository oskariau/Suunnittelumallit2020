
public class Main {

	public static void main(String[] args) {
		
		ClockTimer ct = new ClockTimer();
		DigitalClock dc = new DigitalClock();
		
		ct.addObserver(dc);
		ct.getTime();
	}

}

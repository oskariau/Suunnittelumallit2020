import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {
	
	public DigitalClock() {}
	
	@Override
	public void update(Observable o, Object arg) {
		// Prints time given by ClockTimer
		System.out.println((String) arg);
		
	}

}

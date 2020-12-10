import java.util.GregorianCalendar;
import java.util.Observable;

public class ClockTimer extends Observable{
	
	public ClockTimer() {}
	
	public void getTime(){
		// Updates time every second and notifies Digital Clock
		while(true) {
			String time = "";
	
			GregorianCalendar calendario = new GregorianCalendar();   
			int h = calendario.get(GregorianCalendar.HOUR_OF_DAY);   
			int m = calendario.get(GregorianCalendar.MINUTE);   
			int s = calendario.get(GregorianCalendar.SECOND);   
			time += ((h < 10) ? "0" : "") + h + ":";
			time += ((m < 10) ? "0" : "") + m + ":";
			time += ((s < 10) ? "0" : "") + s;
			
			setChanged();
			notifyObservers(time);
			
			try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error Occurred.");
            }
		}
	}
}

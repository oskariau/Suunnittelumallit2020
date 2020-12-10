package composite;

import java.util.ArrayList;
import java.util.List;

public class Prosessori implements Laiteosa {
	private double hinta;
	List<Laiteosa> osat = new ArrayList<Laiteosa>();
	
	public Prosessori(double hinta) {
		this.hinta = hinta;
	}
	
	@Override
	public double getHinta() {
		double osienHinta = 0;
		for (Laiteosa i : osat) {
			osienHinta = osienHinta + i.getHinta();
		}
		return hinta + osienHinta;
	}

	@Override
	public void addOsa(Laiteosa osa) {
		osat.add(osa);
	}
}

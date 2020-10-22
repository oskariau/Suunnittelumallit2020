package abstractfactory;

public class Paita implements Vaate{
	private String merkki;
	
	public Paita(String merkki) {
		this.merkki = merkki;
	}
	
	public String toString() {
		return merkki + "-paita";
	}
}

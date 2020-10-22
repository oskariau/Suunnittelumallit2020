package abstractfactory;

public class Kengat  implements Vaate{
	private String merkki;
	
	public Kengat(String merkki) {
		this.merkki = merkki;
	}
	
	public String toString() {
		return merkki + "-kengät";
	}
}

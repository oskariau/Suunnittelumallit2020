package abstractfactory;

public class Housut  implements Vaate{
	private String merkki;
	
	public Housut(String merkki) {
		this.merkki = merkki;
	}
	
	public String toString() {
		return merkki + "-housut";
	}
}

package abstractfactory;

public class Lakki  implements Vaate{
	private String merkki;
	
	public Lakki(String merkki) {
		this.merkki = merkki;
	}
	
	public String toString() {
		return merkki + "-hattu";
	}
}

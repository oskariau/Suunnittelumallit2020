package composite;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laiteosa kotelo = new Kotelo(40);
		Laiteosa emolevy = new Emolevy(100);
		Laiteosa muistipiiri = new Muistipiiri(60);
		Laiteosa näytönohjain = new Näytönohjain(70);
		Laiteosa prosessori = new Prosessori(300);
		Laiteosa verkkokortti = new Verkkokortti(150);
		
		emolevy.addOsa(muistipiiri);
		emolevy.addOsa(prosessori);
		emolevy.addOsa(verkkokortti);
		kotelo.addOsa(emolevy);
		kotelo.addOsa(näytönohjain);
		
		System.out.println("Tietokoneen hinta: " + kotelo.getHinta());
		
	}

}
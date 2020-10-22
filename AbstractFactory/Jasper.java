package abstractfactory;

public class Jasper {
	private VaateFactory vaateFactory;
	private Vaate hattu;
	private Vaate housut;
	private Vaate paita;
	private Vaate kengat;
	
	public Jasper() {
	}

	public void setVaateFactory(VaateFactory factory) {
		vaateFactory = factory;
	}
	
	public void pue() {
		System.out.println("Jasper pukeutuu.");
		hattu = vaateFactory.pueHattu();
		kengat = vaateFactory.pueKengat();
		housut = vaateFactory.pueHousut();
		paita = vaateFactory.puePaita();
	}
	
	public void naytaVaatteet() {
		System.out.println("Jasperilla on päällä:");
		System.out.println(hattu);
		System.out.println(housut);
		System.out.println(kengat);
		System.out.println(paita);
		System.out.println();
	}

}

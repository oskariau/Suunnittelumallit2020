package abstractfactory;

public class AdidasVaateFactory implements VaateFactory {
	private String merkki = "Adidas";
	@Override
	public Vaate pueHattu() {
		return new Lakki(merkki);
	}

	@Override
	public Vaate pueKengat() {
		return new Kengat(merkki);
	}

	@Override
	public Vaate pueHousut() {
		return new Housut(merkki);
	}

	@Override
	public Vaate puePaita() {
		return new Paita(merkki);
	}
}

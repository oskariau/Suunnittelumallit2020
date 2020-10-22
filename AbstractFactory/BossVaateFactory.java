package abstractfactory;

public class BossVaateFactory implements VaateFactory {
	private String merkki = "Boss";
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

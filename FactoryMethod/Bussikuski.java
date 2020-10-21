package factorymethod;

public class Bussikuski extends AterioivaOtus{

	@Override
	public Juoma createJuoma() {
		// TODO Auto-generated method stub
		return new Maito();
	}

	@Override
	public Ruoka createRuoka() {
		// TODO Auto-generated method stub
		return new Hampurilainen();
	}
}

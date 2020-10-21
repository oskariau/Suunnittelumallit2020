package factorymethod;

public class Opiskelija extends AterioivaOtus {

	@Override
	public Juoma createJuoma() {
		// TODO Auto-generated method stub
		return new Olut();
	}

	@Override
	public Ruoka createRuoka() {
		// TODO Auto-generated method stub
		return new Banaani();
	}
}

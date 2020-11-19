
public class McDonalds extends HamburgerBuilder{
	private StringBuilder str = new StringBuilder();

	
	public StringBuilder getBurger() {
		return str;	
	}
	
	@Override
	public void buildBun() {
		str.append("Vehnäsämpylä, ");
		
	}

	@Override
	public void buildMeat() {
		str.append("Jauhelihapihvi, ");
	}

	@Override
	public void buildCheese() {
		str.append("Juusto, ");
	}

	@Override
	public void buildSalad() {
		str.append("Jäävuorisalaatti, ");
	}

	@Override
	public void buildSauce() {
		str.append("Majoneesikastike");
	}

}

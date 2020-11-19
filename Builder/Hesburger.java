import java.util.ArrayList;
import java.util.List;

import taytteet.Juusto;
import taytteet.Jäävuorisalaatti;
import taytteet.Kastike;
import taytteet.Pihvi;
import taytteet.Sämpylä;
import taytteet.Täyte;

public class Hesburger  extends HamburgerBuilder{
	List<Täyte> hamburgerList = new ArrayList<Täyte>();
	
	public List getBurger() {
		return hamburgerList;
	}
	@Override
	public void buildBun() {
		hamburgerList.add(new Sämpylä());
	}

	@Override
	public void buildMeat() {
		hamburgerList.add(new Pihvi());
	}

	@Override
	public void buildCheese() {
		hamburgerList.add(new Juusto());
	}

	@Override
	public void buildSalad() {
		hamburgerList.add(new Jäävuorisalaatti());
	}

	@Override
	public void buildSauce() {
		hamburgerList.add(new Kastike());
	}

}

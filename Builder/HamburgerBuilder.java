
public abstract class HamburgerBuilder {

	
	public void buildHamburger() {
		buildBun();
		buildMeat();
		buildCheese();
		buildSalad();
		buildSauce();
	}
	
	
	public abstract void buildBun();
	public abstract void buildMeat();
	public abstract void buildCheese();
	public abstract void buildSalad();
	public abstract void buildSauce();
}

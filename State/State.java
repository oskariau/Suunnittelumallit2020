package pokemon;

public abstract class State {
	Pokemon pokemon;
	
	State (Pokemon pokemon){
		this.pokemon = pokemon;
	}
	
	public abstract String evolve();
	public abstract String devolve();
	public abstract String getName();
	public abstract String fly();
	public abstract String eat();
	public abstract String attack();
}

package pokemon;

public class Pokemon {
	private State state;
	
	public Pokemon() {
		this.state = new FirstState(this);
	}
	
	public void changeState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}
	
	public void name() {
		System.out.println("Pokemon's name is " + state.getName());
	}
	
	public void evolve() {
		System.out.println(state.evolve());
	}
	
	public void devolve() {
		System.out.println(state.devolve());
	}
	
	public void attack() {
		System.out.println(state.attack());
	}
	
	public void eat() {
		System.out.println(state.eat());
	}
	
	public void fly() {
		System.out.println(state.fly());
	}
}

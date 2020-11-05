package pokemon;

public class FirstState extends State{
	private String name = "Charmander";

	FirstState(Pokemon pokemon) {
		super(pokemon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String evolve() {
		pokemon.changeState(new SecondState(pokemon));
		return "Pokemon evolved";
	}

	@Override
	public String devolve() {
		return "This is the lowest form";
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return name + " can't fly";
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return name + " eats apples";
	}

	@Override
	public String attack() {
		// TODO Auto-generated method stub
		return name + " attacks with Flamethrower";
	}

}

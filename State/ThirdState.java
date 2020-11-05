package pokemon;

public class ThirdState extends State{
	private String name = "Charizard";

	ThirdState(Pokemon pokemon) {
		super(pokemon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String evolve() {
		return "This is the final form.";
	}

	@Override
	public String devolve() {
		pokemon.changeState(new SecondState(pokemon));
		return "Pokemon devolved";
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return name + " can fly";
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return name + " eats horses and people";
	}

	@Override
	public String attack() {
		// TODO Auto-generated method stub
		return name + " attacks with Inferno";
	}

}

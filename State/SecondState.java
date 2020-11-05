package pokemon;

public class SecondState extends State{
	private String name = "Charmeleon";
	
	SecondState(Pokemon pokemon) {
		super(pokemon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String evolve() {
		pokemon.changeState(new ThirdState(pokemon));
		return "Pokemon evolved";
	}

	@Override
	public String devolve() {
		pokemon.changeState(new FirstState(pokemon));
		return "Pokemon devolved";
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
		return name + " eats small animals";
	}

	@Override
	public String attack() {
		// TODO Auto-generated method stub
		return name + " attacks with Dragon Breath";
	}

}

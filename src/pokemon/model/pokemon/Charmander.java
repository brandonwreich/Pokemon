package pokemon.model.pokemon;

import pokemon.model.Pokemon;
import pokemon.model.types.Fire;

public class Charmander extends Pokemon implements Fire
{
	public Charmander(int number, String name)
	{
		super(number, name);
	}

	public int Scorch()
	{
		int burnDegree = 213151;

		return burnDegree;
	}

	public int blind()
	{
		int brightness = 12;

		return brightness;
	}

	public int sizzle()
	{
		int heat = 456;

		return heat;
	}

	public int toast()
	{
		int toastness = 231;

		return toastness;
	}
}

package pokemon.model.pokemon;

import pokemon.model.Pokemon;
import pokemon.model.types.Fire;
import pokemon.model.types.Ghost;

public class Marowak extends Pokemon implements Fire, Ghost
{
	public Marowak(int number, String name)
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
	
	public int scare(String booAmount)
	{
		int damage = 1;
		
		if(booAmount.length() > 5)
		{
			damage = 1200;
		}
		
		else
		{
			damage = 2;
		}
		
		return damage;
	}
	
	public boolean disappear()
	{
		boolean didDisappear = false;
		
		return didDisappear;
	}
	
	public boolean possess()
	{
		boolean didPossess = false;
		
		return didPossess;
	}
}

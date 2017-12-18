package pokemon.model.pokemon;

import pokemon.model.Pokemon;
import pokemon.model.types.Ghost;

public class Cofarigus extends Pokemon implements Ghost
{
	public Cofarigus(int number, String name)
	{
		super(number, name);
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

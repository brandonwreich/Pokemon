package pokemon.model.pokemon;

import pokemon.model.Pokemon;
import pokemon.model.types.Ice;

public class Beartic extends Pokemon implements Ice
{
	public Beartic(int number, String name)
	{
		super(number, name);
	}
	
	public int freeze()
	{
		int cold = -45;
		
		return cold;
	}
	
	public int frostBite()
	{
		int bite = -854326;
		
		return bite;
	}
	
	public int shield()
	{
		int iceShield = 454646;
		
		return iceShield;
	}
}

package pokemon.model.pokemon;

import pokemon.model.Pokemon;
import pokemon.model.types.Ghost;
import pokemon.model.types.Ice;

public class Froslass extends Pokemon implements Ghost, Ice
{
	public Froslass()
	{
		super(478, "Froslass");
		setup();
	}
	
	public Froslass(String name)
	{
		super(478, name);
		setup();
	}
	
	public Froslass(int number, String name)
	{
		super(number, name);
		setup();
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
	
	public void setup()
	{
		this.setAttackPoints(456);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.99);
		this.setHealthPoints(1500);
	}
}

package pokemon.model.pokemon;

import pokemon.model.Pokemon;
import pokemon.model.types.Ghost;

public class Cofagrigus extends Pokemon implements Ghost
{
	public Cofagrigus()
	{
		super(563, "Cofagrigus");
		setup();
	}
	
	public Cofagrigus(String name)
	{
		super(563, name);
		setup();
	}
	
	public Cofagrigus(int number, String name)
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
	
	public void setup()
	{
		this.setAttackPoints(214);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.89);
		this.setHealthPoints(450);
	}
}

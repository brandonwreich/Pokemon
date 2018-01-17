package pokemon.model.pokemon;

import pokemon.model.*;
import pokemon.model.types.*;

public class Beartic extends Pokemon implements Ice
{
	public Beartic()
	{
		super(614, "Beartic");
		setup();
	}
	
	public Beartic(String name)
	{
		super(614, name);
		setup();
	}
	
	public Beartic(int number, String name)
	{
		super(number, name);
		setup();
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
		this.setAttackPoints(253);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.22);
		this.setHealthPoints(144);
	}
}

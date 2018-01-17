package pokemon.model.pokemon;

import pokemon.model.*;
import pokemon.model.types.*;


public class TissueBox extends Pokemon implements Derptastic
{
	public TissueBox()
	{
		super(999, "Sniffles");
		setup();
	}
	
	public TissueBox(String name)
	{
		super(999, name);
		setup();
	}
	
	public TissueBox(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	public int annoy(int level)
	{
		int annoyance = -913124;
		
		return annoyance;
	}
	
	public String sayDerpy()
	{
		return "derp derp derp derp derp";
	}
	
	public void derpDerpDerp()
	{
		
	}
	
	public void setup()
	{
		this.setAttackPoints(1);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.01);
		this.setHealthPoints(2);
	}
}

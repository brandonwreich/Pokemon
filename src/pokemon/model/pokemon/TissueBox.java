package pokemon.model.pokemon;

import pokemon.model.Pokemon;
import pokemon.model.types.Derptastic;

public class TissueBox extends Pokemon implements Derptastic
{
	public TissueBox(int number, String name)
	{
		super(number, name);
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
}

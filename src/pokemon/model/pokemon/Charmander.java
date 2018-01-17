package pokemon.model.pokemon;

import pokemon.model.*;
import pokemon.model.types.*;

public class Charmander extends Pokemon implements Fire
{
	public Charmander()
	{
		super(004, "Charmander");
		setup();
	}
	
	public Charmander(String name)
	{
		super(004, name);
		setup();
	}
	
	public Charmander(int number, String name)
	{
		super(number, name);
		setup();
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
	
	public void setup()
	{
		this.setAttackPoints(200);
		this.setCanEvolve(false);
		this.setHealthPoints(500);
		this.setEnhancementModifier(.45);
	}
}

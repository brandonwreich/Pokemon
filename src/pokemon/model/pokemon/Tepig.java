package pokemon.model.pokemon;

import pokemon.model.Pokemon;
import pokemon.model.types.Fire;

public class Tepig extends Pokemon implements Fire
{
	public Tepig()
	{
		super(498, "Tepig");
		setup();
	}
	
	public Tepig(String name)
	{
		super(498, name);
		setup();
	}
	
	public Tepig(int number, String name)
	{
		super(number, name);
		setup();
	}

	public int Scorch()
	{
		int burnDegree = 522252;
		
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
	
	protected void setup()
	{
		this.setAttackPoints(45);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.23);
		this.setHealthPoints(100);
	}
			
}

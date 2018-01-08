package pokemon.model.pokemon;

import pokemon.model.types.Fighting;
import pokemon.model.types.Fire;

public class Emboar extends Pignite implements Fire, Fighting
{
	public Emboar()
	{
		super(500, "Emboar");
		setup();
	}
	
	public Emboar(String name)
	{
		super(500, name);
		setup();
	}
	
	public Emboar(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	@Override
	protected void setup()
	{
		super.setup();
		this.setAttackPoints(10000000);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.99);
		this.setHealthPoints(10000000);
	}
}

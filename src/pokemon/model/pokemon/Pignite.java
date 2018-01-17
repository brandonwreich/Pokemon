package pokemon.model.pokemon;

import pokemon.model.types.*;

public class Pignite extends Tepig implements Fire, Fighting
{
	public Pignite()
	{
		super(499, "Pignite");
		setup();
	}

	public Pignite(String name)
	{
		super(499, name);
		setup();
	}

	public Pignite(int number, String name)
	{
		super(number, name);
		setup();
	}

	public int punch()
	{
		int punch = 12356;

		return punch;
	}

	public int kick()
	{
		int kick = 4564;

		return kick;
	}

	public int roundHouse()
	{
		int roundHouse = 1232565885;

		return roundHouse;
	}

	@Override
	protected void setup()
	{
		super.setup();
		this.setAttackPoints(100);
		this.setEnhancementModifier(.51);
		this.setHealthPoints(401);
	}
}

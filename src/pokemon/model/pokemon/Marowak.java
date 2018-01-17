package pokemon.model.pokemon;

import pokemon.model.*;
import pokemon.model.types.*;

public class Marowak extends Pokemon implements Fire, Ghost
{
	public Marowak()
	{
		super(105, "Marowak");
		setup();
	}

	public Marowak(String name)
	{
		super(105, name);
		setup();
	}

	public Marowak(int number, String name)
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

	public int scare(String booAmount)
	{
		int damage = 1;

		if (booAmount.length() > 5)
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

	private void setup()
	{
		this.setAttackPoints(500);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.99);
		this.setHealthPoints(1000);
	}
}

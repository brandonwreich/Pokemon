package pokemon.model.pokemon;

import pokemon.model.Pokemon;
import pokemon.model.types.Derptastic;

public class blank extends Pokemon implements Derptastic
{
	public blank()
	{
		super(000, "");
	}
	public blank (int number, String name)
	{
		super(number, name);
	}
	@Override
	public void derpDerpDerp()
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public int annoy(int amount)
	{
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String sayDerpy()
	{
		// TODO Auto-generated method stub
		return null;
	}
}

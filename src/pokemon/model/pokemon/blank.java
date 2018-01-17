package pokemon.model.pokemon;
/**
 * 
 * Just made this class so that my combo box would have a space in front
 * for the reset button :)
 * 
 */
import pokemon.model.*;
import pokemon.model.types.*;

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

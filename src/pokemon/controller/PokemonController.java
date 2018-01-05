package pokemon.controller;

import pokemon.view.*;
import pokemon.model.Pokemon;

import java.util.List;
import java.util.ArrayList;

/**
 * 
 * @author Brandon Reich
 * @version 12 December 2017
 *
 */
public class PokemonController
{
	private List<Pokemon> pokedex;
	private PopupDisplay popup;
	private PokemonFrame appFrame;
	
	public void start()
	{
		
	}
	
	public List<Pokemon> getPokedex()
	{
		return pokedex;
	}
	
	public boolean isValidInteger(String input)
	{
		boolean valid = false;
		
		try
		{
			Integer.parseInt(input);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("Only integer values are vaild: " + input + " is not.");
		}
		
		return valid;
	}
	
	public boolean isValidDouble(String input)
	{
		boolean valid = false;
		
		try
		{
			Double.parseDouble(input);
			valid = true;
		}
		catch (NumberFormatException error)
		{
			popup.displayText("Only double values are valid: " + input + " is not.");
		}
		
		return valid;
	}
}

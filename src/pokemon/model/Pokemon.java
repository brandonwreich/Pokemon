package pokemon.model;

import java.util.ArrayList;

/**
 * 
 * @author Brandon Reich
 * @version 14 December 2017
 *
 */
public abstract class Pokemon
{
	private int healthPoints;
	private int attackPoints;
	private double enhancementModifier;
	private int number;
	private String name;
	private boolean canEvolve;

	public Pokemon(int number, String name)

	{
		this.name = name;
		this.number = number;
	}
	
/**
 * Changes the information when selecting a pokemon
 * @return A pokemon with it's information
 */
	public String[] getPokemonTypes()
	{
		//Declare Data members
		String[] types = null;
		ArrayList<String> parentType = new ArrayList<String>();
		Class<?> currentClass = this.getClass();
	
		while (currentClass.getSuperclass() != null)
		{
			//Builds the array
			Class<?> [] pokemonTypes = currentClass.getInterfaces();
			types = new String[pokemonTypes.length];

			//Loops through each type and gets the name
			//Takes all unesscerary stuff out
			for (int index = 0; index < types.length; index++)
			{
				String currentInterface = pokemonTypes[index].getCanonicalName();
				currentInterface = currentInterface.replace(this.getClass().getPackage().getName() + ".", "");
				
				//Checks to see if it is in the list, if not it adds it
				if (!parentType.contains(currentInterface))
				{
					parentType.add(currentInterface);
				}
			}

			currentClass = currentClass.getSuperclass();
		}
		
		types = new String[parentType.size()];

		for (int index = 0; index < parentType.size(); index++)
		{
			types[index] = parentType.get(index);
		}

		return types;
	}

	public String toString()
	{
		String description = "Hi, I am " + name + ", and my HP is " + healthPoints;

		return description;
	}

	public String getPokemonInformation()
	{
		String pokemonInfo = "This pokemon is of type: " + this.getClass().getSimpleName();

		return pokemonInfo;
	}

	/**
	 * @return the healthPoints
	 */
	public int getHealthPoints()
	{
		return healthPoints;
	}

	/**
	 * @return the attackPoints
	 */
	public int getAttackPoints()
	{
		return attackPoints;
	}

	/**
	 * @return the enhancementModifier
	 */
	public double getEnhancementModifier()
	{
		return enhancementModifier;
	}

	/**
	 * @return the number
	 */
	public int getNumber()
	{
		return number;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @return the canEvolve
	 */
	public boolean isCanEvolve()
	{
		return canEvolve;
	}

	/**
	 * @param healthPoints
	 *            the healthPoints to set
	 */
	public void setHealthPoints(int healthPoints)
	{
		this.healthPoints = healthPoints;
	}

	/**
	 * @param attackPoints
	 *            the attackPoints to set
	 */
	public void setAttackPoints(int attackPoints)
	{
		this.attackPoints = attackPoints;
	}

	/**
	 * @param enhancementModifier
	 *            the enhancementModifier to set
	 */
	public void setEnhancementModifier(double enhancementModifier)
	{
		this.enhancementModifier = enhancementModifier;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @param canEvolve
	 *            the canEvolve to set
	 */
	public void setCanEvolve(boolean canEvolve)
	{
		this.canEvolve = canEvolve;
	}
}

package pokemon.view;

import pokemon.controller.*;
import javax.swing.*;

/**
 * 
 * @author Brandon Reich
 * @version 12 December 2017
 *
 */
public class PokemonFrame extends JFrame
{
	private PokemonController appController;
	private PokemonPanel appPanel;

	public PokemonFrame(PokemonController appController)
	{
		super();
		this.setAppController(appController);
		appPanel = new PokemonPanel(appController);

		setupFrame();
	}

	/**
	 * Creates the frame and sets the characteristics
	 */
	private void setupFrame()
	{
		this.setSize(500, 300);
		this.setTitle("Pokemon");
		this.setContentPane(appPanel);
		this.setResizable(false);
		this.setVisible(true);
	}

	/**
	 * @return appController
	 */
	public PokemonController getAppController()
	{
		return appController;
	}

	/**
	 * @param appController
	 */
	public void setAppController(PokemonController appController)
	{
		this.appController = appController;
	}
}

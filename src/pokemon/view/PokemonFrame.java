package pokemon.view;

import pokemon.controller.PokemonController;
import javax.swing.JFrame;

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
		this.appController = appController;
		appPanel = new PokemonPanel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(500, 500);
		this.setTitle("Pokemon");
		this.setContentPane(appPanel);
		this.setResizable(false);
		this.setVisible(true);
	}
}

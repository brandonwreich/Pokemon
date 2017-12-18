package pokemon.view;

import pokemon.controller.PokemonController;
import javax.swing.JPanel;
import javax.swing.*;

/**
 * 
 * @author Brandon Reich
 * @version 12 December 2017
 *
 */
public class PokemonPanel extends JPanel
{
	private PokemonController appController;
	
	private JLabel pictureLabel;
	private JLabel numberLabel;
	private JLabel nameLabel;
	private JLabel evolveLabel;
	private JLabel healthLabel;
	private JLabel attackLabel;
	
	private JTextArea numberArea;
	private JTextArea nameArea;
	private JTextArea healthArea;
	private JTextArea attackArea;
	private JTextArea textArea;
	private JTextArea textArea2;
	
	private JButton loadButton;
	private JButton saveButton;
	private JButton resetButton;
	
	private JCheckBox canEvolveBox;
	
	private JComboBox comboBox;
	
	private SpringLayout appLayout;
	
	
	public PokemonPanel(PokemonController appController)
	{
		super();
		this.appController = appController;
		appLayout = new SpringLayout();
		
		pictureLabel = new JLabel("");
		numberLabel = new JLabel("Number");
		evolveLabel = new JLabel("Can Evolve");
		healthLabel = new JLabel("Health");
		attackLabel = new JLabel("Attack");
		
		numberArea = new JTextArea(5, 5);
		nameArea = new JTextArea(5, 5);
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}

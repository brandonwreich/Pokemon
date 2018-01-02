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
	private JLabel modifierLabel;
	
	private JTextField numberField;
	private JTextField nameField;
	private JTextField healthField;
	private JTextField attackField;
	private JTextField modifierField;
	
	private JTextArea descriptionArea;
	private JTextArea typeArea;
	
	private JButton saveButton;
	private JButton resetButton;
	
	private JCheckBox canEvolveBox;
	
	private JComboBox pokedexDropdown;
	
	private SpringLayout appLayout;
	
	private JPanel firstType;
	private JPanel secondType;
	private JPanel thirdType;
	private JPanel fourthType;
	
	
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

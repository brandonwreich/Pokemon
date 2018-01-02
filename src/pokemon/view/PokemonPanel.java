package pokemon.view;

import pokemon.controller.PokemonController;
import pokemon.model.Pokemon;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;

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
	private SpringLayout appLayout;
	
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
	
	private JPanel firstType;
	private JPanel secondType;
	private JPanel thirdType;
	private JPanel fourthType;
	
	
	private void updatePokedexInfo(int index)
	{
		nameField.setText(appController.getPokedex().get(index).getName());
		canEvolveBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex().get(index).getNumber() + "");
		attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
		modifierField.setText(appController.getPokedex().get(index).getEnhancementModifier() + "");
	}
	
	public PokemonPanel(PokemonController appController)
	{
		super();
		this.appController = appController;
		appLayout = new SpringLayout();
		
		//Labels
		pictureLabel = new JLabel(getName());
		numberLabel = new JLabel("Number");
		nameLabel = new JLabel("Name");
		
		evolveLabel = new JLabel("Can Evolve");
		healthLabel = new JLabel("Health");	
		attackLabel = new JLabel("Attack");
		modifierLabel = new JLabel("Enhancment Modifier");
		
		
		//TextFields
		numberField = new JTextField(20);
		nameField = new JTextField(20);
		healthField = new JTextField(20);
		attackField = new JTextField(20);
		modifierField = new JTextField(20);
		
		//TextAreas
		descriptionArea = new JTextArea(10, 25);
		typeArea = new JTextArea(10, 25);
		
		//Buttons
		saveButton = new JButton("Save");
		resetButton = new JButton("Reset");
		
		//Check box
		canEvolveBox = new JCheckBox();
		
		//Combo Box
		pokedexDropdown = new JComboBox<Pokemon>();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		
		//Labels
		this.add(pictureLabel);
		this.add(numberLabel);
		this.add(nameLabel);
		this.add(evolveLabel);
		this.add(healthLabel);
		this.add(attackLabel);
		this.add(modifierLabel);
		
//		//Text Fields
//		this.add(numberField);
//		this.add(nameField);
//		this.add(healthField);
//		this.add(attackField);
//		this.add(modifierField);
//		
//		//Text Areas
//		this.add(descriptionArea);
//		this.add(typeArea);
//		
//		//Buttons
//		this.add(saveButton);
//		this.add(resetButton);
//		
//		//Check Box
//		this.add(canEvolveBox);
//		
//		//Combo Box
//		this.add(pokedexDropdown);
	}
	
	private void setupLayout()
	{
		//Name Label
		nameLabel.setFont(new Font("Times", Font.BOLD | Font.PLAIN, 12));
		nameLabel.setEnabled(true);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, -120, SpringLayout.EAST, this);
		
		//Number Label
		numberLabel.setFont(new Font("Times", Font.BOLD | Font.PLAIN, 12));
		numberLabel.setEnabled(false);
		
		
	}
	
	private void setupListeners()
	{
		
	}
}

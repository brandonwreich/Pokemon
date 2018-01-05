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
		numberField = new JTextField(10);
		nameField = new JTextField(10);
		healthField = new JTextField(10);	
		attackField = new JTextField(10);
		modifierField = new JTextField(10);

		
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
		this.add(nameLabel);
		this.add(numberLabel);
		this.add(evolveLabel);
		this.add(attackLabel);
		this.add(healthLabel);
		this.add(modifierLabel);
		this.add(pictureLabel);		
		
		//Text Fields
		this.add(nameField);
		this.add(numberField);
		this.add(attackField);
		this.add(healthField);
		this.add(modifierField);
		
//		//Text Areas
//		this.add(descriptionArea);
//		this.add(typeArea);
//		
//		//Buttons
//		this.add(saveButton);
//		this.add(resetButton);
//		
		//Check Box
		this.add(canEvolveBox);
//		
//		//Combo Box
//		this.add(pokedexDropdown);
	}
	
	private void setupLayout()
	{
		//Name Label
		nameLabel.setFont(new Font("Times", Font.BOLD | Font.PLAIN, 12));
		nameLabel.setEnabled(false);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.WEST, numberLabel);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 5, SpringLayout.NORTH, nameField);
		
		//Number Label
		numberLabel.setFont(new Font("Times", Font.BOLD | Font.PLAIN, 12));
		numberLabel.setEnabled(false);
		appLayout.putConstraint(SpringLayout.WEST, numberLabel, 0, SpringLayout.WEST, evolveLabel);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 5, SpringLayout.NORTH, numberField);
		
		//Evolve Label
		evolveLabel.setFont(new Font("Times", Font.BOLD | Font.PLAIN, 12));
		evolveLabel.setEnabled(false);
		appLayout.putConstraint(SpringLayout.EAST, evolveLabel, -180, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, evolveLabel, -11, SpringLayout.NORTH, attackLabel);
		
		//Attack Label
		attackLabel.setFont(new Font("Times", Font.BOLD | Font.PLAIN, 12));
		attackLabel.setEnabled(false);
		appLayout.putConstraint(SpringLayout.EAST, attackField, 0, SpringLayout.EAST, nameField);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 0, SpringLayout.WEST, nameLabel);

		//Health Label
		healthLabel.setFont(new Font("Times", Font.BOLD | Font.PLAIN, 12));
		healthLabel.setEnabled(false);
		appLayout.putConstraint(SpringLayout.WEST, healthLabel, 0, SpringLayout.WEST, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 5, SpringLayout.NORTH, healthField);

		//Enhancement Modifier Label
		modifierLabel.setFont(new Font("Times", Font.BOLD | Font.PLAIN, 12));
		modifierLabel.setEnabled(false);
		appLayout.putConstraint(SpringLayout.WEST, modifierLabel, 0, SpringLayout.WEST, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, modifierLabel, 5, SpringLayout.NORTH, modifierField);
		
		//Name Text Field
		nameField.setFont(new Font("Times", Font.BOLD | Font.PLAIN, 12));
		nameField.setEnabled(false);
		appLayout.putConstraint(SpringLayout.EAST, nameField, -10, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, nameField, 5, SpringLayout.NORTH, this);
		
		//Number Field
		numberField.setFont(new Font("Times", Font.BOLD | Font.PLAIN, 12));
		numberField.setEnabled(false);
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 6, SpringLayout.SOUTH, nameField);
		appLayout.putConstraint(SpringLayout.WEST, numberField, 0, SpringLayout.WEST, nameField);
		
		//Attack Field
		attackField.setFont(new Font("Times", Font.BOLD | Font.PLAIN, 12));
		attackField.setEnabled(false);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 28, SpringLayout.SOUTH, numberField);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 5, SpringLayout.NORTH, attackField);
		
		//Health Field
		healthField.setFont(new Font("Times", Font.BOLD | Font.PLAIN, 12));
		healthField.setEditable(false);
		appLayout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 6, SpringLayout.SOUTH, attackField);
		
		//Enhancement Modifier Field
		modifierField.setFont(new Font("Times", Font.BOLD | Font.PLAIN, 12));
		modifierField.setEnabled(false);	
		appLayout.putConstraint(SpringLayout.NORTH, modifierField, 6, SpringLayout.SOUTH, healthField);
		appLayout.putConstraint(SpringLayout.EAST, modifierField, 0, SpringLayout.EAST, nameField);
		
		//Description Area
		descriptionArea.setFont(new Font("Times", Font.BOLD | Font.PLAIN, 12));
		descriptionArea.setEditable(false);
		descriptionArea.setEnabled(false);
		descriptionArea.setWrapStyleWord(true);
		descriptionArea.setLineWrap(true);
		descriptionArea.setDisabledTextColor(Color.BLACK);
		descriptionArea.setBackground(Color.WHITE);
		
		//Can Evolve Check Box
		canEvolveBox.setEnabled(false);
		appLayout.putConstraint(SpringLayout.WEST, canEvolveBox, 0, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.SOUTH, canEvolveBox, 25, SpringLayout.SOUTH, numberField);
	}
	
	private void setupListeners()
	{
		
	}
}

package pokemon.view;

import pokemon.controller.*;
import pokemon.model.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

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
	private JLabel iconLabel;

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

	public PokemonPanel(PokemonController appController)
	{
		super();
		this.appController = appController;
		appLayout = new SpringLayout();

		// Labels
		pictureLabel = new JLabel(getName());
		numberLabel = new JLabel("Number");
		nameLabel = new JLabel("Name");
		evolveLabel = new JLabel("Can Evolve");
		healthLabel = new JLabel("Health");
		attackLabel = new JLabel("Attack");
		modifierLabel = new JLabel("Enhancment Modifier");
		iconLabel = new JLabel(new ImageIcon(getClass().getResource("pokemon.view.images/PokeBall.png")), SwingConstants.CENTER);

		// TextFields
		numberField = new JTextField(10);
		nameField = new JTextField(10);
		healthField = new JTextField(10);
		attackField = new JTextField(10);
		modifierField = new JTextField(10);

		// TextAreas
		descriptionArea = new JTextArea(5, 15);
		typeArea = new JTextArea(5, 15);

		// Buttons
		saveButton = new JButton("Save");
		resetButton = new JButton("Reset");
		appLayout.putConstraint(SpringLayout.EAST, iconLabel, 132, SpringLayout.WEST, resetButton);

		// Check box
		canEvolveBox = new JCheckBox();

		// Combo Box
		pokedexDropdown = new JComboBox<Pokemon>();

		// Panel Types
		firstType = new JPanel();
		secondType = new JPanel();

		setupComboBox();
		setupTypePanels();
		setupPanel();
		setupLayout();
		setupListeners();
	}

	/**
	 * Will update the text fields based upon which pokemon you selected in the combo box.
	 * 
	 * @param index
	 */
	private void updatePokedexInfo(int index)
	{
		// Update Basic Fields
		nameField.setText(appController.getPokedex().get(index).getName());
		canEvolveBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex().get(index).getNumber() + "");
		attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
		modifierField.setText(appController.getPokedex().get(index).getEnhancementModifier() + "");

		// Update Text Areas
		descriptionArea.setText(appController.getPokedex().get(index).toString());
		typeArea.setText("");

		for (String current : appController.getPokedex().get(index).getPokemonTypes())
		{
			typeArea.append(current + "\n");
		}
	}

	/**
	 * Sets up the J Combo Box
	 */
	private void setupComboBox()
	{
		DefaultComboBoxModel pokemonModel = new DefaultComboBoxModel(appController.convertPokedex());
		pokedexDropdown.setModel(pokemonModel);
	}

	private void setupTypePanels()
	{
		firstType.setSize(50, 50);
		secondType.setSize(50, 50);
	}

	/**
	 * Initializes the elements
	 */
	private void setupPanel()
	{
		this.setLayout(appLayout);

		// Labels
		this.add(nameLabel);
		this.add(numberLabel);
		this.add(evolveLabel);
		this.add(attackLabel);
		this.add(healthLabel);
		this.add(modifierLabel);
		this.add(pictureLabel);
		this.add(iconLabel);

		// Text Fields
		this.add(nameField);
		this.add(numberField);
		this.add(attackField);
		this.add(healthField);
		this.add(modifierField);

		// Text Areas
		this.add(descriptionArea);
		this.add(typeArea);

		// Buttons
		this.add(saveButton);
		this.add(resetButton);

		// Check Box
		this.add(canEvolveBox);

		// Combo Box
		this.add(pokedexDropdown);

		// Panel Types
		this.add(firstType);
		this.add(secondType);
	}

	private void updateImage()
	{
		String path = "pokemon.view.images/";
		String defaultName = "PokeBall";
		String name = pokedexDropdown.getSelectedItem().toString();
		String extension = ".png";
		ImageIcon pokemonIcon;

		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
		}
		catch (NullPointerException missingImageFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}

		iconLabel.setIcon(pokemonIcon);
	}

	/**
	 * Changes the color of the background based upon the type of pokemon it is.
	 */
	private void updateTypePanels()
	{
		String[] types = appController.getPokedex().get(pokedexDropdown.getSelectedIndex()).getPokemonTypes();

		if (types[0].equals("Fighting"))
		{
			firstType.setBackground(Color.RED);
		}
		else if (types[0].equals("Fire"))
		{
			firstType.setBackground(Color.ORANGE);
		}
		else if (types[0].equals("Ghost"))
		{
			firstType.setBackground(Color.DARK_GRAY);
		}
		else if (types[0].equals("Ice"))
		{
			firstType.setBackground(Color.BLUE);
		}

		if (types.length > 1)
		{
			if (types[1].equals("Fighting"))
			{
				secondType.setBackground(new Color(235, 78, 57));
			}
		}
	}

	/**
	 * Sets up my layout. Gives each element the characteristics I want. Places my elements where I want
	 * them.
	 */
	private void setupLayout()
	{
		// Name Label
		nameLabel.setFont(new Font("Times", Font.BOLD | Font.PLAIN, 12));
		nameLabel.setEnabled(true);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.WEST, numberLabel);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 5, SpringLayout.NORTH, nameField);

		// Number Label
		numberLabel.setFont(new Font("Times", Font.BOLD | Font.PLAIN, 12));
		numberLabel.setEnabled(true);
		appLayout.putConstraint(SpringLayout.WEST, numberLabel, 0, SpringLayout.WEST, evolveLabel);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 5, SpringLayout.NORTH, numberField);

		// Evolve Label
		evolveLabel.setFont(new Font("Times", Font.BOLD | Font.PLAIN, 12));
		evolveLabel.setEnabled(true);
		appLayout.putConstraint(SpringLayout.EAST, evolveLabel, -180, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, evolveLabel, -11, SpringLayout.NORTH, attackLabel);

		// Attack Label
		attackLabel.setFont(new Font("Times", Font.BOLD | Font.PLAIN, 12));
		attackLabel.setEnabled(true);
		appLayout.putConstraint(SpringLayout.EAST, attackField, 0, SpringLayout.EAST, nameField);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 0, SpringLayout.WEST, nameLabel);

		// Health Label
		healthLabel.setFont(new Font("Times", Font.BOLD | Font.PLAIN, 12));
		healthLabel.setEnabled(true);
		appLayout.putConstraint(SpringLayout.WEST, healthLabel, 0, SpringLayout.WEST, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 5, SpringLayout.NORTH, healthField);

		// Enhancement Modifier Label
		modifierLabel.setFont(new Font("Times", Font.BOLD | Font.PLAIN, 12));
		modifierLabel.setEnabled(true);
		appLayout.putConstraint(SpringLayout.WEST, modifierLabel, 0, SpringLayout.WEST, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, modifierLabel, 5, SpringLayout.NORTH, modifierField);

		// Icon Label
		appLayout.putConstraint(SpringLayout.NORTH, iconLabel, 0, SpringLayout.NORTH, pictureLabel);
		appLayout.putConstraint(SpringLayout.WEST, iconLabel, 32, SpringLayout.EAST, pictureLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, iconLabel, 110, SpringLayout.NORTH, pictureLabel);

		// Name Text Field
		nameField.setFont(new Font("Times", Font.BOLD | Font.PLAIN, 12));
		nameField.setEnabled(true);
		nameField.setEditable(true);
		nameField.setToolTipText("Name");
		appLayout.putConstraint(SpringLayout.EAST, nameField, -10, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, nameField, 5, SpringLayout.NORTH, this);

		// Number Field
		numberField.setFont(new Font("Times", Font.BOLD | Font.PLAIN, 12));
		numberField.setEnabled(true);
		numberField.setEditable(true);
		numberField.setToolTipText("Poke Number");
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 6, SpringLayout.SOUTH, nameField);
		appLayout.putConstraint(SpringLayout.WEST, numberField, 0, SpringLayout.WEST, nameField);

		// Attack Field
		attackField.setFont(new Font("Times", Font.BOLD | Font.PLAIN, 12));
		attackField.setEnabled(true);
		attackField.setEditable(true);
		attackField.setToolTipText("Attack Points");
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 28, SpringLayout.SOUTH, numberField);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 5, SpringLayout.NORTH, attackField);

		// Health Field
		healthField.setFont(new Font("Times", Font.BOLD | Font.PLAIN, 12));
		healthField.setEditable(true);
		healthField.setEnabled(true);
		healthField.setToolTipText("Helath Points");
		appLayout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 6, SpringLayout.SOUTH, attackField);

		// Enhancement Modifier Field
		modifierField.setFont(new Font("Times", Font.BOLD | Font.PLAIN, 12));
		modifierField.setEnabled(true);
		modifierField.setEditable(true);
		modifierField.setToolTipText("Enhancment Modifier");
		appLayout.putConstraint(SpringLayout.NORTH, modifierField, 6, SpringLayout.SOUTH, healthField);
		appLayout.putConstraint(SpringLayout.EAST, modifierField, 0, SpringLayout.EAST, nameField);

		// Description Area
		descriptionArea.setFont(new Font("Times", Font.BOLD | Font.PLAIN, 12));
		descriptionArea.setEditable(false);
		descriptionArea.setEnabled(true);
		descriptionArea.setWrapStyleWord(true);
		descriptionArea.setLineWrap(true);
		descriptionArea.setDisabledTextColor(Color.BLACK);
		descriptionArea.setBackground(Color.WHITE);
		descriptionArea.setToolTipText("Description");
		appLayout.putConstraint(SpringLayout.NORTH, descriptionArea, 35, SpringLayout.SOUTH, modifierField);
		appLayout.putConstraint(SpringLayout.EAST, descriptionArea, -48, SpringLayout.EAST, this);

		// Type Area
		typeArea.setFont(new Font("Times", Font.BOLD | Font.PLAIN, 12));
		typeArea.setEditable(false);
		typeArea.setEnabled(false);
		typeArea.setWrapStyleWord(true);
		typeArea.setLineWrap(true);
		typeArea.setDisabledTextColor(Color.BLACK);
		typeArea.setBackground(Color.WHITE);
		appLayout.putConstraint(SpringLayout.NORTH, typeArea, 0, SpringLayout.NORTH, descriptionArea);
		appLayout.putConstraint(SpringLayout.WEST, typeArea, 48, SpringLayout.WEST, this);

		// Can Evolve Check Box
		canEvolveBox.setEnabled(false);

		if (canEvolveBox.isSelected() == true)
		{
			canEvolveBox.setToolTipText("Can Evolve");
		}
		else
		{
			canEvolveBox.setToolTipText("Can't Evolve");
		}

		appLayout.putConstraint(SpringLayout.WEST, canEvolveBox, 0, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.SOUTH, canEvolveBox, 25, SpringLayout.SOUTH, numberField);

		// Reset Button
		resetButton.setEnabled(true);
		resetButton.setFont(new Font("Times", Font.BOLD | Font.PLAIN, 12));
		resetButton.setToolTipText("Reset");
		appLayout.putConstraint(SpringLayout.NORTH, resetButton, 0, SpringLayout.NORTH, saveButton);
		appLayout.putConstraint(SpringLayout.WEST, resetButton, 10, SpringLayout.WEST, this);

		// Save Button
		saveButton.setEnabled(true);
		saveButton.setFont(new Font("Times", Font.BOLD | Font.PLAIN, 12));
		saveButton.setToolTipText("Save");
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, 0, SpringLayout.NORTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.EAST, saveButton, -27, SpringLayout.WEST, modifierLabel);

		// JCombo Box
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 0, SpringLayout.WEST, pictureLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, pokedexDropdown, -6, SpringLayout.NORTH, saveButton);
		appLayout.putConstraint(SpringLayout.EAST, pokedexDropdown, -10, SpringLayout.EAST, saveButton);

	}

	private void setupListeners()
	{
		saveButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				if (appController.isValidInteger(attackField.getText()) && appController.isValidInteger(healthField.getText()) && appController.isValidDouble(modifierField.getText()))
				{
					int selection = pokedexDropdown.getSelectedIndex();
					int health = Integer.parseInt(healthField.getText());
					int attack = Integer.parseInt(attackField.getText());
					double modify = Double.parseDouble(modifierField.getText());
					String name = nameField.getText();
					boolean evolve = canEvolveBox.isSelected();

					// Send to the controller to modify the pokemon
					appController.updateSelected(selection, health, attack, evolve, modify, name);
				}
			}

		});

		resetButton.addActionListener(new ActionListener()

		{

			public void actionPerformed(ActionEvent click)
			{

			}

		});

		pokedexDropdown.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent selection)
			{
				int selectedPokemonIndex = pokedexDropdown.getSelectedIndex();
				updatePokedexInfo(selectedPokemonIndex);
				updateImage();
				updateTypePanels();
				repaint();
			}
		});
	}

}

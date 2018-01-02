package pokemon.view;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class PopupDisplay
{
		private ImageIcon icon;
		private String windowTitle;

		public PopupDisplay()
		{
			icon = new ImageIcon(getClass().getResource("PopupPika"));
			windowTitle = "Ummmm";
		}

		public void displayText(String message)
		{
			JOptionPane.showMessageDialog(null, message, windowTitle, JOptionPane.INFORMATION_MESSAGE, icon);
		}
}

import java.awt.FontFormatException;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.JButton;

public class Nupukuular implements ActionListener {
	public static String taht = "";

	public void actionPerformed(ActionEvent e) {
		String nupp = e.getActionCommand();
		switch (nupp) {
		case "Start":
			try {
				new GameWindow();
			} catch (FontFormatException | IOException e1) {
				e1.printStackTrace();
			}
			break;
		case "Exit":
			System.exit(0);
		default:
			JButton bt = (JButton) e.getSource();
			bt.setEnabled(false);
			Nupukuular.taht = (e.getActionCommand()).toLowerCase();
			KosmoseOdysseia.Arva();
		}
	}
}

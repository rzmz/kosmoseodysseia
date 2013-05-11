import java.awt.Desktop;
import java.awt.FontFormatException;
import java.awt.event.*;
import java.io.File;
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
		case "Highscore":
			if (Desktop.isDesktopSupported()) {
				try {
					Desktop.getDesktop().edit(new File("highscore.txt"));
				} catch (IOException e1) {
					e1.printStackTrace();
					System.err.println("Ei saa Highscore faili avada.");
				}
			} else {
				System.err.println("Ei saa Highscore faili avada.");
			}
			break;
		case "Options":
			break;
		default:
			JButton bt = (JButton) e.getSource();
			bt.setEnabled(false);
			Nupukuular.taht = (e.getActionCommand()).toLowerCase();
			KosmoseOdysseia.Arva();
		}
	}
}

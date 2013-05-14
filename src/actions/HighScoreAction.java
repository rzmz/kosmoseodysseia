package actions;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.AbstractAction;

public class HighScoreAction extends AbstractAction {
	
	private static final long serialVersionUID = -1401878596198647763L;

	public HighScoreAction(){
		super("Edetabel");
	}
	
	public void actionPerformed(ActionEvent e) {
		if (Desktop.isDesktopSupported()) {
			try {
				Desktop.getDesktop().edit(new File("highscore.txt"));
			} catch (IOException e1) {
				e1.printStackTrace();
				System.err.println("Ei saa Highscore faili avada.");
			}
		}
	}
}

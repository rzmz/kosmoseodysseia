package actions;

import kosmos.GameWindow;

import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.swing.AbstractAction;

public class StartAction extends AbstractAction {

	private static final long serialVersionUID = 888841888359206779L;

	public StartAction(){
		super("Alusta");
	}
	
	public void actionPerformed(ActionEvent e) {
		try {
			new GameWindow();
		} catch (FontFormatException | IOException e1) {
			e1.printStackTrace();
		}
	}

}

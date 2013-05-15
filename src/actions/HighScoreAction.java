package actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import kosmos.HighScoreWindow;

public class HighScoreAction extends AbstractAction {
	
	private static final long serialVersionUID = -1401878596198647763L;

	public HighScoreAction(){
		super("Edetabel");
	}
	
	public void actionPerformed(ActionEvent e) {
		new HighScoreWindow();
	}
}

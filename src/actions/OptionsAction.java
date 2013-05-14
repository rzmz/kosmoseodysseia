package actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

public class OptionsAction extends AbstractAction {

	private static final long serialVersionUID = -6646853743472831596L;

	public OptionsAction(){
		super("Suvandid");
	}
	
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Veel implementeerimata!");
	}

}

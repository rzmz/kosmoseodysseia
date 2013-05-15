package actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import kosmos.StartWindow;

public class BackButtonAction extends AbstractAction {

	private static final long serialVersionUID = -811320562924872083L;

	public void actionPerformed(ActionEvent e) {
		StartWindow.StartMenu();
	}
}

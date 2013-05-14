package actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class ExitAction extends AbstractAction {
	
	private static final long serialVersionUID = -450620152500745345L;

	public ExitAction(){
		super("Välju");
	}
	
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	
}

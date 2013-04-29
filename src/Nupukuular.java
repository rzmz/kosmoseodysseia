import java.awt.event.*;

import javax.swing.JButton;

public class Nupukuular implements ActionListener {
	public static String taht = "";

	public void actionPerformed(ActionEvent e) {
		JButton bt=(JButton)e.getSource();
		bt.setEnabled(false);
		Nupukuular.taht = (e.getActionCommand()).toLowerCase();

	}
}

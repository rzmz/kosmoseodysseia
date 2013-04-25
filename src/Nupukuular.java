import java.awt.event.*;

public class Nupukuular implements ActionListener {
	public static String taht = "";

	public void actionPerformed(ActionEvent e) {
		Nupukuular.taht = (e.getActionCommand()).toLowerCase();

	}
}

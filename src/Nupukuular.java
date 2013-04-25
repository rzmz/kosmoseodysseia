import java.awt.event.*;

public class Nupukuular implements ActionListener {
	public static String taht;
	public static String getTaht() {
		return taht;
	}
	public void setTaht(String taht) {
		this.taht = taht;
	}
	synchronized public void actionPerformed(ActionEvent e) {
		taht=e.getActionCommand();
	}

}

import java.awt.event.*;

public class Nupukuular implements ActionListener {
	public static String taht="";
	public String getTaht() {
		return taht;
	}
	public void setTaht(String taht) {
		Nupukuular.taht = taht;
	}
	public void actionPerformed(ActionEvent e) {
		Nupukuular.taht=(e.getActionCommand()).toLowerCase();
	}

}

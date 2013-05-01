import java.io.File;

import javax.swing.JOptionPane;

public class Peaklass {
	public static void main(String[] args) {
		JOptionPane
				.showMessageDialog(
						null,
						"Tere tulemast, kartmatu piloot!\nMängu eesmärgiks on tunda kosmoseteemalist teooriat ning saata rakett kuule.");
		new Thread(Sound.play).start();
		new JoonistaFreim();
	}
}

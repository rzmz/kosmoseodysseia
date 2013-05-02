import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Klahvikuular extends JPanel implements KeyListener {
	private static final long serialVersionUID = 1L;
	static boolean isLeftDown = false;
	static boolean isRightDown = false;
	static boolean isUpDown = false;

	public Klahvikuular() {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int kood = e.getKeyCode();
		char taht = e.getKeyChar();
		switch (taht) {
		case 'a':
			(JoonistaFreim.A).setEnabled(false);
			Nupukuular.taht = "a";
			break;
		case 'b':
			(JoonistaFreim.B).setEnabled(false);
			Nupukuular.taht = "b";
			break;
		case 'c':
			(JoonistaFreim.C).setEnabled(false);
			Nupukuular.taht = "c";
			break;
		case 'd':
			(JoonistaFreim.D).setEnabled(false);
			Nupukuular.taht = "d";
			break;
		case 'e':
			(JoonistaFreim.E).setEnabled(false);
			Nupukuular.taht = "e";
			break;
		case 'f':
			(JoonistaFreim.F).setEnabled(false);
			Nupukuular.taht = "f";
			break;
		case 'g':
			(JoonistaFreim.G).setEnabled(false);
			Nupukuular.taht = "g";
			break;
		case 'h':
			(JoonistaFreim.H).setEnabled(false);
			Nupukuular.taht = "h";
			break;
		case 'i':
			(JoonistaFreim.I).setEnabled(false);
			Nupukuular.taht = "i";
			break;
		case 'j':
			(JoonistaFreim.J).setEnabled(false);
			Nupukuular.taht = "j";
			break;
		case 'k':
			(JoonistaFreim.K).setEnabled(false);
			Nupukuular.taht = "k";
			break;
		case 'l':
			(JoonistaFreim.L).setEnabled(false);
			Nupukuular.taht = "l";
			break;
		case 'm':
			(JoonistaFreim.M).setEnabled(false);
			Nupukuular.taht = "m";
			break;
		case 'n':
			(JoonistaFreim.N).setEnabled(false);
			Nupukuular.taht = "n";
			break;
		case 'o':
			(JoonistaFreim.O).setEnabled(false);
			Nupukuular.taht = "o";
			break;
		case 'p':
			(JoonistaFreim.P).setEnabled(false);
			Nupukuular.taht = "p";
			break;
		case 'q':
			(JoonistaFreim.Q).setEnabled(false);
			Nupukuular.taht = "q";
			break;
		case 'r':
			(JoonistaFreim.R).setEnabled(false);
			Nupukuular.taht = "r";
			break;
		case 's':
			(JoonistaFreim.S).setEnabled(false);
			Nupukuular.taht = "s";
			break;
		case 'š':
			(JoonistaFreim.Ss).setEnabled(false);
			Nupukuular.taht = "š";
			break;
		case 'z':
			(JoonistaFreim.Z).setEnabled(false);
			Nupukuular.taht = "z";
			break;
		case 'ž':
			(JoonistaFreim.Zz).setEnabled(false);
			Nupukuular.taht = "ž";
			break;
		case 't':
			(JoonistaFreim.T).setEnabled(false);
			Nupukuular.taht = "t";
			break;
		case 'u':
			(JoonistaFreim.U).setEnabled(false);
			Nupukuular.taht = "u";
			break;
		case 'v':
			(JoonistaFreim.V).setEnabled(false);
			Nupukuular.taht = "v";
			break;
		case 'w':
			(JoonistaFreim.W).setEnabled(false);
			Nupukuular.taht = "w";
			break;
		case 'õ':
			(JoonistaFreim.Oo).setEnabled(false);
			Nupukuular.taht = "õ";
			break;
		case 'ä':
			(JoonistaFreim.Aa).setEnabled(false);
			Nupukuular.taht = "ä";
			break;
		case 'ö':
			(JoonistaFreim.Oi).setEnabled(false);
			Nupukuular.taht = "ö";
			break;
		case 'ü':
			(JoonistaFreim.Uu).setEnabled(false);
			Nupukuular.taht = "ü";
			break;
		case 'x':
			(JoonistaFreim.X).setEnabled(false);
			Nupukuular.taht = "x";
			break;
		case 'y':
			(JoonistaFreim.Y).setEnabled(false);
			Nupukuular.taht = "y";
			break;
		default:
//			 System.out.println(kood);
			switch (kood) {
			case 38:
				isUpDown = true;
				break;
			case 39:
				isRightDown = true;
				break;
			case 37:
				isLeftDown = true;
				break;
			case 27:
				JoonistaFreim.StartMenu();
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int kood = e.getKeyCode();
		switch (kood) {
		case 38:
			isUpDown = false;
			break;
		case 39:
			isRightDown = false;
			break;
		case 37:
			isLeftDown = false;
			break;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
}

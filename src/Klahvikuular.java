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
			Nupukuular.taht = "a";
			(GameWindow.A).setEnabled(false);
			break;
		case 'b':
			Nupukuular.taht = "b";
			(GameWindow.B).setEnabled(false);
			break;
		case 'c':
			Nupukuular.taht = "c";
			(GameWindow.C).setEnabled(false);
			break;
		case 'd':
			Nupukuular.taht = "d";
			(GameWindow.D).setEnabled(false);
			break;
		case 'e':
			Nupukuular.taht = "e";
			(GameWindow.E).setEnabled(false);
			break;
		case 'f':
			Nupukuular.taht = "f";
			(GameWindow.F).setEnabled(false);
			break;
		case 'g':
			Nupukuular.taht = "g";
			(GameWindow.G).setEnabled(false);
			break;
		case 'h':
			Nupukuular.taht = "h";
			(GameWindow.H).setEnabled(false);
			break;
		case 'i':
			Nupukuular.taht = "i";
			(GameWindow.I).setEnabled(false);
			break;
		case 'j':
			Nupukuular.taht = "j";
			(GameWindow.J).setEnabled(false);
			break;
		case 'k':
			Nupukuular.taht = "k";
			(GameWindow.K).setEnabled(false);
			break;
		case 'l':
			Nupukuular.taht = "l";
			(GameWindow.L).setEnabled(false);
			break;
		case 'm':
			Nupukuular.taht = "m";
			(GameWindow.M).setEnabled(false);
			break;
		case 'n':
			Nupukuular.taht = "n";
			(GameWindow.N).setEnabled(false);
			break;
		case 'o':
			Nupukuular.taht = "o";
			(GameWindow.O).setEnabled(false);
			break;
		case 'p':
			Nupukuular.taht = "p";
			(GameWindow.P).setEnabled(false);
			break;
		case 'q':
			Nupukuular.taht = "q";
			(GameWindow.Q).setEnabled(false);
			break;
		case 'r':
			Nupukuular.taht = "r";
			(GameWindow.R).setEnabled(false);
			break;
		case 's':
			Nupukuular.taht = "s";
			(GameWindow.S).setEnabled(false);
			break;
		case 'š':
			Nupukuular.taht = "š";
			(GameWindow.Ss).setEnabled(false);
			break;
		case 'z':
			Nupukuular.taht = "z";
			(GameWindow.Z).setEnabled(false);
			break;
		case 'ž':
			Nupukuular.taht = "ž";
			(GameWindow.Zz).setEnabled(false);
			break;
		case 't':
			Nupukuular.taht = "t";
			(GameWindow.T).setEnabled(false);
			break;
		case 'u':
			Nupukuular.taht = "u";
			(GameWindow.U).setEnabled(false);
			break;
		case 'v':
			Nupukuular.taht = "v";
			(GameWindow.V).setEnabled(false);
			break;
		case 'w':
			Nupukuular.taht = "w";
			(GameWindow.W).setEnabled(false);
			break;
		case 'õ':
			Nupukuular.taht = "õ";
			(GameWindow.Oo).setEnabled(false);
			break;
		case 'ä':
			Nupukuular.taht = "ä";
			(GameWindow.Aa).setEnabled(false);
			break;
		case 'ö':
			Nupukuular.taht = "ö";
			(GameWindow.Oi).setEnabled(false);
			break;
		case 'ü':
			Nupukuular.taht = "ü";
			(GameWindow.Uu).setEnabled(false);
			break;
		case 'x':
			Nupukuular.taht = "x";
			(GameWindow.X).setEnabled(false);
			break;
		case 'y':
			Nupukuular.taht = "y";
			(GameWindow.Y).setEnabled(false);
			break;
		default:
			System.out.println(kood);
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
				StartWindow.StartMenu();
			}
		}
		KosmoseOdysseia.Arva();
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

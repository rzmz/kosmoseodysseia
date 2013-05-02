import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.swing.*;
import javax.swing.border.Border;

public class JoonistaFreim extends JFrame {

	private static final long serialVersionUID = 6814320761507411061L;

	static JButton A = new JButton("A");
	static JButton B = new JButton("B");
	static JButton C = new JButton("C");
	static JButton D = new JButton("D");
	static JButton E = new JButton("E");
	static JButton F = new JButton("F");
	static JButton G = new JButton("G");
	static JButton H = new JButton("H");
	static JButton I = new JButton("I");
	static JButton J = new JButton("J");
	static JButton K = new JButton("K");
	static JButton L = new JButton("L");
	static JButton M = new JButton("M");
	static JButton N = new JButton("N");
	static JButton O = new JButton("O");
	static JButton P = new JButton("P");
	static JButton Q = new JButton("Q");
	static JButton R = new JButton("R");
	static JButton S = new JButton("S");
	static JButton Ss = new JButton("Š");
	static JButton Z = new JButton("Z");
	static JButton Zz = new JButton("Ž");
	static JButton T = new JButton("T");
	static JButton U = new JButton("U");
	static JButton V = new JButton("V");
	static JButton W = new JButton("W");
	static JButton Oo = new JButton("Õ");
	static JButton Aa = new JButton("Ä");
	static JButton Oi = new JButton("Ö");
	static JButton Uu = new JButton("Ü");
	static JButton X = new JButton("X");
	static JButton Y = new JButton("Y");
	static JButton nupud[] = { A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P,
			Q, R, S, Ss, Z, Zz, T, U, V, W, Oo, Aa, Oi, Uu, X, Y };
	static char tahed[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
			'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 'š', 'z', 'ž', 't',
			'u', 'v', 'w', 'õ', 'ä', 'ö', 'ü', 'x', 'y' };
	static JFrame frame;
	static Container container;
	Font font = new Font("Press Start 2P", Font.PLAIN, 8);

	public JoonistaFreim() throws FontFormatException, IOException {
		GraphicsEnvironment ge = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(
				"PressStart2P.ttf")));
//		 GraphicsEnvironment e = GraphicsEnvironment
//		 .getLocalGraphicsEnvironment();
//		 String[] fontnames = e.getAvailableFontFamilyNames();
//		 System.out.println("\nFonts available on this platform: ");
//		 for (int i = 0; i < fontnames.length; i++)
//		 System.out.println(fontnames[i]);
		
		frame = new JFrame("Kosmose Odüsseia");
		frame.setSize(new Dimension(600, 500));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
	    frame.setLocationRelativeTo(null);  

		container = frame.getContentPane();
		container.setLayout(new BorderLayout());  

		Paint obj = new Paint();
		obj.setPreferredSize(new Dimension(350, 330));

		container.add(obj, BorderLayout.NORTH);

		JPanel paneel1 = new JPanel();
//		container.add(paneel1, BorderLayout.CENTER);

		JTextArea textArea = new JTextArea("Tekst", 15, 50);

		textArea.setFont(font);
		textArea.setForeground(Color.WHITE);
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
	    textArea.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));   
		paneel1.add(textArea);
		textArea.selectAll();
		textArea.replaceSelection("kala");
		container.add(textArea, BorderLayout.CENTER);

		KosmoseOdysseia mang = new KosmoseOdysseia(textArea);
		JPanel paneel2 = new JPanel(new GridLayout(4, 8));
		JPanel paneel3 = new JPanel(new FlowLayout());

		for (int i = 0; i < nupud.length; i++) {
			nupud[i].addActionListener(new Nupukuular());
			nupud[i].addKeyListener(new Klahvikuular());
			nupud[i].setFont(font);
			nupud[i].setForeground(Color.WHITE);
			nupud[i].setBackground(Color.BLACK);
			paneel2.add(nupud[i]);
		}

		paneel3.add(paneel2);
		container.add(paneel3, BorderLayout.SOUTH);
		
		frame.setBackground(Color.BLACK);
		container.setBackground(Color.BLACK);
		paneel3.setBackground(Color.BLACK);
		paneel2.setBackground(Color.BLACK);
		paneel1.setBackground(Color.BLACK);
		textArea.setBackground(Color.BLACK);
		
		frame.setVisible(true);

		textArea.addKeyListener(new Klahvikuular());

		try {
			mang.Alusta();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}

		frame.setVisible(true);

	}

	public static void enableAllButtons() {
		for (int i = 0; i < nupud.length; i++) {
			nupud[i].setEnabled(true);
		}
	}

	static public void StartMenu() {
		container.removeAll();
		JPanel paneel = new JPanel();
		for (int i = 0; i < nupud.length; i++) {
			nupud[i].addActionListener(new Nupukuular());
			nupud[i].addKeyListener(new Klahvikuular());
			paneel.add(nupud[i]);
		}
		container.add(paneel);
		container.revalidate();
		container.repaint();
		// Sound.run=false;
	}
}

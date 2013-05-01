import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

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
	private JFrame frame;

	public JoonistaFreim() {
		frame = new JFrame("Kosmose Odüsseia");
		frame.setSize(new Dimension(600, 500));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

		Container container = frame.getContentPane();
		container.setLayout(new BorderLayout());

		Paint obj = new Paint();
		obj.setPreferredSize(new Dimension(343, 270));
		container.add(obj, BorderLayout.NORTH);

		JPanel paneel1 = new JPanel();
		container.add(paneel1, BorderLayout.CENTER);

		JTextArea textArea = new JTextArea("Tekst", 60, 50);

		textArea.setFont(new Font("Courier", Font.PLAIN, 12));
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);

		paneel1.add(new JScrollPane(textArea));
		textArea.selectAll();
		textArea.replaceSelection("kala");

		KosmoseOdysseia mang = new KosmoseOdysseia(textArea);
		JPanel paneel2 = new JPanel(new GridLayout(4, 8));
		JPanel paneel3 = new JPanel(new FlowLayout());

		for (int i = 0; i < nupud.length; i++) {
			nupud[i].addActionListener(new Nupukuular());
			nupud[i].addKeyListener(new Klahvikuular());
			paneel2.add(nupud[i]);
		}

		paneel3.add(paneel2);
		container.add(paneel3, BorderLayout.SOUTH);

		frame.setVisible(true);

		textArea.addKeyListener(new Klahvikuular());

		try {
			mang.Alusta();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		frame.setVisible(true);

	}

	public static void enableAllButtons() {
		for (int i = 0; i < nupud.length; i++) {
			nupud[i].setEnabled(true);
		}

	}
}

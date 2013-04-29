import java.awt.*;

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

	public JoonistaFreim() {
		setScreenSize();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("KosmoseOdüsseia");
		setResizable(false);

		Container container = getContentPane();
		container.setLayout(new BorderLayout());

		JPanel paneel1 = new JPanel();
		container.add(paneel1, BorderLayout.NORTH);

		JTextArea textArea = new JTextArea("Tekst", getHeight() / 24,
				getWidth() / 12);
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
			paneel2.add(nupud[i]);
		}

		paneel3.add(paneel2);
		container.add(paneel3, BorderLayout.CENTER);
		setVisible(true);
		try {
			mang.Alusta();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		setVisible(true);

	}

	private void setScreenSize() {
		final Dimension screenSize = Toolkit.getDefaultToolkit()
				.getScreenSize();
		setSize(600, 500);
	}

	public static void enableAllButtons() {
		for (int i = 0; i < nupud.length; i++) {
			nupud[i].setEnabled(true);
		}

	}
}

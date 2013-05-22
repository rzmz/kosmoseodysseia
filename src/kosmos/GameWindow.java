package kosmos;

import java.awt.*;
import java.io.IOException;

import javax.swing.*;

public class GameWindow extends JFrame {

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
	static JButton nupud[] = { A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, Ss, Z, Zz, T, U, V, W, Oo, Aa, Oi, Uu, X, Y };
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int width = (int)Math.round(screenSize.getWidth());
	int height = (int)Math.round(screenSize.getHeight());

	static JDialog Loading;
	JLabel LoadingText = new JLabel();
	
	static Paint obj = new Paint();

	public GameWindow() throws FontFormatException, IOException {
		KosmoseOdysseia.isBeginning=true;

		// Loading dialoog;
		Loading = new JDialog(this, true);
		Loading.setUndecorated(true);
		Loading.getContentPane().setBackground(Color.BLACK);
		LoadingText.setForeground(Color.WHITE);
		LoadingText.setFont(StartWindow.font);
		Loading.setLocationRelativeTo(StartWindow.frame);
		Loading.getContentPane().add(LoadingText);
		Loading.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Loading.setSize(100, 30);
		Loading.setOpacity(0.75f);
		Thread stuffToDo = new Thread() {
			public void run() {
				try {
					LoadingText.setText("Tegutsen...");
					Thread.sleep(1000);
					Loading.dispose();
				} catch (Exception e) {
					System.out.println("Error in Gamewindow: " + e);
				}
			}
		};
		stuffToDo.start();
		Loading.setVisible(true);

		(StartWindow.container).removeAll();

		Paint.ImagePanel();
		obj.setPreferredSize(new Dimension(350, 320));
		(StartWindow.container).revalidate();
		(StartWindow.container).repaint();
		(StartWindow.container).add(obj, BorderLayout.NORTH);

		JTextArea textArea = new JTextArea("Tekst", 15, 50);

		textArea.setFont(StartWindow.font);
		textArea.setForeground(Color.WHITE);
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		textArea.selectAll();
		
		(StartWindow.container).add(textArea, BorderLayout.CENTER);

		new KosmoseOdysseia(textArea);
		JPanel paneel2 = new JPanel(new GridLayout(4, 8));
		JPanel paneel3 = new JPanel(new FlowLayout());

		for (int i = 0; i < nupud.length; i++) {
			nupud[i].addActionListener(new Nupukuular());
			nupud[i].addKeyListener(new Klahvikuular());
			nupud[i].setFont(StartWindow.font);
			nupud[i].setForeground(Color.WHITE);
			nupud[i].setBackground(Color.BLACK);
			int a = 5;
			nupud[i].setBorder(BorderFactory.createEmptyBorder(a, a * 2, a,
					a * 2));
			paneel2.add(nupud[i]);
		}

		paneel3.add(paneel2);
		(StartWindow.container).add(paneel3, BorderLayout.SOUTH);

		paneel3.setBackground(Color.BLACK);
		paneel2.setBackground(Color.BLACK);
		textArea.setBackground(Color.BLACK);
		obj.setBackground(Color.BLACK);

		(StartWindow.container).requestFocusInWindow();
		(StartWindow.container).addKeyListener(new Klahvikuular());

		obj.addMouseListener(new Hiirekuular());

		try {
			KosmoseOdysseia.Alusta();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}

	}

	public static void enableAllButtons() {
		for (int i = 0; i < nupud.length; i++) {
			nupud[i].setEnabled(true);
		}
	}

}

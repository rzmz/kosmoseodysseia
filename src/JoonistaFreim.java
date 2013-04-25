import java.awt.*;
import javax.swing.*;

public class JoonistaFreim extends JFrame {

	private static final long serialVersionUID = 6814320761507411061L;

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

		JButton A = new JButton("A");
		JButton B = new JButton("B");
		JButton C = new JButton("C");
		JButton D = new JButton("D");
		JButton E = new JButton("E");
		JButton F = new JButton("F");
		JButton G = new JButton("G");
		JButton H = new JButton("H");
		JButton I = new JButton("I");
		JButton J = new JButton("J");
		JButton K = new JButton("K");
		JButton L = new JButton("L");
		JButton M = new JButton("M");
		JButton N = new JButton("N");
		JButton O = new JButton("O");
		JButton P = new JButton("P");
		JButton Q = new JButton("Q");
		JButton R = new JButton("R");
		JButton S = new JButton("S");
		JButton Ss = new JButton("Š");
		JButton Z = new JButton("Z");
		JButton Zz = new JButton("Ž");
		JButton T = new JButton("T");
		JButton U = new JButton("U");
		JButton V = new JButton("V");
		JButton W = new JButton("W");
		JButton Oo = new JButton("Õ");
		JButton Aa = new JButton("Ä");
		JButton Oi = new JButton("Ö");
		JButton Uu = new JButton("Ü");
		JButton X = new JButton("X");
		JButton Y = new JButton("Y");

		A.addActionListener(new Nupukuular());
		B.addActionListener(new Nupukuular());
		C.addActionListener(new Nupukuular());
		D.addActionListener(new Nupukuular());
		E.addActionListener(new Nupukuular());
		F.addActionListener(new Nupukuular());
		G.addActionListener(new Nupukuular());
		H.addActionListener(new Nupukuular());
		I.addActionListener(new Nupukuular());
		J.addActionListener(new Nupukuular());
		K.addActionListener(new Nupukuular());
		L.addActionListener(new Nupukuular());
		M.addActionListener(new Nupukuular());
		N.addActionListener(new Nupukuular());
		O.addActionListener(new Nupukuular());
		P.addActionListener(new Nupukuular());
		Q.addActionListener(new Nupukuular());
		R.addActionListener(new Nupukuular());
		S.addActionListener(new Nupukuular());
		Ss.addActionListener(new Nupukuular());
		Z.addActionListener(new Nupukuular());
		Zz.addActionListener(new Nupukuular());
		T.addActionListener(new Nupukuular());
		U.addActionListener(new Nupukuular());
		V.addActionListener(new Nupukuular());
		W.addActionListener(new Nupukuular());
		Oo.addActionListener(new Nupukuular());
		Aa.addActionListener(new Nupukuular());
		Oi.addActionListener(new Nupukuular());
		Uu.addActionListener(new Nupukuular());
		X.addActionListener(new Nupukuular());
		Y.addActionListener(new Nupukuular());

		JPanel paneel2 = new JPanel(new GridLayout(4, 8));
		JPanel paneel3 = new JPanel(new FlowLayout());
		paneel2.add(A);
		paneel2.add(B);
		paneel2.add(C);
		paneel2.add(D);
		paneel2.add(E);
		paneel2.add(F);
		paneel2.add(G);
		paneel2.add(H);
		paneel2.add(I);
		paneel2.add(J);
		paneel2.add(K);
		paneel2.add(L);
		paneel2.add(M);
		paneel2.add(N);
		paneel2.add(O);
		paneel2.add(P);
		paneel2.add(Q);
		paneel2.add(R);
		paneel2.add(S);
		paneel2.add(Ss);
		paneel2.add(Z);
		paneel2.add(Zz);
		paneel2.add(T);
		paneel2.add(U);
		paneel2.add(V);
		paneel2.add(W);
		paneel2.add(Oo);
		paneel2.add(Aa);
		paneel2.add(Oi);
		paneel2.add(Uu);
		paneel2.add(X);
		paneel2.add(Y);
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
}

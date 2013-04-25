
import java.awt.*;
import javax.swing.*;

public class JoonistaFreim extends JFrame {
	
	private static final long serialVersionUID = 6814320761507411061L;

	public JoonistaFreim() throws InterruptedException
	{		
	    setScreenSize();
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setTitle("KosmoseOdüsseia");
	    setResizable(false);
	    
	    Container container = getContentPane();
	    container.setLayout(new BorderLayout());
	    
	    JPanel paneel1 = new JPanel();
	    container.add(paneel1, BorderLayout.NORTH);
	    
	    JTextArea textArea = new JTextArea("Tekst", getHeight()/24, getWidth()/12);
	    textArea.setFont(new Font("Courier", Font.PLAIN, 11));
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
		JButton Š = new JButton("Š");
		JButton Z = new JButton("Z");
		JButton Ž = new JButton("Ž");
		JButton T = new JButton("T");
		JButton U = new JButton("U");
		JButton V = new JButton("V");
		JButton W = new JButton("W");
		JButton Õ = new JButton("Õ");
		JButton Ä = new JButton("Ä");
		JButton Ö = new JButton("Ö");
		JButton Ü = new JButton("Ü");
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
		Š.addActionListener(new Nupukuular());
		Z.addActionListener(new Nupukuular());
		Ž.addActionListener(new Nupukuular());
		T.addActionListener(new Nupukuular());
		U.addActionListener(new Nupukuular());
		V.addActionListener(new Nupukuular());
		W.addActionListener(new Nupukuular());
		Õ.addActionListener(new Nupukuular());
		Ä.addActionListener(new Nupukuular());
		Ö.addActionListener(new Nupukuular());
		Ü.addActionListener(new Nupukuular());
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
		paneel2.add(Š);
		paneel2.add(Z);
		paneel2.add(Ž);
		paneel2.add(T);
		paneel2.add(U);
		paneel2.add(V);
		paneel2.add(W);
		paneel2.add(Õ);
		paneel2.add(Ä);
		paneel2.add(Ö);
		paneel2.add(Ü);
		paneel2.add(X);
		paneel2.add(Y);
		paneel3.add(paneel2);
		container.add(paneel3, BorderLayout.CENTER);
		setVisible(true);
		mang.Alusta();

	    setVisible(true);

	}

	private void setScreenSize(){
        final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(600, 500);
	}
}

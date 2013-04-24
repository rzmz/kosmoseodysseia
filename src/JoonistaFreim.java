
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JoonistaFreim extends JFrame {
	
	private static final long serialVersionUID = 6814320761507411061L;

	public JoonistaFreim()
	{		
	    setScreenSize();
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setTitle("KosmoseOdüsseia");
	    setResizable(true);
	    
	    Container container = getContentPane();
	    container.setLayout(new FlowLayout());
	    
	    JPanel panel = new JPanel();
	    container.add(panel);
	    
	    JTextArea textArea = new JTextArea("Tekst", 40, 80);
	    textArea.setFont(new Font("Courier", Font.PLAIN, 11));
	    textArea.setEditable(false);
	    panel.add(new JScrollPane(textArea));
	    
	    textArea.selectAll();
	    textArea.replaceSelection("kala");
	    
		KosmoseOdysseia mang = new KosmoseOdysseia(textArea);
		mang.Alusta();

	    setVisible(true);

	}

	private void setScreenSize(){
        final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width, screenSize.height);
	}
}

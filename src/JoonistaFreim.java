
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JoonistaFreim extends JFrame {
	
	private static final long serialVersionUID = 6814320761507411061L;

	public JoonistaFreim()
	{		
	    setScreenSize();
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setTitle("KosmoseOdüsseia");
	    setVisible(true);
	    setResizable(true);
	    
	    Container sisu = getContentPane();
	    sisu.setLayout(new FlowLayout());
	    JLabel silt = new JLabel("KosmoseOdüsseia");
	    sisu.add(silt);
	}

	private void setScreenSize(){
        final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width, screenSize.height);
	}
}

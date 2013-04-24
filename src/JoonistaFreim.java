
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class JoonistaFreim extends JFrame {
	
	public JoonistaFreim()
	{		
	    setScreenSize();
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setTitle("KosmoseOdüsseia");
	    setVisible(true);
	    setResizable(true);
	}

	private void setScreenSize(){
        final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width, screenSize.height);
	}
	
	public void paint(Graphics g){
		
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.lightGray);
				
		// joonistame testiks horisontaalsed gridline'id
		for(int i = 0; i < getWidth(); i = i + 10) {
			g2.drawLine(i, 0, i, getHeight());
		}
		
		// joonistame testiks vertikaalsed gridline'id
		for(int j = 0; j < getHeight(); j = j + 10) {
			g2.drawLine(0, j, getWidth(), j);			
		}
		
	}
	
	private static final long serialVersionUID = 1L;

}
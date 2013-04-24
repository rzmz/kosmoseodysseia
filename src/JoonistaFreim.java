
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class JoonistaFreim extends JFrame {
	
	public JoonistaFreim()
	{
		
	    setScreen();

//	    Dimension d = getSize();

	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setTitle("KosmoseOdüsseia");
	    setLocation(new Point(0,0));
	    setVisible(true);
	}

	private void setScreen(){
        final GraphicsConfiguration config = getGraphicsConfiguration();

        final int left = Toolkit.getDefaultToolkit().getScreenInsets(config).left;
        final int right = Toolkit.getDefaultToolkit().getScreenInsets(config).right;
        final int top = Toolkit.getDefaultToolkit().getScreenInsets(config).top;
        final int bottom = Toolkit.getDefaultToolkit().getScreenInsets(config).bottom;

        final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        final int width = screenSize.width - left - right;
        final int height = screenSize.height - top - bottom;

        setResizable(false);
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        setVisible(true);		
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
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Paint extends JPanel {
	private static final long serialVersionUID = 1L;
	private BufferedImage nightsky;
	private BufferedImage rocket;
	int x = 0;
	int y = -830;
	int deltaX = 1;
	int deltaY = 2;
	int y1 = -1090;

	public void ImagePanel() {
		try {
			nightsky = ImageIO.read(new File("nightsky.png"));
			rocket = ImageIO.read(new File("rocket.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		ImagePanel();
		if (y >= 0 && y < 270) {
			g.drawImage(nightsky, x, y1, null);
			y1 = y1 + deltaY;
		}
		if (y == 270) {
			y = y1;
			y1 = -1090;
		}
		y = y + deltaY;
		g.drawImage(nightsky, x, y, null);
		g.drawImage(rocket, 250, 25, null);
		repaint();
	}

}

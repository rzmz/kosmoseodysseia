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

	public void ImagePanel() {
		try {
			nightsky = ImageIO.read(new File("nightsky.jpg"));
			rocket = ImageIO.read(new File("rocket.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		ImagePanel();
		g.drawImage(nightsky, 0, 0, null);
		g.drawImage(rocket, 250, 25, null);

	}

}

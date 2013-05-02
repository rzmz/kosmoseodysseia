import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Paint extends JPanel {
	private static final long serialVersionUID = 1L;
	private BufferedImage nightsky;
	private BufferedImage rocket;
	int x = -1200;
	int y = -800;
	int deltaX0 = 2;
	int deltaX = deltaX0;
	int deltaY0 = 2;
	int deltaY = deltaY0;
	int y1 = -1090;
	AffineTransformOp op;
	int p = 0;

	public void ImagePanel() {
		try {
			nightsky = ImageIO.read(new File("space.png"));
			rocket = ImageIO.read(new File("rocket.png"));
			double rotationRequired = Math.toRadians(p);
			double locationX = rocket.getWidth() / 2;
			double locationY = rocket.getHeight() / 2;
			AffineTransform tx = AffineTransform.getRotateInstance(
					rotationRequired, locationX, locationY);
			op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		if (deltaY == deltaY0 && Klahvikuular.isUpDown) {
			deltaY = deltaY0 + 2;
		}
		if (deltaY == (deltaY0 + 2) && Klahvikuular.isUpDown == false) {
			deltaY = deltaY0;
		}
		super.paintComponent(g);
		ImagePanel();
		if (y >= 0 && y < 270) {
			g.drawImage(nightsky, x, y1, null);
			y1 = y1 + deltaY;
		}
		if (y > 269) {
			y = y1;
			y1 = -1090;
		}
		y = y + deltaY;
		g.drawImage(nightsky, x, y, null);
		// g.drawImage(rocket, 250, 25, null);
		g.drawImage(op.filter(rocket, null), 240, 100, null);
		if (Klahvikuular.isLeftDown)
			p--;
		else if (Klahvikuular.isRightDown)
			p++;

//		x = x - p / 10;
//		if (p != 0)
//			y = y - 1 / p;
		
		repaint();
	}

}

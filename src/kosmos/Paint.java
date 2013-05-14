package kosmos;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Paint extends JPanel {
	private static final long serialVersionUID = 1L;
	static BufferedImage space;
	static BufferedImage rocket;
	static BufferedImage mutebutton;
	static BufferedImage SoundON;
	static BufferedImage SoundOFF;
	static String mutebuttonpath = "SoundON.png";
	static String SoundONpath = "SoundON.png";
	static String SoundOFFpath = "SoundOFF.png";
	int x = -1200;
	int y = -800;
	int deltaX0 = 1;
	int deltaX = deltaX0;
	int deltaY0 = 1;
	int deltaY = deltaY0;
	int y1 = -1090;
	// static AffineTransformOp op;
	// static int p = 0;
	static int skoor = 0;

	// double rotationRequired;
	// static double locationX;
	// static double locationY;

	public BufferedImage makeTranslucent(BufferedImage source, float alpha) {
		Graphics2D g2d = source.createGraphics();
		g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC, alpha));
		g2d.drawImage(source, 0, 0, null);
		g2d.dispose();
		return source;
	}

	public static void ImagePanel() {
		try {
			space = ImageIO.read(new File("space.png"));
			rocket = ImageIO.read(new File("rocket.png"));
			SoundON = ImageIO.read(new File(SoundONpath));
			SoundOFF = ImageIO.read(new File(SoundOFFpath));
			if (mutebutton == null)
				mutebutton = SoundON;
			// double rotationRequired = Math.toRadians(p);
			// locationX = rocket.getWidth() / 2;
			// locationY = rocket.getHeight() / 2;
			// AffineTransform tx = AffineTransform.getRotateInstance(
			// rotationRequired, locationX, locationY);
			// op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		if (deltaY == deltaY0 && Klahvikuular.isUpDown) {
			deltaY = deltaY0 + 1;
		}
		if (deltaY == (deltaY0 + 1) && Klahvikuular.isUpDown == false) {
			deltaY = deltaY0;
		}
		super.paintComponent(g);
		if (y >= 0 && y < 270) {
			g.drawImage(space, x, y1, null);
			y1 = y1 + deltaY;
		}
		if (y > 269) {
			y = y1;
			y1 = -1090;
		}
		y = y + deltaY;
		g.drawImage(space, x, y, null);
		// g.drawImage(op.filter(rocket, null), 250, 110, null);
		g.drawImage(rocket, 250, 110, null);
		g.drawImage(mutebutton, 560, 10, null);
		// if (Klahvikuular.isLeftDown)
		// p = p - 1;
		// else if (Klahvikuular.isRightDown)
		// p = p + 1;
		//
		// x = x - p / 10;
		// if (p != 0)
		// y = y - 1 / p;
		g.setColor(Color.WHITE);
		g.setFont(StartWindow.font);
		g.drawString("Skoor: " + Integer.toString(skoor), 10, 20);
		repaint();
	}

}
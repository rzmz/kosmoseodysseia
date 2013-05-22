package kosmos;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageFilter;
import java.awt.image.ImageProducer;
import java.awt.image.RGBImageFilter;
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
	static int skoor = 0;
	static boolean explosionEnded = false;
	private int numFrames = 4;
	private int currentFrame = 0;
	static boolean explosionStart = true;

	static Image[] explosionFrames = new Image[4];

	public void playExplosion(Graphics g, Image[] frames) {
		if (explosionStart) {
			Thread ExplosionPlay = new Thread(
					(new Sound("explosion.wav", false)).play);
			ExplosionPlay.start();
		}
		explosionStart = false;
		g.drawImage(frames[currentFrame], 230, 90, null);
		currentFrame++;
		if (currentFrame >= numFrames) {
			currentFrame = 0;
			explosionEnded = true;
		}
	}

	public BufferedImage makeTranslucent(BufferedImage source, float alpha) {
		Graphics2D g2d = source.createGraphics();
		g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC, alpha));
		g2d.drawImage(source, 0, 0, null);
		g2d.dispose();
		return source;
	}

	public static Image makeColorTransparent(Image im, final Color color) {
		ImageFilter filter = new RGBImageFilter() {
			public int markerRGB = color.getRGB() | 0xFF000000;

			public final int filterRGB(int x, int y, int rgb) {
				if ((rgb | 0xFF000000) == markerRGB) {
					return 0x00FFFFFF & rgb;
				} else {
					return rgb;
				}
			}
		};

		ImageProducer ip = new FilteredImageSource(im.getSource(), filter);
		return Toolkit.getDefaultToolkit().createImage(ip);
	}

	public static void ImagePanel() {
		try {
			for (int i = 0; i < 4; i++) {

				explosionFrames[i] = makeColorTransparent(
						ImageIO.read(new File("frame" + (i + 1) + ".png")),
						Color.WHITE);
			}
			space = ImageIO.read(new File("space.png"));
			rocket = ImageIO.read(new File("rocket.png"));
			SoundON = ImageIO.read(new File(SoundONpath));
			SoundOFF = ImageIO.read(new File(SoundOFFpath));
			if (mutebutton == null)
				mutebutton = SoundON;
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
		g.drawImage(mutebutton, 560, 10, null);
		g.setColor(Color.WHITE);
		g.setFont(StartWindow.font);
		if (KosmoseOdysseia.katseid == KosmoseOdysseia.lubatudKatseteArv) {
			if (!explosionEnded) {
				playExplosion(g, explosionFrames);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} else
			g.drawImage(rocket, 250, 110, null);
		g.drawString("Skoor: " + Integer.toString(skoor), 10, 20);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		repaint();
	}
}

package resources;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class ResourceLoader {

	static ResourceLoader rl = new ResourceLoader();

	public static InputStream getResStream(String fileName) {
		return rl.getClass().getResourceAsStream(fileName);

	}

	public static BufferedImage getImage(String fileName) {
		try {
			return ImageIO.read(rl.getClass().getResourceAsStream(fileName));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

	}

}
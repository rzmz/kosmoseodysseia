package kosmos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import actions.*;

public class StartWindow extends JFrame {
	private static final long serialVersionUID = 1L;
	
	static JButton Start = new JButton(new StartAction());
	static JButton Options = new JButton(new OptionsAction());
	static JButton Highscore = new JButton(new HighScoreAction());
	static JButton Exit = new JButton(new ExitAction());
	
	static JButton MenuButtons[] = { Start, Options, Highscore, Exit };
	static JFrame frame;
	static Container container;
	static Font font = new Font("Press Start 2P", Font.PLAIN, 9);

	public StartWindow() throws FontFormatException, IOException {
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("PressStart2P.ttf")));

		frame = new JFrame("Kosmose Odüsseia");
		frame.setSize(new Dimension(600, 500));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setUndecorated(true);

		container = frame.getContentPane();
		container.setLayout(new BorderLayout());
//		Sound.filepath="Music.wav";
		Thread MusicPlay=new Thread((new Sound("Music.wav",true)).play);
		MusicPlay.start();
		StartMenu();

	}

	static class ImagePanel extends JPanel {
		
		private static final long serialVersionUID = 1L;
		private Image img;

		public ImagePanel(String img) {
			this(new ImageIcon(img).getImage());
		}

		public ImagePanel(Image img) {
			this.img = img;
			Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
			setPreferredSize(size);
			setMinimumSize(size);
			setMaximumSize(size);
			setSize(size);
			setLayout(new FlowLayout());
		}

		public void paintComponent(Graphics g) {
			g.drawImage(img, 0, 0, null);
		}

	}

	static public void StartMenu() {
		
		container.removeAll();
		
		JPanel MenuPanel = new JPanel(new GridLayout(4, 1));
		
		MenuPanel.setBackground(new Color(Color.TRANSLUCENT));
		
		JPanel BackgroundPanel = new ImagePanel(new ImageIcon("space.png").getImage());
		BackgroundPanel.setLayout(new GridBagLayout());

		for (int i = 0; i < MenuButtons.length; i++) {
			MenuButtons[i].setForeground(Color.WHITE);
			MenuButtons[i].setOpaque(false);
			MenuButtons[i].setContentAreaFilled(false);
			MenuButtons[i].setBorderPainted(false);
			MenuPanel.add(MenuButtons[i]);
		}
		
		BackgroundPanel.add(MenuPanel, new GridBagConstraints());
		container.add(BackgroundPanel);
		container.repaint();
		frame.setVisible(true);
	}
}

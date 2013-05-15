package kosmos;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import actions.BackButtonAction;

import kosmos.StartWindow.ImagePanel;

public class HighScoreWindow extends JFrame {

	private static final long serialVersionUID = -3743025448866513282L;

	public HighScoreWindow(){
		StartWindow.container.removeAll();
		StartWindow.container.revalidate();
		StartWindow.container.repaint();
		
		JPanel BackgroundPanel = new ImagePanel(new ImageIcon("space.png").getImage());
		BackgroundPanel.setLayout(new GridBagLayout());
		
		JPanel highScorePanel = new JPanel();
		highScorePanel.setLayout(new BoxLayout(highScorePanel, BoxLayout.Y_AXIS));
		highScorePanel.setOpaque(false);
		highScorePanel.setBackground(new Color(Color.TRANSLUCENT));
		String highscores[] = KosmoseOdysseia.LoeFail("highscore.txt");

		JLabel heading = new JLabel("Edetabel");
		heading.setForeground(Color.WHITE);

		highScorePanel.add(heading);
		JLabel divider = new JLabel("--------------------");
		divider.setForeground(Color.WHITE);
		
		highScorePanel.add(divider);

		HashMap<Integer, String> highScoreMap = new HashMap<Integer, String>();
		ScoreComparator cmp = new ScoreComparator();
		TreeMap<Integer, String> sortedHighscores = new TreeMap<Integer, String>(cmp);
				
		for(String scorerow : highscores){
			String[] ns = scorerow.split(": ");
			highScoreMap.put(new Integer(ns[1]), ns[0]);
		}
		
		sortedHighscores.putAll(highScoreMap);
		Set<Entry<Integer, String>> it = sortedHighscores.entrySet();
		
		Integer u = 1;
		
		for(Entry<Integer, String> entry : it){
			JLabel score = new JLabel(u.toString() + ": " + entry.getValue() + " (" + entry.getKey().toString() + ")");
			score.setForeground(Color.WHITE);
			highScorePanel.add(score);
			u++;
		}
		
		JButton back = new JButton("<< Tagasi");
		back.addActionListener(new BackButtonAction());
		
		highScorePanel.add(divider);
		
		back.setForeground(Color.WHITE);
		back.setOpaque(false);
		back.setContentAreaFilled(false);
		back.setBorderPainted(false);

		highScorePanel.add(back);
		
		BackgroundPanel.add(highScorePanel, new GridBagConstraints());
		StartWindow.container.add(BackgroundPanel);
		StartWindow.container.repaint();
		StartWindow.frame.setVisible(true);
	}
}

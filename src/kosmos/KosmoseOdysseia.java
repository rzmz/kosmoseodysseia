package kosmos;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class KosmoseOdysseia extends Nupukuular {

	private static int lubatudKatseteArv = 6;
	private static JTextArea _textArea;
	static int a = 33;
	static String sonaoriginaal;
	static List<Integer> ArvatudSonadeIndeksid = new ArrayList<Integer>();
	static int sonaindeks;
	static String vihje;
	static int katseid;
	static String arvatudTahed;
	static String sona;
	static char v1[];
	static char s2[];
	static String kirjeldus;

	public KosmoseOdysseia(JTextArea textArea) {
		setTextArea(textArea);
	}

	public static String[] LoeFail(String fileName) {
		FileReader fin;
		try {
			fin = new FileReader(fileName);
			Scanner src = new Scanner(fin);
			ArrayList<String> lines = new ArrayList<String>();
			while(src.hasNext()){
				lines.add(src.nextLine());
			}
			String[] words = new String[lines.size()];
			lines.toArray(words);
			src.close();
			return words;
		}
		catch (FileNotFoundException e) {
			System.out.println("VIGA: Faili ei leitud (" + fileName + ")");
			e.printStackTrace();
		}
		return new String[]{""};
	}
	
	public static void Alusta() throws InterruptedException {
		
		// Sõnade listi lugemine failist

		String sonad[] = LoeFail("words.txt");

		// Juhusliku sõna valimine koos vihjega
		Random rand = new Random();
		sonaindeks = rand.nextInt(sonad.length);
		while (ArvatudSonadeIndeksid.contains(sonaindeks)) {
			sonaindeks = rand.nextInt(sonad.length);
		}
		String sona_koos_vihjega = sonad[sonaindeks];

		// teeme tükkideks...
		String[] sona_vihje = sona_koos_vihjega.split("-");

		sonaoriginaal = sona_vihje[0].trim();
		sona = sona_vihje[0].trim().toLowerCase();
		kirjeldus = sona_vihje[1].trim();

		// Tekitame tühikud
		vihje = "";
		int kriipse = sona.length() + 1;
		for (int i = 1; i < kriipse; i++) {
			vihje += "-";
		}

		arvatudTahed = "";

		// Alustame mängu
		GameWindow.enableAllButtons();

		v1 = vihje.toCharArray();
		s2 = sona.toCharArray();

		// teeme tekstikasti tühjaks
		clearTextArea();

		String kokku = "";

		for (int x = 0; x < v1.length; x++) {
			kokku += v1[x];
		}
		if (Character.isUpperCase(sonaoriginaal.charAt(0))) {
			getTextArea().append("Nimi: " + kokku);
		} else {
			getTextArea().append("Sõna: " + kokku);
		}
		getTextArea().append("\nVihje: " + kirjeldus);
		kuvaKatseid(true);
		for (int i = 0; i < 60; i++) {
			getTextArea().append(" ");
		}
			}

	private static void clearTextArea() {
		getTextArea().selectAll();
		getTextArea().replaceSelection("");
	}

	public static void Arva() {
		if (sona.contains(taht)) {
			if (arvatudTahed.contains(taht)) {
			} else {
				String error = "Õige!                                   ";
				getTextArea().replaceRange(
						"                                      ",
						a + v1.length + kirjeldus.length(),
						a + v1.length + kirjeldus.length() + error.length());

				try {
					getTextArea()
							.replaceRange(
									error,
									a + v1.length + kirjeldus.length(),
									a + v1.length + kirjeldus.length()
											+ error.length());
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
					System.exit(0);
				}
				int sp = sona.length();
				for (int i = 0; i < sp; i++) {
					char aChar = taht.charAt(0);
					char bChar = s2[i];
					if (bChar == aChar) {
						v1[i] = aChar;
					}
				}
			}
		} else {
			if (arvatudTahed.contains(taht) == false) {
				katseid += 1;
				kuvaKatseid(false);
				String error = "Vale! Tähte " + taht.toUpperCase()
						+ " ei ole sõnas!     ";
				getTextArea().replaceRange(
						"                                      ",
						a + v1.length + kirjeldus.length(),
						a + v1.length + kirjeldus.length() + error.length());

				getTextArea().replaceRange(error,
						a + v1.length + kirjeldus.length(),
						a + v1.length + kirjeldus.length() + error.length());
				arvatudTahed += taht;
			}
		}
		String S = "";
		for (int x = 0; x < v1.length; x++) {
			S += v1[x];
		}
		if (Character.isUpperCase(sonaoriginaal.charAt(0))) {
			S = S.substring(0, 1).toUpperCase() + S.substring(1);
		}
		getTextArea().replaceRange(S, 6, 6 + S.length());
		arvatudTahed += taht;

		String tg1 = new String(v1);
		String tg2 = new String(s2);
		if (tg1.equals(tg2)) {
			GuessedRight();
		} else if (katseid == lubatudKatseteArv) {
			Kaotus(sona);
		}
	}

	public static void Kaotus(String sona) {
		int reply = JOptionPane.showConfirmDialog(null,
				"Sa kaotasid..\nSõna oli '" + sona
						+ "'.\nKas lisad oma tulemuse edetabelisse?",
				"Boohoo :(", JOptionPane.YES_NO_OPTION);
		if (reply == JOptionPane.YES_OPTION) {
			try {
				String nimi = "";
				while (nimi == "") {
					nimi = nameInputDialog();
				}
				PrintWriter out = new PrintWriter(new BufferedWriter(
						new FileWriter("highscore.txt", true)));
				out.println(nimi + ": " + String.valueOf(Paint.skoor));
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		int reply2 = JOptionPane.showConfirmDialog(null,
				"Kas alustame uut mängu?", "Play again?",
				JOptionPane.YES_NO_OPTION);
		if (reply2 == JOptionPane.YES_OPTION) {
			try {
				ArvatudSonadeIndeksid.clear();
				Paint.skoor = 0;
				katseid = 0;
				Alusta();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			System.exit(0);
		}

	}

	public void Voit() {
		int reply = JOptionPane.showConfirmDialog(null,
				"Sa võitsid!\nKas mängime uuesti?", "Yeahh!",
				JOptionPane.YES_NO_OPTION);
		if (reply == JOptionPane.YES_OPTION) {
			try {
				Alusta();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			System.exit(0);
		}
	}

	public static void kuvaKatseid(boolean isBeginning) {
		if (isBeginning)
			getTextArea()
					.append("\nKatseid jäänud: "
							+ (lubatudKatseteArv - katseid) + "\n");
		else
			getTextArea().replaceRange(
					Integer.toString(lubatudKatseteArv - katseid),
					31 + v1.length + kirjeldus.length(),
					32 + v1.length + kirjeldus.length());

	}

	public static JTextArea getTextArea() {
		return _textArea;
	}

	public void setTextArea(JTextArea _tekst) {
		KosmoseOdysseia._textArea = _tekst;
	}

	public static void GuessedRight() {
		Paint.skoor += 1;
		ArvatudSonadeIndeksid.add(sonaindeks);
		try {
			Alusta();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static String nameInputDialog() {
		Object[] possibilities = null;
		String s = (String) JOptionPane.showInputDialog(StartWindow.frame,
				"Sisesta oma nimi: ", "Highscore!!", JOptionPane.PLAIN_MESSAGE,
				null, possibilities, "");

		if ((s != null) && (s.length() > 0)) {
			return s;
		} else {
			return "";
		}

	}

}

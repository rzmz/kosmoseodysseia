package kosmos;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import resources.ResourceLoader;

public class KosmoseOdysseia extends Nupukuular {

	static int lubatudKatseteArv = 6;
	private static JTextArea _textArea;
	static int a = 33;
	static List<Integer> ArvatudSonadeIndeksid = new ArrayList<Integer>();
	static int sonaindeks;
	static int katseid;
	static String arvatudTahed;
	static String sona;
	static String eelnevsona;
	static char vihjeCharArray[];
	static char sonaCharArray[];
	static String kirjeldus;
	static boolean isBeginning;
	static Object obj = new Object();

	public KosmoseOdysseia(JTextArea textArea) {
		setTextArea(textArea);
	}

	public static String[] LoeFail(String fileName, boolean txtCreate) {
		// InputStreamReader fin = null;
		Object fin = null;
		Scanner src=null;
		try {
			if (fileName == "words.txt" || txtCreate) {
				fin = new InputStreamReader(
						ResourceLoader.getResStream(fileName), "UTF-8");
				src = new Scanner((InputStreamReader) fin);
			} else {
				fin = new FileReader(fileName);
				src = new Scanner((FileReader) fin);
			}
		} catch (UnsupportedEncodingException | FileNotFoundException e) {
			e.printStackTrace();
		}
		ArrayList<String> lines = new ArrayList<String>();
		while (src.hasNext()) {
			lines.add(src.nextLine());
		}
		String[] words = new String[lines.size()];
		lines.toArray(words);
		src.close();
		return words;
	}

	public static void Alusta() throws InterruptedException {

		// Sõnade listi lugemine failist

		String sonad[] = LoeFail("words.txt",false);

		// Juhusliku sõna valimine koos vihjega
		Random rand = new Random();
		sonaindeks = rand.nextInt(sonad.length);
		while (ArvatudSonadeIndeksid.contains(sonaindeks)) {
			sonaindeks = rand.nextInt(sonad.length);
		}
		String sona_koos_vihjega = sonad[sonaindeks];

		// teeme tükkideks...
		String[] sona_vihje = sona_koos_vihjega.split("-");

		sona = sona_vihje[0].trim();
		kirjeldus = sona_vihje[1].trim();

		// Tekitame tühikud
		String vihje = "";
		int kriipse = sona.length() + 1;
		for (int i = 1; i < kriipse; i++) {
			vihje += "-";
		}

		arvatudTahed = "";

		// Alustame mängu
		GameWindow.enableAllButtons();

		vihjeCharArray = vihje.toCharArray();
		sonaCharArray = sona.toCharArray();

		if (sona.contains(" ") || sona.contains("-")) {
			for (int i = 0; i < sona.length(); i++) {
				if (' ' == sonaCharArray[i]) {
					vihjeCharArray[i] = ' ';
				}
				if ('-' == sonaCharArray[i]) {
					vihjeCharArray[i] = '-';
				}
			}
		}

		// teeme tekstikasti tühjaks
		clearTextArea();

		String kokku = "";

		for (int x = 0; x < vihjeCharArray.length; x++) {
			kokku += vihjeCharArray[x];
		}
		if (Character.isUpperCase(sona.charAt(0))) {
			getTextArea().append("Nimi: " + kokku);
		} else {
			getTextArea().append("Sõna: " + kokku);
		}
		getTextArea().append("\nVihje: " + kirjeldus);
		kuvaKatseid(true);
		for (int i = 0; i < 60; i++) {
			getTextArea().append(" ");
		}

		if (isBeginning == false) {
			String error = "'" + eelnevsona + "' oli õige!     ";
			getTextArea().replaceRange(
					error,
					a + vihjeCharArray.length + kirjeldus.length(),
					a + vihjeCharArray.length + kirjeldus.length()
							+ error.length());
		}
		isBeginning = false;
		Paint.explosionStart = true;
	}

	private static void clearTextArea() {
		getTextArea().selectAll();
		getTextArea().replaceSelection("");
	}

	public static void Arva() {
		if (sona.toLowerCase().contains(taht)) {
			if (arvatudTahed.contains(taht)) {
			} else {
				String error = "'" + taht.toUpperCase()
						+ "' on õige!                      ";
				getTextArea().replaceRange(
						"                                            ",
						a + vihjeCharArray.length + kirjeldus.length(),
						a + vihjeCharArray.length + kirjeldus.length()
								+ error.length());

				try {
					getTextArea().replaceRange(
							error,
							a + vihjeCharArray.length + kirjeldus.length(),
							a + vihjeCharArray.length + kirjeldus.length()
									+ error.length());
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				}

				for (int i = 0; i < sona.length(); i++) {
					if (taht.charAt(0) == sonaCharArray[i]) {
						vihjeCharArray[i] = taht.charAt(0);
					} else if (taht.toUpperCase().charAt(0) == sonaCharArray[i]) {
						vihjeCharArray[i] = taht.toUpperCase().charAt(0);
					}
				}
			}
		} else {
			if (arvatudTahed.contains(taht) == false) {
				katseid += 1;
				kuvaKatseid(false);
				String error = "Vale! Tähte '" + taht.toUpperCase()
						+ "' ei ole sõnas!          ";
				getTextArea().replaceRange(
						"                                           ",
						a + vihjeCharArray.length + kirjeldus.length(),
						a + vihjeCharArray.length + kirjeldus.length()
								+ error.length());

				getTextArea().replaceRange(
						error,
						a + vihjeCharArray.length + kirjeldus.length(),
						a + vihjeCharArray.length + kirjeldus.length()
								+ error.length());
				arvatudTahed += taht;
			}
		}
		String S = "";
		for (int x = 0; x < vihjeCharArray.length; x++) {
			S += vihjeCharArray[x];
		}
		getTextArea().replaceRange(S, 6, 6 + S.length());
		arvatudTahed += taht;

		String vihje = new String(vihjeCharArray);
		if (vihje.equals(sona)) {
			GuessedRight();
		} else if (katseid == lubatudKatseteArv) {
			theEnd("Sa kaotasid..\nSõna oli '" + sona
					+ "'.\nKas lisad oma tulemuse edetabelisse?", "Boohoo :(");
			Paint.explosionEnded = false;
		}
	}

	public static void theEnd(String message, String topic) {
		isBeginning = true;
		int reply = JOptionPane.showConfirmDialog(null, message, topic,
				JOptionPane.YES_NO_OPTION);
		if (reply == JOptionPane.YES_OPTION) {
			try {
				String nimi = "";
				while (nimi == "") {
					nimi = nameInputDialog();
				}
				// OutputStream välja = new FileOutputStream(
				// ResourceLoader.getResStream("highscore.txt"), "UTF-8");
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

	public static void kuvaKatseid(boolean isBeginning) {
		if (isBeginning)
			getTextArea()
					.append("\nKatseid jäänud: "
							+ (lubatudKatseteArv - katseid) + "\n");
		else
			getTextArea().replaceRange(
					Integer.toString(lubatudKatseteArv - katseid),
					31 + vihjeCharArray.length + kirjeldus.length(),
					32 + vihjeCharArray.length + kirjeldus.length());

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
		eelnevsona = sona;
		try {
			if (ArvatudSonadeIndeksid.size() == 50) {
				theEnd("Sa võitsid!!\nKas lisad oma tulemuse edetabelisse?",
						"Woohoo!!");
			} else
				Alusta();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static String nameInputDialog() {
		Object[] possibilities = null;
		String nimi = (String) JOptionPane.showInputDialog(StartWindow.frame,
				"Sisesta oma nimi: ", "Highscore!!", JOptionPane.PLAIN_MESSAGE,
				null, possibilities, "");

		if ((nimi != null) && (nimi.length() > 0)) {
			return nimi;
		} else {
			return "";
		}

	}

}

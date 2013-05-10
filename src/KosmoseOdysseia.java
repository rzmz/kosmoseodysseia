import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class KosmoseOdysseia extends Nupukuular {

	private static int lubatudKatseteArv = 6;
	private static JTextArea _textArea;
	static int a = 33;
	static boolean Beginning = true;
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

	public static void Alusta() throws InterruptedException {
		// Sõnade listi genereerimine
		String sonad[] = {
				"süstik - Tiibadega kosmoseaparaat.",
				"Estcube - Kuulus tudengisatelliit.",
				"gravitatsioonikonstant - Konstant, mis iseloomustab raskusjõu tugevust.",
				"paokiirus - Vähim kiirus, millega saab lahkuda taevakeha külgetõmbejõu mõjupiirkonnast.",
				"orbitaaljaam - Kosmoseaparaat, mis tiirleb pikka aega ümber Maa ja on pidevalt või ajutiselt mehitatud.",
				"kuupsatelliit - Minitehiskaaslane, mille ruumala on täpselt 1 liiter.",
				"kosmonaut - Kosmoselaeva, lennuki liige (Venemaa).",
				"astronaut - Kosmoselaeva, lennuki liige (USA).",
				"taikonaut - Kosmoselaeva, lennuki liige (Hiina).",
				"astronoomia - Teadusharu, mis uurib kosmilisi objekte ja universumit tervikuna.",
				"meteoroloogia - Teadusharu, mis uurib atmosfääri.",
				"atmosfäär - Maad ümbritsev kihilise ehitusega õhukest, mis koosneb erinevatest gaasidest ning seda hoiab kinni gravitatsioonijõud.",
				"tehiskaaslane - Mõne planeedi või selle loodusliku kaaslase gravitatsiooniväljas mingil kindlal orbiidil tiirlev kosmoseaparaat.",
				"Apollo - NASA kosmoselendude programm aastatel 1961–1975, mille käigus sooritati kuus mehitatud lendu Kuule.",
				"Hubble - 1990. aastal käivitatud kosmoseobservatooriumi, mis tiirleb kosmoses ümber maakera, nimi.",
				"Curiosity - 2011. aastal käivitatud mehitamata marsikulgur.",
				"Gagarin - Nõukogude kosmonaut, kellest 1961. aastal sai esimene kosmoses käinud inimene.",
				"Armstrong - USA astronaut, esimene inimene, kes astus Kuu pinnale.",
				"aeronautika - Õhust kergemaid lennuvahendeid: õhupalle, õhulaevu, stratostaate jms. rakendav lennunduse haru.",
				"kosmosesond - Automaatne ja mehitamata kosmoseaparaat, mis on määratud kosmoses lendamiseks Maa orbiidi väljas ja muude taevakehade uurimiseks.",
				"kosmodroom - Piiritletud maa ala (koos ehitiste ja seadmetega) kosmoseaparaatide väljasaatmiseks, vastuvõtmiseks, katsetamiseks ja monteerimiseks.",
				"päikesetuul - Päikesest lähtuv laetud osakeste voog.",
				"päikesepuri - Teoreetiline kosmosesõiduki käitursüsteem, mis kasutab jõuallikaks päikesetuule dünaamilist rõhku.",
				"kuumoodul - Kosmoseaparaat, mille otstarve oli missiooni käigus kahe astronaudi Kuu pinnale maandamine ja missiooni lõppedes orbiidile tagasi lennutamine.",
				// "dilämmastiktetraoksiid - Teisisõnu N2O4. Ülimürgine aine, mida kasutati Apollo kuumoodulis koos Aerozine50'ga kütteks.",
				"skafander - Suletav tehiskeskkond, mille eesmärk on kaitsta astronauti avakosmoses valitsevate tingimuste eest.",
				"asteroid - Väike planeedisarnane taevakeha, mis tiirleb Kepleri seadustele vastavatel orbiitidel ümber Päikese.",
				"meteoriitika - Teadusharu, mis tegeleb meteoriitide ja muude maaväliste materjalide uurimisega.",
				"tumeaine - Varjatud aine, mida ei ole näha, kuid mida on tunda tema raskusjõu tõttu.",
				"tumeenergia - Kosmoloogias ja astronoomias hüpoteetiline energiavorm, mis moodustab suurema osa Universumi koostisest.",
				"Universum -  Maailmakõiksus, kõikide asjade kogusus. Kosmos ehk maailmaruum, mis sisaldab kogu ainet ja energiat.",
				"Galaktika -  Gravitatsiooniliselt seotud tähesüsteem, mis koosneb tähtedest ja nende jäänustest, tähtedevahelisest tolmust ja tumedast ainest.",
				"tähesüsteem -  Tähtede kooslus, mille puhul koosluse liikmete paigutuse määrab vahetult tähtede vastastikune gravitatsioon.",
				"Päike - Meie Päikesesüsteemi täht.",
				"Maa - Ainuke teadaolev planeet Universumis, kus leidub elu.",
				"Linnutee - Meie galaktika nimi.",
				"Jupiter - Päikesesüsteemi kõige suurem planeet.",
				"Merkuur - Päikesele kõige lühem ning kõige väiksem Päikesesüsteemi planeet.",
				"Veenus - Maaga peaaegu ühesuurune ning meile lähim planeet.",
				"Marss - Päikesesüsteemi neljas planeet.",
				"Saturn - Päikesesüsteemi kuues planeet.",
				"Uraan - Päikesesüsteemi seitsmes planeet.",
				"Neptuun - Kaheksas ja viimane suurtest planeetidest meie päikesesüsteemis.",
				"Pluuto - Kääbusplaneet, mida kunagi loeti meie Päikesesüsteemi üheksandaks planeediks.",
				"Kuu - Maa looduslik kaaslane.",
				"heliopaus - Heliosfääri väline kiht, kus tähtedevaheline tuul ja päikesetuul on tasakaalus.",
				"supernoova - Oma arengu lõppjärku jõudnud täht, mille plahvatuse tagajärjel tähe heledus kasvab hetkeliselt miljoneid kordi.",
				"neutrontäht - Peamiselt neutronitest koosnev täht." };

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
		katseid = 0;

		// Alustame mängu
		GameWindow.enableAllButtons();
		Mangi();
	}

	private static void clearTextArea() {
		getTextArea().selectAll();
		getTextArea().replaceSelection("");
	}

	// meetod, mis juhib mängu käiku

	public static void Mangi() {

		if (katseid == lubatudKatseteArv) {
			Kaotus(sona);
		} else {
			v1 = vihje.toCharArray();
			s2 = sona.toCharArray();

			// // teeme tekstikasti tühjaks
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
			kuvaKatseid(lubatudKatseteArv);
			for (int i = 0; i < 60; i++) {
				getTextArea().append(" ");
			}

			if (Beginning) {
				new Thread(Sound.play).start();
				// JOptionPane
				// .showMessageDialog(
				// null,
				//
				// "Tere tulemast, kartmatu piloot!\nMängu eesmärgiks on tunda\nkosmoseteemalist teooriat ning\nsaata rakett kuule.");
				Beginning = false;
			}
			// Arva();
		}
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
				kuvaKatseid(lubatudKatseteArv - katseid, v1, kirjeldus);
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
				"Sa kaotasid..\nSõna oli '" + sona + "'.\nKas mängime uuesti?",
				"Boohoo :(", JOptionPane.YES_NO_OPTION);
		if (reply == JOptionPane.YES_OPTION) {
			try {
				ArvatudSonadeIndeksid.clear();
				Paint.skoor = 0;
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

	public static void kuvaKatseid(int katseteArv) {
		getTextArea().append("\nKatseid jäänud: " + katseteArv + "\n");
	}

	public static void kuvaKatseid(int katseteArv, char[] v1, String kirjeldus) {
		getTextArea().replaceRange(Integer.toString(katseteArv),
				31 + v1.length + kirjeldus.length(),
				32 + v1.length + kirjeldus.length());

	}

	public static JTextArea getTextArea() {
		return _textArea;
	}

	public void setTextArea(JTextArea _tekst) {
		this._textArea = _tekst;
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

}

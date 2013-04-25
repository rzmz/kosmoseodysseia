import java.util.Random;
import javax.swing.JTextArea;

public class KosmoseOdysseia {

	private int lubatudKatseteArv = 6;
	private JTextArea _textArea;
	private String taht;

	public KosmoseOdysseia(JTextArea textArea) {
		setTextArea(textArea);
	}

	public KosmoseOdysseia() {
		// TODO Auto-generated constructor stub
	}

	public void Alusta() {

		// Sõnade listi genereerimine
		String sonad[] = {
				"süstik - Tiibadega kosmoseaparaat.",
				"estcube - Kuulus tudengisatelliit.",
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
				"dilämmastiktetraoksiid - Teisisõnu N2O4. Ülimürgine aine, mida kasutati Apollo kuumoodulis koos Aerozine50'ga kütteks.",
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
		String sona_koos_vihjega;
		Random rand = new Random();
		int sonaindeks = rand.nextInt(sonad.length);
		sona_koos_vihjega = sonad[sonaindeks];

		String[] sona_vihje;

		String sona;
		String kirjeldus;

		// teeme tükkideks...
		sona_vihje = sona_koos_vihjega.split("-");

		sona = sona_vihje[0].trim().toLowerCase();
		kirjeldus = sona_vihje[1].trim();

		// Tekitame tühikud
		String vihje = "";
		int kriipse = sona.length() + 1;
		for (int i = 1; i < kriipse; i++) {
			vihje += "- ";
		}

		String arvatudTahed = "";
		int katseid = 0;

		// Alustame mängu
		Mangi(vihje, katseid, arvatudTahed, sona, kirjeldus);
	}

	private void clearTextArea() {
		getTextArea().selectAll();
		getTextArea().replaceSelection("");
	}

	/**
	 * meetod, mis juhib mängu käiku
	 */
	public void Mangi(String vihje, int katseid, String arvatudTahed,
			String sona, String kirjeldus) {

		if (katseid == lubatudKatseteArv) {
			Kaotus();
		} else {
			// tekitame raketi massiivi
			String man[] = new String[7];
			man[0] = "        _\n       /_\\\n      | _ |\n    /\\||_||/\\\n    | |   | |\n    | |   | |\n    | |   | |\n |_|___|_|\n / \\      / \\\n\n";
			man[1] = "        _\n       /_\\\n      | _ |\n    /\\||_||/\\\n    | |   | |\n    | |   | |\n    | |   | |\n |_|___|_|\n\n";
			man[2] = "        _\n       /_\\\n      | _ |\n       ||_||/\\\n      |   | |\n      |   | |\n      |   | |\n   |___|_|\n\n";
			man[3] = "        _\n       /_\\\n      | _ |\n       ||_||\'                \n      |   | \n       |   | \n    |___|  \n\n";
			man[4] = "        _\n       /_\\\n      | _ |\n       ||_||\'                \n      |   | \n       |   | \n           \n\n";
			man[5] = "        _\n       /_\\\n      | _ |\n       ||_||\'                \n      |   | \n             \n           \n\n";
			man[6] = "        _\n       /_\\\n      | _ |\n       ||_||\'                \n            \n             \n           \n\n";
			char v1[] = vihje.toCharArray();
			char s2[] = sona.toCharArray();

			// teeme tekstikasti tühjaks
			clearTextArea();

			getTextArea().append(man[0]);

			String kokku = "";

			for (int x = 0; x < v1.length; x++) {
				kokku += v1[x];
			}

			getTextArea().append(kokku);

			getTextArea().append("");
			Arva(vihje, katseid, arvatudTahed, sona, v1, s2, man, kirjeldus);
		}
	}

	public void Arva(String vihje, int katseid, String arvatudTahed,
			String sona, char v1[], char s2[], String man[], String kirjeldus) {
		String tg1 = new String(v1);
		String tg2 = new String(s2);

		getTextArea().append("\nVihje: " + kirjeldus);

		if (tg1.equals(tg2)) {
			Voit();
		} else {
			if (katseid == lubatudKatseteArv) {
				System.out
						.println("\n\nSa kaotasid ja rakett ei saanud valmis! Sõna oli: "
								+ sona);
				Kaotus();
			} else {
				taht=Nupukuular.getTaht();
				if (sona.contains(taht)) {
					if (arvatudTahed.contains(taht)) {
						katseid += 1;
						System.out.println("Vale!");
					} else {
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
					katseid += 1;
					System.out.println("Vale!");
					arvatudTahed += taht;
				}
				System.out.println();
				System.out.println(man[katseid]);
				for (int x = 0; x < v1.length; x++) {
					System.out.print(v1[x]);
				}
				System.out.println("\n\n");
				arvatudTahed += taht;
				Arva(vihje, katseid, arvatudTahed, sona, v1, s2, man, kirjeldus);
			}
		}
	}

	public void Kaotus() {
		MangiUuesti();
	}

	public void MangiUuesti() {
//		Scanner input = new Scanner(System.in);
//		System.out.print("\nKas mängime uuesti?(J/E): ");
//		String valik = input.next();
//		if (valik.toLowerCase().contains("j")) {
//			Alusta();
//		}
//		input.close();
	}

	public void Voit() {
		// System.out.println("     _\n    /_\\\n   | _ |\n /\\||_||/\\\n | |   | |\n | |   | |\n | |   | |\n |_|___|_|\n / \\   / \\\n");
		// System.out.println("     _\n    /_\\\n   | _ |\n /\\||_||/\\\n | |   | |\n | |   | |\n | |   | |\n |_|___|_|\n / \\   / \\\n |||   |||  \n");
		// System.out.println("Sa võitsid! Rakett startis edukalt!\n");
		MangiUuesti();
	}

	public JTextArea getTextArea() {
		return _textArea;
	}

	public void setTextArea(JTextArea _tekst) {
		this._textArea = _tekst;
	}

}

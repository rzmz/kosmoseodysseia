import java.util.Random;
import java.util.Scanner;


public class KosmoseOdysseia {

	private int lubatudKatseteArv = 6;
	
	public void Alusta() {

		// Sonade listi genereerimine
		String sonad[] = {
				"sĆ¼stik - Tiibadega kosmoseaparaat",
				"estcube - Kuulus tudengisatelliit",
				"gravitatsioonikonstant - Konstant, mis iseloomustab raskusjĆµu tugevust",
				"paokiirus - VĆ¤him kiirus, millega saab lahkuda taevakeha kĆ¼lgetĆµmbejĆµu mĆµjupiirkonnast",
				"orbitaaljaam - Kosmoseaparaat, mis tiirleb pikka aega Ć¼mber Maa ja on pidevalt vĆµi ajutiselt mehitatud",
				"kuupsatelliit - Minitehiskaaslane, mille ruumala on tĆ¤pselt 1 liiter",
				"kosmonaut - Kosmoselaeva, lennuki liige (Venemaa)",
				"astronaut - Kosmoselaeva, lennuki liige (USA)",
				"taikonaut - Kosmoselaeva, lennuki liige (Hiina)",
				"astronoomia - Teadusharu, mis uurib kosmilisi objekte ja universumit tervikuna",
				"meteoroloogia - Teadusharu, mis uurib atmosfĆ¤Ć¤ri",
				"atmosfĆ¤Ć¤r - Maad Ć¼mbritsev kihilise ehitusega Ćµhukest, mis koosneb erinevatest gaasidest ning seda hoiab kinni gravitatsioonijĆµud",
				"tehiskaaslane - MĆµne planeedi vĆµi selle loodusliku kaaslase gravitatsioonivĆ¤ljas mingil kindlal orbiidil tiirlev kosmoseaparaat",
				"Apollo - NASA kosmoselendude programm aastatel 1961Ā–1975, mille kĆ¤igus sooritati kuus mehitatud lendu Kuule",
				"Hubble - 1990. aastal kĆ¤ivitatud kosmoseobservatooriumi, mis tiirleb kosmoses Ć¼mber maakera, nimi",
				"Curiosity - 2011. aastal kĆ¤ivitatud mehitamata marsikulgur",
				"Gagarin - NĆµukogude kosmonaut, kellest 1961. aastal sai esimene kosmoses kĆ¤inud inimene",
				"Armstrong - USA astronaut, esimene inimene, kes astus Kuu pinnale",
				"aeronautika - Ć•hust kergemaid lennuvahendeid: Ćµhupalle, Ćµhulaevu, stratostaate jms. rakendav lennunduse haru",
				"kosmosesond - Automaatne ja mehitamata kosmoseaparaat, mis on mĆ¤Ć¤ratud kosmoses lendamiseks Maa orbiidi vĆ¤ljas ja muude taevakehade uurimiseks",
				"kosmodroom - Piiritletud maa-ala (koos ehitiste ja seadmetega) kosmoseaparaatide vĆ¤ljasaatmiseks, vastuvĆµtmiseks, katsetamiseks ja monteerimiseks",
				"pĆ¤ikesetuul - PĆ¤ikesest lĆ¤htuv laetud osakeste voog",
				"pĆ¤ikesepuri - Teoreetiline kosmosesĆµiduki kĆ¤itursĆ¼steem, mis kasutab jĆµuallikaks pĆ¤ikesetuule dĆ¼naamilist rĆµhku",
				"kuumoodul - Kosmoseaparaat, mille otstarve oli missiooni kĆ¤igus kahe astronaudi Kuu pinnale maandamine ja missiooni lĆµppedes orbiidile tagasi lennutamine",
				"dilĆ¤mmastiktetraoksiid - TeisisĆµnu N2O4. Ć�limĆ¼rgine aine, mida kasutati Apollo kuumoodulis koos Aerozine50'ga kĆ¼tteks",
				"skafander - Suletav tehiskeskkond, mille eesmĆ¤rk on kaitsta astronauti avakosmoses valitsevate tingimuste eest",
				"asteroid - vĆ¤ike planeedisarnane taevakeha, mis tiirleb Kepleri seadustele vastavatel orbiitidel Ć¼mber PĆ¤ikese",
				"meteoriitika - Teadusharu, mis tegeleb meteoriitide ja muude maavĆ¤liste materjalide uurimisega",
				"tumeaine - Varjatud aine, mida ei ole nĆ¤ha, kuid mida on tunda tema raskusjĆµu tĆµttu",
				"tumeenergia - Kosmoloogias ja astronoomias hĆ¼poteetiline energiavorm, mis moodustab suurema osa Universumi koostisest",
				"Universum -  MaailmakĆµiksus, kĆµikide asjade kogusus. Kosmos ehk maailmaruum, mis sisaldab kogu ainet ja energiat",
				"Galaktika -  Gravitatsiooniliselt seotud tĆ¤hesĆ¼steem, mis koosneb tĆ¤htedest ja nende jĆ¤Ć¤nustest, tĆ¤htedevahelisest tolmust ja tumedast ainest",
				"tĆ¤hesĆ¼steem -  TĆ¤htede kooslus, mille puhul koosluse liikmete paigutuse mĆ¤Ć¤rab vahetult tĆ¤htede vastastikune gravitatsioon",
				"PĆ¤ike - Meie PĆ¤ikesesĆ¼steemi tĆ¤ht",
				"Maa - Ainuke teadaolev planeet Universumis, kus leidub elu",
				"Linnutee - Meie galaktika nimi",
				"Jupiter - PĆ¤ikesesĆ¼steemi kĆµige suurem planeet",
				"Merkuur - PĆ¤ikesele kĆµige lĆ¤hem ning kĆµige vĆ¤iksem PĆ¤ikesesĆ¼steemi planeet",
				"Veenus - Maaga peaaegu Ć¼hesuurune ning meile lĆ¤him planeet",
				"Marss - PĆ¤ikesesĆ¼steemi neljas planeet",
				"Saturn - PĆ¤ikesesĆ¼steemi kuues planeet",
				"Uraan - PĆ¤ikesesĆ¼steemi seitsmes planeet",
				"Neptuun - Kaheksas ja viimane suurtest planeetidest meie pĆ¤ikesesĆ¼steemis",
				"Pluuto - KĆ¤Ć¤busplaneet, mida kunagi loeti meie PĆ¤ikesesĆ¼steemi Ć¼heksandaks planeediks",
				"Kuu - Maa looduslik kaaslane",
				"heliopaus - HeliosfĆ¤Ć¤ri vĆ¤line kiht, kus tĆ¤htedevaheline tuul ja pĆ¤ikesetuul on tasakaalus",
				"supernoova - Oma arengu lĆµppjĆ¤rku jĆµudnud tĆ¤ht, mille plahvatuse tagajĆ¤rjel tĆ¤he heledus kasvab hetkeliselt miljoneid kordi",
				"neutrontĆ¤ht - Peamiselt neutronitest koosnev tĆ¤ht" };

		// Juhusliku sĆµna valimine koos vihjega
		String sona_koos_vihjega;
		Random rand = new Random();
		int sonaindeks = rand.nextInt(sonad.length);
		sona_koos_vihjega = sonad[sonaindeks];

		String[] sona_vihje;

		String sona;
		String kirjeldus;

		// teeme tĆ¼kkideks...
		sona_vihje = sona_koos_vihjega.split("-");

		sona = sona_vihje[0].trim().toLowerCase();
		kirjeldus = sona_vihje[1].trim();

		// Tekitame tĆ¼hikud
		String vihje = "";
		int kriipse = sona.length() + 1;
		for (int i = 1; i < kriipse; i++) {
			vihje += "-";
		}

		String arvatudTahed = "";
		int katseid = 0;

		// Alustame mĆ¤ngu
		Mangi(vihje, katseid, arvatudTahed, sona, kirjeldus);
	}

	/**
	 * meetod, mis juhib mĆ¤ngu kĆ¤iku
	 */
	public void Mangi(String vihje, int katseid, String arvatudTahed, String sona, String kirjeldus) {
		
		if (katseid == lubatudKatseteArv) {
			Kaotus();
		} else {
			// tekitame raketi massiivi
			String man[] = new String[7];
			man[0] = "     _\n    /_\\\n   | _ |\n /\\||_||/\\\n | |   | |\n | |   | |\n | |   | |\n |_|___|_|\n / \\   / \\\n";
			man[1] = "     _\n    /_\\\n   | _ |\n /\\||_||/\\\n | |   | |\n | |   | |\n | |   | |\n |_|___|_|\n\n";
			man[2] = "     _\n    /_\\\n   | _ |\n   ||_||/\\\n   |   | |\n   |   | |\n   |   | |\n   |___|_|\n\n";
			man[3] = "     _\n    /_\\\n   | _ |\n   ||_||\'       \n   |   | \n   |   | \n   |___|\n\n";
			man[4] = "     _\n    /_\\\n   | _ |\n   ||_||\'       \n   |   | \n   |   | \n   \n\n";
			man[5] = "     _\n    /_\\\n   | _ |\n   ||_||\'       \n   |   | \n   \n   \n\n";
			man[6] = "     _\n    /_\\\n   | _ |\n   ||_||\'       \n  \n   \n   \n\n";
			char v1[] = vihje.toCharArray();
			char s2[] = sona.toCharArray();
			System.out.println(man[0]);
			for (int x = 0; x < v1.length; x++) {
				System.out.print(v1[x]);
			}
			System.out.println();
			Arva(vihje, katseid, arvatudTahed, sona, v1, s2, man, kirjeldus);
		}
	}

	public void Arva(String vihje, int katseid, String arvatudTahed,
			String sona, char v1[], char s2[], String man[], String kirjeldus) {
		String tg1 = new String(v1);
		String tg2 = new String(s2);

		System.out.println("Vihje: " + kirjeldus);

		if (tg1.equals(tg2)) {
			Voit();
		} else {
			if (katseid == lubatudKatseteArv) {
				System.out
						.println("\n\nSa kaotasid ja rakett ei saanud valmis! SĆµna oli: "
								+ sona);
				Kaotus();
			} else {
				Scanner input = new Scanner(System.in);
				String taht = input.next();
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
				input.close();
			}
		}
	}

	public void Kaotus() {
		MangiUuesti();
	}

	public void MangiUuesti() {
		Scanner input = new Scanner(System.in);
		System.out.print("\nKas mĆ¤ngime uuesti?(J/E): ");
		String valik = input.next();
		if (valik.toLowerCase().contains("j")) {
			Alusta();
		}
		input.close();
	}

	public void Voit() {
		//System.out.println("     _\n    /_\\\n   | _ |\n /\\||_||/\\\n | |   | |\n | |   | |\n | |   | |\n |_|___|_|\n / \\   / \\\n");
		System.out.println("     _\n    /_\\\n   | _ |\n /\\||_||/\\\n | |   | |\n | |   | |\n | |   | |\n |_|___|_|\n / \\   / \\\n |||   |||  \n");
		System.out.println("Sa vĆµitsid! Rakett startis edukalt!\n");
		MangiUuesti();
	}

}

import java.util.Arrays;
import java.util.Scanner;

class mainProgramma {
	public static void main(String args[]) {
		MiniOpdracht1 opdr1 = new MiniOpdracht1();
		opdr1.plakSamen();
		
		MiniOpdracht2 opdr2 = new MiniOpdracht2();
		String woord = "hottentottententententoonstelling";
		opdr2.telEs(woord);
		
		MiniOpdracht3 opdr3 = new MiniOpdracht3();
		int[] arraytje = {4, 6, 8, 2, 4};
		opdr3.telArrayOp(arraytje);
		
		MiniOpdracht4 opdr4 = new MiniOpdracht4();
		opdr4.start();
		
		MiniOpdracht5 opdr5 = new MiniOpdracht5();
		opdr5.repareerAutos();
		
		//MiniOpdracht6 opdr6 = new MiniOpdracht6();
		//opdr6.sorteerLetters();
		
		//MiniOpdracht7 opdr7 = new MiniOpdracht7();
		//opdr7.speelLingo();
		
		MiniOpdracht8 opdr8 = new MiniOpdracht8();
		opdr8.start();
	}
}

/*
	void start() {
		System.out.println("Dag Kijker! Voer je naam in");
		Scanner sc = new Scanner(System.in);
		String naam = sc.nextLine();
		System.out.println("Welkom " + naam + ". Laten we beginnen.");

		Hond hondje = new Hond();
		hondje.ademen();
		hondje.blaffen();

		int[] getallen = { 5, 7, 8 };
		String[] woorden = { "woord1", "woord2" };
		Hond[] honden = { new Hond(), new Hond() };
		int[][] tweeDarray = { { 3, 4, 5 }, { 5, 7, 8 }, { 2, 6, 9 } };
		System.out.println(tweeDarray[1][2]); // geeft 8

	}
}

class Dier {
	int leeftijd;

	void ademen() {
		System.out.println("Het dier ademt nu");
	}
}

class Hond extends Dier {
	String hondenras;

	void blaffen() {
		System.out.println("Woef!");
	}
}
*/
	
/*
 * class Nederlander{ static final int aantalogen??; // oprichtingsdatum,
 * eerstekoning, volkslied, WOII, NL, static int belasting; //Stemrechtregels,
 * final gebdatum; woonplaats }
 * 
 * 
 * class Mens{ static final String brandstofSpier = "O2"; final String
 * vingerafdruk = ""; static int avondkloktijdstip; String kleurhaar; }
 * 
 * class Auto{ static final String doel??; final typemotor; static
 * rdwkeuringRegels;??? bekleding; }
 * 
 * 
 * class Plant{ static final boolean heeftCelwand = true; final zaaidatum;
 * static boolean naamNaturalis; String naamNaturalis; int aantalBladeren; }
 */
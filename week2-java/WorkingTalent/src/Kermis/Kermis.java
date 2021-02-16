package Kermis;

import java.util.Scanner;

public class Kermis {
	Botsauto botsauto;
	Spin spin;
	Spiegelpaleis spiegelpaleis;
	Spookhuis spookhuis;
	Hawaii hawaii;
	Ladderklimmen ladderklimmen;
	Kassa kassa;
	Attractie[] attractiePool;
		
	Kermis(){
		botsauto = new Botsauto();
		spin = new Spin();
		spiegelpaleis = new Spiegelpaleis();
		spookhuis = new Spookhuis();
		hawaii = new Hawaii();
		ladderklimmen = new Ladderklimmen();
		kassa = new Kassa();
		attractiePool = new Attractie[]{botsauto, spin, spiegelpaleis, spookhuis, hawaii, ladderklimmen};
	}
	
	public static void main(String args[]) {
		Kermis kermis1 = new Kermis();
		kermis1.start();
	}
	
	void start() {
		System.out.println("================================================================================");
		System.out.println("Welkom op de kermis.");
		System.out.println("Geef een getal tussen de 1 en de 6 om een attractie in te gaan.");
		System.out.println("Voor de totale omzet van de kermis, voer in 'o'.");
		System.out.println("Voor een overzicht van het aantal verkochte kaartjes per attractie, voer in 'k'.");
		System.out.println("Voor een bezoek van de belastinginspecteur, voer in 'b'.");
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			leesInput(sc);
		}
	}
	
	void leesInput(Scanner sc) {
		String s = sc.nextLine();
		char c = s.charAt(0);
		
		if (Character.isDigit(c)) {
			startAttractie(c);
		}else if (c == 'o'){
			kassa.geefOmzet();
		}else if (c == 'k'){
			telKaartjes();
		}else if (c == 'm') {
			vraagOmMonteur();
		}else if (c == 'b') {
			hefBelastingen();
		}
	}
	
	void startAttractie(char c) {
		double omzet = 0;
		int i = Character.getNumericValue(c);  // converteer input van character naar een integer
		
		if (i < 7) {
			Attractie attractie = attractiePool[i - 1];
			
			try{
				omzet = attractie.draaien();
			}catch(Exception e) {
				System.out.println("Deze attractie kan niet draaien. Geef een 'm' om deze te repareren.");
			}
			
		}else {
			System.out.println("Dit is geen getal tussen de 1 en 6!!");
		}
		
		kassa.schrijfBij(omzet);
	}
	
	void hefBelastingen() {
		System.out.println("De belastinginspecteur komt langs!");
		double belasting = 0;
		
		for (Attractie a : attractiePool) {
			if (a instanceof GokAttractie) {
				GokAttractie att = (GokAttractie) a;
				double temp = att.kansSpelBelastingBetalen();
				System.out.println("Er is " + temp + " kansSpelBelasting betaald van de " + a.naam + " attractie");
				
				belasting += temp;
			}
		}
		kassa.hefBelasting(belasting);
	}
	
	void vraagOmMonteur() {
		System.out.println("De monteur wordt gebeld.");
		
		for (Attractie a : attractiePool) {
			if (a instanceof RisicoRijkeAttractie) {
				RisicoRijkeAttractie att = (RisicoRijkeAttractie) a;
				
				if(att.aantalDraaien >= att.draaiLimiet) {
					att.onderhoudsBeurt();
					return;
				}
			}
		}
		
		System.out.println("De monteur heeft geen RisicoRijkeAttractie gevonden die over zijn draailimiet zit.");
	}
	
	void telKaartjes() {
		int totaal = 0;
		
		for (int i = 0; i < attractiePool.length; i++) {
			System.out.println("De attractie '" + attractiePool[i].naam + "' heeft " +
								attractiePool[i].aantalKaartjes + " kaartjes verkocht");
			totaal += attractiePool[i].aantalKaartjes;
		}
		
		System.out.println("In totaal zijn er dus " + totaal + " kaartjes verkocht");
	}
}

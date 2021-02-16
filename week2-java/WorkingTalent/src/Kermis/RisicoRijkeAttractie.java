package Kermis;

abstract public class RisicoRijkeAttractie extends Attractie {
	int draaiLimiet;
	int aantalDraaien;
	
	void opstellingsKeuring() {
		System.out.println("De attractie " + naam + " is hierbij gekeurd.");
	}
	
	void onderhoudsBeurt() {
		aantalDraaien = 0;
		System.out.println("Er heeft onderhoud plaatsgevonden bij de " + naam + " attractie.");
	}
	
	double draaien() throws Exception { 		// overridet de standaard draaien() van class Attractie
		if (aantalDraaien >= draaiLimiet) {
			throw new Exception();
		}else {
			System.out.println("De attractie " + naam + " draait nu.");
			aantalDraaien ++;
			aantalKaartjes ++;
			omzet += prijs;
			return prijs;
		}
	}
}

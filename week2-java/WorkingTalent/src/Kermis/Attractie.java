package Kermis;

public abstract class Attractie{
	String naam;
	double prijs;
	int oppervlakte;
	int aantalKaartjes = 0;
	double omzet = 0.;
	
	double draaien() throws Exception {
		System.out.println("De attractie " + naam + " draait nu.");
		aantalKaartjes ++;
		omzet += prijs;
		return prijs;
	}
}

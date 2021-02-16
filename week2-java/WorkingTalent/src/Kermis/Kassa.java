package Kermis;

public class Kassa {
	double totaleOmzet = 0;
	
	void schrijfBij(double nieuweOmzet) {
		totaleOmzet += nieuweOmzet;
	}
	
	void hefBelasting(double belasting) {
		totaleOmzet -= belasting;
	}
	
	void geefOmzet() {
		System.out.println("De totale omzet tot nu toe is: " + totaleOmzet);
	}
}

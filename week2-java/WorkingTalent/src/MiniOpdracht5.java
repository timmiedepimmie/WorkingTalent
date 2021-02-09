
public class MiniOpdracht5 {
	void repareerAutos() {
		Auto auto1 = new Auto(true, false, true, true);
		
		Monteur monteur1 = new Monteur();
		monteur1.repareer(auto1);
		monteur1.repareer(auto1); // de tweede reparatie kost geen geld, want alles is al gerepareerd.
		
		Auto auto2 = new Auto(true, false, false, false);
		monteur1.repareer(auto2);

		
	}
}

class Monteur {
	final int prijsPerOnderdeel = 25;
	
	void repareer(Auto auto) {
		int totaalPrijs = 0;
		boolean[] onderdelen = {auto.motor, auto.deur, auto.voorruit, auto.uitlaat};
		for (boolean onderdeelStuk : onderdelen) {
			if (onderdeelStuk){
				totaalPrijs += prijsPerOnderdeel;
			}
		}
		auto.motor = false;
		auto.deur = false;
		auto.voorruit = false;
		auto.uitlaat = false;
		
		System.out.println("De totaalprijs van deze reparatie is: " + totaalPrijs);
	}
}

class Auto {
	boolean motor;
	boolean deur;
	boolean voorruit;
	boolean uitlaat;
	
	Auto(boolean motor, boolean deur, boolean voorruit, boolean uitlaat) {
		this.motor = motor;
		this.deur = deur;
		this.voorruit = voorruit;
		this.uitlaat = uitlaat;
	}
	

}
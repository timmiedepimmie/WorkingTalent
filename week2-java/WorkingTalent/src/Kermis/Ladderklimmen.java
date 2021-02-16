package Kermis;

public class Ladderklimmen extends Attractie implements GokAttractie{
	Ladderklimmen(){
		naam = "Ladderklimmen";
		prijs = 5.;
	}
	
	public double kansSpelBelastingBetalen() {
		double belasting = omzet * 0.3;
		omzet = omzet - belasting;
		return belasting;
	}
}

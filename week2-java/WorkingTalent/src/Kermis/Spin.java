package Kermis;

public class Spin extends RisicoRijkeAttractie implements GokAttractie{
	Spin(){
		naam = "Spin";
		prijs = 2.25;
		draaiLimiet = 5;
		this.opstellingsKeuring();
	}
	
	public double kansSpelBelastingBetalen() {
		double belasting = omzet * 0.3;
		omzet = omzet - belasting;
		return belasting;
	}
}

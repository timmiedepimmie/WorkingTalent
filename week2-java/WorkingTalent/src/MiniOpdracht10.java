import java.util.Scanner;

public class MiniOpdracht10 {
	final int aantalRondjes = 5;
	String[] history = new String[aantalRondjes];
	
	void speelVakantieSpel() {		
		int rondje = 1;
		String huidigWoord = startSpel();
		history[0] = huidigWoord;
		
		while (rondje < aantalRondjes){
			printHistory();
			String input = vraagInput();
			boolean geaccepteerd = checkInput(huidigWoord, input);
			if(geaccepteerd) {
				huidigWoord = input;
				history[rondje] = input;
				rondje++;
			}else {
				System.out.println("Fout.. Probeer opnieuw. Geen hoofdletters a.u.b.");
			}
		}
		System.out.println("Fijne vakantie!");
	}
	
	void printHistory() {
		System.out.print("Gezegd is: " + history[0]);
		for (int i=1; i < aantalRondjes; i++) {
			String element = history[i];
			if (element != null) {
				System.out.print(", " + element);
			}
		}
		System.out.print(". Voer een nieuw item in: ");
	}
	
	String startSpel() {
		System.out.print("Ik ga op vakantie en neem mee... ");
		String in = vraagInput();
		return in;
	}
	
	String vraagInput() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		return input;
	}
	
	boolean checkInput(String vorigWoord, String input) {
		if(input.charAt(0) == vorigWoord.charAt(vorigWoord.length() - 1)){
			return true;
		}else {
			return false;
		}
	}
}

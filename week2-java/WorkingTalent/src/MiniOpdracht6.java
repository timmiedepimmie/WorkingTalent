import java.util.Arrays;
import java.util.Scanner;

public class MiniOpdracht6 {
	void sorteerLetters() {
		System.out.println("Dag gebruiker, welkom bij Mini Opdracht 6. Voer een String in...");
		Scanner sc = new Scanner(System.in);
		String woord = sc.nextLine();
		System.out.println("Bedankt voor uw input: \"" + woord + "\" Deze zal ik nu op alfabetische volgorde voor u zetten....");
		
		sorteer(woord);
	}
	
	
	/* 1. Dit sorteeralgoritme houdt een char array van het woord bij met bijbehorende ASCII waardes van elk karakter in een aparte int array.
	 * 2. Vind de laagste letterScore van het woord met bijbehorende index en sla de bijbehorende letter apart op (gesorteerd).
	 * 3. Verander diens letterScore in iets absurds hoog (9999).
	 * 4. Herhaal stap 2 en 3 (tweede for loop) totdat je elke letter op 9999 hebt gezet.
	 */
	void sorteer(String woord) {
		char[] gesorteerdWoord = new char[woord.length()];  // lege char array om later de letters één voor één toe te voegen
		char[] woordInChars = woord.toCharArray();
		int[] letterScores = maakLetterScores(woordInChars);
		
		for (int i=0; i < woordInChars.length; i++) {
			int laagsteScore = 9999;
			int kleinsteIndex = 9999;
			
			for (int j=0; j < woordInChars.length; j++) { 	//
				int score = letterScores[j];
				if (score < laagsteScore) {
					laagsteScore = score;
					kleinsteIndex = j;
				}
			}
			letterScores[kleinsteIndex] = 9999;			// zet de score van de "laagste" letter op 9999 zodat deze niet nogmaals gekozen wordt
			gesorteerdWoord[i] = woordInChars[kleinsteIndex];
		}
		
		System.out.println("Zie hier de letters van uw input in alfabetische volgorde: " + Arrays.toString(gesorteerdWoord));
	}
	
	int[] maakLetterScores(char[] woord) {				
		int[] letterScores = new int[woord.length];
		
		for (int i=0; i < woord.length; i++) {
			letterScores[i] = (int) woord[i]; 		// converteer het karakter in een ASCII waarde, en sla deze op in de int array
		}
		return letterScores;
	}
}

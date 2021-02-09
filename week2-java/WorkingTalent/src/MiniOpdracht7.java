import java.util.Arrays;
import java.util.Scanner;

public class MiniOpdracht7 {
	boolean woordGeraden = false;
	final String hetWoord = "fiets";
	
	void speelLingo() {
		System.out.println("Welkom bij Lingo! Voer uw woord in met de juiste lengte:");
		for (int i=0; i < hetWoord.length(); i++) {
			System.out.print("_ ");
		}
		
		while (!woordGeraden) {
			String input = vraagInput();
			beoordeelInput(input);
			
			if (input.equals(hetWoord)){
				System.out.println("Gefeliciteerd! U heeft het woord geraden!");
				woordGeraden = true;
			}
		}
	}
	
	String vraagInput() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		return input;
	}
	
	void beoordeelInput(String input) {
		char[] inputInChars = input.toCharArray();
		int[] eindScore = new int[input.length()];
		
		for (int i=0; i < inputInChars.length; i++) {
			char karakter = inputInChars[i];
			if (hetWoord.contains(Character.toString(karakter))) {
				eindScore[i] = 1;
				if (hetWoord.charAt(i) == karakter)  {
					eindScore[i] = 2;
				}
			}	
			else {
				eindScore[i] = 0;
			}
		}
		System.out.println(Arrays.toString(eindScore));
	}
}

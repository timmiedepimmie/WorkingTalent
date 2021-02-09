
public class MiniOpdracht2 {
	int telEs(String invoer) {
		int aantalE = 0;
		for (int i=0; i<invoer.length(); i++) {
			char letter = invoer.charAt(i);
			if (letter == 'e') {
				aantalE++;
			}
		}
		return aantalE;
	}
}

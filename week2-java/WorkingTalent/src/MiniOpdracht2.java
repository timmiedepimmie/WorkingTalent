
public class MiniOpdracht2 {
	void telEs(String invoer) {
		int aantalE = 0;
		for (int i=0; i<invoer.length(); i++) {
			char letter = invoer.charAt(i);
			if (letter == 'e') {
				aantalE++;
			}
		}
		System.out.println(aantalE + " e's zitten in het woord " + invoer);
		return;
	}
}

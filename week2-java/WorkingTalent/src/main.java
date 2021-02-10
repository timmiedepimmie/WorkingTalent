import java.util.Arrays;
import java.util.Scanner;

class mainProgramma {
	public static void main(String args[]) {
		MiniOpdracht1 opdr1 = new MiniOpdracht1();
		opdr1.plakSamen();
		
		MiniOpdracht2 opdr2 = new MiniOpdracht2();
		String woord = "hottentottententententoonstelling";
		opdr2.telEs(woord);
		
		MiniOpdracht3 opdr3 = new MiniOpdracht3();
		int[] arraytje = {4, 6, 8, 2, 4};
		opdr3.telArrayOp(arraytje);
		
		MiniOpdracht4 opdr4 = new MiniOpdracht4();
		opdr4.start();
		
		MiniOpdracht5 opdr5 = new MiniOpdracht5();
		opdr5.repareerAutos();
		
		//MiniOpdracht6 opdr6 = new MiniOpdracht6();
		//opdr6.sorteerLetters();
		
		//MiniOpdracht7 opdr7 = new MiniOpdracht7();
		//opdr7.speelLingo();
		
		MiniOpdracht8 opdr8 = new MiniOpdracht8();
		opdr8.start();
		
		MiniOpdracht9 opdr9 = new MiniOpdracht9();
		opdr9.start();
	}
}


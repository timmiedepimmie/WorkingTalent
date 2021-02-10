import java.util.Arrays;
import java.util.Scanner;

class mainProgramma {
	public static void main(String args[]) {
		printNieuweOpdracht(1);
		MiniOpdracht1 opdr1 = new MiniOpdracht1();
		opdr1.plakSamen();
		
		printNieuweOpdracht(2);
		MiniOpdracht2 opdr2 = new MiniOpdracht2();
		String woord = "hottentottententententoonstelling";
		opdr2.telEs(woord);
		
		printNieuweOpdracht(3);
		MiniOpdracht3 opdr3 = new MiniOpdracht3();
		int[] arraytje = {4, 6, 8, 2, 4};
		opdr3.telArrayOp(arraytje);
		
		printNieuweOpdracht(4);
		MiniOpdracht4 opdr4 = new MiniOpdracht4();
		opdr4.start();
		
		printNieuweOpdracht(5);
		MiniOpdracht5 opdr5 = new MiniOpdracht5();
		opdr5.repareerAutos();
		
		printNieuweOpdracht(6);
		//MiniOpdracht6 opdr6 = new MiniOpdracht6();
		//opdr6.sorteerLetters();
		
		printNieuweOpdracht(7);
		MiniOpdracht7 opdr7 = new MiniOpdracht7();
		opdr7.speelLingo();
		
		printNieuweOpdracht(8);
		MiniOpdracht8 opdr8 = new MiniOpdracht8();
		opdr8.start();
		
		printNieuweOpdracht(9);
		MiniOpdracht9 opdr9 = new MiniOpdracht9();
		opdr9.start();	
		
		printNieuweOpdracht(10);
		MiniOpdracht10 opdr10 = new MiniOpdracht10();
		opdr10.speelVakantieSpel();
	}
	
	static void printNieuweOpdracht(int i) {
		System.out.print("\n================Opdracht " + i + "================\n");
	}
}



public class MiniOpdracht8 {
	void start() {
		Kapitein kap1 = new Kapitein();
		Boot b1 = new Boot();
		SpeedBoot b2 = new SpeedBoot();
		
		kap1.varen(b1);
		kap1.varen(b2);
	}
}


class Boot{
	String type = "onbekend";
	
	void starten() {
		System.out.println("Vroem... de boot vaart");
	}
}

class SpeedBoot extends Boot{
	SpeedBoot() {
		type = "speedboot";
	}
}

class Kapitein{
	void varen(Boot b) {
		System.out.println("Laten we even gaan varen...");
		if (b.type == "speedboot") {
			System.out.println("Ik zet eerst even mijn pet af.");
		}
		b.starten();
	}
}

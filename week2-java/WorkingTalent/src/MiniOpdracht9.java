
public class MiniOpdracht9 {
	void start() {
		Vliegtuig v1 = new Vliegtuig();
		Spreeuw s1 = new Spreeuw();
		
		vliegen(v1);	
		vliegen(s1);
		Vliegend v2 = v1.maakVliegendObject();
		vliegen(v2);
	}
	
	void vliegen(Vliegend ding) {
		ding.stijgOp();
		System.out.println("Het object is nu aan het vliegen.");
	}
}

interface Vliegend{
	void stijgOp();
	Vliegend maakVliegendObject();
}

class Vliegtuig implements Vliegend{
	public Vliegend maakVliegendObject() {
		return new Vliegtuig();
	}
	
	public void stijgOp() {
		System.out.println("Het vliegtuig geeft gas en stijgt op");
	}
}

class Spreeuw implements Vliegend{
	public Vliegend maakVliegendObject() {
		return new Spreeuw();
	}
	
	public void stijgOp() {
		System.out.println("De spreeuw wappert met zijn vleugels en gaat de lucht in");
	}
}



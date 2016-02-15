public class Bil extends Kjoretoy{
	private int antSeter;

	Bil(int seter, String regNr){
		super(regNr);
		//this.regNr = regNr;
		antSeter = seter;
	}

	public void skrivUtAntSeter(){
		System.out.println("Antseter " + antSeter);
	}

	public void printUtKlasse(){
		System.out.println("Vi er i Bilklassen.");
	}

}
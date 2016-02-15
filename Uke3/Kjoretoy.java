abstract public class Kjoretoy{
	private String regNr;
	Kjoretoy(String regNr){
		this.regNr = regNr;
	}

	abstract public void skrivUtAntSeter();

	public void printUtKlasse(){
		System.out.println("Vi er i Kjoretoyklassen.");
	}
	
}
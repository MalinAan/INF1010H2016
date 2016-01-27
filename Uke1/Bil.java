public class Bil{
	private String regNr;
	private String bilModell;
	private int antSeter;

	Bil(String nr, String modell, int antSeter){
		this.regNr = nr;
		this.bilModell = modell;
		this.antSeter = antSeter;
	}

	public String toString(){
		return regNr;
	}
}
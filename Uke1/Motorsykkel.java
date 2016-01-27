public class Motorsykkel{
	private String regNr;
	private String type;

	Motorsykkel(String nr, String type){
		regNr = nr;
		this.type = type;
	}

	public String toString(){
		return regNr;
	}
}
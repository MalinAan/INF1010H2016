public class MainKlasse{
	public static void main(String[] args){
		Bil bilen = new Bil(5, "KM1234567");
		bilen.printUtKlasse();
		bilen.skrivUtAntSeter();
		
		Kjoretoy kjoreToyPeker = bilen;

		kjoreToyPeker.printUtKlasse();
		kjoreToyPeker.skrivUtAntSeter();
	}
}
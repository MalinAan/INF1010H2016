public class Person{
	private String navn;
	private Hus mittHus;
	
	Person(String n, Hus huset){
		navn = n;
		mittHus = huset;
	}

	public void skrivUtMinAdresse(){
		System.out.println("Min adresse er" + mittHus.hentAdresse());
	}
}
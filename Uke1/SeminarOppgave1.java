public class SeminarOppgave1{
	public static void main(String[] args){
		Hus huset = new Hus("Gokk");
		Person personen = new Person("Stig", huset);
		personen.skrivUtMinAdresse();
	}
}
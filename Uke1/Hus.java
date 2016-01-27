public class Hus{
	private String adresse;
	private Person eier;

	Hus(String adr){
		adresse = adr;
	}

	public String hentAdresse(){
		return adresse;	
	}

	public void settInnPerson(Person person){
		this.eier = person;
	}
}
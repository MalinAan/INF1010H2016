public class MainKlasse{
	public static void main(String [] args){
		Motorsykkel sykkelen = new Motorsykkel("12345", "Sykkel");
		Bil bilen = new Bil("JK123456", "Limosinen", 15);
		Bil hverdagsbilen = new Bil("BE123456", "Golf", 5);
		Parkeringsplass<Bil> bilplass = new Parkeringsplass<Bil>();
		bilplass.settInnKjoretoy(bilen);
		bilplass.settInnKjoretoy(hverdagsbilen);
		Parkeringsplass<Motorsykkel> sykkelplass = new Parkeringsplass<Motorsykkel>();
		//sykkelplass.settInnKjoretoy(sykkelen);
		//sykkelplass.settInnKjoretoy(hverdagsbilen);
	}
}
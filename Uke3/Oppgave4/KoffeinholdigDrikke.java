public abstract class KoffeinholdigDrikke implements Drikkbar{
	proctected String beskrivelse;
	proctected double koeffeininnhold; //mg per liter

	public double hentKoffeinInnhold(){
		return this.koeffeininnhold;
	}

	public String kortInfo(){
		return this.beskrivelse;
	}

    public Aldersgrense kanSelgesTil(){
    	return Aldersgrense.ALLE;
    }
}
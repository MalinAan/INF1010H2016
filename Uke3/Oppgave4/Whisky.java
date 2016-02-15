public class Whisky extends AlkoholholdigDrikke{
	private String opprinnelsesland;

	Whisky(String opprinnelsesland, String beskrivelse, int volum){
		super(beskrivelse, volum);
		this.opprinnelsesland = opprinnelsesland;
		//this.beskrivelse = beskrivelse;
		//this.volum = volum;
	}

	public String kortInfo(){
		return beskrivelse + " fra " + opprinnelsesland;
	}
}
public abstract class Vin extends AlkoholholdigDrikke{
	protected int aargang;

	public int hentAargang(){
		return aargang;
	}

	public String kortInfo(){
		return beskrivelse + " fra aargang " + aargang;
	}
}
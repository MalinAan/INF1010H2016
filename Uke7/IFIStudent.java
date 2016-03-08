import java.util.ArrayList;

public class IFIStudent extends Student{
	//private ArrayList<String> progSpraak = new ArrayList<String>();
	private SpraakListe<ProgSpraak> programmeringsSpraak = new SpraakListe<ProgSpraak>();
	private static String fakultet = "MatNat";

	IFIStudent(String navn){
		super(navn);
	}

	public String hentFakultet(){
		return fakultet;
	}

	public void leggTilSpraak(ProgSpraak nyttSpraak){
		programmeringsSpraak.leggTil(nyttSpraak);
	}

	public void skrivUtSpraak(){
		programmeringsSpraak.skrivUtSpraak();
	}



}
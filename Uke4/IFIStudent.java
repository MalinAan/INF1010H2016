import java.util.ArrayList;

public class IFIStudent extends Student{
	private ArrayList<String> progSpraak = new ArrayList<String>();
	private static String fakultet = "MatNat";

	IFIStudent(String navn){
		super(navn);
	}

	public String hentFakultet(){
		return fakultet;
	}



}
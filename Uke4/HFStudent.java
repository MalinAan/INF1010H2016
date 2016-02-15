public class HFStudent extends Student implements Hipster{
	private static String fakultet = "HF";
	private boolean kul = false;

	HFStudent(String navn){
		super(navn);
	}

	public String hentFakultet(){
		return fakultet;
	}

	public void taKaffePaaLokka(){
		kul = true;
	}

}
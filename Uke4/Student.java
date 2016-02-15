public abstract class Student{
	private int studID;
	private static int antallStudenter = 0;
	private String navn;

	Student(String navn){
		this.navn = navn;
		studID = antallStudenter;
		antallStudenter++;
	}

	public String toString(){
		return navn;
	}

	public void byttNavn(String nyttNavn){
		this.navn = nyttNavn;
	}

	abstract public String hentFakultet();
}
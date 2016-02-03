class NavneLagrer implements NavneBeholder{
	String navn;

	public void settInnNavn(String s){
		this.navn = s;
	}

	public String hentUt(){
		return navn;
	}
}
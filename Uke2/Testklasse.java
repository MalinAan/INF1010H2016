class Testklasse{
	public static void main(String[] args){
		NavneBeholder nb = new NavneLagrer();
		
		System.out.print("Tester om navn er null: ");
		if(nb.hentUt() == null){
			System.out.println("Passed.");
		} else {
			System.out.println("Failed.");
		}
		String navn = "Mathias";

		nb.settInnNavn(navn);

		System.out.print("Tester om navnet ble lagret: ");
		if(sjekkStreng(navn, nb.hentUt())){
			System.out.println("Passed.");
		} else {
			System.out.println("Failed");
		}

		System.out.print("Tester om navnet fremdeles ligger der: ");
		if(sjekkStreng(navn, nb.hentUt())){
			System.out.println("Passed.");
		} else {
			System.out.println("Failed");
		}
		
	}

	public static boolean sjekkStreng(String forventet, String strengen){
		if(forventet != null && forventet.equals(strengen)){
			return true;
		} return false;
	}
}
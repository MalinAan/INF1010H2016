/**
* Interface som lagrer et navn.
* @author mwaandah
*/

interface NavneBeholder{
	
	/**
	* Metode som setter inn et navn i beholderen.
	* @param s navnet som blir satt inn.
	*/
	void settInnNavn(String s);

	/**
	* Metode som returnerer navnet som er lagret i navnebeholderen.
	* Returnerer null dersom det ikke er noe navn.
	* @return navnet som er lagret i beholderen.
	*/
	String hentUt();
}
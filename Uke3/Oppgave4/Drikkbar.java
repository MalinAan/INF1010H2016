/**
 @author    Kristian Gregorius Hustad
 */


public interface Drikkbar {

    /**
     * Returnerer en streng med informasjon om drikken. 
     * @return      informasjon om drikken
     */
    public String kortInfo();

    /**
     * Returnerer aldersgrensen for kjoep av drikken
     * @return      aldersgrense for kjoep av drikken
     */
    public Aldersgrense kanSelgesTil();
}


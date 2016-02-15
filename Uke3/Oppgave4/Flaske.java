public class Flaske<D> implements DrikkeBeholder<D> {
    private D innhold; // flasken kan lagre 1 type drikke
    private int kapasitet; // enhet: ml

    /** 
     * Oppretter en tom flaske.
     * @param kapasitet     flaskens kapasitet (i milliliter)
     */
    public Flaske(int kapasitet) {


    }

    

    /**
     * @return kapasitet    flaskens kapasitet (i milliliter)
     */
    public int hentKapasitet() {

    }

    /**
     * Fyller flasken med innhold (eventuelt gammelt innhold forsvinner). 
     * @param innhold               innholdet flasken fylles med
     */
    public void fyllMed(D innhold) {

    }

    /**
     * Returnerer flaskens innhold (kan vaere null) og setter flaskens
     * innhold til null.
     * @return      flaskens innhold
     */
    public D toem() {


    }
}

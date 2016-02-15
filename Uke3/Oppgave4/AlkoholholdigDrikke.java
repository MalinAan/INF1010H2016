public abstract class AlkoholholdigDrikke implements Drikkbar {
    protected String beskrivelse;
    protected double volum; /* alkoholinnhold i prosent */


    Aldersgrense(String beskrivelse, double volum){
        this.beskrivelse = beskrivelse;
        this.volum = volum;
    }
    public double hentVolum() {
        return volum;
    }

    public String kortInfo() {
        return beskrivelse;
    }



    public Aldersgrense kanSelgesTil() {
        if(volum < 0.7){
            return Aldersgrense.ALLE;
        } else if(volum < 22){
            return Aldersgrense.OVER18;
        } return Aldersgrense.OVER20;
    }
}
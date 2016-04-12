/**
 * Created by malinaandahl on 12.04.16.
 */
public class LeggTilElementer implements Runnable {
    private Stakk<String> stakk;

    LeggTilElementer(Stakk<String> stakk){
        this.stakk = stakk;
    }

    public void run(){
        stakk.settInn("Miriam");
        stakk.settInn("Miriam");
        stakk.settInn("Miriam");
        stakk.settInn("Miriam");
        stakk.settInn("Miriam");
        stakk.settInn("Miriam");

    }
}

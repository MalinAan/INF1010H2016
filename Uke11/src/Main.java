/**
 * Created by malinaandahl on 12.04.16.
 */
public class Main {

    public static void main(String[] args) {
        Stakk<String> stakk = new Stakk<String>();

        Runnable leggTilElementer = new LeggTilElementer(stakk);
        Runnable hentUtElementer = new HentUtElementer(stakk);

        Thread leggerTil = new Thread(leggTilElementer);
        Thread henterUt = new Thread(hentUtElementer);

        leggerTil.start();
        henterUt.start();
    }
}

/**
 * Created by malinaandahl on 05.04.16.
 */
public class Bord {
    private final int ANTALL_MAALTIDER_TOTALT = 200;
    private final int MAKS_PAA_BORDET = 10;

    private int antallLaget = 0;
    private int antallPaaBordet = 0;
    private int antallServert = 0;

    //Kokkens metode
    public synchronized boolean settMaaltid(Kokk kokk){
        while(antallPaaBordet == MAKS_PAA_BORDET
                && antallLaget < ANTALL_MAALTIDER_TOTALT){

            try{
                System.out.println("Kokk nr " + kokk.hentId() + " venter.");
                wait();
            } catch(InterruptedException e){

            }

        }

        //Klar for aa legge pa et nytt maaltid!

        if(antallLaget < ANTALL_MAALTIDER_TOTALT){
            //Bordet er ikke fullt, aa vi skal fortsette aa lage.
            antallPaaBordet++;
            antallLaget++;

            System.out.println("Maaltid nr " + antallLaget + " er lagt paa bordet"
            + kokk.hentId() + " \t Antall tallerkner paa bordet: " + antallPaaBordet);
            notifyAll();

            if(antallLaget == ANTALL_MAALTIDER_TOTALT){
                //Vi er ferdige!
                return false;
            } else {
                //Vi fortsetter!
                return true;
            }
        } else {
            //Vi er ferdige!
            return false;
        }

    }


    //Kelners metode.

    public synchronized boolean hentMaaltid(Kelner kelner){
        while(antallPaaBordet == 0 && antallLaget < ANTALL_MAALTIDER_TOTALT){
            try{
                System.out.println("Kelner nr " + kelner.hentId() + " venter");
                wait();
            } catch(InterruptedException e){

            }
        }

        if(antallPaaBordet > 0){
            //Det er mat paa bordet!
            antallPaaBordet--;
            antallServert++;

            System.out.println("Maaltid nr " + antallServert + " servert av kelner "
            + kelner.hentId() + "\t Antall tallkerner paa bordet " + antallPaaBordet);
            notifyAll();

            if(antallLaget == ANTALL_MAALTIDER_TOTALT && antallPaaBordet == 0){
                //Vi er ferdige!
                return false;
            } else {
                //Vi fortsetter!
                return true;
            }
        } else{
            return false;
        }

    }
}

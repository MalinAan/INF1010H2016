/**
 * Created by malinaandahl on 12.04.16.
 */
public class HentUtElementer implements Runnable{

    private Stakk<String> stakk;

    HentUtElementer(Stakk<String> stakk){
        this.stakk = stakk;
    }

    public void run(){
        try{
            Thread.sleep(5000);
        } catch(InterruptedException e){

        }

        for(int i = 0; i < 5; i++){
            //Henter ut fem elementer.
            System.out.println("Hentet ut element " + stakk.hent());
        }
    }
}

/**
 * Created by malinaandahl on 05.04.16.
 */
public class Kelner implements Runnable {

    private Bord bordet;
    static int kelnerTeller = 1;
    private int id;

    public Kelner(Bord bord){
        this.bordet = bord;
        this.id = kelnerTeller++;

    }

    public void run(){
        try{
            while(bordet.hentMaaltid(this)){

                Thread.sleep(5000);
            }
        } catch(InterruptedException e){

        }

        //Kelner er ferdig
        System.out.println("Kelner " + id + " er ferdig");
    }

    public int hentId(){
        return id;
    }
}

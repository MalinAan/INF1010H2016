/**
 * Created by malinaandahl on 05.04.16.
 */
public class Kokk implements Runnable {

    private Bord bordet;
    static int kokketeller = 1;
    private int id;

    public Kokk(Bord bord){
        this.bordet = bord;
        this.id = kokketeller++;
        //id = kokketeller;
        //kokketeller++;

    }

    public void run(){

        try{
            while(bordet.settMaaltid(this)){
                //Det tar litt tid aa lage mat!
                Thread.sleep((long) (1000 * Math.random()));
            }
        } catch(InterruptedException e){

        }

        //Kokken er ferdig.
        System.out.println("Kokk " + id + " er ferdig");


    }

    public int hentId(){
        return id;
    }
}

/**
 * Created by malinaandahl on 29.03.16.
 */
public class RunnableTraad implements Runnable{

    private static int teller = 0;
    private int nr;
    public static int antTraader = 0;

    public RunnableTraad(){
        this.nr = teller;
        teller++;
        //System.out.println(teller);
    }

    public synchronized void update(){
        antTraader++;
    }

    public void run(){
        //System.out.println("Naa er vi i Runnable-klassen");
        update();
    }
}

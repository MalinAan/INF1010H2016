/**
 * Created by malinaandahl on 29.03.16.
 */
public class Main {
    public static void main(String[] args){
        TraadSubklasse subklasse = new TraadSubklasse();
        subklasse.start();
        System.out.println("Naa er vi i main");

        RunnableTraad[] runnableObjekter = new RunnableTraad[1000];
        Thread[] runnableTraader = new Thread[1000];
        for(int i = 0; i < 1000; i++){
            runnableObjekter[i] = new RunnableTraad();
            runnableTraader[i] = new Thread(runnableObjekter[i]);
            runnableTraader[i].start();
        }

        for(int i = 0; i < 1000; i++){
            try{
                runnableTraader[i].join();
            } catch(InterruptedException e){
                e.printStackTrace();
            }

        }

        System.out.println(RunnableTraad.antTraader);
        /*Thread runnableTraad = new Thread(new RunnableTraad());
        runnableTraad.start();*/

        //new Thread(new RunnableTraad()).start();


    }
}

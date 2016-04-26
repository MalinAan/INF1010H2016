/**
 * Created by malinaandahl on 26.04.16.
 */
public class Oppover implements Runnable {
    private int tall = Integer.MIN_VALUE;
    private Monitor monitor;

    Oppover(Monitor m){
        this.monitor = m;
    }

    public void run(){
        while(monitor.settMinste(tall)){
            tall++;
        }

        System.out.println("Oppover ble avsluttet. Tall:" + tall);
    }

}

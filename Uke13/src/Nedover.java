/**
 * Created by malinaandahl on 26.04.16.
 */
public class Nedover implements Runnable {
    private int tall = Integer.MAX_VALUE;
    private Monitor monitor;

    Nedover(Monitor m){
        monitor = m;
    }

    public void run(){
        while(monitor.settStorste(tall)){
            tall--;
        }

        System.out.println("Nedover ble avsluttet. Tall:" + tall);
    }
}

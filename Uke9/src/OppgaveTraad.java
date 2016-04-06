/**
 * Created by malinaandahl on 29.03.16.
 */
public class OppgaveTraad implements Runnable{

    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args){
        Thread t1 = new Thread(new OppgaveTraad());
        Thread t2 = new Thread(new OppgaveTraad());

        t1.setName("Admin");
        //t2.setName("Andre traad");
        t1.start();
        t2.start();
        System.out.println("Main traaden: " + Thread.currentThread().getName());
    }
}

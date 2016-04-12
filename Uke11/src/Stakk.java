/**
 * Created by malinaandahl on 12.04.16.
 */

import java.util.concurrent.locks.*;
//import java.util.*.*.*; sjekk etterpaa.

public class Stakk<E> {
    private Node forstILista;
    private final int MAX_GRENSE = 5;
    private int storrelse = 0;
    private Lock laas = new ReentrantLock();
    private Condition ikkeTom = laas.newCondition();
    private Condition ikkeFull = laas.newCondition();

    public void settInn(E element){

        laas.lock();
        //Laaser lista.

        while(storrelse == MAX_GRENSE){
            //Det er fullt i lista. Traad maa vente!
            System.out.println("Prover aa legge til element " + element.toString() +
                    " men maa vente");
            try{
                ikkeFull.await();
            } catch(InterruptedException e){

            }
        }

        //Traad faar lov til aa sette inn et element!
        Node nyNode = new Node(element);

        if(forstILista == null){
            //Lista er tom
            forstILista = nyNode;
        } else {
            //Mer enn ett element i lista.
            nyNode.neste = forstILista;
            forstILista = nyNode;
        }

        storrelse++;
        ikkeTom.signalAll();
        System.out.println(element.toString() + " ble lagt til!");
        laas.unlock(); //Gir fra oss laasen.

    }

    public E hent(){

        laas.lock();

        while(storrelse == 0){
            //Ingen elementer aa hente ut - enda
            System.out.println("Prover aa hente ut element, men listen er tom");

            try{
                ikkeTom.await();
            } catch(InterruptedException e){

            }
        }

        E element = forstILista.element;
        forstILista = forstILista.neste;

        System.out.println("Fikk hentet ut " + element.toString());
        storrelse--;

        ikkeFull.signalAll();

        laas.unlock();

        return element;

    }

    public class Node{
        E element;
        Node neste;

        Node(E element){
            this.element = element;
        }
    }
}

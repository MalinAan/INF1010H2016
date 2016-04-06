/**
 * Created by malinaandahl on 29.03.16.
 */

import java.util.*;
import java.io.*;

public class NummerAvOrdIFiler {
    public static void main(String[] args){
        ArrayList<File> filer = new ArrayList<File>();

        int antOrd;

        for(int i = 0; i < args.length; i++){
            filer.add(new File(args[i]));
        }

        System.out.println(Thread.activeCount());

        //OrdTeller ot;
        synchronized (filer){
            for(File fil : filer){
                new Thread(new OrdTeller(fil)).start();
            }
        }


        while(Thread.activeCount() > 1) {};
        //Alle traadene er ferdig.


        System.out.println("Antall ord " + OrdTeller.antOrd);



    }
}

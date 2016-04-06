/**
 * Created by malinaandahl on 29.03.16.
 */

import java.util.*;
import java.io.*;
public class OrdTeller implements Runnable {

    public static volatile int antOrd = 0;
    public File filen;
    Scanner in;

    OrdTeller(File minFil){
        filen = minFil;
    }

    public void run(){
        try{
            in = new Scanner(filen);
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }

        while(in.hasNextLine()){
            String line = in.nextLine();
            inkrementer(line.split(" ").length);
        }

    }

    public synchronized void inkrementer(int ant){
        antOrd += ant;
    }
}

/**
 * Created by malinaandahl on 05.04.16.
 */
public class Main {
    public static void main(String[] args) {
        Bord bord = new Bord();

        for(int i = 0; i < 6; i++){
            new Thread(new Kokk(bord)).start();
            new Thread(new Kelner(bord)).start();
        }
    }
}

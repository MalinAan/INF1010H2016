/**
 * Created by malinaandahl on 26.04.16.
 */
public class Main {

    public static void main(String[] args) {
        Monitor m = new Monitor();

        new Thread(new Nedover(m)).start();
        new Thread(new Oppover(m)).start();
    }
}

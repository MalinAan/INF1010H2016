/**
 * Created by malinaandahl on 26.04.16.
 */
public class Monitor {
    private int detMinste = Integer.MIN_VALUE;
    private int detStorste = Integer.MAX_VALUE;

    public synchronized boolean settMinste(int tall){
        if(tall < detStorste){
            //Tilstandspaastanden holder!
            detMinste = tall;
            return true;
        }
        //Tilstandspaastanden holder ikke!
        return false;
    }

    public synchronized boolean settStorste(int tall){
        if(tall > detMinste){
            //Tilstandspaastanden holder!
            detStorste = tall;
            return true;
        }

        return false;
    }


}

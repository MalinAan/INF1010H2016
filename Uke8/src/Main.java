/**
 * Created by malinaandahl on 15.03.16.
 */
public class Main {
    public static void main(String[] args) {

        //Exceptionhaandtering
        try{
            metode1();
        } catch(MittException e){
            System.out.println("Inne i catch");
            e.printStackTrace();
        } finally {
            System.out.println("Blokk ferdig");
        }
        System.out.println("Ferdig med try/catch");

        //Rekursjon
        int [] array = {4, 6, 7, 2, 4};

        System.out.println("Resultat: " + finnMax(array, (array.length - 1)));

    }

    public static void metode1() throws MittException{
        metode2();
    }

    public static void metode2() throws MittException{
        metode3();
    }

    public static void metode3() throws MittException{
        throw new MittException();
    }

    public static int finnMax(int[] array, int index){
        if(index == 0) {
            return array[0];
        }
        return Math.max(array[index], finnMax(array, (index-1)));

    }
}

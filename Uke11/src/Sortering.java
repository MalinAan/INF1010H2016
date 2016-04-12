/**
 * Created by malinaandahl on 12.04.16.
 */

import java.util.Arrays;

public class Sortering {

    public static void main(String[] args) {
        int[] array = {4, 5, 7, 1, 2, 9, 0};
        int[] array2 = {3, 4, 2, 1, 1};
        bobbleSortering(array);
        bobbleSortering(array2);

        flett(array, array2);


    }

    public static void bobbleSortering(int[] array){
        //int temp;

        for(int i = 0; i < array.length - 1; i++){
            for(int j = 1; j < array.length - i; j++){
                if(array[j - 1] > array[j]){
                    //Maa byttes plass!
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));

    }

    public static void flett(int[] array1, int[] array2){
        //Forutsetter at arrayene er allerede sortert.

        int[] resultat = new int[array1.length + array2.length];

        int indeks1 = 0;
        int indeks2 = 0;

        for(int i = 0; i < resultat.length; i++){
            if(indeks2 >= array2.length ||
                    (indeks1 < array1.length && array1[indeks1] < array2[indeks2])){
                //Skal legge fra array 1
                resultat[i] = array1[indeks1];
                indeks1++;
            } else {
                //Skal legge fra array 2
                resultat[i] = array2[indeks2];
                indeks2++;
            }


        }

        System.out.println(Arrays.toString(resultat));

    }

}

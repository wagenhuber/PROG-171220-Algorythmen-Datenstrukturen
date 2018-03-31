import java.lang.reflect.Array;
import java.util.*;

public class Testklasse {


    //Minimumsuche 29.03.18
    public static int minimumSuche(int[] array) {
        int minimum = array[0];
        int position = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
                position = i;
            }

        }
        return position;
    }


    public static void main(String[] args) {

        int[] array = {3, 4, 9, 23, 25, 2, 99};

        //Minimum-Suche
        System.out.println("Minimum-Suche: " + minimumSuche(array));

        //Binäre-Suche:
        System.out.println(Arrays.binarySearch(array, 99));


        Arrays.sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }

    }



}

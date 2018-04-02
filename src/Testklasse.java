import java.lang.reflect.Array;
import java.util.*;

public class Testklasse {

    public static void ausgabeIntArray(int[] array) {
        for (int i : array) {
            System.out.printf("%d / ", i);
        }
    }


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


    //Selection-Sort


    public static void selectionSort(int[] array) {
        int position;
        int minimum;
        for (int i = 0; i < array.length - 1; i++) {
            position = i;
            minimum = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    minimum = array[j];
                    position = j;
                }
            }
            array[position] = array[i];
            array[i] = minimum;
        }
    }


    public static void selectionSortWrapperClass(Integer[] array) {
        int position;
        int minimum;
        for (int i = 0; i < array.length - 1; i++) {
            position = i;
            minimum = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    minimum = array[j];
                    position = j;
                }
            }
            array[position] = array[i];
            array[i] = minimum;
        }
    }


    public static void main(String[] args) {

        int[] array = {13, 4, 9, 27, 25, 2, 99};
        Integer[] array2 = {13, 4, 9, 27, 25, 2, 99};


        //Minimum-Suche
        //System.out.println("Minimum-Suche: " + minimumSuche(array));

        //Binäre-Suche:
        //System.out.println(Arrays.binarySearch(array, 99));


        System.out.println("Ausgabe unsortiert:");
        ausgabeIntArray(array);

        System.out.println();
        System.out.println("Ausgabe sortiert:");
        selectionSort(array);
        ausgabeIntArray(array);

        System.out.println();
        System.out.println("Sortierte Array von Wrapper-Class");
        selectionSortWrapperClass(array2);
        System.out.println(Arrays.asList(array2));


    }


}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * Typen: Eindimensional / Mehrdimensionale - Arrays
 * Arrays besitzen feste, unveränderbare Länge (immutable = unveränderbar)
 * Länge kann abgefragt werden mit Length() -> gibt immer die Menge zurück, die im Element platz finden
 *
 *
 * Viele Funktion von Collections können mit Arrays verwendet werden!
 * Dazu muss mittels Arrays.asList() das Array in eine Liste kopiert werden
 */


public class Sample_Array {


    public static void main(String[] args) {

        int[] array1 = {3, 4, 9, 23, 25, 2, 99};
        Integer[] array2 = {3, 9, -1, 0};
        int[] array3 = new int[2]; //Array mit Platz für 2 Elemente;


        System.out.println(array3.length);
        array3[0] = 0;
        array3[1] = 1;
        //array3[2] = 2; // Erzeugt "IndexOutOfBoundsException", da Array max 2 Elemente aufnehmen kann!


        //Maximsuche über Klasse Collections
        System.out.println(Collections.max(Arrays.asList(array2)));


        //Array in Liste umwandeln mittels Arrays.asList() Achtung geht nur mit Arrays von Wrapperklassen!
        List<Integer> newList = Arrays.asList(array2);
        //Array auf Console ausgeben:
        System.out.println(newList);


        //Array in neues Array kopieren
        int[] array4 = array1.clone();





    }

}

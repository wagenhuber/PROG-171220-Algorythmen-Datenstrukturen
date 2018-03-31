import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sample_Array {


    public static void main(String[] args) {

        int[] array1 = {3, 4, 9, 23, 25, 2, 99};
        Integer[] array2 = { 3, 9, -1, 0 };


        //Maximsuche über Klasse Collections
        System.out.println( Collections.max( Arrays.asList( array2 ) ) );
//Collections.max()


        //Array in Liste umwandeln miottels Arrays.asList()
        List<Integer> newList = Arrays.asList(array2);
        System.out.println(newList);


    }

}

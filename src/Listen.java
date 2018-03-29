import java.util.*;

public class Listen {

    public static void main(String[] args) {

        ArrayList<Integer> liste = new ArrayList<Integer>(100);
        List<Integer> liste2 = Arrays.asList(2, 5, 6, 7, 1, 22, 4, 4252, 25);
        List<String> liste3 = Arrays.asList("Anna", "Otto", "Benno");


        System.out.println(liste.isEmpty());
        liste.add(4);
        liste.add(5);
        liste.add(0);

        for (Integer integer : liste) {
            System.out.println(integer + " ");
        }


        for (Integer integer : liste2) {
            System.out.println(integer);
        }


        Iterator iterator = liste.iterator();
        while (iterator.hasNext()) {
            int i = (int) iterator.next();
            if (i == 0) {
                iterator.remove();
            }
        }

        List<String> list = new ArrayList<String>();
        Collections.addAll( list, "b", "c", "d" );

        ListIterator<String> it = list.listIterator();

        it.next();
        it.add( "a" );                     // Vorne anfügen
        System.out.println( list );        // [a, b, c, d]

    }



}

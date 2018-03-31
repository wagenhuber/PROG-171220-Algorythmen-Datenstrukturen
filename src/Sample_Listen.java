import java.util.*;

public class Sample_Listen {


    /**
     * "java.util.Collections" = Utiliy-Klasee -> bietet Methoden / allte Methoden sind statisch
     * "Collection" = Interface
     *
     * Collections -> Listen -> ArrayList / LinkedList
     * Collections -> Sets -> HashSet / TreeSet
     * Collections -> Maps -> HashMap (Key-Value-Store)
     */


    public static void ausgabeArray() {

    }



    public static void main(String[] args) {


        //ArrayList erstellen:
        ArrayList<Integer> liste = new ArrayList<Integer>(100);


        //List erstellen
        List<Integer> liste2 = Arrays.asList(2, 5, 6, 7, 1, 22, 4, 4252, 25);
        List<String> liste3 = Arrays.asList("Anna", "Otto", "Benno");
        List<String> list = new ArrayList<String>();


        //Liste manuell befüllen
        System.out.println(liste.isEmpty());
        liste.add(4);
        liste.add(5);
        liste.add(0);


        //Liste mit mehreren Werten befüllen
        Collections.addAll(list, "b", "c", "d");



        //Element von Liste entfernen
        Iterator iterator = liste.iterator();
        while (iterator.hasNext()) {
            int i = (int) iterator.next();
            if (i == 0) {
                iterator.remove();
            }
        }


        //Element zu Liste hinzufügen -> bestimmte Position mittels ListOperator
        ListIterator<String> it = list.listIterator();
        it.next();                      //eine Position nach vorne springen "von 0 -> 1 "
        it.add("a");                     // an position 1 anfügen
        System.out.println(list);        // [b, a, c, d]



        //Prüfen ob Wert in Liste - Rückgabe boolean:
        System.out.println(list.contains("d"));


        //Liste nach Wert durchsuchen und dessen Position zurückgeben:
        System.out.println(Arrays.binarySearch(list.toArray(), "c"));



        //Minimumsuche mit Klasse "Collections"
        System.out.println(Collections.min(liste2));


        //liste aufsteigend sortieren
        Collections.sort(liste2);
        System.out.println(liste2);


        //Liste in Array umwandeln:
        String[] namen = (String[]) liste3.toArray(new String[0]);
        String[] namen2 = (String[]) liste3.toArray(new String[liste3.size()]);
        System.out.println(namen.toString());











    }//ende main


}

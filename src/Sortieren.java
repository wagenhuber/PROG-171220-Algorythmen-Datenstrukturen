public class Sortieren {

    //Allgemein
    //Angabe der Komplexität in der sog. "Landau-Notation"


    //Werte für Beipiel an Tafel: 18 / 3 / 42 / 28 / 42 / 8

    /**
     * Selection Sort (mit Minimum-Suche):
     * Hole jeweils das kleinste Element nach vorn:
     * Nutzt die Minimum-Suche!
     * Stabilität: nicht stabil (siehe Anmerkung unten!!)
     */
//Wichtig für Abschlussprüfung - Kodieren + Bestimmung Laufzeit
    public static void selectionSort(int[] array) {
        int  position;
        int minimum;
        for (int i = 0; i < array.length - 1; i++) {
            minimum = array[i];
            position = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minimum) {
                    minimum = array[j];
                    position = j;
                }

            }
            array[position] = array[i];
            array[i] = minimum;
        }

    }

    //Analyse Laufzeit:
    //Best Case: O(n²)
    //Average Case: O(n²)
    //Worst Case: O(n²)

    //Analyse Speicher: O(1) (Konstant, nicht abhängig von der Länge des Arrays)

    //Stabilität: nicht stabil






    /**
     * Bubble Sort:
     * große Zahlen wandern nach oben:
     * Stabilität: stabil
     */

    public static void bubbleSort(int[] array) {
        boolean getauscht;
        do {
            getauscht = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    getauscht = true;
                }
            }
        } while (getauscht);
    }

    //Analyse Laufzeit:
    //Best Case: O(n)
    //Average Case: O(n²)
    //Worst Case: O(n²)

    //Analyse Speicher: O(1) (Konstant, nicht abhängig von der Länge des Arrays)

    //Stabilität: stabil




    /**Insertion-Sort
     * Sortiere die jeweils nächste Zahl ein
     */

    //Werte für Beipiel an Tafel: 5 / 7 / 0 / 3 / 2 / 4

    public static void insertionSort(int[] a) {
        int i;
        int j;
        int t;

        for (i = 1; i < a.length; i++){
            j = i;
            t = a[j];
            while (j > 0 && a[j] > t){
                j--;
            }
            a[j] = t;
        }
    }
    //Analyse Laufzeit:
    //Best Case: O(n)
    //Average Case: O(n²)
    //Worst Case: O(n²)

    //Analyse Speicher: O(1)

    //Stabilität: stabil


    //#####Bessere Sortieralgorythmen - Prinzip "Devide and Conquer############
    //Allgemein
    //=========
    /**Paradigma: Divide an Conquer (Teile und Behersche / Zusammensetzen)
     * 1) Aufteilen eines Problems in Teilprobleme (unsortierte Teilfolgen)
     * 2) Lösen (Beherschen) der Teilprobleme => Teillösungen (sortierte Teilsorgen)
     * 3) Zusammensetzen (Combine) der Teillösungen zur Gesamtlösung (sortierte Teilfolgen zu Gesamtfolge zusammensetzen)
     * Meist mit Rekursion
     */

    //Schritt 2

    public static int[] sort(int[] a){
        int l = a.length / 2;
        if(l == 0){
            return a;
        }
        int[] b = new int[l];
        int[] c = new int[a.length - l];
        for(int i = 0; i < b.length; i++){
            b[i] = a[i];
        }
        for(int i = l; i < a.length; i++ ){
            c[i - l] = a[i];
        }
        return merge(sort(b), sort(c));

    }


    //======================================================



//Option Schritt 3 MergeSort:

    /**MergeSort (Merge = Zusammensetzen)
     * 1) Aufteilen des Array in neue, kleinere Arrays
     * 2) Sortieren der Teil-Arrays und übergabe an MergeSort
     * 3) Zusammensetzen der sortierenten Arrays zu einem neuem Array
     */



    private static int[] merge(int[] a, int[] b){
        int[] c = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length){
            if(a[i] < b[j]){
                //Zum Verständnis:
                //k++ => Post-Inkrement (erst auswerten, dann erhöhen)
                //++k => Pre-Inkrement (erst erhöhen, dann auswerten)
                c[k++] = a[i++];
            }else{
                c[k++] = b[j++];
            }
        }
        while (i < a.length){
            c[k++] = a[i++];
        }
        while (j < b.length){
            c[k++] = b[j++];
        }
        return c;
    }

    //Analyse Laufzeit:
    //alle Fälle O(n * log n)) -> schnellste Sortierfunktion überhaupt!! ->  < (kleiner als) O(n²)

    //Stabilität: stabil

    //Analyse Speicher:
    //zusätzlicher Platz O(n) -> hoher Speicherbedarf! -> sortieren von 1000 Werten -> Platzbedarf im Speicher für 2000 Werte!






    //Option Schritt 3 QuickSort:
    /**QuickSort
     * 1) Aufteilen des Array anhand eines Pivot-Element (Wert in der Mitte)
     * 2) Werte im Vergleich zum Pivot-Element vorsortieren (links < Pivot-Elemnt | rechtes >= Pivot-Element
     * 3) Neue PivotElemente links und rechts festlegen und erneut durchführen
     * Wichtig: In Java bereits fertig implementiert (muss nicht mehr selbst programmiert werden)-> aufruf auf Array: Arrays.sort(array)
     */

    //Analyse Laufzeit:
    //BestCase O(n * log n)
    //WorstCase O(n²))

    //Analyse Speicher: O(n * log n)

    //Stabilität: nicht stabil






    //Allgemein
    //Anmerkung Stabilität:
    //Unterscheidung bei Sortieralgorythmen nach "stabil" vs. "nicht stabil"
    //Stabil: Reihenfolge von Dupletten bleibt erhalten
    //Nicht Stabil: Reihenfolge bleibt nicht erhalten! -> z.B. bei MergeSort!!!

}


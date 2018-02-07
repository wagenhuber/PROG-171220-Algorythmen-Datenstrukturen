public class Sortieren {

    //Werte für Beipiel: 18 / 3 / 42 / 28 / 42 / 8

    /**
     * Selection Sort: Hole jeweils das kleinste Element nach vorn:
     * @param array
     */
//Wichtig für Abschlussprüfung - Kodieren + Bestimmung Laufzeit

    public static void selectionSort(int[] array) {
        int position;
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
    //Best Case: O(n2)
    //Average Case: O(n2)
    //Worst Case: O(n2)

    //Analyse Speicher:
    //Konstant, nicht abhängig von der Länge des Arrays => O(1)


    /**
     * Bubble Sort: große Zahlen wandern nach oben:
     */

    public static void bubbleSort(int[] array){
        boolean getauscht;
        do {
            getauscht = false;
            for (int i = 0; i < array.length - 1; i++) {
                if(array[i] > array[i+1]){
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
    //Average Case: O(n2)
    //Worst Case: O(n2)

    //Analyse Speicher:
    //Konstant, nicht abhängig von der Länge des Arrays => O(1)

}


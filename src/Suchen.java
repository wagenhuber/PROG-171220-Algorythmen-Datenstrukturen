public class Suchen {

    /** Lineare Suche
     * Laufzeit O(n)
     * Ist Wert in Menge enthalten?
     */


    // Soll in Abschlussprüfung erklärt werden können in ein paar Sätzen, bzw. an Tafel
    //Mit der Anzahl der Werte steigt die Laufzeit linear an!


    //Beispiel: Minimum-Suche:
    public static int minimumSuche (int[] array) {
        int position = 0;
        int minimum = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
                position = i;
            }
        }
        return position;
    }




    /** Binäre Suche (Arrays.brinarySearch(...))
     * Laufzeit O(log² n)
     */


}

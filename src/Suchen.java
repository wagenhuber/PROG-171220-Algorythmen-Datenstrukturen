public class Suchen {

    /** Lineare Suche
     * Laufzeit O(n)
     * Ist Wert in Menge enthalten?
     * Wichtig: Die Position des Minimums im Array wird zurückgegeben, NICHT der Wert des Minimum!
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




    /** Binäre Suche (Arrays.brinarySearch(...)) / = "Halbierungssuche" -> sehr effizient
     * Laufzeit O(log² n)
     * Ist bereits in Java implementiert -> liefert Position des gesuchten Wertes im Array zurück. Suchwert kann angegeben werden!
     */


}

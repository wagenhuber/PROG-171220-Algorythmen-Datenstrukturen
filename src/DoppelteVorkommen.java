public class DoppelteVorkommen {

    /**Doppelte Vorkommen in einem UNSORTIERTEN Array ermitteln
     *
     * @param array
     * @return
     */

    //Laufzeit quadartisch O(n2)

    public static boolean doppelteVorkommenUnsortiert(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] == array[j]){
                    return true;
                }

            }

        }
        return false;
    }

    /**Doppelte Vorkommen in einem SORTIERTEN Array ermitteln
     *
     * @param array
     * @return
     */

    //Laufzeit linear O(n) = schneller!

    public static boolean doppelteVorkommenSortiert(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
                if(array[i] == array[i+1]){
                    return true;
                }

            }
        return false;
    }


}

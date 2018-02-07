public class SummeMultiDimArray {

    //Summe aller Werte in einem Multidimensionalen Array
    public static int summe(int[][] a){
        int summe = 0;
        for (int zeile = 0; zeile < a.length; zeile++){
            for (int spalte = 0; spalte < a[zeile].length; spalte++) {
                summe += a[zeile][spalte];

            }
        }
        return summe;
    }

}

import java.util.Arrays;
import java.util.Scanner;

/**
 * Quersumme Beispiel:
 * Zahl n = 36036 die dezimale Quersumme q(n) = 3 + 6 + 0 + 3 + 6 = 18
 */


public class Quersumme {

    //Quersumme aus int mittels Modulo(Restwert)
    public static int berechneQuersumme(int zahl) {
        int summe = 0;
        while (0 != zahl) {
            // addiere die letzte ziffer der uebergebenen zahl zur summe
            summe = summe + (zahl % 10);
            // entferne die letzte ziffer der uebergebenen zahl
            zahl = zahl / 10;
        }
        return summe;
    }


    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte ganze Zahl eingeben: ");
        int eingabe = scanner.nextInt();
        scanner.close();

        String trenner = ((Integer) eingabe).toString();

        char[] zahlen = trenner.toCharArray();


        int quersumme = 0;
        int[] a = new int[zahlen.length];

        for (int i = 0; i < zahlen.length; i++) {
            //quersumme += ((int) zahlen[i]);

            a[i] = ((int) zahlen[i]);
            quersumme += a[i];
        }


        System.out.println("Die Quersumme lautet: " + quersumme);*/


        int zahl = 127;
        int summe = 0;

        while (zahl != 0) {
            summe += (zahl % 10);
            zahl = zahl / 10;
        }
        System.out.println(summe);

    }

}

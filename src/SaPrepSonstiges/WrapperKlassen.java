package SaPrepSonstiges;

import javafx.beans.property.BooleanProperty;

public class WrapperKlassen {

    public static void main(String[] args) {

        double zahl0 = 1.8;
        int zahl1 = 5;

        Integer zahl2 = zahl1;
        System.out.println(zahl2.toString());

        //double aus int erzeugen:
        double zahl3 = zahl2.doubleValue();
        System.out.println(zahl3);


        //int aus double erzeugen
        int zahl4 = ((Double) zahl0).intValue();
        System.out.println(zahl4);




    }

}

package SaPrepSonstiges;

public class Tiger {

    public static int zahl1 = 1;

    public Tiger() {
    }

    public Tiger(int zahl) {
        zahl1 = zahl;
    }


    public static void main(String[] args) {

        //Statisches Datenfeld kann zur Laufzeit verändert werden, mit Programmneustart wieder ursprungswert!
        System.out.println(Tiger.zahl1);
        new Tiger(2);
        System.out.println(Tiger.zahl1);
        new Tiger();
        System.out.println(Tiger.zahl1);
    }

}

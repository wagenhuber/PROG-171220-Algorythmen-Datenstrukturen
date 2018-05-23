package SaPrepSonstiges;

public class StringMethoden {

    public static void main(String[] args) {

        String test = "  Autobahn  ";
        String test2 = "Landstrasse";
        String test3 = "";

        System.out.println(test);

        //Leerzeichen abschneiden
        System.out.println(test.trim());

        //String in char[] umwandeln
        char[] meinZeichenArray;
        meinZeichenArray = test2.toCharArray();
        System.out.println(meinZeichenArray[1]);

        //Abschneiden mittels Substring
        System.out.println(test2.substring(4));

        //Leerstring prüfen
        System.out.println(test3.isEmpty());

        //Buchstabe aus String extrahieren
        System.out.println(test2.charAt(4));


        //String erzeugen, verändern mittels StringBuilder
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Gottes");
        System.out.println(stringBuilder.toString());
        stringBuilder.append(" Werk ");
        System.out.println(stringBuilder.toString());

        System.out.println(stringBuilder.append(8));


        //String aus int erzeugen
        int i = 123;
        String a = String.valueOf(i);

    }

}

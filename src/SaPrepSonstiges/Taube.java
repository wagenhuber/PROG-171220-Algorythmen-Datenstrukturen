package SaPrepSonstiges;

import java.util.ArrayList;
import java.util.List;

public class Taube extends Tier {

    public String publicText = "publicTaube";
    private String privateText = "privateTaube";

    public void taubenMethode() {
        System.out.println("Ich bin ein Taube!");
    }

    @Override
    public void tierMethode() {
        System.out.println("ich bin nicht nur ein Tier, sondern noch mehr...");
    }

    public static void main(String[] args) {

        //Listen erstellen
        List<Tier> tierList = new ArrayList<>();
        List<Taube> taubeList = new ArrayList<>();

        //Objekte erstellen normal und polymorph
        Tier tier1 = new Tier();
        Tier tier2 = new Taube();
        Taube tier3 = new Taube();


        tierList.add(tier1);
        tierList.add(tier2);
        tierList.add(tier3); //Kindklasse wird automatisch auf Elternklasse gecastet

        taubeList.add(((Taube) tier2));//Elternklasse muss von Hand auf Kindklasse gecastet werden

        //Zugriff auf Datenfelder
        System.out.println("####Tier2: Datenfeld Elternklasse####");
        System.out.println(tier2.publicText);
        System.out.println("####Tier2: Datenfeld Kindeklasse####");
        System.out.println(((Taube) tier2).publicText);

        System.out.println();

        System.out.println("####Tier3: Datenfeld Elternklasse####");
        System.out.println(((Tier) tier3).publicText); //public Datenfeld existiert 2 Mal! In Parent und in Child!
        System.out.println("####Tier3: Datenfeld Kindeklasse####");
        System.out.println(tier3.publicText);

        System.out.println();


        System.out.println("####Zugriff privates Datenfeld####");
        System.out.println(tier1.getPrivateText()); //priv. Datenfeld existiert nur 1x bei Elternklasse
        System.out.println(tier2.getPrivateText());
        System.out.println(tier3.getPrivateText());

        System.out.println();


        //Vererbung von Methoden
        System.out.println("####tier-methoden####");
        tier1.tierMethode();
        tier2.tierMethode();//nutzt direkt überschriebene Methode der Kindklasse (wegen Konstrukturaufruf new Taube()
        ((Tier) tier2).tierMethode();//Trotz des CAST => Es wird trotzdem immer die Überschriebene Implemeniterung der Methode verwendet
        tier3.tierMethode();//methode in Kindklasse überschrieben, diese wird immer genutzt

        System.out.println();

        System.out.println("####tauben-methoden####");
        ((Taube) tier2).taubenMethode();//muss für Zugriff auf tauben-methode erst gecastet werden
        tier3.taubenMethode();//besitzt Methode direkt

        System.out.println();

        System.out.println("####tier-methode2 (nicht überschrieben)####");
        tier1.tierMethode2();
        tier2.tierMethode2();
        tier3.tierMethode2();

        System.out.println();

        System.out.println("####ForEach von Tierliste:####");
        for (Tier tier : tierList) {
            tier.tierMethode();
        }



    }
}

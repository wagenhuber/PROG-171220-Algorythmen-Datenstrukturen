package SaPrepSonstiges;

public class Tier {

    private String privateText;
    public String publicText;
    protected String protectedText;
    String paketsicher;

    public Tier() {

        privateText = "privateTier";
        publicText = "publicTier";
        protectedText = "protectedTier";
        paketsicher = "paketsicherTier";

    }

    public String getPrivateText() {
        return privateText;
    }

    public void setPrivateText(String privateText) {
        this.privateText = privateText;
    }

    public String getPublicText() {
        return publicText;
    }

    public void setPublicText(String publicText) {
        this.publicText = publicText;
    }

    public String getProtectedText() {
        return protectedText;
    }

    public void setProtectedText(String protectedText) {
        this.protectedText = protectedText;
    }

    public String getPaketsicher() {
        return paketsicher;
    }

    public void setPaketsicher(String paketsicher) {
        this.paketsicher = paketsicher;
    }

    public void ausgebeTest() {
        System.out.println("TEST");
    }

    public void tierMethode() {
        System.out.println("Ich bin nur ein Tier!");
    }

    public void tierMethode2() {
        System.out.println("Ich bin nur ein Tier! (Methode2)");
    }

    private void tierMethode3() {
        System.out.println("Ich bin nur ein Tier! (Methode3)");
    }

}

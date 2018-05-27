package SaPrepSonstiges;

public class Tier {

    private String privateText;
    public String publicText;
    protected String protectedText;
    String paketsicher;

    public Tier() {

        privateText = "private";
        publicText = "public";
        protectedText = "protected";
        paketsicher = "paketsicher";

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

}

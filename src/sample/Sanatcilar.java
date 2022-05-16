package sample;

public class Sanatcilar {

    private int sanatciID;
    private String sanatciAd;
    private String sanatciUlke;

    public Sanatcilar(int sanatciID, String sanatciAd, String sanatciUlke) {
        this.sanatciID = sanatciID;
        this.sanatciAd = sanatciAd;
        this.sanatciUlke = sanatciUlke;
    }

    public int getSanatciID() {
        return sanatciID;
    }

    public void setSanatciID(int sanatciID) {
        this.sanatciID = sanatciID;
    }

    public String getSanatciAd() {
        return sanatciAd;
    }

    public void setSanatciAd(String sanatciAd) {
        this.sanatciAd = sanatciAd;
    }

    public String getSanatciUlke() {
        return sanatciUlke;
    }

    public void setSanatciUlke(String sanatciUlke) {
        this.sanatciUlke = sanatciUlke;
    }
}

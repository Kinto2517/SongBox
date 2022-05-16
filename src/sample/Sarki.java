package sample;

public class Sarki {

    private int sarkiID;
    private String sarkiAd;
    private String sarkiTur;
    private int sarkiSure;

    public int dinlenmeSayisi;

    public Sarki(int sarkiID, String sarkiAd, String sarkiTur, int sarkiSure, int dinlenmeSayisi) {
        this.sarkiID = sarkiID;
        this.sarkiAd = sarkiAd;
        this.sarkiTur = sarkiTur;
        this.sarkiSure = sarkiSure;
        this.dinlenmeSayisi = dinlenmeSayisi;
    }

    public int getSarkiID() {
        return sarkiID;
    }

    public void setSarkiID(int sarkiID) {
        this.sarkiID = sarkiID;
    }

    public String getSarkiAd() {
        return sarkiAd;
    }

    public void setSarkiAd(String sarkiAd) {
        this.sarkiAd = sarkiAd;
    }

    public String getSarkiTur() {
        return sarkiTur;
    }

    public void setSarkiTur(String sarkiTur) {
        this.sarkiTur = sarkiTur;
    }

    public int getSarkiSure() {
        return sarkiSure;
    }

    public void setSarkiSure(int sarkiSure) {
        this.sarkiSure = sarkiSure;
    }

    public int getDinlenmeSayisi() {
        return dinlenmeSayisi;
    }

    public void setDinlenmeSayisi(int dinlenmeSayisi) {
        this.dinlenmeSayisi = dinlenmeSayisi;
    }
}

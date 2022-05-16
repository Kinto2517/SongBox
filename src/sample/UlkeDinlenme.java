package sample;

public class UlkeDinlenme {

    private int ulkeDinlenmeID;
    private int sarkiID;
    private String ulkeAdi;
    private int dinlenmeSayisi;

    public UlkeDinlenme(int ulkeDinlenmeID, int sarkiID, String ulkeAdi, int dinlenmeSayisi) {
        this.ulkeDinlenmeID = ulkeDinlenmeID;
        this.sarkiID = sarkiID;
        this.ulkeAdi = ulkeAdi;
        this.dinlenmeSayisi = dinlenmeSayisi;
    }

    public int getUlkeDinlenmeID() {
        return ulkeDinlenmeID;
    }

    public void setUlkeDinlenmeID(int ulkeDinlenmeID) {
        this.ulkeDinlenmeID = ulkeDinlenmeID;
    }

    public int getSarkiID() {
        return sarkiID;
    }

    public void setSarkiID(int sarkiID) {
        this.sarkiID = sarkiID;
    }

    public String getUlkeAdi() {
        return ulkeAdi;
    }

    public void setUlkeAdi(String ulkeAdi) {
        this.ulkeAdi = ulkeAdi;
    }

    public int getDinlenmeSayisi() {
        return dinlenmeSayisi;
    }

    public void setDinlenmeSayisi(int dinlenmeSayisi) {
        this.dinlenmeSayisi = dinlenmeSayisi;
    }
}

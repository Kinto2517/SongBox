package sample;

public class User {

    private int kullaniciID;
    private String kullaniciAdi;
    private String kullaniciSifre;
    private String aboneTur;
    private String kullaniciUlke;
    private boolean isOdendi;

    public User(int kullaniciID, String kullaniciAdi, String kullaniciSifre, String aboneTur, String kullaniciUlke, boolean isOdendi) {
        this.kullaniciID = kullaniciID;
        this.kullaniciAdi = kullaniciAdi;
        this.kullaniciSifre = kullaniciSifre;
        this.aboneTur = aboneTur;
        this.kullaniciUlke = kullaniciUlke;
        this.isOdendi = isOdendi;
    }

    public int getKullaniciID() {
        return kullaniciID;
    }

    public void setKullaniciID(int kullaniciID) {
        this.kullaniciID = kullaniciID;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getKullaniciSifre() {
        return kullaniciSifre;
    }

    public void setKullaniciSifre(String kullaniciSifre) {
        this.kullaniciSifre = kullaniciSifre;
    }

    public String getAboneTur() {
        return aboneTur;
    }

    public void setAboneTur(String aboneTur) {
        this.aboneTur = aboneTur;
    }

    public String getKullaniciUlke() {
        return kullaniciUlke;
    }

    public void setKullaniciUlke(String kullaniciUlke) {
        this.kullaniciUlke = kullaniciUlke;
    }

    public boolean isOdendi() {
        return isOdendi;
    }

    public void setOdendi(boolean odendi) {
        isOdendi = odendi;
    }
}

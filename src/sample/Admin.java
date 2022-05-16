package sample;

public class Admin {

    private int adminID;
    private String adminAdi;
    private int adminSifre;

    public Admin(int adminID, String adminAdi) {
        this.adminID = adminID;
        this.adminAdi = adminAdi;
        this.adminSifre = 666;
    }

    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public String getAdminAdi() {
        return adminAdi;
    }

    public void setAdminAdi(String adminAdi) {
        this.adminAdi = adminAdi;
    }

    public int getAdminSifre() {
        return adminSifre;
    }

}

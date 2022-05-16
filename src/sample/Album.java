package sample;

public class Album {
    private int albumID;
    private String albumAdi;
    private String albumCikisTarih;
    public Album(int albumID, String albumAdi, String albumCikisTarih) {
        this.albumID = albumID;
        this.albumAdi = albumAdi;
        this.albumCikisTarih = albumCikisTarih;
    }

    public int getAlbumID() {
        return albumID;
    }

    public void setAlbumID(int albumID) {
        this.albumID = albumID;
    }

    public String getAlbumAdi() {
        return albumAdi;
    }

    public void setAlbumAdi(String albumAdi) {
        this.albumAdi = albumAdi;
    }

    public String getAlbumCikisTarih() {
        return albumCikisTarih;
    }

    public void setAlbumCikisTarih(String albumCikisTarih) {
        this.albumCikisTarih = albumCikisTarih;
    }
}

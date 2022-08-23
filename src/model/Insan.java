package model;

public class Insan {

    private String tcKimlikNo;
    private String adSoyad;

    public Insan(String tcKimlikNo, String adSoyad) {
        this.tcKimlikNo = tcKimlikNo;
        this.adSoyad = adSoyad;
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }


}

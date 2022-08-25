package kalitimsiz_ornek;

public class Ogrenci {


    private String isim;
    private int yas;
    private long tcKimlik;
    private int okulNo;

    public Ogrenci() {
        isim = "Henüz atanmadı";
        tcKimlik = 0;
        yas = 18;
        okulNo = 5000;
    }

    public Ogrenci(String isim, int yas, long tcKimlik, int okulNo) {
        this.isim = isim;
        setYas(yas);
        this.tcKimlik = tcKimlik;
        this.okulNo = okulNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas >= 7)
            this.yas = yas;
        else this.yas = 7;
    }


    public long getTcKimlik() {
        return tcKimlik;
    }

    public void setTcKimlik(long tcKimlik) {
        this.tcKimlik = tcKimlik;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    @Override
    public String toString() {
        return "Ad: " + isim + " Tc Kimlik no: " + tcKimlik + " Yaş: " + yas + " Okul No: " + okulNo;
    }


}

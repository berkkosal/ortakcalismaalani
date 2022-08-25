package kalitimli_ornek;

public class Kisi {

    private String isim;
    private long tcKimlik;
    private int yas;

    public Kisi() {
        isim = "Henüz atanmadı";
        tcKimlik = 0;
        yas = 18;
    }

    public Kisi(String isim, long tcKimlik, int yas) {
        this.isim = isim;
        this.tcKimlik = tcKimlik;
        setYas(yas);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public long getTcKimlik() {
        return tcKimlik;
    }

    public void setTcKimlik(long tcKimlik) {
        this.tcKimlik = tcKimlik;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas >= 18)
            this.yas = yas;
        else this.yas = 18;
    }

    @Override
    public String toString() {
        return "Ad: " + isim + " Tc Kimlik no: " + tcKimlik + " Yaş: " + yas;
    }

}

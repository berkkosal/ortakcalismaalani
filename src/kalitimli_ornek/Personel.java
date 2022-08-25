package kalitimli_ornek;

class Personel extends Kisi {
    public Personel(String isim, long tcKimlik, int yas, String pozisyon) {
        setIsim(isim);
        setYas(yas);
        setTcKimlik(tcKimlik);
        this.pozisyon = pozisyon;
    }

    private String pozisyon;

    public String getPozisyon() {
        return pozisyon;
    }

    public void setPozisyon(String pozisyon) {
        this.pozisyon = pozisyon;
    }

    @Override
    public String toString() {
        return "Personel adı: " + getIsim() + " TcKimlik : " + getTcKimlik() + " Yaş: " + getYas() + " pozisyon " + getPozisyon();
    }




}

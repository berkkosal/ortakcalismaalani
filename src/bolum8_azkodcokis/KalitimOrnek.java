package bolum8_azkodcokis;

public class KalitimOrnek {

    public static void main(String[] args) {

        Dikdortgen d1 = new Dikdortgen(10,20);
        d1.ozellikYazdir();

        GeometrikSekil gs1 = new GeometrikSekil(5,10);
        System.out.println(gs1);

       Kare k1 = new Kare(8);
       k1.alanHesapla();
       k1.cevreHesapla();

    }




}

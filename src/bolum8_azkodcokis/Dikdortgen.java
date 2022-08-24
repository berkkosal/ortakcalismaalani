package bolum8_azkodcokis;

class Dikdortgen extends GeometrikSekil{

    public Dikdortgen (int en){
        setEn(en);
        System.out.println("Dikdörtgen oluşturuluyor");

    }


    public Dikdortgen (int en , int boy){
        setEn(en);
        setBoy(boy);
        System.out.println("Dikdörtgen oluşturuluyor");

    }

    public void ozellikYazdir(){
        System.out.println("Geometrik şeklin eni : " + getEn() +  " boyu : " + getBoy());
        alanHesapla();
        cevreHesapla();
    }


}

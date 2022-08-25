package kalitimli_ornek;

 class Ogrenci extends Kisi {
     public Ogrenci(String isim, long tcKimlik, int yas, int ogrenciNo) {
       /*   setYas(yas);
            setIsim(isim);
            setTcKimlik(tcKimlik);
       */   super(isim,tcKimlik,yas);
          this.ogrenciNo = ogrenciNo;
     }

     private int ogrenciNo;

     public int getOgrenciNo() {
         return ogrenciNo;
     }

     public void setOgrenciNo(int ogrenciNo) {
         this.ogrenciNo = ogrenciNo;
     }


     public String toString() {
         return "Ad: " + getIsim() + " Tc Kimlik no: " + getTcKimlik() + " Yaş: " + getYas() + " ÖğrenciNo: " + ogrenciNo;
     }

 }





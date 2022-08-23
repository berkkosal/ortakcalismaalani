package controller;

import model.BankaHesabi;
import model.Insan;

public class Controller {


    public void paraYatir (String sifre, int yatirilacakPara,Insan insan){

        for (int i = 0; i < BankaHesabi.getList().size(); i++) {
            BankaHesabi hesap = BankaHesabi.getList().get(i);
            if (hesap.getHesapSahibi().getTcKimlikNo()==insan.getTcKimlikNo()){
                if (hesap.getSifre()==sifre){
                    hesap.setHesapBakiyesi(hesap.getHesapBakiyesi()+yatirilacakPara);
                    return;
                }
            }
        }
        System.out.println("Hata");
    }

    //hesapoluştur -- paraçek -- hesapbakiyesi -- şifredegistir




}

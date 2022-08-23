package model;

import java.util.ArrayList;
import java.util.Arrays;

public class BankaHesabi {


    private Insan hesapSahibi;
    private String hesapNo;
    private String sifre;
    private int hesapBakiyesi;
    private static int acilanTumHesapSayisi = 0;
    private boolean flag;
    private static ArrayList<BankaHesabi> list = new ArrayList<>();


    public BankaHesabi(Insan hesapSahibi, String hesapNo) {
        this.hesapSahibi = hesapSahibi;
        this.hesapNo = hesapNo;
        this.sifre = "0000";
        this.flag = false;
        BankaHesabi.acilanTumHesapSayisi++;
        BankaHesabi.list.add(this);
    }


    public Insan getHesapSahibi() {
        return hesapSahibi;
    }

    public void setHesapSahibi(Insan hesapSahibi) {
        this.hesapSahibi = hesapSahibi;
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public int getHesapBakiyesi() {
        return hesapBakiyesi;
    }

    public void setHesapBakiyesi(int hesapBakiyesi) {
        this.hesapBakiyesi = hesapBakiyesi;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public static int getAcilanTumHesapSayisi() {
        return acilanTumHesapSayisi;
    }

    public static ArrayList<BankaHesabi> getList() {
        return list;
    }
}

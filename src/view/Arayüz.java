package view;

import controller.Controller;

import java.util.Scanner;

public class Arayüz {
    private Scanner scanner = new Scanner(System.in);
    private Controller controller = new Controller();

    public void anaMenu(){
        while (true){
            System.out.println("1 -  Hesap oluştur.");
            System.out.println("2 -  Hesaba giriş yap.");
            System.out.println("0 -  Çıkış");
            String secim = scanner.nextLine();
            hesapOlusturMenusu();
            if (secim.equals("1")) {
                hesapOlusturMenusu();
            } else if (secim.equals("2") ){

            }else if (secim.equals("0")) {
                System.out.println("Çıkış yapıldı");
            }else {
                System.out.println("Lütfen doğru giriş yapın");
            }
        }

    }

    public  void hesapOlusturMenusu(){

            System.out.println("Tc gir");
            String tc = scanner.nextLine();


    }

    //hesap giriş





}

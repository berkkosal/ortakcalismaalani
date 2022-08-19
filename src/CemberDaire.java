import java.util.Scanner;

public class CemberDaire {


    double yaricap;


    public CemberDaire() {
        Scanner kullanicidanBilgiAl = new Scanner(System.in);
        System.out.println("Yarıçap değeri giriniz.");
        yaricap = kullanicidanBilgiAl.nextDouble();


    }

    public void alanBul() {
        double alan = Math.PI * Math.pow(yaricap, 2);
        System.out.println("Çemberinizin alanı: " + alan);

    }

    public void cevreBul() {
        double cevre = 2 * Math.PI * yaricap;
        System.out.println("Çemberinizin çevresi " + cevre);

    }


}

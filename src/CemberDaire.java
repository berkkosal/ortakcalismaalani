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
        System.out.println("Dairenizin alanı: " + alan);

    }


}

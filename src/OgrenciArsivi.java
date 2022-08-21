import java.util.Arrays;
import java.util.Random;

public class OgrenciArsivi {
    public static void main(String[] args) {

        int[] ogrenciListesi = new int[100];
        for (int i = 0; i < ogrenciListesi.length; i++) {
            int not = ((int) (Math.random() * 100) + 1);
            ogrenciListesi[i] = not;
            System.out.println(i + ".ci öğrencinin notu " + ogrenciListesi[i]);
        }


    }

}

class Ogrenci {

    int[] ogrenciListesi;


    private Ogrenci() {


    }

    private Ogrenci(int[] liste) {


    }

}

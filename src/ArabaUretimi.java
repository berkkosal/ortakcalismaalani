public class ArabaUretimi {

    public static void main(String[] args) {

        //model yılını sistem verecek değişmeyecek atanamayacak.
        //sistemde hiçbir şey null olamayacak şekilde bir araba üret.

        Lastik lastik1 = new Lastik(225,"Lassa");
        Lastik lastik2 = new Lastik(225,"Lassa");
        Teker teker1 = new Teker(17,lastik1);
        Teker teker2 = new Teker(17,lastik2);
        Motor motor = new Motor(1.6,600,300);
        Araba berkAraba = new Araba(teker1,teker2,motor);
        System.out.println(berkAraba.getOnTeker().getLastik().getMarka());





    }



}

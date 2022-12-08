package kendi_çalışmalarım;

import java.util.Random;

public class RastgeleSayıOrtalaması {

    public static void main(String[] args) {

        int[] sayılar = new int[100];

        for (int i = 0; i < 100; i++) {
            Random rand = new Random();
            int sayı = rand.nextInt(10);
            System.out.println( (i+1) + ". sayı = " + sayı);
            sayılar[i] = sayı;
        }

        int top = toplam (sayılar) ;
        System.out.println("Sayıların toplamı = " + top);
        double ort = ortalama (sayılar);
        System.out.println("Sayıların ortalaması = " + ort);

    }

   public static double ortalama (int [] dizi){
        double toplam = 0;
        for (int i = 0; i < 100; i++){
                toplam += dizi[i] ;

        }
        return toplam / 100 ;
    }

    public static int toplam (int [] dizi) {
        int toplam = 0;
        for (int i = 0; i < 100; i++) {
            toplam += dizi[i];
        }
        return toplam;
    }
}

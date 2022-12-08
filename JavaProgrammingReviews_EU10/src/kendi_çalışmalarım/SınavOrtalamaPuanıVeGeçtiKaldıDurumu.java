package kendi_çalışmalarım;

import java.util.Scanner;

public class SınavOrtalamaPuanıVeGeçtiKaldıDurumu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Vize notunu giriniz = ");
        double vıze = input.nextDouble();

        System.out.print("Final notunu giriniz = ");
        double fınal = input.nextDouble();

        double ortalama = ((vıze * 40) / 100) + ((fınal * 60) / 100);

        System.out.println("Ortalama not = " + ortalama);


        if( ortalama >= 89.5 ){
            System.out.println("Başarı durumu = A");
            System.out.println("GEÇTİ");
        }
        if( 89.5 > ortalama && ortalama>= 79.5 ){
            System.out.println("Başarı durumu = B");
            System.out.println("GEÇTİ");
        }
        if( 79.5 > ortalama && ortalama>= 69.5 ){
            System.out.println("Başarı durumu = C");
            System.out.println("GEÇTİ");
        }
        if( 69.5 > ortalama && ortalama>= 59.5 ){
            System.out.println("Başarı durumu = D");
            System.out.println("GEÇTİ");
        }
        if( 59.5 > ortalama && ortalama>= 49.5 ){
            System.out.println("Başarı durumu = E");
            System.out.println("GEÇTİ");
        }
        if (49.5 > ortalama){
            System.out.println("Başarı durumu = F");
            System.out.println("KALDI");
        }

        input.close();

    }
}

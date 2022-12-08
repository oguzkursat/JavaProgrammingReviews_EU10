package kendi_çalışmalarım;

import java.util.Scanner;

public class N_eKadarOlanSayıToplamı {

    /*public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir tam sayı giriniz = ");
        int s = input.nextInt();
        int t = 0;
        for ( int x = 1 ; x<=s ; ++x ){
            t += x ;
        }
        System.out.println("Sayıların toplamı = " + t);
    }*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Kaça kadar toplayalım = ");
        int s = input.nextInt();
        System.out.print("Kaçtan başlayalım = ");
        int t = input.nextInt();
        int c=t;
        for ( int x = t ; x<=s ; ++x ){
            t += x;
        }
        System.out.println("Sayıların toplamı = " + (t-c));

        input.close();

    }
}
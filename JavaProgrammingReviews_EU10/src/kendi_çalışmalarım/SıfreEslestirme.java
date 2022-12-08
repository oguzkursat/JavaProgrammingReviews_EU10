package kendi_çalışmalarım;

import java.util.Scanner;

public class SıfreEslestirme {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String sifre = "12345";

        System.out.print("Lütfen şifrenizi giriniz = ");
        String password = input.nextLine();

        while (password != sifre) {
            if (password.equals(sifre)) {
                System.out.println("Şifre doğru.");
                break;
            }
            else {
                    System.out.println("Şifre yanlış. Lütfen tekrar deneyiniz.");
                    System.out.print("Lütfen şifrenizi giriniz = ");
                    password = input.nextLine();
            }

        }

        input.close();

    }
}

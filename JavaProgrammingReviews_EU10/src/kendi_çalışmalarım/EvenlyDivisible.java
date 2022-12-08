package kendi_çalışmalarım;

import java.util.Scanner;

public class EvenlyDivisible {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen sayı giriniz = ");
        int number = input.nextInt();
        int n2 = number % 2;
        int n3 = number % 3;
        int n5 = number % 5;

        if (n2 != 0) {
            System.out.println("false");
        }        else {
            System.out.println("true");
        }
        if (n3 != 0) {
            System.out.println("false");
        }        else {
            System.out.println("true");
        }
        if (n5 != 0) {
            System.out.println("false");
        }        else {
            System.out.println("true");
        }

        input.close();

    }
}

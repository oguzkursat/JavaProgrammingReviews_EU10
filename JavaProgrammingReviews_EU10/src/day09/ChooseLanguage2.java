package day09;

import java.util.Scanner;

public class ChooseLanguage2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;

        System.out.println(num1 + " = English");
        System.out.println(num2 + " = Spanish");
        System.out.println(num3 + " = Türkish");
        System.out.println(num4 + " = Russian");
        System.out.println(num5 + " = French");

        System.out.print("Please select a language between 1 to 5 = ");
        int number = input.nextInt();

        if (number == 1) {
            System.out.println("Hello, thank you for your call");
        }else if (number == 2) {
            System.out.println("Hola, gracias para llamar");
        }else if (number == 3) {
            System.out.println("Merhaba, aradığınız için teşekkürler");
        }else if (number == 4) {
            System.out.println("Privet, spasibo za vash zvonok");
        }else if (number == 5) {
            System.out.println("Merci, pour votre appel");
        }else {
            System.err.println("Invalid number");
        }

        input.close();

    }
}
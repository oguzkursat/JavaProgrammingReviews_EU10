package kendi_çalışmalarım;

import java.util.Scanner;

public class IntroPostIncrementDecrement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number = ");
        int number = input.nextInt();

        System.out.println(number++);
        System.out.println(number--);
        System.out.println(number);

        input.close();

    }

}

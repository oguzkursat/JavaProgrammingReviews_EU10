package kendi_çalışmalarım;

import java.util.Scanner;

public class EligibileToBuyCigarettes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter name = ");
        String name = input.nextLine();

        System.out.print("Enter age = ");
        byte age = input.nextByte();

        if (age >= 18) {
            System.out.println(name + " is eligible to buy cigarettes.");
        }else{
            System.err.println(name + " is not eligible to buy cigarettes.");
        }

        input.close();

    }
}

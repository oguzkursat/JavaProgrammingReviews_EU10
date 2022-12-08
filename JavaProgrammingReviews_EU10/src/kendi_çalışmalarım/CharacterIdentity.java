package kendi_çalışmalarım;

import java.util.Scanner;

public class CharacterIdentity {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character = ");
        char scanner = input.next().charAt(0);
        if (scanner>=48 && scanner <=57){
            System.out.println(scanner + " is digit number.");
        }else if ( (scanner>=65 && scanner <=90) ||  (scanner>=97 && scanner <=122) ) {
            System.out.println(scanner + " is alphabetical character.");
        }else {
            System.out.println(scanner + " is special character.");
        }

        input.close();


    }
}

package kendi_çalışmalarım;

import java.util.Scanner;

public class FindTheResult {
    /*
Task 6: Create a class which is "FindTheResult" create a variable
int a=15;
 if a is divisable by 3 add 20
 if a is divisable by 5 add 25
 if a is divisable by 15 add 50
 */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number = ");
        int number = input.nextInt();

        if (number % 3 == 0  &&  number % 5 != 0) {
            number += 20;
            System.out.println("New Number = " + number);
        }else if (number % 5 == 0  &&  number % 3 != 0) {
            number += 25;
            System.out.println("New Number = " + number);

        }else if (number % 3 == 0  &&  number % 5 == 0) {
            number += 50;
            System.out.println("New Number = " + number);

        }else {
            System.err.println("INVALID NUMBER");
        }

        input.close();

    }
}
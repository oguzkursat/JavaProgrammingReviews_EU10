package kendi_çalışmalarım;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter number 1 = ");
        int number1 = input.nextInt();
        System.out.print("Please enter number 2 = ");
        int number2 = input.nextInt();

        if ( number1 > number2 ){
            System.out.println(number1 + " is the maximum number ");
        }else if ( number1 < number2 ){
            System.out.println(number2 + " is the maximum number ");
        }else{
            System.out.println(number1 + " and " + number2+ " is equal.");
        }

        input.close();


    }
}

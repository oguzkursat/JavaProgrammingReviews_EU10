package kendi_çalışmalarım;

import java.util.Scanner;

public class MedianNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number1 = ");
        int number1 = input.nextInt();
        System.out.print("Enter number2 = ");
        int number2 = input.nextInt();
        System.out.print("Enter number3 = ");
        int number3 = input.nextInt();

        /*if ( number1 > number2 && number3 > number1 ){
            System.out.println( number1 + " is the median number");
        }else if ( number2 > number1 && number3 > number2 ){
            System.out.println( number2 + " is the median number");
        }else if ( number3 > number2 && number1 > number3 ){
            System.out.println( number1 + " is the median number");
        }else {
            System.err.println("Please do not enter same number.");
        }*/

        String medianNumber = (number1 > number2 && number3 > number1) ? number1+" is the median number" :
                (number2 > number1 && number3 > number2)? number2+" is the median number" :
                (number3 > number2 && number1 > number3)? number3+" is the median number" : "Please do not enter same number.";
        System.out.println(medianNumber);

        input.close();

    }
}

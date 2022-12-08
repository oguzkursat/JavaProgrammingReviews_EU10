package day12.day10;

import java.util.Scanner;

public class BiggerNumWithTernaries {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number-1 = ");
        int num1 = input.nextInt();
        System.out.print("Enter number-2 = ");
        int num2 = input.nextInt();
        System.out.print("Enter number-3 = ");
        int num3 = input.nextInt();

        String result1 = (num1>num2  &&  num1>num3)? "num1 is bigger" : "num1 is not bigger" ;
        System.out.println(result1);
        String result2 = (num2>num1  &&  num2>num3)? "num2 is bigger" : "num2 is not bigger" ;
        System.out.println(result2);
        String result3 = (num3>num2  &&  num3>num1)? "num3 is bigger" : "num3 is not bigger" ;
        System.out.println(result3);

        input.close();

    }
}

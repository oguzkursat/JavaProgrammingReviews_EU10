package day18;

import java.util.Scanner;

public class Day18_Task_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Enter first number:");
            double num1 = input.nextDouble();

            System.out.println("Enter math operator:");
            char operator = input.next().charAt(0);

            while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
                System.out.println("invalid operator, please re enter");
                operator = input.next().charAt(0);
            }

            System.out.println("Enter second number:");
            double num2 = input.nextDouble();

            if (operator == '+') {
                System.out.println(num1 + num2);
            } else if (operator == '-') {
                System.out.println(num1 - num2);
            }else if (operator == '*') {
                System.out.println(num1 * num2);
            }else {
                System.out.println(num1 / num2);
            }

            System.out.println("Do you want to continue?");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes")||answer.equals("no"))) {
                System.out.println("invalid operator, please re enter");
                answer = input.next().toLowerCase();
            }
            if(answer.equals("no")){
                System.out.println("Thanks for using Cydeo calculator!");
                break;
            }

        }
    }
}

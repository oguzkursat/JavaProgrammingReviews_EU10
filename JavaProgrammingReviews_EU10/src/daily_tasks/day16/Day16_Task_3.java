package daily_tasks.day16;

import java.util.Scanner;

public class Day16_Task_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number = ");
        int num1 = input.nextInt();
        System.out.println("Enter second number = ");
        int num2 = input.nextInt();
        int multiplicationOfTwoNumber = 0;
        if (num1 < 0 || num2 < 0) {
            System.out.println("Invalid");
        } else {
            for (int i = 0; i < num1 ; i++) {
                multiplicationOfTwoNumber += num2;
            }
            System.out.println(multiplicationOfTwoNumber);
        }

    }
}
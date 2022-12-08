package day15;

import java.util.Scanner;

public class Day15_Task_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = input.nextInt();

        int factorial = 1;

        for (int i = 1 ; i<num+1 ; i++) {
            factorial *= i;
        }
        System.out.println(factorial);

        input.close();

    }
}

package daily_tasks.day14;

import java.util.Scanner;

public class Day14_Task_5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your 1st number");
        double num1 = scan.nextDouble();
        System.out.println("Enter your second number:");
        double num2 = scan.nextDouble();
        System.out.println("enter your math operator");
        char ch = scan.next().charAt(0);
        int result = 0;
        while (!(ch == '+' || ch == '-' || ch == '/' || ch == '*')) {
            System.err.println("Invalid operator, Please re-enter.");
            ch = scan.next().charAt(0);
        }
        if (ch == '+') {
            result = (int) (num1 + num2);
        } else if (ch == '-') {
            result = (int) (num1 - num2);
        } else if (ch == '/') {
            result = (int) (num1 / num2);
        } else{
            result = (int) (num1 * num2);
        }


        scan.close();
        System.out.println(result);
    }
}
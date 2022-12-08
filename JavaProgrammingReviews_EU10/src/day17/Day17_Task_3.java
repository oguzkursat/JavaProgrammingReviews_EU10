package day17;

import java.util.Scanner;

public class Day17_Task_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = input.nextInt();

        System.out.println("Enter second number:");
        int num2 = input.nextInt();

        System.out.println("Enter math operator:");
        char operator = input.next().charAt(0);

        double result;

        while (!(operator=='+'||operator=='-'||operator=='/'||operator=='*')){
            System.out.println("Invalid operator, re-enter operator:");
            operator = input.next().charAt(0);
        }

        if(operator=='+'){
            result = num1+num2;
        }else if(operator=='-'){
            result = num1-num2;
        }else if(operator=='*'){
            result = num1*num2;
        }else {
            result = (double) num1/num2;
        }

        System.out.println(result);

        input.close();

    }
}

package day17;

import java.util.Scanner;

public class Day17_Task_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = input.nextInt();

        System.out.println("Enter second number:");
        int num2 = input.nextInt();

        if(num1>0&&num2>0){
            int count = 0;
            for(int i=num1; i>=num2 ; i=i-num2 ){
                count++;
            }
            System.out.println(count);
        }else{
            System.out.println("Invalid number");
        }

        input.close();

    }
}

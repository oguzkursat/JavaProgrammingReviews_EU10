package daily_tasks.day09;

import java.util.Scanner;

public class EqualNumbers {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.print("Enter number-1 = ");
        int number1 = input.nextInt();
        System.out.print("Enter number-2 = ");
        int number2 = input.nextInt();
        System.out.print("Enter number-3 = ");
        int number3 = input.nextInt();

        if (number1==number2 && number1==number3){
            System.out.println("All numbers are equal.");
        }else if (number1==number2 && number1!=number3){
            System.out.println("number-1" + " and " + "number-2" + " are equal.");
        }else if (number1!=number2 && number1==number3){
            System.out.println("number-1" + " and " + "number-3" + " are equal.");
        }else if (number1!=number2 && number2==number3){
            System.out.println("number-2" + " and " + "number-3" + " are equal.");
        }else{
            System.out.println("None of them are equal.");
        }

        input.close();

    }
}

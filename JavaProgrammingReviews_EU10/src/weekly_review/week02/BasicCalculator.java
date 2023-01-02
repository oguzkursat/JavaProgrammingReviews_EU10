package weekly_review.week02;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char addition = '+';
        char subtraction = '-';
        char multiplication = '*';
        char division = '/';

        System.out.print("Please enter first number = ");
        double firstNumber = input.nextDouble();
        System.out.print("Please enter second number = ");
        double secondNumber= input.nextDouble();

        System.out.print("Please choose your operation (+,-,*,/) = ");
        char operation = input.next().charAt(0);
        if(operation == '+') {
            System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        }else if(operation == '-'){
            System.out.println(firstNumber+" - "+secondNumber+" = "+(firstNumber-secondNumber));
        }else if(operation == '*'){
            System.out.println(firstNumber+" * "+secondNumber+" = "+(firstNumber*secondNumber));
        }else if(operation == '/'){
            System.out.println(firstNumber+" / "+secondNumber+" = "+(firstNumber/secondNumber));
        }else {
            System.out.println("Invalid Operator");
        }

        input.close();

    }

}

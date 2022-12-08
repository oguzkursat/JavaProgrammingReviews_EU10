package day09;

public class Calculator {
    public static void main(String[] args) {

        int num1 = 4;
        int num2 = 10;
        char mathOperator = '-';
        int result = 0;
        if (mathOperator == '+') {
            result = num1 + num2;
        } else if (mathOperator == '-') {
            result = num1 - num2;
        } else if (mathOperator == '/') {
            result = num1 / num2;
        } else if (mathOperator == '*') {
            result = num1 * num2;
        }

        System.out.println(num1 + "" + mathOperator + num2 + "=" + result);

    }
}

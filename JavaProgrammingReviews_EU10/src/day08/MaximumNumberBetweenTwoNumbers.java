package day08;

public class MaximumNumberBetweenTwoNumbers {
    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 200;

        if (num1 > num2) {
            System.out.println("Maximum number is " + num1);
        } else if (num2 > num1) {
            System.out.println("Maximum number is " + num2);
        } else if (num1 == num2) {
            System.out.println(num1 + " and " + num2 + " are equal numbers");
        }


    }
}

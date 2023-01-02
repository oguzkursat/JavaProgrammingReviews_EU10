package weekly_review.week02;

import java.util.Scanner;

public class Rectangle {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter length :");
        double num1 = input.nextDouble();

        System.out.print("Enter width :");
        double num2 = input.nextDouble();

        double area = num1 * num2 ;
        double perimeter = (num1 + num2) * 2 ;

        System.out.println("Area =" + area);
        System.out.println("Perimeter =" + perimeter);

        input.close();

    }

}

package day19;

import java.util.Scanner;

public class Day19_Task_1_Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.print("Enter a radius value = ");
            double radius = input.nextDouble();

            if (radius <= 0) {
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }

            double PI = 3.14;
            double diameter = radius * 2;
            double area = radius * radius * PI;
            double perimeter = diameter * PI;

            System.out.println("radius = " + radius);
            System.out.println("diameter = " + diameter);
            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);

            System.out.println("Would you like to calculate another circle?");
            String answer = input.next().toLowerCase();
            input.nextLine();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Invalid entry, enter a valid answer(yes/no)");
                System.out.println("Would you like to calculate another circle?");
                answer = input.next().toLowerCase();
                input.nextLine();
            }
            if (answer.equals("no")) {
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                System.exit(0);
            }        input.close();

        }

    }
}

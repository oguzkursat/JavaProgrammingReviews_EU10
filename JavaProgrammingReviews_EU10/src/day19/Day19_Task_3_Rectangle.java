package day19;

import java.util.Scanner;

public class Day19_Task_3_Rectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //boolean b=true;
        int a = 5;
        while (0<a) {

            System.out.print("Enter a small side = ");
            double smallSide = input.nextDouble();

            if (smallSide <= 0) {
                System.err.println("Invalid Entry for the side of the square");
                System.exit(0);
            }

            System.out.print("Enter a long side = ");
            double longSide = input.nextDouble();

            if (longSide <= 0) {
                System.err.println("Invalid Entry for the side of the square");
                System.exit(0);
            }

            double area = smallSide * longSide;
            double perimeter = (smallSide + longSide) * 2;

            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);

            System.out.println("Would you like to calculate another square?");
            String answer = input.next().toLowerCase();
            input.nextLine();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Invalid entry, enter a valid answer(yes/no)");
                System.out.println("Would you like to calculate another square?");
                answer = input.next().toLowerCase();
                input.nextLine();
            }
            if (answer.equals("no")) {
                System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
                System.exit(0);

            }
        }
        input.close();
    }
}
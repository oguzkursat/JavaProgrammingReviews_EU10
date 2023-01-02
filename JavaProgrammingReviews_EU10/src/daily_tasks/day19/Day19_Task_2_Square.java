package daily_tasks.day19;

import java.util.Scanner;

public class Day19_Task_2_Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.print("Enter an edge = ");
            double side = input.nextDouble();

            if (side <= 0) {
                System.err.println("Invalid Entry for the side of the square");
                System.exit(0);
            }

            double area = side * side;
            double perimeter = side * 4;

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
                System.out.println("Thank you for using Cydeo Square Calculator APP");
                break;
            }
        }

        input.close();

    }
}

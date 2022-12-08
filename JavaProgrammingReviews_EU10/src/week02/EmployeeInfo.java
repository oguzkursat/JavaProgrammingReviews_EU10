package week02;

import java.util.Scanner;


public class EmployeeInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee name = ");
        String name = input.nextLine();

        System.out.print("Enter employee age = ");
        int age = input.nextInt();

        System.out.print("Enter employee gender (F/M) = ");
        char gender = input.next().charAt(0);

        while ( gender != 'F') {
            if ( gender == 'M') {
                break;
            }
            else {
                System.out.println("Please enter F for female or M for male!");
                System.out.print("Enter employee gender (F/M) = ");
                gender = input.next().charAt(0);

                }
        }

        System.out.print("Enter employee company = " );
        String company = input.nextLine();

        System.out.print("Enter employee job title = " );
        String jobTitle = input.nextLine();

        System.out.print("Enter employee years of experience = " );
        int yearsOfExperience = input.nextInt();

        System.out.print("Enter employee salary = " );
        double salary = input.nextDouble();

        System.out.print("Enter employee is full time = " );
        boolean isFullTime = input.nextBoolean();

        System.out.print("Enter employee is married = " );
        boolean isMarried = input.nextBoolean();

        System.out.print("Enter employee ID = " );
        String employeeID = input.nextLine();

        input.close();

    }
}

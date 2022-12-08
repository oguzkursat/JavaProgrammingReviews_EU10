package day19;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Day19_Task_5_Salary_Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("How much you make an hour?");
            int hourlyRate = input.nextInt();
            if (hourlyRate <= 0) {
                System.err.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }

            System.out.println("How many hours do you work per week?");
            int weeklyHour = input.nextInt();
            if (weeklyHour < 1 || weeklyHour > 144) {
                System.err.println("Invalid Entry for Weekly Hours");
                System.exit(0);
            }

            System.out.println("Enter your state tax rate");
            double taxRate = input.nextDouble();
            if (taxRate < 0 || taxRate > 0.1) {
                System.err.println("Invalid Entry for Tax Rate");
                System.exit(0);
            }

            double grossSalary = hourlyRate * weeklyHour;
            double federalTaxOfSalary = grossSalary * 0.26;
            double stateTaxOfSalary = grossSalary * taxRate;
            double totalTax = federalTaxOfSalary + stateTaxOfSalary;
            double netIncome = grossSalary - totalTax;

            System.out.println("grossSalary = " + grossSalary);
            System.out.println("federalTaxOfSalary = " + federalTaxOfSalary);
            System.out.println("stateTaxOfSalary = " + stateTaxOfSalary);
            System.out.println("totalTax = " + totalTax);
            System.out.println("netIncome = " + netIncome);

            System.out.println("Would you like to continue?");
            String answer = input.next().toLowerCase();
            input.nextLine();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid Entry");
                System.exit(0);
            }

            if (answer.equals("no")) {
                System.err.println("Invalid entry");
                break;
            }
        }
        input.close();
    }
}

package kendi_çalışmalarım;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter HourlyRate = $");
        int hourlyRate = input.nextInt();
        System.out.print("Enter WeeklyHours = ");
        int weeklyHours = input.nextInt();
        System.out.print("Enter sStateTaxRate = ");
        double stateTaxRate = input.nextDouble();
        System.out.print("Enter FederalTaxRate = ");
        double federalTaxRate = input.nextDouble();

        double salaryBeforeTax = hourlyRate * weeklyHours * 52;
        System.out.println("Gross pay is = $" + salaryBeforeTax);

        double federalTax = salaryBeforeTax * federalTaxRate ;
        System.out.println("Federal tax is= $" + federalTax);

        double stateTax = salaryBeforeTax * stateTaxRate ;
        System.out.println("State tax is = $" + stateTax);

        double totalTax = federalTax + stateTax ;
        System.out.println("Total tax is = $" + totalTax);

        double netIncome = salaryBeforeTax - totalTax ;
        System.out.println("Net income is = $" + netIncome);

        input.close();



    }
}

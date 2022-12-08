package day07;

public class SalaryCalculator {
    public static void main(String[] args) {

        int hourlyRate=50;
        int weeklyHours=45;
        double stateTaxRate=0.06;
        double federalTaxRate=0.26;

        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double federalTax=salaryBeforeTax*federalTaxRate;
        double stateTax = salaryBeforeTax*stateTaxRate;

        System.out.println("Gross pay is: $"+salaryBeforeTax);
        System.out.println("Federal tax is: $"+federalTax);
        System.out.println("State tax is: $"+stateTax);
        System.out.println("Total tax is: $"+(federalTax+stateTax));
        System.out.println("Net income is: $"+(salaryBeforeTax-(federalTax+stateTax)));

    }
}

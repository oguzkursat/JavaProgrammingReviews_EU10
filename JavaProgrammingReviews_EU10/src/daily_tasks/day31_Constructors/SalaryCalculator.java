package daily_tasks.day31_Constructors;

public class SalaryCalculator{
    public int hourlyRate;
    public  double stateTaxRate,federalTaxRate;
    public  int weeklyHours;

    public SalaryCalculator(int hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary (){
        double salary = hourlyRate*weeklyHours*52;
        return salary;
    }

    public double StateTax(){
        double stateTax = salary()*stateTaxRate;
        return stateTax;
    }

    public double FederalTax(){
        double federalTax = salary()*federalTaxRate;
        return federalTax;
    }

    public double SalaryAfterTax(){
        double salaryAfterTax = salary()-(StateTax()-FederalTax());
        return salaryAfterTax;
    }

    public String toString() {
        return "SalaryCalculator{" +
                "salary=" + salary() +
                ", stateTax=" + StateTax() +
                ", federalTax=" + FederalTax() +
                ", salaryAfterTax=" + SalaryAfterTax()+
                '}';
    }
}

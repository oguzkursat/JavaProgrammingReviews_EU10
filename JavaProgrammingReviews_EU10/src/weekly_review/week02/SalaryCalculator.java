package weekly_review.week02;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main (String [] args){

        Scanner input =  new Scanner(System.in);

        int numberOfWeeks = 52;

        System.out.print("hourlyRate = $ ");
        int hr = input.nextInt();
        System.out.print("weeklyHour = $ ");
        int wr = input.nextInt();

        int salary = hr * wr * 52;
        System.out.println("salary = $ " + salary);

        input.close();

    }

}

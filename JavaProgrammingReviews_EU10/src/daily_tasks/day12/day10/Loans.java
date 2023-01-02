package daily_tasks.day12.day10;

import java.util.Scanner;

public class Loans {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter salary = ");
        int salary = input.nextInt();

        System.out.print("Enter credit score = ");
        int creditScore = input.nextInt();

        String result = (salary>60000 && creditScore>650)? "Loan approved" : "Loan denied";
        System.out.println(result);

        input.close();

    }
}

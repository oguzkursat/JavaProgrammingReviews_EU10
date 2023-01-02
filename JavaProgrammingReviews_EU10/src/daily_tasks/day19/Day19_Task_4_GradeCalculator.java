package daily_tasks.day19;

import java.util.Scanner;

public class Day19_Task_4_GradeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your score : ");
            double score = input.nextDouble();

            if (score < 0) {
                System.err.println("Invalid Entry");
                System.exit(0);
            }

            if (score >= 90) {
                System.out.println("A");
            } else if (score >= 80) {
                System.out.println("B");
            } else if (score >= 70) {
                System.out.println("C");
            } else if (score >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            System.out.println("Would you like to continue");
            String answer = input.next().toLowerCase();
            input.nextLine();

            while (!(answer.equals("yes")||answer.equals("no"))){
                System.err.println("Invalid entry");
                System.exit(0);
            }
            if(answer.equals("no")){
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                break;
            }
        }
    }
}

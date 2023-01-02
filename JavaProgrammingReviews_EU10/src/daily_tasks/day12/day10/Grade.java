package daily_tasks.day12.day10;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter grade (A/B/C/D/F) = ");
        char grade = input.next().charAt(0);
        String gradeMessage = null;

        if ( grade>=65 && grade<=70 && grade!=69) {
            if(grade=='A'){
                gradeMessage ="excellent";
            } else if (grade=='B') {
                gradeMessage ="great job";
            } else if (grade=='C') {
                gradeMessage ="good";
            } else if (grade=='D') {
                gradeMessage ="passed";
            }else{
                gradeMessage ="failed";
            }
        }
        else{
            gradeMessage="invalid";
        }

        System.out.println(grade + " : " + gradeMessage);

        input.close();

    }
}

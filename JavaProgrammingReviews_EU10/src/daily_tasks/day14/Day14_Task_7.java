package daily_tasks.day14;

import java.util.Scanner;

public class Day14_Task_7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter account number:");
        String num = input.next();

        if(num.startsWith("2")){
            if(num.length()==7){
                System.out.println("Valid number");
            }
            else {
                System.out.println("Invalid number");
            }
        } else if (num.startsWith("5")) {
            if(num.length()==10){
                System.out.println("Valid number");
            }
            else {
                System.out.println("Invalid number");
            }
        } else{
            System.out.println("Invalid number");
        }


    }
}

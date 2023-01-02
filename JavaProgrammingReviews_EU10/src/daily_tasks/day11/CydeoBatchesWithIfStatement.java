package daily_tasks.day11;

import java.util.Scanner;

public class CydeoBatchesWithIfStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your batch type (US morning/US evening/EU)= ");
        String batchType = input.nextLine();

        String result = "";

        if (batchType.equals("US morning")){
            result = "Class times are 10-5 EST. M, T, Th, F.";
        } else if (batchType.equals("US evening")) {
            result = "lass times are 7-10 EST. M, T, W, Th, S, S";
        } else if (batchType.equals("EU")) {
            result = "Class times are  10-5 EST. M, T, W, Th, F.";
        }else{
            result = "Invalid Batch";
        }

        System.out.println(result);

        input.close();

    }
}

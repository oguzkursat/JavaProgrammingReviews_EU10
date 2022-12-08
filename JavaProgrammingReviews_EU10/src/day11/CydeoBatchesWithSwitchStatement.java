package day11;

import java.util.Scanner;

public class CydeoBatchesWithSwitchStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your batch type (US morning/US evening/EU)= ");
        String batchType = input.nextLine();

        String result = "";

        switch (batchType){
            case "US morning":
                result = "Class times are 10-5 EST. M, T, Th, F.";
                break;
            case "US evening":
                result = "lass times are 7-10 EST. M, T, W, Th, S, S";
                break;
            case "EU":
                result = "Class times are  10-5 EST. M, T, W, Th, F.";
                break;
            default:
                result = "Invalid Batch";
                break;
        }

        System.out.println(result);

        input.close();


    }
}

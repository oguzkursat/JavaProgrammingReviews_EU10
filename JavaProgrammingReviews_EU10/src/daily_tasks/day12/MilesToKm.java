package daily_tasks.day12;

import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter miles to convert km= ");
        double miles = input.nextDouble();

        double km = miles * 1.609;

        if(miles>0){
            System.out.println(miles + " miles equal to " +km+" kilometers");
        }else{
            System.out.println("INVALID");
        }

        input.close();
    }
}

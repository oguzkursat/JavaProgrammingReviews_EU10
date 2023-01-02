package weekly_review.week02;

import java.util.Scanner;

public class GallonsToLitters {

    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter gallons to convert litters = ");

        double gallons = input.nextDouble();
        double litters = gallons * 3.79;

        System.out.println("Litters = " + litters);

        input.close();

    }

}

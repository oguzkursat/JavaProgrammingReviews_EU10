package week02;

import java.util.Scanner;

public class KgToPounds {
    
    public static void main (String [] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter kg to convert pounds = ");
        
        double kg = input.nextDouble();
        double pound = kg * 2.2;

        System.out.println("pound = " + pound);

        input.close();

    }
}

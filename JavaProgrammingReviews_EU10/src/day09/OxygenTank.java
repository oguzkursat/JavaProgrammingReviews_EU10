package day09;

import java.util.Scanner;

public class OxygenTank {
    public static void main(String[] args) {

        /*
        Above 90 -  Your tank is full
        Above 80 -  Still okay
        Above 70 -  Don't go too far
        Above 60 -  Start to head back
        Above 50 -  Be careful now you at at 50%
        */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter oxygen level = ");
        int oxygenLevel = input.nextInt();
        String tankLevel;

        if(oxygenLevel>90) {
            tankLevel = "Your tank is full.";
        }else if(oxygenLevel>80) {
            tankLevel = "Still okay.";
        }else if(oxygenLevel>70) {
            tankLevel = "Don't go too far.";
        }else if(oxygenLevel>60) {
            tankLevel = "Start to head back.";
        }else if(oxygenLevel>50) {
            tankLevel = "Be careful now you are at %50.";
        }else {
            tankLevel = "XXX  You are dead XXX :):):):)";
        }

        System.out.println( tankLevel );

        input.close();

    }
}

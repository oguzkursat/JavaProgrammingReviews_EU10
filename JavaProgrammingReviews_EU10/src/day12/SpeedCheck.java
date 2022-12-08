package day12;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed = ");
        int speed = input.nextInt();

        int speedLimit = 55;

        if(speed>=0){
            if(speed>speedLimit){
                System.err.println("You're driving " + (speed-speedLimit) + " mph over the limit.Slow down!");
            }else{
                System.out.println("Have a good day.");
            }
        }else{
            System.out.println("Speed can not be negative.");
        }

        input.close();


    }
}

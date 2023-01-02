package weekly_review.week04;

import java.util.Scanner;

public class BloodDonation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter age = ");
        int age = input.nextInt();
        System.out.println("Enter weight = ");
        int weight = input.nextInt();

        /*if(age>=18 && weight>50){
            System.out.println("You are eligible to donate blood.");
        } else if (age>=18 && weight<=50) {
            System.out.println("You are not eligible to donate blood.");
        } else if (age<18) {
            System.out.println("Age must be greater than or equal 18.");
        }*/

        if(age>=18){
            if(weight>50){
                System.out.println("You are eligible to donate blood.");
            }else{
                System.out.println("You are not eligible to donate blood.");
            }
        }else{
            System.out.println("Age must be greater than or equal 18.");
        }

        input.close();

    }
}

package weekly_review.week02;

import java.util.Scanner;

public class BirthDay {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name = ");
        String name = input.nextLine();

        System.out.print("Enter your birth day = ");
        String birthDay = input.nextLine();

        System.out.print("Enter your birth month = ");
        String birthMonth = input.nextLine();

        System.out.print("Enter your birth year = ");
        String birthYear = input.nextLine();

        System.out.println(name +" was born on " + birthMonth +"/"+birthDay+"/"+birthYear+".");

        input.close();

    }
}

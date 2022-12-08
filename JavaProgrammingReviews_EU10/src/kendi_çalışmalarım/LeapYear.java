package kendi_çalışmalarım;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter year = ");
        int year = input.nextInt();

        boolean isLeapYear = year%4==0 ;

        if ( isLeapYear == true) {
            System.out.println(year + " is leap year : " + isLeapYear);
        }else {
            System.out.println(year + " is leap year : " + isLeapYear);
        }

        input.close();

    }
}
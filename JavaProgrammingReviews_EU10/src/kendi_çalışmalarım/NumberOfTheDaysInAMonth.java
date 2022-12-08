package kendi_çalışmalarım;

import java.util.Scanner;

public class NumberOfTheDaysInAMonth {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter month number = ");

        int numberOfTheDaysInAMonth = input.nextInt();

        if (numberOfTheDaysInAMonth == 1 || numberOfTheDaysInAMonth == 3 || numberOfTheDaysInAMonth == 5 || numberOfTheDaysInAMonth == 7 || numberOfTheDaysInAMonth == 8 || numberOfTheDaysInAMonth == 10 ||  numberOfTheDaysInAMonth == 12 ){
            int a = 31;
            System.out.println(numberOfTheDaysInAMonth + " month of the year has "+ a + " days.");
        }else if (numberOfTheDaysInAMonth == 2){
            int a = 28;
            System.out.println(numberOfTheDaysInAMonth + " month of the year has " + a + " days.");
        }else if (numberOfTheDaysInAMonth == 4 || numberOfTheDaysInAMonth == 6 || numberOfTheDaysInAMonth ==9 || numberOfTheDaysInAMonth == 11){
            int a = 30;
            System.out.println(numberOfTheDaysInAMonth + " month of the year has " + a + " days.");
        }else{
            System.err.println("Please enter a number between 1 and 12.\nNow stop the program and run it again.");

        }

        input.close();

    }
}

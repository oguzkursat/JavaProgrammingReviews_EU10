package kendi_çalışmalarım;

import java.util.Scanner;

public class NameOfTheMonth {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your month number = ");
        int nameOfTheMonth = input.nextInt();
        if (nameOfTheMonth == 1){
            System.out.println(nameOfTheMonth + "st month of the year is January");
        }
        else if (nameOfTheMonth == 2){
            System.out.println(nameOfTheMonth + "nd month of the year is February");
        }
        else if (nameOfTheMonth == 3){
            System.out.println(nameOfTheMonth + "rd month of the year is March");
        }
        else if (nameOfTheMonth == 4){
            System.out.println(nameOfTheMonth + "th month of the year is April");
        }
        else if (nameOfTheMonth == 5){
            System.out.println(nameOfTheMonth + "th month of the year is May");
        }
        else if (nameOfTheMonth == 6){
            System.out.println(nameOfTheMonth + "th month of the year is June");
        }
        else if (nameOfTheMonth == 7){
            System.out.println(nameOfTheMonth + "th month of the year is July");
        }
        else if (nameOfTheMonth == 8){
            System.out.println(nameOfTheMonth + "th month of the year is August");
        }
        else if (nameOfTheMonth == 9){
            System.out.println(nameOfTheMonth + "th month of the year is September");
        }
        else if (nameOfTheMonth == 10){
            System.out.println(nameOfTheMonth + "th month of the year is October");
        }
        else if (nameOfTheMonth == 11){
            System.out.println(nameOfTheMonth + "th month of the year is November");
        }
        else if (nameOfTheMonth == 12){
            System.out.println(nameOfTheMonth + "th month of the year is December");
        }
        else {

            System.err.println("Please enter a number between 1 and 12.\nNow stop the program and run it again.");

        }

        input.close();


    }
}

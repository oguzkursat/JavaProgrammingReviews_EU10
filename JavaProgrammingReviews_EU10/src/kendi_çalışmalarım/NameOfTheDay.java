package kendi_çalışmalarım;

import java.util.Scanner;

public class NameOfTheDay {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your day number = ");
        int nameOfTheDay = input.nextInt();
        String day;
        
        if (nameOfTheDay == 1){
            day = "Monday";        
        }else if (nameOfTheDay == 2){
            day = "Tuesday";
        }else if (nameOfTheDay == 3){
            day = "Wednesday";
        }else if (nameOfTheDay == 4){
            day = "Thursday";
        }else if (nameOfTheDay == 5){
            day = "Friday";
        }else if (nameOfTheDay == 6){
            day = "Saturday";
        }else if (nameOfTheDay == 7){
            day = "Sunday";
        }else{
           day = "INVALID\nNow stop the program and run it again.";
        }
        System.out.println("day = " + day);

        input.close();



    }
}

package day12.day10;

import java.util.Scanner;

public class CrewAndPassangersWithSwitchCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of people (50/75/100) = ");
        int numberOfPeople = input.nextInt();
        int crew=0;
        int passengers=0;

        switch (numberOfPeople){
            case 50:
                crew = 20;
                passengers = 30;
                break;
            case 75:
                crew = 25;
                passengers = 50;
                break;
            case 100:
                crew = 30;
                passengers = 70;
                break;
            default:
                System.err.println("INVALID NUMBER");
                break;
        }
        System.out.println("TOTAL: " + numberOfPeople + " ====> " + crew + " crew, " + passengers + " passengers");

        input.close();

        /*int crew;
        int passengers;

        if (numberOfPeople == 50 || numberOfPeople == 75 || numberOfPeople == 100){
            if (numberOfPeople == 50){
                crew = 20;
                passengers = 30;
            }else if ( numberOfPeople == 75){
                crew = 25;
                passengers = 50;
            }else{
                crew = 30;
                passengers = 70;
            }

            System.out.println("TOTAL: " + numberOfPeople + " ====> " + crew + " crew, " + passengers + " passengers");

        }
        else {
            System.err.println("Invalid number of people.");
        }*/




    }
}

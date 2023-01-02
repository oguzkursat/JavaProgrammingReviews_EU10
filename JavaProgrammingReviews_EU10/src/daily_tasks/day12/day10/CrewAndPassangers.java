package daily_tasks.day12.day10;

import java.util.Scanner;

public class CrewAndPassangers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of people (50/75/100) = ");
        int numberOfPeople = input.nextInt();

        int crew;
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
        }

        input.close();


    }
}

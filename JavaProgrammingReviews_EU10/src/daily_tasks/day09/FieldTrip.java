package daily_tasks.day09;

import java.util.Scanner;

public class FieldTrip {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter grade number = ");
        int gradeNumber = input.nextInt();

        String location = null;
        int numberOfGroups = 0;
        String teacherInCharge = null;


        if (gradeNumber == 1) {
            location = "Apple Orchard";
            numberOfGroups = 3;
            teacherInCharge = "Ms. Smith";
        }else if (gradeNumber == 2) {
            location = "Zoo";
            numberOfGroups = 7;
            teacherInCharge = "Mr. Lee";
        }else if (gradeNumber == 3) {
            location = "Aquarium";
            numberOfGroups = 5;
            teacherInCharge = "Ms. Wilson";
        }else if (gradeNumber == 4) {
            location = "Movie Theater";
            numberOfGroups = 2;
            teacherInCharge = "Ms. Reyes";
        }else if (gradeNumber == 5) {
            location = "Museum";
            numberOfGroups = 5;
            teacherInCharge = "Ms. Lela";
        }else if (gradeNumber == 6) {
            location = "Six Flags";
            numberOfGroups = 8;
            teacherInCharge = "Mr. Watt";
        }else {
            System.err.println("Invalid grade number.");
        }

        System.out.println("Grade - " + gradeNumber);
        System.out.println("Location - " + location);
        System.out.println("Number of groups - " + numberOfGroups);
        System.out.println("Teacher in charge - " + teacherInCharge);


        input.close();

    }
}

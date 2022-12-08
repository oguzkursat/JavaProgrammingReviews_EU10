package day12.day10;

import java.util.Scanner;

public class GradeLevelWithSwitchCase {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Enter grade level = ");
        byte gradeLevel = input.nextByte();

        String type = "";

        if (gradeLevel>=1 && gradeLevel<=18)
            switch (gradeLevel) {
                case 1:case 2:case 3:case 4:case 5:
                    type = "Elementary School";
                    break;
                case 6: case 7: case 8:
                    type = "Middle School";
                    break;
                case 9:case 10:case 11:case 12:
                    type = "High School";
                    break;
                case 13:case 14:case 15:case 16:
                    type = "College";
                    break;
                case 17:case 18:
                    type = "Grad School";
                    break;
            }
        else {
            type = "Invalid Grade Level";
        }
            System.out.println(type);

        input.close();

    }
}

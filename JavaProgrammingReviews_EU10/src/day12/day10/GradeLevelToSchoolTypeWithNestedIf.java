package day12.day10;

import java.util.Scanner;

public class GradeLevelToSchoolTypeWithNestedIf {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter name = ");
        String name = input.nextLine();

        System.out.print("Enter grade level = ");
        byte gradeLevel = input.nextByte();

        String gradeLevelName;

        if ( gradeLevel>0 && gradeLevel<19 ){

          if ( gradeLevel<=5){
              gradeLevelName = "Elementary School";
          }else if( gradeLevel<=8){
              gradeLevelName = "Middle School";
          }else if( gradeLevel<=12){
              gradeLevelName = "High School";
          }else if( gradeLevel<=16){
              gradeLevelName = "College";
          }else{
              gradeLevelName = "Grad School";
          }
            System.out.println(name + " is going to " + gradeLevelName + ".");
        }else {
            System.err.println("Invalid grade level. Please enter grade level between 1 and 18.\nNow stop the program an run it again.");
        }

        input.close();


    }
}

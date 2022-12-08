package kendi_çalışmalarım;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class GradeLevelToSchoolType {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter name = ");
        String name = input.nextLine();

        System.out.print("Enter grade level = ");
        byte gradeLevel = input.nextByte();

        if ( gradeLevel<=5 && gradeLevel>=1){
            System.out.println(name + " is going to elementary school.");
        }else if( gradeLevel<=8 && gradeLevel>=6){
            System.out.println(name + " is going to middle school.");
        }else if( gradeLevel<=12 && gradeLevel>=9){
            System.out.println(name + " is going to high school.");
        }else if( gradeLevel<=16 && gradeLevel>=13){
            System.out.println(name + " is going to college.");
        }else if( gradeLevel<=18 && gradeLevel>=17){
            System.out.println(name + " is going to grad school.");
        }else {
            System.err.println("Please enter number between 1 and 18.\nNow stop the program an run it again.");
        }


        input.close();

    }
}

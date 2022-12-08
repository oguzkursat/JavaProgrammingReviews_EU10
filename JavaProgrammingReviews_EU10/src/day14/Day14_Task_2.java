package day14;

import java.util.Scanner;

public class Day14_Task_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = input.nextLine();

        if(word.endsWith("ly")){
            System.out.println("really???");
        }
        else{
            System.out.println("never mind");
        }


        input.close();

    }
}

package daily_tasks.day15;

import java.util.Scanner;

public class Day15_Task_8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your word: ");
        String word = input.next();

        String reverseWord="";

        for(int i=word.length()-1; i>=0;i--) {

            reverseWord += word.charAt(i);

        }
        if(word.equalsIgnoreCase(reverseWord)) {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        input.close();

    }
}

package daily_tasks.day13;

import java.util.Scanner;

public class Day13_Task1_3 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter a String:");
        String word=input.nextLine();

        if(word.charAt(0)==word.charAt(word.length()-1)){
            System.out.println("SAME");
        }else{
            System.err.println("NOT SAME");
        }

        input.close();



    }
}

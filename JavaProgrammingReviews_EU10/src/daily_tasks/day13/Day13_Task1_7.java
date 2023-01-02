package daily_tasks.day13;

import java.util.Scanner;

public class Day13_Task1_7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first word  : ");
        String word1=input.next();
        System.out.print("Enter second word : ");
        String word2=input.next();
        System.out.print("Enter third word  : ");
        String word3=input.next();

        if (word1.length()==word2.length() && word1.length()==word3.length()){
            System.out.println("All words are same length");
        } else if (word1.length()==word2.length() || word1.length()==word3.length() || word2.length()==word3.length()) {
            System.out.println("Not Same nor Different lengths");
        }else{
            System.out.println("All different length");
        }

       input.close();

    }
}

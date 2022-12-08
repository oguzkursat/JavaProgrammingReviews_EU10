package day14;

import java.util.Scanner;

public class Day14_Task_3 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter a word");
        String word= scan.next();

        scan.close();

        String result ="";
        if (word.startsWith("x") || word.startsWith("X")){
            result=word.substring(1,word.length()); //?????
        }

        System.out.println(result);

        scan.close();

    }
}

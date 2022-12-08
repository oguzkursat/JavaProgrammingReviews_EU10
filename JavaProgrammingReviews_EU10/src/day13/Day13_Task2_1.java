package day13;

import java.util.Scanner;

public class Day13_Task2_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 5 letter word : ");
        String word = input.next();

        if(word.length()<5){
            System.out.println("Too short!");
        } else if (word.length()>5) {
            System.out.println("Too long!");
        }else{
            char first=word.charAt(word.length()-5);
            char second=word.charAt(word.length()-4);
            char third=word.charAt(word.length()-3);
            char fourth=word.charAt(word.length()-2);
            char fifth=word.charAt(word.length()-1);

            String newWord=(""+fifth+fourth+third+second+first);
            System.out.println(newWord);
        }

        input.close();

    }
}

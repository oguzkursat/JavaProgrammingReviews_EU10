package day13;

import java.util.Scanner;

public class Day13_Task1_6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 3 letter word : ");
        String word = input.next();

        if(word.length()<3){
            System.out.println("Word is too short");
        } else if (word.length()>3) {
            System.out.println("Word is too long");
        }else{
            if(word.charAt(word.length()-2)=='a'){
                System.out.println("Cool word");
            }else{
                System.out.println("Okay word");
            }
        }

        input.close();

    }
}

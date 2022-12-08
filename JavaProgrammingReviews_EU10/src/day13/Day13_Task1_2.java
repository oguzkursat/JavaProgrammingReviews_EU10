package day13;

import java.util.Scanner;

public class Day13_Task1_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first sentence : ");
        String firstSentence=input.nextLine();
        System.out.println("Enter second sentence : ");
        String secondSentence=input.nextLine();

        if(firstSentence.length()>secondSentence.length()) {
            System.out.println(firstSentence);
        }else{
            System.out.println(secondSentence);
        }

        input.close();


    }
}

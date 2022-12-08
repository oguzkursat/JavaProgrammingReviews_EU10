package day14;

import java.util.Scanner;

public class Day14_Task_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word : ");
        String word1 = input.nextLine();
        System.out.println("Enter second word : ");
        String word2 = input.nextLine();

        word1 = word1.substring(1, word1.length());
        word2 = word2.substring(1, word2.length());

        System.out.println(word1+word2);

        input.close();

    }
}

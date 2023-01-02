package daily_tasks.day13;

import java.util.Scanner;

public class Day13_Task1_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = input.nextLine();
        int lastCharacter=sentence.length()-1;
        System.out.println(sentence.charAt(0)+","+sentence.charAt(lastCharacter));

        input.close();

    }
}

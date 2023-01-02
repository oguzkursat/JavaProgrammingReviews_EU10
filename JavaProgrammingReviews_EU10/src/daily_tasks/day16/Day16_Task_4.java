package daily_tasks.day16;

import java.util.Scanner;

public class Day16_Task_4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a text please");
        String str = scan.nextLine();

        System.out.println("Enter a word from the text:");
        String word = scan.next();

        int count = 0;

        for (int i = 0; i <= str.length()-word.length(); i++) {

            if (str.substring(i, i + word.length()).equalsIgnoreCase(word)) {
                count++;

            }
        }
        System.out.println(count);

        scan.close();


    }
}

package week06;

import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter a string:");
        String str = input.nextLine();
        System.out.println("enter what you looking for?");
        String word = input.nextLine();

        int count = 0;

        for (int i = 0; i <= str.length()-word.length(); i++) {
            String str2 = str.substring(i,i+word.length());
            if(str2.equalsIgnoreCase(word)) {
                count++;
            }
        }

        System.out.println(count);

        input.close();

    }
}

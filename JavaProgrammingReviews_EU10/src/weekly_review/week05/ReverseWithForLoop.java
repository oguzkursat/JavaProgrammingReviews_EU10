package weekly_review.week05;

import java.util.Scanner;

public class ReverseWithForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 5 letter word : ");
        String word = input.next();

        char ch;
        String reverse="";

        if(word.length()<5){
            System.out.println("Too short!");
        } else if (word.length()>5) {
            System.out.println("Too long!");
        }else {
            for (int i = 0; i < word.length(); i++) {
                ch = word.charAt(i);
                reverse = ch + reverse;
            }
            System.out.println(reverse);
        }


        input.close();

    }
}

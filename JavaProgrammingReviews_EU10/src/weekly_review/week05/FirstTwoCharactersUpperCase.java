package weekly_review.week05;

import java.util.Scanner;

public class FirstTwoCharactersUpperCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string = ");
        String str = input.next();

        str=str.substring(0,2).toUpperCase();

        System.out.println(str);

        input.close();
    }
}

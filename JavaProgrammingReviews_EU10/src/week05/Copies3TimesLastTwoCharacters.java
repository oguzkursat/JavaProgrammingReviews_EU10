package week05;

import java.util.Scanner;

public class Copies3TimesLastTwoCharacters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string = ");
        String str = input.nextLine();

        String result = "";

        for (int i = 0; i < 3; i++) {
            result+=str.substring(str.length()-2);
        }

        System.out.println(result);

        input.close();
    }
}

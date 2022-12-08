package week04;

import java.util.Scanner;

public class CharacterUpperCaseOrLowerCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character = ");
        char character = input.next().charAt(0);

        if (character>='A' && character<='Z') {
            System.out.println(character + " is a Upper Case character");
        }
        if (character>='a' && character<='z') {
            System.out.println(character + " is a Lower Case character");
        }
        if (!((character>='A' && character<='Z')||(character>='a'&& character<='z'))) {
            System.out.println(character + " is not an alphabetical character");
        }

    }
}

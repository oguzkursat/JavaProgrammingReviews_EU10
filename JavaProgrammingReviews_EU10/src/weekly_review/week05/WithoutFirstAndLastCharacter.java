package weekly_review.week05;

import java.util.Scanner;

public class WithoutFirstAndLastCharacter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string = ");
        String str = input.nextLine();

        str = str.substring(1,str.length()-1);

        System.out.println(str);

        input.close();
    }
}

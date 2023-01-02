package weekly_review.week05;

import java.util.Scanner;

public class PasswordEncryptWithX {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String result = "";

        System.out.println("Enter a string = ");
        String str = input.nextLine();

        for (int i = 0; i < str.length(); i++) {
            result+=str.charAt(i)+"x";
        }

        System.out.println(result);

        input.close();
    }
}

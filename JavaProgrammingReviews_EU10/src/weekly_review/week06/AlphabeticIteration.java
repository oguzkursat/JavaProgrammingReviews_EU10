package weekly_review.week06;

import java.util.Scanner;

public class AlphabeticIteration {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string = ");
        String str = input.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result+=str.substring(0,i+1);
        }

        System.out.println(result);

        input.close();
    }
}

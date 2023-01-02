package weekly_review.week06;

import java.util.Scanner;

public class WarmUpTask5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = input.nextLine();

        System.out.println("Enter number to delete");
        int index = input.nextInt();

        if(index>=0 && index<str.length()) {
            System.out.println((str.substring(0, index) + str.substring(index + 1)));
        }
        else {
            System.out.println("ınvalid number");
        }


    }
}

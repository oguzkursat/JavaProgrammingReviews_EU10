package weekly_review.week06;

import java.util.Scanner;

public class WarmUpTask3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter string:");
        String str = input.nextLine();

        int count=0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==' '){
                count++;
            }
        }

        System.out.print(count+1);

        input.close();

    }
}

package week06;

import java.util.Scanner;

public class WarmUpTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter string:");
        String str = input.nextLine();

        String result = "";

        for (int i = 0; i <= str.length(); i++) {
            String str2 = str.substring(0, i);
            result+=str2;
        }

        System.out.print(result);

        input.close();

    }
}

package hatalikodlar;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
    }

    public static String uniqueChars(String str) {
        //TODO: write your code
        int count = 0;
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > 1 && !result.contains("" + str.charAt(i))) {
                result += str.charAt(i);
            }
            if (count == 1) {
                result += str.charAt(i);
            }

        }

        return result;
    }
}
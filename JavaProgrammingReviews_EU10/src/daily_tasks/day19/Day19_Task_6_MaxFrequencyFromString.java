package daily_tasks.day19;

import java.util.Scanner;

public class Day19_Task_6_MaxFrequencyFromString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = scan.nextLine().toLowerCase();
        int frequency = 0;
        String result = "";
        scan.close();
        for (int j = 0; j < str.length(); j++) { //abcdef

            int count = 0;

            for (int i = j; i < str.length(); i++) {// Here we get the char from  string
                if (str.charAt(j) == str.charAt(i)) {// compare it in the string
                    count++;//if they are same count increases
                }
                if (count > frequency) {
                    result = str.charAt(j) + "";
                    frequency = count;
                }

            }
            if (count == frequency) {
                result = result + ", " +str.charAt(j);
            }
        }
        System.out.println("highest frequency of the char is  \"" + result.substring(3) + "\" and"
                + " it  is repeated " + frequency + " times");

    }
}
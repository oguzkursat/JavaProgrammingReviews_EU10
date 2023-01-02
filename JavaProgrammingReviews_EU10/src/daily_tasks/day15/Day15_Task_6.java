package daily_tasks.day15;

import java.util.Scanner;

public class Day15_Task_6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String including numbers:");
        String str = input.nextLine();
        input.close();
        String numbers = "";
        int total = 0;

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 48) && (str.charAt(i) <= 57)) {
                numbers += str.charAt(i);
                total +=  (str.charAt(i)-48);
            }

        }
        System.out.println("numbers = " + numbers);
        System.out.println("total = " + total);

    }
}

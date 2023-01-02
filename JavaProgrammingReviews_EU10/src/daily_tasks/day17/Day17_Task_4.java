package daily_tasks.day17;

import java.util.Scanner;

public class Day17_Task_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number");
        int num = input.nextInt();

        String result15 = "";
        String result5 = "";
        String result3 = "";

        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                if (i % 15 == 0) {
                    result15 += (i+" ");
                } else if (i % 5 == 0) {
                    result5 += (i+" ");

                } else if (i % 3 == 0) {
                    result3 += (i+" ");

                }
            }
            System.out.println("Divisible By 15 : " + result15);
            System.out.println("Divisible By 5  : " + result5);
            System.out.println("Divisible By 3  : " + result3);



        } else {
            System.out.println("It's a negative number.");
        }

        input.close();

    }
}

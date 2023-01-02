package daily_tasks.day17;

import java.util.Scanner;

public class Day17_Task_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = input.nextInt();
        int sum = num;

        while (num > 0) {
            System.out.println("Enter number:");
            num = input.nextInt();
            if (num > 0) {
                sum += num;
            }
        }

        System.out.println(sum);

        input.close();

    }
}

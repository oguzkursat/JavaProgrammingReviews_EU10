package daily_tasks.day15;

import java.util.Scanner;

public class Day15_Task_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = input.nextInt();

        int sum = 0;

        for (int i = 0 ; i<num+1 ; i++) {
            sum += i;
        }
        System.out.println(sum);

        input.close();

    }
}

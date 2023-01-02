package daily_tasks.day20;

import java.util.Arrays;

public class Day20_Task_6_Move_All_Zero_To_End {
    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0};
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                for (int j = i; j < array.length-1; j++) {
                    temp = array[i];
                    array[j] = array[j+1];

                }
                temp = array[array.length-1];
            }
        }

        System.out.println(Arrays.toString(array));


    }
}

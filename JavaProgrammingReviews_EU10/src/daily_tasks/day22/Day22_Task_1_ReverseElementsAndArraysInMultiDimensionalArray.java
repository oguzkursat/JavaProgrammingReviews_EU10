package daily_tasks.day22;

import java.util.Arrays;

public class Day22_Task_1_ReverseElementsAndArraysInMultiDimensionalArray {
    public static void main(String[] args) {

        int array[][] = {{1, 2, 3,90,50,67}, {4, 5, 6, 10, 12}, {7, 8, 9}, {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //{{7, 8, 9},{4, 5, 6},{1, 2, 3},{7, 8, 9},{4, 5, 6},{1, 2, 3}}

        for (int i = 0; i < array.length / 2; i++) {
            int[] temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        //{{7, 8, 9},{4, 5, 6},{1, 2, 3},{7, 8, 9},{4, 5, 6},{1, 2, 3}}

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length / 2; j++) {
                int temp = array[i][j];
                array[i][j] = array[i][array[i].length - 1 - j];
                array[i][array[i].length - 1 - j] = temp;
            }
        }

        System.out.println(Arrays.deepToString(array));

    }
}

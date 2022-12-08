package day20;

import java.util.Arrays;

public class Day20_Task_5_Reverse_Int_Array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] reversedArray = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; j++, i--) {
            reversedArray[j] = array[i];
        }
        System.out.println(Arrays.toString(reversedArray));

    }
}

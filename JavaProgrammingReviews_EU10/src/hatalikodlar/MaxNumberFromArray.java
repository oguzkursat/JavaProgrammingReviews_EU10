package hatalikodlar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxNumberFromArray {
    public static void main(String[] args) {

        int[] arr = {8, 4, 9, 22, 4, -1, 7};

        /*
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
        */

        /*
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
        */

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(8, 4, 9, 22, 4, -1, 7));

        int max = Collections.max(nums);
        System.out.println(max);


    }
}

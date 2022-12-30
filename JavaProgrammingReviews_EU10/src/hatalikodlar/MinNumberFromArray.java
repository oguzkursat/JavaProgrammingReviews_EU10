package hatalikodlar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinNumberFromArray {

    public static void main(String[] args) {

        int [] arr = {8,4,9,22,4,-1,7};
        /*
        Arrays.sort(arr);
        System.out.println(arr[0]);
        */

       /*
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]) {
                min = arr[i];
            }
        }

        System.out.println(min);
        */

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(8,4,9,22,4,-1,7));

        int min = Collections.min(nums);
        System.out.println(min);




    }
}

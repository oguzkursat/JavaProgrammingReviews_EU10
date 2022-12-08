package week11;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainsUniqueElements {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6,7,1,5};
        int [] arr2  ={4,5,6,7,8};
        System.out.println(containsUniqueElements(arr1,arr2));
    }

    public static ArrayList<Integer> containsUniqueElements(int[] arr1, int[] arr2) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int each : arr1) {
            if(!list.contains(each)){
                list.add(each);
            }
        }
        for (int each : arr2) {
            if(!list.contains(each)){
                list.add(each);
            }
        }

        return list;
    }
}

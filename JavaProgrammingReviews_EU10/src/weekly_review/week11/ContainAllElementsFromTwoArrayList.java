package weekly_review.week11;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainAllElementsFromTwoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.addAll(Arrays.asList(1,2,3,4));
        ArrayList<Integer> arr2=new ArrayList<>();
        arr2.addAll(Arrays.asList(5,6,7,8));

        System.out.println(Arrays.toString(containsAllElements(arr1,arr2)));

    }
    public static int [] containsAllElements(ArrayList<Integer> arr1,ArrayList<Integer> arr2){

        ArrayList<Integer> list2 = new ArrayList<>(arr1);
        list2.addAll(arr2);

        int[] list = new int[list2.size()];

        for (int i = 0; i < list.length; i++) {
            list[i]=list2.get(i);
        }
        return list;
    }


    public static Integer[] merged(ArrayList<Integer>list1,ArrayList<Integer>list2){
        list1.addAll(list2);
        Integer[] array = list1.toArray(new Integer[0]);
        return array;
    }
}

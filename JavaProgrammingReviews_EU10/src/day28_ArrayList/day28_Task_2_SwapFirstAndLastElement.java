package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class day28_Task_2_SwapFirstAndLastElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        int temp = list.get(0);
        list.set(0, list.get(4));
        list.set(4, temp);
        System.out.println(list);
    }
}

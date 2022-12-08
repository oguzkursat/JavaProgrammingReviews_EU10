package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class day28_Task_3_MultiplyAllElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));

        int i=0;
        for (Integer each : list) {
            list.set(i++,each*2);
        }
        System.out.println(list);
    }
}

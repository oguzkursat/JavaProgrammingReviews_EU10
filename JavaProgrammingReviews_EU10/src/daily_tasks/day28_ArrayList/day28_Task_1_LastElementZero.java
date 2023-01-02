package daily_tasks.day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class day28_Task_1_LastElementZero {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        list.set(4,0);
        System.out.println(list);


    }
}

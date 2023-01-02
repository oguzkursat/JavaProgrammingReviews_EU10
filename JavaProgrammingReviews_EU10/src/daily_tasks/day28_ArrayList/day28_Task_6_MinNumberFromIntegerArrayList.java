package daily_tasks.day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class day28_Task_6_MinNumberFromIntegerArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,0));

        int min = list.get(0);

        for (Integer each : list) {
            if(each<min){
                min=each;
            }
        }
        System.out.println(min);

        //2nd way
        int min2 = Collections.min(list);
        System.out.println(min2);
    }
}

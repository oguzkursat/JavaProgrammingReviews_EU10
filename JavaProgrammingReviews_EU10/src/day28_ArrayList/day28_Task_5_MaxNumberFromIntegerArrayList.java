package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class day28_Task_5_MaxNumberFromIntegerArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));

        int max = list.get(0);

        for (Integer each : list) {
            if(each>max){
                max=each;
            }
        }
        System.out.println(max);

        //2nd way
        int max2= Collections.max(list);
        System.out.println(max2);

    }
}

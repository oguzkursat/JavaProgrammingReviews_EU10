package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class day28_Task_7_FirstDuplicatedElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,2,3,4,4,5,6,7,7));

        for (Integer each1 : list) {
            int count = 0;
            for (Integer each2 : list) {
                if(each1==each2){
                    count++;
                }
            }
            if(count==2){
                System.out.println(each1 + " is first duplicated element");
                break;
            }
        }
    }
}

package day29_ArrayListContinueAndCollectionsUtilityClass;

import java.util.ArrayList;
import java.util.Collections;

public class FirstUniqueElementsFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(50);


        for (Integer each : list) {
            int count = 0;
            for (Integer integer : list) {
                if(each==integer){
                    count++;
                }
            }
            if(count==1){
                System.out.println(each);
                break;
            }

            /*
            int frequency = Collections.frequency(list,each);
            if(frequency>1){
                System.out.println(each);
                break;
            }

            */

        }






    }
}

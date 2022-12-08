package day29_ArrayListContinueAndCollectionsUtilityClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aaabcccdeeef";

        String [] strArr = str.split("");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(strArr));

        System.out.println("list = " + list);

        list.removeIf(p->Collections.frequency(list,p)>1);

        System.out.println("list = " + list);

        String unique = "";
        for (String each : list) {
            int frequency = Collections.frequency(list,each);
            if(frequency == 1){
                unique += each;
            }
        }

        System.out.println("unique = " + unique);

    }
}

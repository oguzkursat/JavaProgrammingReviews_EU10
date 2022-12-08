package day29_ArrayListContinueAndCollectionsUtilityClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice1 {
    public static void main(String[] args) {

        String [] countries = {"Japan","Korea","United States","Turkey","United Kingdom","Canada"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));

        list.removeIf(p-> p.length()>=10);
        //System.out.println(list);
        countries = list.toArray(new String [0]);

        System.out.println(Arrays.toString(countries));


    }
}

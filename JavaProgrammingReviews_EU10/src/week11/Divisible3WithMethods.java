package week11;

import java.util.ArrayList;
import java.util.Arrays;

public class Divisible3WithMethods {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        ArrayList<Integer> result = divisibleBy3(array);
        System.out.println(result);

    }
    public static ArrayList<Integer> divisibleBy3(ArrayList<Integer> array){
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer each : array) {
            if(each%3==0){
                list.add(each);
            }
        }
        return list;
    }
}

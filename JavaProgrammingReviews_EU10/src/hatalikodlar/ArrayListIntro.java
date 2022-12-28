package hatalikodlar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListIntro {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        for (int i = 0 , j = list.size()-1; i < list.size()/2 ; i++ , j--) {
            int temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
        }

        System.out.println(list);

        Collections.reverse(list);

        System.out.println(list);


        int [] reverse = new int[list.size()];

        for (int i = 0; i < reverse.length; i++) {
            reverse[i]= list.get(i);
        }

        System.out.println(Arrays.toString(reverse));

        /*ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            list2.add(list.get(i));
        }
        System.out.println(list2);*/

        System.out.println("  second solution ");


        for (int i = 0; i < list.size()/2; i++) {
            int temp= list.get(i);
            list.set(i,list.get((list.size()-1)-i));
            list.set((list.size()-1)-i,temp);
            System.out.println(list);
        }


        System.out.println("--------------------------");

        for (int i = 0,j=list.size()-1; i <list.size()/2 ; i++,j--) {
            Collections.swap(list,i,j);
        }
        System.out.println(list);

        //System.out.println(list);



    }
}
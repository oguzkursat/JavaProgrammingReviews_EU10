package hatalikodlar;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Search {

    public static String search(ArrayList<String> strs, String find) {
        // complete the method
        String result = "";
        for (String each : strs) {
            if (each.contains(find)) {
                result = each;
            } else {
                result = "\"search failed\"";
            }
        }

        for (int i = 0; i < strs.size(); i++) {
            if (strs.get(i).contains(find)) {
                result = strs.get(i);
                break;
            } else {
                result = "\"search failed\"";
            }
        }
        return result;


    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String find = in.next();
        in.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextLine());
        }
        System.out.println(search(list, find));
    }


    /*public static void main(String[] args) {

        String array[]={"one apple","two orange","four banana"};
        String str = "oneappletwoorangefourbanana";

        if(str.contains("fou")){
            System.out.println(Arrays.toString(array));
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i].contains("fou")){
                System.out.println(array[i]);
            }
        }





*/


}

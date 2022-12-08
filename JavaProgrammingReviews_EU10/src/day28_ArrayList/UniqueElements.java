package day28_ArrayList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Java");
        list.add("Java");
        list.add("Phyton");
        list.add("C#");
        list.add("JavaScript");
        list.add("C#");
        list.add("JavaScript");
        list.add("Ruby");

        System.out.println(list);

        ArrayList<String> unique = new ArrayList<>();

        for (String each : list) {
            if (list.indexOf(each) == list.lastIndexOf(each)) {
                unique.add(each);
            }
        }
        System.out.println(unique);

        char ch = '-';
        System.out.println(ch);

    }
}

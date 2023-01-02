package daily_tasks.day28_ArrayList;

import java.util.ArrayList;

public class day28_Task_4_CombiningTwoStringArraysIntoAnArrayList {
    public static void main(String[] args) {

        String [] str1 = {"A", "B", "C"};
        String [] str2 = {"D", "E", "F", "G"};

        ArrayList<String> list = new ArrayList<>();

        for (String each : str1) {
            list.add(each);
        }
        for (String each : str2) {
            list.add(each);
        }
        System.out.println(list);
    }
}

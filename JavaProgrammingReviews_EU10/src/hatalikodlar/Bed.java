package hatalikodlar;

import java.util.ArrayList;

public class Bed {
    static int count;

    public Bed() {
        count++;
    }

    public Bed(int i) {
        count += i;
    }

    public Bed(String s) {
        count += s.length();
    }
}

class Test1 {
    public static void main(String[] args) {

        new Bed();
        Bed a = new Bed();
        Bed a2 = new Bed("word");
        Bed a3 = new Bed(5);
        System.out.println(Bed.count);


    }
}
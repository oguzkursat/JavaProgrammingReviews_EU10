package kendi_çalışmalarım;

import java.util.ArrayList;

public class FibonacciMyOwn {
    public static void main(String[] args) {
        System.out.println(Fibonacci(8));
    }

    public static ArrayList<Integer> Fibonacci(int number) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i = 1; i < number; i++) {
            list.add(list.get(i - 1) + list.get(i));
        }
        return list;
    }
}

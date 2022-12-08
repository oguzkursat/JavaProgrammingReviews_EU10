package kendi_çalışmalarım;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of Arraylist = ");
        int size = input.nextInt();

        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);

        for (int i = 1; i < size; i++) {
            fibonacci.add(fibonacci.get(i-1)+fibonacci.get(i));
        }

        System.out.println(fibonacci);
        
        
        
        
    }
}

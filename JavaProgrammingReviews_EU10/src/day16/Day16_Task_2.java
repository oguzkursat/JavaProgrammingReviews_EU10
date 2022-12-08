package day16;

import java.util.Scanner;

public class Day16_Task_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = input.nextLine();

        System.out.println("Which character are you looking for?");
        String ch = input.next();

        int num = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==ch.charAt(0)){
                num += 1;
            }
        }

        System.out.println(num);

        input.close();
    }
}

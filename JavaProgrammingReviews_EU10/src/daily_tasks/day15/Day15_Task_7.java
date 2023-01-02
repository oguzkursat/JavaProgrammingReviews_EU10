package daily_tasks.day15;

import java.util.Scanner;

public class Day15_Task_7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String newStr="";

        System.out.println("Enter string : ");
        String str = input.nextLine();

        for (int i=str.length(); i>0; i--){

            newStr += str.charAt(i-1) ;

        }

        System.out.println(newStr);

        input.close();

    }
}

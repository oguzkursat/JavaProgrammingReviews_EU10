package day14;

import java.util.Scanner;

public class Day14_Task_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two string :");
        String str1 = input.nextLine();
        String str2 = input.nextLine();

        if(str1.substring(str1.length()-1).equalsIgnoreCase(str2.substring(0,1))){
            System.out.println(str1+str2.substring(1));
        }
        else{
            System.out.println(str1+"\n"+str2);
        }


    }
}

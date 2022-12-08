package day13;

import java.util.Scanner;

public class Day13_Task1_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String word = input.nextLine();

        if(word.length()==0){
            System.out.println("string is empty");
        } else if (word.length()<=3) {
            System.out.println(word);
        } else{
            System.out.println(word.charAt(word.length()-3)+""+word.charAt(word.length()-2)+""+word.charAt(word.length()-1));
        }

        input.close();

    }
}

package daily_tasks.day16;

import java.util.Scanner;

public class Recording_Day16_WithoutDuplicationOfString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter sentence:");
        String sentence = input.nextLine();

        String result = "";

        for (int i =0 ; i<sentence.length() ; i++){
            String ch =""+ sentence.charAt(i);

            if(!result.contains(ch)){
                result += ch;
            }
        }

        System.out.println(result);


    }
}

package daily_tasks.day18;

import java.util.Scanner;

public class Day18_Task_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = input.nextLine();

        String result = "";
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            count=0;
            for (int j = 0; j < str.length(); j++) {  //aabcccd
                if(str.charAt(i)==str.charAt(j)){        //0123456   length=7
                    count++;
                }
            }
            if(count==1){
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
